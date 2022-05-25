import java.util.Scanner;

public class Ucak_Bilet_Fiyati_Hesap {
    public static void main(String[] args) {
        double mesafe,ucret=0.10 ;
        double tutar,indirim,itut;
        int yas,tip;

        Scanner input= new Scanner(System.in);

        System.out.print("Lutfen Mesafe Bilgilerini Km Olarak Giriniz : ");
        mesafe= input.nextDouble();

        System.out.print("Lutfen yas bilginizi giriniz: ");
        yas= input.nextInt();

        System.out.print("Lutfen yolculuk tipinizi seciniz(1:Tek Yon, 2:Gidis Donus) : ");
        tip=input.nextInt();


            if (yas > 0 && mesafe > 0 && tip == 1) {

                tutar = mesafe * ucret;
                System.out.println("Indirimsiz Tek Yon Tutari : " + tutar);

                    if (yas < 12) {

                        indirim = tutar * 0.5;
                        itut = tutar - indirim;
                        System.out.println("12 yas indirimli tutar : " + itut);

                    } else if (12 < yas && yas <= 24) {

                        indirim = tutar * 0.10;
                        itut = tutar - indirim;

                        System.out.println("12-24 yas indirimli tutar: " + itut);

                    } else if (24 < yas && yas < 65) {

                        System.out.println("Normal tutar: " + tutar);

                    } else if (yas >= 65) {

                        indirim = tutar * 0.30;
                        itut = tutar - indirim;

                        System.out.println("65 yas indirimli tutar: " + itut);

                    }


            }

            // Aynı sistemin tip 2 için olan versiyonu sadece genel tutarı %20 indirimli yapacağım.

            if (yas > 0 && mesafe > 0 && tip == 2) {

                tutar = mesafe * ucret;

                System.out.println("Indirimsiz Gidis&Donus Tutari : " + tutar);

                    if (yas < 12) {

                        indirim = tutar * 0.5;
                        itut = tutar - indirim;
                        indirim = itut * 0.2;
                        tutar = (itut - indirim) * 2;
                        System.out.println("12 yas indirimli tutar : " + tutar);

                    } else if (12 < yas && yas <= 24) {

                        indirim = tutar * 0.10;
                        itut = tutar - indirim;
                        indirim = itut * 0.2;
                        tutar = (itut - indirim) * 2;

                        System.out.println("12-24 yas indirimli tutar: " + tutar);

                    } else if (24 < yas && yas < 65) {

                        tutar = tutar * 2;

                        System.out.println("Normal tutar: " + tutar);

                    } else if (yas >= 65) {

                        indirim = tutar * 0.30;
                        itut = tutar - indirim;
                        indirim = itut * 0.2;
                        tutar = (itut - indirim) * 2;

                        System.out.println("65 yas indirimli tutar: " + tutar);
                    }


            }

            if(tip !=1 && tip!=2){

                System.out.println("Lutfen bilgilerinizi kontrol ediniz! ");

            }
                else if(yas>0 && mesafe<0 ){
                System.out.println("Mesafe bilginizi kontrol ediniz!!!");

                } else if (yas<0) {
                    System.out.println("Yas bilginizi kontrol ediniz.");

            }


    }
}
