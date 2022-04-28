import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int n = input.nextInt();

        for (int i = 1;i<=n;i++){
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for (int a =1;a<=(2*i)-1;a++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1;i<=n;i++){
            for (int j=1;j<=(i);j++){
                System.out.print(" ");
            }
            for (int a =1;a<=((2*n)-1)-(2*i);a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
