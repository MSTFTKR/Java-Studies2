
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class CityTour {
    
    public static void printProcess(){
        System.out.println("0 - İşlemleri Göster:.:");
        System.out.println("1 - Bir Sonraki Şehre Git:.:");
        System.out.println("2 - Bir Önceki Şehre Git:.:");
        System.out.println("3 - Uygulamadan Çık:.:");
        
    }
    
    public static void citiesTour(LinkedList<String> cities){
        ListIterator<String> iterator=cities.listIterator();
        Scanner scanner=new Scanner(System.in);
        int process;
        
        printProcess();
        
        if (!iterator.hasNext()){
            System.out.println("Herhangi Bir şehir BUlunmuyoy");
        }
        boolean exit=false;
        boolean next=true;
        
        
        while(!exit){
            System.out.println("İşlemi Seçiniz...:");
            process=scanner.nextInt();
        
            switch (process) {
                case 0:
                    printProcess();
                    break;
                case 1:
                    if (!next){
                            if (iterator.hasNext()) {
                                iterator.next();
                            
                        }
                        next=true;
                    
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Şehre Gidilyor: "+iterator.next());
                        
                        
                    }
                    else{
                        System.out.println("Gidilecek Şehir Kalmadı..");
                        next=true;  
                    }
                    break;
                case 2:
                    if (next){
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                            
                        }
                    next=false;
                    
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println("Şehre Gidiliyor: "+iterator.previous());
                        
                    }
                    else{
                        System.out.println("Tur başına döndünüz..");
                    }
                    break;
                case 3:
                    exit=true;
                    System.out.println("Uygulamadan Çıkılıyor..");
                    break; 
                default:
                    System.out.println("Hatalı Giriş Yaptınız");
                    
                    
                
            }
        
        
        }
        
        
    }
    

    public static void main(String[] args) {
        LinkedList<String> cities=new LinkedList<String>();
        
        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("Konya");
        cities.add("İzmir");
        cities.add("Edirne");
        cities.add("Ankara");
        
        
        citiesTour(cities);
    }
}
