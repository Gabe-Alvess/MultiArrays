import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {

        // initializing an array original
        int[] originalArray = {1, 2, 3};

        System.out.println("Original Array");
        for (int index = 0; index < originalArray.length; index++) {
            System.out.print(originalArray[index] + " ");
        }

        // copying array originalArray to newArray
        int[] newArray = Arrays.copyOf(originalArray, 5);

        // Changing some elements of newArray
        newArray[3] = 11;
        newArray[4] = 55;

        System.out.println("\nNew array newArray after modifications:");
        for (int index = 0; index < newArray.length; index++) {
            System.out.println(newArray[index] + " ");
        }

        System.out.println("---- 2D - Arrays ----");
        int[][] myArr = new int[5][5];
        myArr[0][0] = 10;
        myArr[1][0] = 10;
//        System.out.println(myArr[1][0]);

        int[][] myArr2D = {{1, 2, 3}, // 1 -> row
                           {4, 5, 6}, // 2 -> row
                           {4, 5, 6}};// 3 -> row
                         // 1  2  3 -> colums

        // for loop 2D array
        System.out.println("for loop");
        for (int rows = 0; rows < myArr2D.length; rows++) {
            for (int columns = 0; columns < myArr2D[rows].length; columns++) {
                System.out.print(myArr2D[rows][columns] + " ");
            }
            System.out.println();
        }

        // foreach 2D array
        System.out.println("foreach");
        for (int[] value : myArr2D) {
            for (int i : value) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("---- 3D - Arrays ----");

        int[][][] myArr3D = {{{1,2,3}, {4,5,6}, {7,8,9}},
                            {{1,2,3}, {4,5,6}, {7,8,9}}};

        // for loop 3D array
        System.out.println("for loop");
        for (int layers = 0; layers < myArr3D.length; layers++) {
            for (int rows = 0; rows < myArr3D[layers].length; rows++) {
                for (int columns = 0; columns < myArr3D[layers][rows].length; columns++) {
                    System.out.print(myArr3D[layers][rows][columns] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // foreach loop 3D array
        System.out.println("foreach");
        for (int[][] ints : myArr3D) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("---- 2D - Array printen als string ----");

        System.out.println(Arrays.deepToString(myArr2D));

        System.out.println("---- 3D - Array printen als string ----");

        System.out.println(Arrays.deepToString(myArr3D));
    }
}
