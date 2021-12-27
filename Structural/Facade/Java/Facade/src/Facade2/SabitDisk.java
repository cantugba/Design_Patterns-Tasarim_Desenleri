package Facade2;

public class SabitDisk {
    public String oku(final String baslangic_adresi,final String uzunluk){
        System.out.println("Sabit disk '" + baslangic_adresi + "' " + "adresinden " + uzunluk
                + " kadar bilgiyi okudu.");
        return "okunan bilgi";
    }
}
