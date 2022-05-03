import java.util.Scanner;

public class Main {
    public static void main(String[ ]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz :");
        int n = input.nextInt();
        int max = 0,min =0;

        for (int i=1; i<= n; i++){
            System.out.println(i + ".Sayıyı Giriniz :");
          int a = input.nextInt();
          if (a>max){
              if(min==0){
                  min =a;
              }
              max =a;
          }
          if (a<min){
              if (max==0){
                  max=a;
              }
              min =a;
          }
        }
        System.out.println("En büyük sayı :"+max+"\nEn küçük sayi :"+min);
    }
}
