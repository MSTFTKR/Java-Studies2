/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author musta
 */
public class sayisal extends aday{

    public sayisal(int turkce, int mat, int edebiyat, int fizik) {
        super(turkce, mat, edebiyat, fizik);
    }

    
    @Override
   public int puanHesapla() {
        return getTurkce()*5+getMat()*5+getFizik()*4+getEdebiyat()*2;
        
    }
    
    
}
