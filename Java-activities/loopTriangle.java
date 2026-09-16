public class UpsideDownTriangle {
    public static void main(String[] args) {
        for (int x = 4; x > 0; x--) {
            for (int z = 4; z > x; z--) {
                System.out.print(" ");
            }
            for (int y = 0; x > y; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class UpsideDownRightTriangle {
    public static void main(String[] args) {
        for (int x = 4; x > 0; x--) {
            for (int y = 0; x > y; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class LeftAlignedTriangle {
    public static void Main(string[] args)
    {
        for (int i = 0; i <= 4; i++)
        {
            for (int j = 4; j > i; j--)
            {
                Console.Write(" ");
            }
            for (int k = 0; k < i; k++)
            {
                Console.Write("*");
            }
            Console.WriteLine();
        }
    }
}