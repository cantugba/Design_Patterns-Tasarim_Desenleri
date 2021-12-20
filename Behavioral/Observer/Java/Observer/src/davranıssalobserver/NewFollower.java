
package davranıssalobserver;
public class NewFollower implements Subscriber{
    
    private String name;
    
    public NewFollower(String name ){
        this.name= name;
    }

    @Override
    public void mesaj(String mesaj) {
        System.out.println("Mesaj: " + this.name);
    }
    
}
