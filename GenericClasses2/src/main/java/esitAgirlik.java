
public class esitAgirlik extends aday{

    public esitAgirlik(int turkce, int mat, int edebiyat, int fizik) {
        super(turkce, mat, edebiyat, fizik);
    }
    
    
    
    
    
    public int puanHesapla() {
        return getTurkce()*5+getMat()*5+getFizik()*2+getEdebiyat()*5;
        
    }
}
