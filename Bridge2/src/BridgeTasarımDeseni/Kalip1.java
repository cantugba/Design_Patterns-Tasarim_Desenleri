package BridgeTasarımDeseni;

import javax.swing.plaf.basic.BasicOptionPaneUI;

public class Kalip1 implements CizimKalibi {
    @Override
    public void cizgiCiz() {
        System.out.println("Kalıp 1 ile çizgi çizildi");
    }

    @Override
    public void cemberCiz() {
        System.out.println("Kalıp 1 ile çember çizildi.");

    }
}
