package Facade;
//Facade
public class Bilgisayar {
    final private Bellek bellek;
    final private SabitDisk sabitDisk;
    final private Islemci islemci;

    private static Bilgisayar facade;
    private Bilgisayar(){
        bellek=new Bellek();
        sabitDisk= new SabitDisk();
        islemci = new Islemci();
    }

    public static Bilgisayar getNesne(){
        if(facade == null){
            facade= new Bilgisayar();
        }
        return facade;
    }
/*
    public Bellek getBellek(){ return bellek;}

    public SabitDisk getSabitDisk() {
        return sabitDisk;
    }

    public Islemci getIslemci() {
        return islemci;
    }*/

    public void ac(){
        islemci.acil();
        final String acilis_bilgisi = sabitDisk.oku("baslangıc:4382432","sektor uzunluğu:2314522");
        bellek.yukle("acilis adresi:23425",acilis_bilgisi);
        islemci.konumlan("dsafasg");
        islemci.calis();
    }
}
