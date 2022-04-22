import java.util.Scanner;
public class Main {
    public static void main(String[]args){

        int k,toplam =0,d=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi Giriniz : ");
        k = input.nextInt();

        for (int i =0;i<=k; i++){
            if ((i% 3 == 0) && (i%4==0) ){
                System.out.println(i);
                toplam = toplam+i;
                d++;
            }

        }
        System.out.println("Toplam : "+toplam);
        double ort = toplam / d;
        System.out.println("Ortalama : "+ort);
    }
}
