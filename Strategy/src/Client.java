/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Client {
    public static void main(String[] args) {
        Eleman e = new Eleman(new DepartmanA(), new YoneticiMaasHesap());
        int yoneticiM= e.maasHesapla();
        int yoneticiIzin= e.izinHesapla();
        
        e = new Eleman(new DepartmanB(), new MuhendisMaasHesap());
        int muhendisM= e.maasHesapla();
        int muhendisIzin= e.izinHesapla();
        
        System.out.println("Yonetici Maasi: " + yoneticiM + " Yonetici İzni: " + yoneticiIzin);
        System.out.println("Muhendis Maasi: " + muhendisM + " Muhendis İzni: " + muhendisIzin);
        
    }
}
