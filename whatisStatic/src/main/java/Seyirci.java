/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author musta
 */
public class Seyirci {
    
    
    private String isim;
    //public static int seyirciSayisi=0;
    private static int seyirciSayisi=0;
    
    
    
    public Seyirci(String isim) {
        this.isim = isim;
        seyirciSayisi++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public void oyunSeyret(){
    
        System.out.println(isim+" oyun Syrediyor");
    }

    public static int getSeyirciSayisi() {
        //System.out.println(isim); statik olanldan statik olmayan çağrılıyor hata.
        return seyirciSayisi;
    }
    
}
