import java.util.Scanner;

public class KDVhesap {
    public static void main(String[] args) {
        double tutar, kdvlitutar, kdvtutar, kdvoran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücreti Giriniz : ");
        tutar = input.nextDouble();
        if(tutar > 1000); {
            kdvoran = 0.08;
        }
        kdvtutar = tutar * kdvoran;
        kdvlitutar = kdvtutar * tutar;

        System.out.println("KDV'siz Tutar : " +tutar);
        System.out.println("KDV Oranı : " +kdvoran);
        System.out.println("KDV Tutarı : " +kdvtutar);
        System.out.println("KDV'li Tutar : " +kdvlitutar);

    }

}
