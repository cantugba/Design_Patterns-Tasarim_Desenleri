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
public class ChainOfR1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PlayerHandler mp4 = new MP4();
       PlayerHandler mpG = new MPG();
       PlayerHandler AVİ = new AVİ();
       
       mp4.sonrakiHandler= mpG;
       mpG.sonrakiHandler= AVİ;
      
       
       mp4.Play("video.mpg");
       mp4.Play("video.avi");
       mp4.Play("video.mp4");
       mp4.Play("video.swf");
       
       
    }
    
}
