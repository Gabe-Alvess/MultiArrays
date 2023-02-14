public class JaggedArr {
    public static void main(String[] args) {
        System.out.println("---- Jagged Array");
        int[][] myJag = {{1,2,3}, {4,5}, {6,7,8,9,10}};

        for (int[] rows: myJag) {
            for (int columns : rows) {
                System.out.print(columns + " ");
            }
            System.out.println();
        }
    }
}
