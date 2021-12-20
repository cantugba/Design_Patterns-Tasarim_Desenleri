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
public class AVİ extends PlayerHandler {
    
        @Override
    public void Play(String filePath) {
        if(filePath.endsWith(".avi")){
            System.out.println(filePath+"oynatılıyor");
        }
        else{
            
              System.out.println(filePath+"geçersiz dosya ");
           
        }
    }
    
}
