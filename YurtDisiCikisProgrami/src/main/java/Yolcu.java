
import java.util.Scanner;


public class Yolcu implements YurtDisiSartlari{
    private int  harcKontrol;
    private boolean siyasiYasakKonrtol;
    private boolean vizeDurumuKontrol;

    public Yolcu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yatırdığınız Harç Bedeli..:");
        this.harcKontrol=scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Siyasi Yasağınız var mı?");
        String cevap=scanner.nextLine();
        
        if (cevap.equals("evet")){
            
            this.siyasiYasakKonrtol=true;
        }
        else{
        this.siyasiYasakKonrtol=false;
        }
        
        System.out.println("Vizenizz var mı");
        String cevap2=scanner.nextLine();
        
        if (cevap2.equals("evet")){
            
            this.vizeDurumuKontrol=true;
        }
        else{
        this.vizeDurumuKontrol=false;
        }
    
    }
    @Override
    public boolean yurtDisiHarci() {
       
        if(this.harcKontrol<150){
        
            System.out.println("Yurtdışı harcını tam yatırın");
            return false;
        }
        else {
            System.out.println("Harç işlemi tamam");
            return true;
        }
    }

    @Override
    public boolean siyasiYasak() {
        if(this.siyasiYasakKonrtol==true){
        
            System.out.println("Siyasi yasağınız bulunuyro. reddedildi");
            return false;
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor...");
            return true;
        }
    }

    @Override
    public boolean vizeDurumu() {
        if(this.vizeDurumuKontrol==true){
        
            System.out.println("vize işlemii tamam");
            return true;
        }
        else {
            System.out.println("vizeniz yok");
            return false;
        }
    }
    
    
    
    
}
