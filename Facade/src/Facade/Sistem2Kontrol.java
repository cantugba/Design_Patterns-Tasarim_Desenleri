package Facade;

public class Sistem2Kontrol {
    private String tc;
    public Sistem2Kontrol(){
        this.tc=tc;
    }


    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getTc() {
        return tc;
    }
    public void uyeEkle(String tc){

        System.out.println("Uye eklendi: " +tc);
    }
}
