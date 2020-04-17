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
public abstract class PlayerHandler {
   protected PlayerHandler sonrakiHandler;
   private int sayi;

   
   public PlayerHandler sonrakiHandler(PlayerHandler sonraki){
       sonrakiHandler=sonraki;
       return sonraki;
   }
   
   public abstract void Play(String filePath);
    
}
