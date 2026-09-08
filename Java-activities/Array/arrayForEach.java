public class ArrayForEach {
    public static void main(String[] args) {
        int[] x = {2, 4, 6, 8, 10, 12, 14, 16};

        for (int y : x) {
            System.out.println(y);
        }

        System.out.println("The length of the array is: " + x.length);
    }
}