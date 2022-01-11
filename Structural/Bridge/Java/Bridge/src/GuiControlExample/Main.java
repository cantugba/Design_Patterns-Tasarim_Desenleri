package GuiControlExample;

public class Main {
    public static void main(String[] args) {
        AbsControl btn = new Button("btnTest");

        btn.setImplementor(new IosButton());
        btn.Render();

        btn.setImplementor(new AndroidButton());
        btn.Render();

        AbsControl txt = new TextBox("txtTest");

        txt.setImplementor(new IosTextBox());
        txt.Render();

        txt.setImplementor(new AndroidTextBox());
        txt.Render();
    }
}
