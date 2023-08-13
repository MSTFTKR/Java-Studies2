
public class Interfaces {

    public static void main(String[] args) {
        
        /*pcEngineer test=new pcEngineer(false, false);
        System.out.println(test.MezuniyetOrtalama(3.33));
        test.adliSicil();
        test.askerlikDurumu();
        String[] tecrube={"TurkNet","MarsLogistic","Microsoft"};
        test.isTecrubesi(tecrube);*/
        
        MachineEngineer makine=new MachineEngineer(true, false);
        
        
        String[] tecrube={};
        String[] referans={"Mustafa Teker","Aslan Kıral"};
        
        makine.MezuniyetOrtalama(2.40);
        makine.adliSicil();
        makine.askerlikDurumu();
        makine.isTecrubesi(tecrube);
        makine.referansGetir(referans);
        makine.calis();
        
        
        
        
        
    }
}
