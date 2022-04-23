import java.util.Scanner;
public class Main {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("C(n,r) kombinasyonu için n eleman sayısını giriniz :");
        int n = input.nextInt();

        System.out.print("Kombinasyon için sayı giriniz :");
        int r =input.nextInt();

        int totaln = 1,totalr =1,totalfark=1;

        for (int i=1; i<=n;i++){
            totaln = totaln*i;
        }
        System.out.println("n! :"+totaln);

        for (int j=1; j<=r;j++){
            totalr = totalr*j;
        }
        System.out.println("r! :"+totalr);

        for (int k=1; k<=(n-r);k++) {
            totalfark = totalfark * k;
        }
        System.out.println("(n-r)! :"+totalfark);

        double sonuc = totaln/(totalr*(totalfark));
        System.out.println("Kombinasyon :"+sonuc);
    }
}