import java.util.Arrays;
        
        
public class pcEngineer implements IEngineer{
    private boolean askerlik;
    private boolean adliSicilSorgu;

    public pcEngineer(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicilSorgu = adliSicilSorgu;
    }
    
        
    @Override
    public void askerlikDurumu() {
        if (askerlik) {
            System.out.println("Askerliğimi Yaptım");
            
        }
        else{
            System.out.println("Henüz Yapılmadı");}
    }

    @Override
    public String MezuniyetOrtalama(double derece) {
        return "Ortalamam:"+derece;
    }

    @Override
    public void adliSicil() {
         if (adliSicilSorgu) {
            System.out.println("Adli Sicil Kaydım Bulunuyor..");
            
        }
        else{
            System.out.println("Adli sicil kaydım bulunmuor");}
        }
    
    @Override
    public void isTecrubesi(String[] array) {
        System.out.println("Bilgiyar Müh Olarak Şu Şirietlerde Çalıştım");
        
        for (int i = 0; i < array.length; i++) {
            
            System.out.println(array[i]);
            
            
        }
    }
  
}
