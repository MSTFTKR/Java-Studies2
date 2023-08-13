
public class YurtDisiCikisProgrami {

    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Havalimanına hoşgeldin");
        
        String sartlar="150 tl harç bedeli, siyasi yasağınızın olmaması ve vizeinizin olması gerekmektedir";
        
        String mesaj="Yurtdışı şartlarının hepsini sağlamanız gerekemktedir";
        
        while (true) {
            System.out.println("++++++++++++++++++++++"); 
            System.out.println(mesaj);
            System.out.println("++++++++++++++++++++++");    
            System.out.println(sartlar);
            
            Yolcu yolcu=new Yolcu();
            System.out.println("Karç bedeli Kontrol ediliyor");
            
            Thread.sleep(3000);
            
            if (yolcu.yurtDisiHarci()==false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Siyasi Yasak Kontrol ediliyor");
            
            Thread.sleep(3000);
            
            if (yolcu.siyasiYasak()==false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Vizeniz Kontrol ediliyor");
            
            Thread.sleep(3000);
            
            if (yolcu.vizeDurumu()==false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("İŞlemler tamam yurtdışına çıkabilirsiniz");
            break;
            
        }
        
        
        
        
    }
}
