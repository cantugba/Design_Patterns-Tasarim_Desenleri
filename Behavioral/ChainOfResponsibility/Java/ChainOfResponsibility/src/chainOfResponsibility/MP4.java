
package chainofr1;

/**
 *
 * @author asus
 */
public class MP4 extends PlayerHandler{

    @Override
    public void Play(String filePath) {
        if(filePath.endsWith(".mp4")){
            System.out.println(filePath+"oynatılıyor");
        }
        else{
            if(sonrakiHandler != null){
                sonrakiHandler.Play(filePath);
            }
        }
    }
    
}
