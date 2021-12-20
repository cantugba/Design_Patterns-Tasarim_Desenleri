package davranıssalobserver;

public class DavranıssalObserver {
    
    public static void main(String[] args) {
        
        NewNotificationService ns = new NewNotificationService();
        
        Subscriber s1 = new NewFollower("Tugba can");
        Subscriber s2 = new NewFollower("Zeynep Pelin");
        Subscriber s3 = new NewFollower("canus pyerk");
        Subscriber s4 = new NewFollower("kurvet marakas");
        
        ns.Register(s1);
        ns.Register(s4);
        ns.Register(s3);
        ns.Register(s2);
        
        
        ns.postMesaj("fener kumeye");
        ns.Unregister(s3);
        ns.postMesaj("merve tufekçi 123124124");
    }
    
}
