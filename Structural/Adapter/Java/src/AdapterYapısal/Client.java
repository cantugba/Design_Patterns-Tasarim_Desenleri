package AdapterYapısal;

import java.util.Scanner;

public class Client {
    private final ITutarHesapla hesaplayici;

    public Client(ITutarHesapla hesaplayici,double fiyat,double miktar) {
        this.hesaplayici = hesaplayici;

    }

    public void OdenecekTutar(ITutarHesapla hesaplayici){
        Scanner sc = new Scanner(System.in);
        System.out.println("Fiyat girin: ");
        double fiyat=sc.nextDouble();
        System.out.println("miktarı girin: ");
        double miktar = sc.nextDouble();
        System.out.println("Ödenecek tutar: "+ hesaplayici.hesapla(fiyat,miktar));
    }

}
