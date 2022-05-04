import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        int a;
        Scanner input= new Scanner(System.in);
        System.out.println("Eleman sayısını giriniz :");
        a= input.nextInt();
        int value1=0;
        int value2=1;
        System.out.print(value1+"  "+value2);
        for (int i = 1;i<=a;i++){
            int value3 = value1+value2;
            System.out.print(" "+value3);
            value1=value2;
            value2=value3;
        }

    }
}
