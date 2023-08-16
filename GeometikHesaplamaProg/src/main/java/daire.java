
public class daire extends Sekil{
        private int yaricap;
    public daire(String isim, int yaricap) {
        super(isim);
        this.yaricap=yaricap;
        
    }

    
    
    
    @Override
    public void alanHesapla() {
        System.out.println(getisim()+" alanı : "+Math.PI*yaricap*yaricap);
       
    }
    
    
    
}
