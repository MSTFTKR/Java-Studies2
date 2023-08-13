
public class Interfaces {

    public static void main(String[] args) {
        
        pcEngineer test=new pcEngineer(false, false);
        System.out.println(test.MezuniyetOrtalama(3.33));
        test.adliSicil();
        test.askerlikDurumu();
        
        String[] tecrube={"TurkNet","MarsLogistic","Microsoft"};
        
        test.isTecrubesi(tecrube);
    }
}
