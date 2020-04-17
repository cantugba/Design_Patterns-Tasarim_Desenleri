package Facade;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Istemci {
    public static void main(String[] args) {
     Facade facade = Facade.getNesne();
      Scanner sc= new Scanner(System.in);

        try {
            System.out.println("Uye Ekle");
            String tc= sc.nextLine();
            Facade.getNesne().Sistem2UyeEkle(tc);
            facade.getSistem1Kontrol().KaraListe(tc);
            //Facade.getNesne().sistem1Kontrol();
            System.out.println(" "+ Facade.getNesne().getSistem2Kontrol().toString());
          // Facade.getNesne().getTcKontrol().Kontrol("");

            //System.out.println("Sistrm kontrol: "+Facade.getNesne().getSistem2Kontrol());
            //System.out.println("Tc kontr0l: "+Facade.getNesne().getTcKontrol());

        }catch (NullPointerException e){
            e.printStackTrace();
        }

    }
}
