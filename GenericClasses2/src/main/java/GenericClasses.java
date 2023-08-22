
import java.util.ArrayList;


public class GenericClasses {

    public static void main(String[] args) {
        
        sayisal sayisal1=new sayisal(40, 21, 15, 15);
        
        sayisal sayisal2=new sayisal(30, 7, 10, 25);
        
        sayisal birinci= birinci(sayisal1, sayisal2);
        
        esitAgirlik eagirlik1=new esitAgirlik(10, 30, 25, 5);
        esitAgirlik eagirlik2=new esitAgirlik(20, 25, 20, 15);
        
        esitAgirlik birinci2=birinci(eagirlik1, eagirlik2);
        
        System.out.println("Birinci öğrenci puanı:"+birinci.puanHesapla());
        System.out.println("Birinci eşit ağırlık öğrenci puanı:"+birinci2.puanHesapla());
        
//      Character[] charDizi={'J','A','V','A'};
//      Integer[] integerDizi={1,2,3,4,5,6};
//      
//      String[] stringDizi={"C++","CSS","Html","Php","Java"};
//      Ogrenci[] ogrenciDizi={new Ogrenci("Mustafa"),new Ogrenci("Ali"),new Ogrenci("hüseyin")};
//      
//        yazdir(charDizi);
//        yazdir(stringDizi);
//        yazdir(integerDizi);
//        yazdir(ogrenciDizi);
      
    }
    
    public static <E extends aday> E birinci(E e1, E e2){
    
        if(e1.puanHesapla()>e2.puanHesapla()){
         return e1;
        
        }
        else {
        return e2;}
    }
    
    /*public static <E>void yazdir(E[] dizi){
        
        for (E e : dizi) {
            System.out.println(e);
            
        }
        
    }*/
}
