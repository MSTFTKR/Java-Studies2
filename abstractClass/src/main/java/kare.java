
public class kare extends Sekil{
    private int kenar;
    
    public kare(String isim,int kenar) {
        super(isim);
        this.kenar=kenar;
    }
    
    @Override
    void alan_hesapla() {
        System.out.println(getIsim()+"alanı: "+(kenar*kenar)+"'dir");
    }
    public void cevreHesapla(){
        System.out.println(getIsim()+"Çevresi:"+kenar*4);
    }
    
}
