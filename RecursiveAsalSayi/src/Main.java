import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        System.out.println("Sayı Giriniz :");
        int n = input.nextInt();

        if (asal(n)==true){
            System.out.println("Bu sayi asal degildir!");
        }else{
            System.out.println("Bu sayi asaldir!");
        }
    }
    static boolean asal(int n){
        boolean result = false;

        for (int i=2; i<n; i++){
            if (n % i ==0){
                result = true;
            }
        }
        return result;
    }
}
