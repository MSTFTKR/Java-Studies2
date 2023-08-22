/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author musta
 */
public class AnonimInnerClass {

    public static void main(String[] args) {
        
        IOgrenci ogrenci=new IOgrenci() {
            @Override
            public void dersCalis() {
                System.out.println("Ders çalışıyorum");
            }

            @Override
            public void derseGir() {
                System.out.println("Derse Giriyorru");
                
            }
        };
        
        
        ogrenci.dersCalis();
        ogrenci.derseGir();
        System.out.println("00-------------------------------00");
        
        
        AOgrenci ogrenci2=new AOgrenci( "Mustafa", 4654) {
            @Override
            void kayitYaptir() {
                    System.out.println("Kayır Yapılıyıor..."+"İsim : "+getIsim()+" no: "+getNumara());
                
            }
        };
        ogrenci2.kayitYaptir();
        ogrenci2.selam();
        
    }
    
    
    
    
    public interface IOgrenci{
    void dersCalis();
    void derseGir();
    }
    
    public  static abstract class AOgrenci{
        private String isim;
        private int numara;

        public AOgrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }
        
        
        
        
        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }
        
        
        abstract void kayitYaptir();
        public void selam(){
            System.out.println("Selammm");}
    }
    
}
