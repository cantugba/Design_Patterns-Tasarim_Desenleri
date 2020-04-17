package AdapterYapısal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String islemler="1-Malzeme Tutari Hesapla \n"
                +"2-İskonto lu Tutari Hesapla\n"
                +" q- Uygulamadan Çık";

        System.out.println(islemler);
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Fiyat girin: ");
            double fiyat=sc.nextDouble();
            System.out.println("miktarı girin: ");
            double miktar = sc.nextDouble();
            System.out.println("miktarı girin: ");
            double iskonto = sc.nextDouble();


            final Adaptee adaptee= new Adaptee(fiyat,miktar,iskonto);
            final Adapter adapter = new Adapter(adaptee);
        }



    }
}
