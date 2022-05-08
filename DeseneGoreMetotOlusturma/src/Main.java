import java.util.Scanner;
public class Main {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Bir N sayisi giriniz :");
        int n = input.nextInt();
        order(n);
        }
   public static void order (int n){
        if(n<=0){
            System.out.print(n +" ");
            return;
        }
        System.out.print(n+" ");
        order(n-5);
        System.out.print(n+" ");
    }
}

