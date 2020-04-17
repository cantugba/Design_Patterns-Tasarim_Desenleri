package Facade;

public class Islemci {
    public void acil(){
        System.out.println("İşlemci açıldı");
    }

    public void konumlan(final String adres){
        System.out.println(adres+"'nde konumlandı");
    }

    public void calis(){
        System.out.println("İşlemci calistı");
    }
}
