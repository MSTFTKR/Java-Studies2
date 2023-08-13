
public class MachineEngineer implements IEngineer,IWork{
    private boolean askerlik;
    private boolean adliSicilSorgu;

    public MachineEngineer(boolean askerlik, boolean adliSicilSorgu) {
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
        if (array.length==0) {
            System.out.println("Tecrübesizim");
        }
        else {
            System.out.println("Makine Müh olarak tecrübelerim");}
            
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
                
            }
        }
    
    public void referansGetir(String[] array){
        if (array.length==0) {
            System.out.println("referanasım yok");
        }
        else {
            System.out.println("Referanslarım:...");
        }
            
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
                
            }
    }

    @Override
    public void calis() {
        System.out.println("Makine müh mük çalışıyor:)");
    }
    
    
}
    
   
