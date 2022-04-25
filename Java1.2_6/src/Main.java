import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int basValue;
        int tempNumber = number;
        int total =0;

        while(tempNumber !=0 ){
            tempNumber = tempNumber/10;
            basNumber++;
        }
        tempNumber = number;
       while(tempNumber !=0){
           basValue = tempNumber%10;
           total += basValue;
           tempNumber /=10;
       }
        System.out.println("Toplam :"+total);
    }
}


