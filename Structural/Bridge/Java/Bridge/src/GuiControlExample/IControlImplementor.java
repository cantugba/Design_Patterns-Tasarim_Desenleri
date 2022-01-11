package GuiControlExample;

// implementor
public interface IControlImplementor {
    void display();
}

// concrete implementor
// ios
class IosButton implements IControlImplementor {

    @Override
    public void display() {
        System.out.println("IOS Button");
    }
}

class IosTextBox implements IControlImplementor {

    @Override
    public void display() {
        System.out.println("IOS TextBox");
    }
}

// Android
class AndroidButton implements IControlImplementor {

    @Override
    public void display() {
        System.out.println("Android Button");
    }
}

class AndroidTextBox implements IControlImplementor {

    @Override
    public void display() {
        System.out.println("Android TextBox");
    }
}