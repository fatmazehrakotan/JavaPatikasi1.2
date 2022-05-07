import java.util.Scanner;

public class Main {

    static  void plus(){

        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;

        while (true) {
            System.out.println(i++ + ".sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }
     static void minus(){

        Scanner scan = new Scanner(System.in);
         System.out.println("Kaç adet sayı gireceksiniz : ");
         int counter =scan.nextInt();
         int number,result =0;

         for (int i = 1; i<= counter; i++){
             System.out.println(i+".sayı :");
             number = scan.nextInt();
             if (i==1){
                 result +=number;
                 continue;
             }
             result -=number;
         }
         System.out.println("Sonuç :"+result);
     }
     static void times(){
        Scanner scan = new Scanner(System.in);
        int number,result =1,i=1;

        while (true){
            System.out.println(i++ +". sayı :");
            number = scan.nextInt();

            if (number ==1)
                break;
            if (number ==0){
                result =0;
                break;
            }
            result *= number;
        }
         System.out.println("Sonuç :" +result);
     }
     static void divided (){
        Scanner scan = new Scanner(System.in);
         System.out.println("Kaç adet sayı gireceksiniz :");
         int counter = scan.nextInt();
         double number,result =0.0;

         for (int i=1; i<=counter; i++){
             System.out.println(i+".sayı :");
             number = scan.nextInt();
             if (i !=1 && number ==0){
                 System.out.println("Böleni 0 giremezsiniz.");
                 continue;
             }
             if ( i==1){
                 result = number;
                 continue;
             }
             result /=number;
         }
         System.out.println("Sonuç :"+result);
     }
     static void power(){
        Scanner scan = new Scanner(System.in);
         System.out.println("Taban değeri giriniz :");
         int base = scan.nextInt();
         System.out.println("Üs değeri giriniz :");
         int exponent = scan.nextInt();
         int result =1;
         for (int i =1;i<= exponent; i++){
             result *= base;
         }
         System.out.println("Sonuç :"+result);
     }
     static  void factorial(){
        Scanner scan = new Scanner(System.in);
         System.out.println("Sayı giriniz :");
         int n= scan.nextInt();
         int result =1;
         for (int i =1; i<=n; i++){
             result *=i;
         }
         System.out.println("Sonuç :"+result);
     }
     static void mode(){
        Scanner scan =new Scanner(System.in);
        int number,result =0;
         System.out.println("Modunu almak istediğiniz sayıyı giriniz .");
         int mode1 = scan.nextInt();
         System.out.println("Mod alacal sayıyı giriniz :");
         int mode2= scan.nextInt();
         if (mode2 ==0){
             System.out.println("Mod alacak sayı sıfırdan farklı olmalıdır.");
         }else{
             result = mode1 % mode2;
             System.out.println("Sonuç: :"+result);
         }
     }
     static void areaPerimeter(){
        Scanner scan = new Scanner(System.in);
         System.out.println("Uzun kenarın uzunluğunu giriniz :");
         int width = scan.nextInt();
         System.out.println("Kısa kenarın uzunluğunu giriniz :");
         int height = scan.nextInt();
         int resultArea = width * height;
         int resultPerimeter =(width+height)*2;
         System.out.println("Alan Sonucu : "+resultArea);
         System.out.println("Çevre Sonucu:"+resultPerimeter);
     }

     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int select;
         String menu = "1-Toplama İşlemi \n"
                 + "2-Çıkarma İşlemi \n"
                 + "3-Çarpma İşlemi \n"
                 + "4-Bölme İşlemi \n"
                 + "5-Üslü Sayı Hesaplama\n"
                 + "6-Faktoriyel Hesaplama \n"
                 + "7-Mod Alma \n"
                 + "8-Dikdörtgen Alan ve Çevre Hesabı \n"
                 + "0-Çıkış Yap";
         do {
             System.out.println(menu);
             System.out.println("Lütfen bir işlem seçiniz :");
             select = scan.nextInt();
             switch (select){
                 case 1:
                     plus();
                     break;
                 case 2:
                     minus();
                     break;
                 case 3:
                     times();
                     break;
                 case 4:
                     divided();
                     break;
                 case 5:
                     power();
                     break;
                 case 6:
                     factorial();
                     break;
                 case 7:
                     mode();
                     break;
                 case 8:
                     areaPerimeter();
                     break;
                 case 0:
                     break;
                 default:
                     System.out.println("Yanlış bir değer girdiniz,tekrar deneyiniz.");
             }
         }while(select !=0);

         }
     }





