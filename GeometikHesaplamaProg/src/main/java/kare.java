/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author musta
 */
public class kare extends Sekil{
    private int kenar;

    public kare(String isim, int kenar) {
        super(isim);
        this.kenar=kenar;
        
    }

    
     
    
    public void alanHesapla(){
        System.out.println(getisim()+" in alanı : "+kenar*kenar);
    
    
    }
    
    
    
    
}
