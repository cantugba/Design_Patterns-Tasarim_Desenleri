package GuiControlExample;

// Abstraction
public abstract class AbsControl {
    protected IControlImplementor implementor;
    private String name;

    public AbsControl(String name) {
        this.name = name;
    }

    public IControlImplementor getImplementor() {
        return implementor;
    }

    public void setImplementor(IControlImplementor implementor) {
        this.implementor = implementor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void Render();
}

// Refined Abstraction
class Button extends AbsControl {
    private IControlImplementor implementor;

    public Button(String name) {
        super(name);
        this.implementor = null;
    }


    @Override
    public void setImplementor(IControlImplementor implementor1) {

        if ((implementor1 instanceof IosButton) || (implementor1 instanceof AndroidButton)) {
            this.implementor = implementor1;
            System.out.println("setleme tamamlandı");
        }
        else {
            System.out.println("Yanlış implementor set edildi.");
        }
    }

    @Override
    public IControlImplementor getImplementor() {
        return implementor;
    }


    @Override
    void Render() {
        this.implementor.display();
    }
}

// Refined Abstraction
class TextBox extends AbsControl {
    private IControlImplementor implementor;

    public TextBox(String name) {
        super(name);
        this.implementor = null;
    }

    @Override
    public IControlImplementor getImplementor() {
        return implementor;
    }

    @Override
    public void setImplementor(IControlImplementor implementor1) {

        if ((implementor1 instanceof IosTextBox) || (implementor1 instanceof AndroidTextBox)) {
            this.implementor = implementor1;
            System.out.println("setleme tamamlandı");
        }
        else {
            System.out.println("Yanlış implementor set edildi.");
        }
    }

    @Override
    void Render() {
        this.implementor.display();
    }
}
