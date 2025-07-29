import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int p = 0; p < 5; p++){
            System.out.print("Enter a positive integer: ");
            int a = sc.nextInt();
            
            if (a<=0){
                System.out.println("Invalid input! Program Stopped!");
                return;
            }
            
           int d = 1;
           System.out.print(a + "! = ");
           while (d<=a){
               if (d<a){
                   System.out.print(d + " x ");
               }
               else {
                   System.out.print(d + " ");
               }
               d++;
           }
           
            int b = 1;
        for(int i = 1; i <= a; i++)
        {
            b = b * i;
        }
        System.out.println("");
        System.out.println("Factorial of "+a+" is: "+ b );
        }
    }
}