import java.util.Scanner;

public class P2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArray  = input.split(" ");
        int[] intArray = new int[inputArray.length];
        for(int i = 0; i<intArray.length; i++){
            intArray[i]=Integer.parseInt(inputArray[i]);
        }
        boolean [] result = isAscOrDsc(intArray);
        if (result[0]) System.out.println("ascending");
        else if (result[1]) System.out.println("descending");
        else System.out.println("mixed");
    }

    public static boolean[] isAscOrDsc(int[] array) {
        boolean asc = true;
        boolean dsc = true;
        boolean mixed = false;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>array[i+1]) asc = false;
            if (array[i]<array[i+1]) dsc = false;
        }
        return new boolean[] {asc,dsc};
    }
}
