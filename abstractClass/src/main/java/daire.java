
public class daire extends Sekil{
    private int yaricap;
    
    public daire(String isim,int yaricap) {
        super(isim);
        this.yaricap=yaricap;
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim()+"Alanı: "+(Math.PI*yaricap*yaricap));
        
    }
    
    
    
}
