
import java.util.Scanner;
public class RakamlariToplami {

    public static void main(String[] args) {
        int toplam=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("rakamlarinin toplamini istediğiniz sayi?");
        int a=scanner.nextInt();
        System.out.println("sayi="+a);
        do{
           toplam+=a%10;
           a=a/10;
        }while(a>0);
        System.out.println("rakamlarin toplami:"+toplam);
        
      
    }
}
