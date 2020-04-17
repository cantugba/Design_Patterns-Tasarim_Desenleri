/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofr1;

/**
 *
 * @author asus
 */
public class MPG extends PlayerHandler {
    
        @Override
    public void Play(String filePath) {
        if(filePath.endsWith(".mpg")){
            System.out.println(filePath+"oynatılıyor");
        }
        else{
            if(sonrakiHandler != null){
                sonrakiHandler.Play(filePath);
            }
        }
    }
    
}
