import java.util.Scanner;

public class Main {
    static int power(int base,int exponent ){
        if (exponent==0)
            return 1;
        int result =1;
        result *= power(base,exponent-1)*base;
        return result;
    }
    public static void main(String[]args){
        Scanner inp= new Scanner(System.in);
        System.out.println("Taban değeri giriniz :");
        int base = inp.nextInt();
        System.out.println("Üs değerini giriniz");
        int exponent = inp.nextInt();
        System.out.println("Sonuç :"+power(base,exponent));
    }
}
