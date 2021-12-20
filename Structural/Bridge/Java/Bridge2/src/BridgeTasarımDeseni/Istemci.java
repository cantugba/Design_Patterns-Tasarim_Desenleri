package BridgeTasarımDeseni;

public class Istemci {
    public static void main(String[] args) {
        final Sekil[] sekiller = new Sekil[3];
        sekiller[0]= new Dikdortgen(new Kalip2());
        sekiller[1]= new Ucgen(new Kalip2());
        sekiller[2] = new Cember(new Kalip1());

        for (final Sekil sekil: sekiller ) {
            sekil.ciz();
        }
    }
}
