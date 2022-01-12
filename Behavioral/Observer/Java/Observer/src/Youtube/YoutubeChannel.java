package Youtube;

import java.util.ArrayList;

public class YoutubeChannel implements Observable{
    private ArrayList<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update();
        }
    }

    public void releaseNewVideo(String video) {
        System.out.println("Release new video : " + video);
        notifyObserver();
    }
}
