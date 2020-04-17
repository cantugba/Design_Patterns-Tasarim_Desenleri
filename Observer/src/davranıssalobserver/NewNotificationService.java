
package davranıssalobserver;

import java.util.ArrayList;
import java.util.List;


public class NewNotificationService implements NotificationService{
    private List<Subscriber> subcribers;
    private boolean changed;
    private final Object MUTEX = new Object();
    
    public NewNotificationService(){
        this.changed = false;
        this.subcribers= new ArrayList<Subscriber>();
    }

    @Override
    public void Register(Subscriber subscriber) {
        if(subscriber== null) throw new NullPointerException("You can not add empty subscriber!");
        synchronized(MUTEX){
            this.subcribers.add(subscriber);
        }
    }

    @Override
    public void Unregister(Subscriber subscriber) {
        synchronized(MUTEX){
            this.subcribers.remove(subscriber);
        }
    }

    @Override
    public void notifySubscribers(String mesaj) {
        List<Subscriber> subscribersLocal = null;
        synchronized(MUTEX){
        if(!this.changed) return;
        subscribersLocal = new ArrayList<Subscriber>(this.subcribers);
        this.changed= false;

        }
        
        if(subscribersLocal != null){
            for(Subscriber subscriber: subscribersLocal){
                subscriber.mesaj(mesaj);
            }
        }
      
    }

    @Override
    public void postMesaj(String mesaj) {
        this.changed=true;
        notifySubscribers(mesaj);
    }
    
}
