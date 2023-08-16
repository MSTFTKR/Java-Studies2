
public class AbstractClass {

    public static void main(String[] args) {
        
        Sekil sekil;
        sekil=new kare("Kare2",9);
        sekil.alan_hesapla();
        
        
        //Sekil sekil=new Sekil("Sekil");
        
        kare Kare=new kare("kare1", 4);
        daire Daire=new  daire("Daire1", 2);
        
        Daire.alan_hesapla();
        Kare.alan_hesapla();
        Kare.cevreHesapla();
    }
}
