package Facade;

public class TcKontrol {
    private String tc;
    public TcKontrol(){
        this.tc=tc;
    }


    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getTc() {
        return tc;
    }
    public boolean Kontrol(String tc){
        System.out.println("Tc Kntrol edilci:"+tc);
       return true;
    }


}
