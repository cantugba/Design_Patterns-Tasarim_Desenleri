
package davranıssalobserver;

public interface NotificationService {
    
    public void Register(Subscriber subscriber);
    public void Unregister(Subscriber subscriber);
    public void notifySubscribers(String mesaj);
    public void postMesaj(String mesaj);
    
}
