package Facade;

public class Facade {
    private  Sistem1Kontrol sistem1Kontrol;
    private Sistem2Kontrol sistem2Kontrol;
    private TcKontrol tcKontrol;

    private static Facade facade;
    private Facade(){
        sistem1Kontrol = new Sistem1Kontrol();
        sistem2Kontrol= new Sistem2Kontrol();
        tcKontrol = new TcKontrol();

    }

    public static  Facade getNesne(){
        if( facade == null){
            facade =new Facade();

        }
        return facade;
    }


    public Sistem2Kontrol getSistem2Kontrol(){ return sistem2Kontrol; }
    public Sistem1Kontrol getSistem1Kontrol(){ return sistem1Kontrol;}
    public TcKontrol getTcKontrol(){ return tcKontrol;}

   /* public void sistem1Kontrol(String tc){ sistem1Kontrol = new Sistem1Kontrol(); }
    public void sistem2Kontrol(String tc){sistem2Kontrol = new Sistem2Kontrol(); }
    public void TcKontrol(String tc){ tcKontrol = new TcKontrol(); }*/

    public void Sistem2UyeEkle(String tc){
        if(tcKontrol.Kontrol(tc) && !sistem1Kontrol.KaraListe(tc)){
            sistem2Kontrol.uyeEkle(tc);


        }
    }
}
