public class Main {
    public static void main(String[]args){

        int sayac =0;
        int i,j;

        for (i =2;i<100;i++) {
            for (j=2;j<i;j++){
         if (i%j==0) sayac++;
            }
            if (sayac==0) System.out.print(i+" ");
            sayac=0;
        }
    }
}
