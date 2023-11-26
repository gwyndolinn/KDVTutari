import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOrani, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        kdvOrani = (tutar <=1000) ? 0.18 :  0.08 ;
        kdvTutar = tutar * kdvOrani;
        kdvliTutar = kdvTutar + tutar;
        System.out.println("KDV'siz tutar: "+ tutar);
        System.out.println("KDV oranı: "+ kdvOrani);
        System.out.println("KDV miktarı: "+ kdvTutar);
        System.out.println("KDV'li tutar: "+ kdvliTutar);



    }
}