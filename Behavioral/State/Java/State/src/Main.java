public class Main {
    public static void main(String[] args) {
        /*
        Soket nesnesini olusturuyoruz,
        her Do metodunu calistirdigimizda farkli islemler calisacaktir
         */

        Soket s = new Soket(8080);
        s.Do();
        s.Do();
        s.Do();
    }
}

// State
interface ISocketState {
    void handle(Soket s);
}

// ConcreteState
class SocketStateAc implements ISocketState {

    @Override
    public void handle(Soket s) {
        System.out.println( s.Port + " Port soket acildi");
        s.State = new SocketStateDinle();
    }
}

class SocketStateDinle implements ISocketState{
    @Override
    public void handle(Soket s) {
        System.out.println( s.Port + " Port soket dinleniyor");
        s.State = new SocketStateKapat();
    }
}

class SocketStateKapat implements ISocketState {
    @Override
    public void handle(Soket s) {
        System.out.println( s.Port + " Port soket kapatildi");
        s.State = new SocketStateAc();
    }
}

// context
class Soket {
    public int Port;

    private ISocketState IState;

    public Soket(int Port) {
        this.Port = Port;
        State = new SocketStateAc();
    }

    public ISocketState getIState() {
        return IState;
    }

    public void setIState(ISocketState IState) {
        this.IState = IState;
    }

    public ISocketState State;

    public int getPort() {
        return Port;
    }

    public void setPort(int port) {
        Port = port;
    }

    public ISocketState getState() {
        return IState;
    }

    public void setState(ISocketState state) {
        IState = state;
    }

    public void Do()
    {
        State.handle(this);
    }

}
