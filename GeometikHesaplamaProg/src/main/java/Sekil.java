
public abstract class Sekil {
    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }

    abstract void alanHesapla();

    public String getisim() {
        return isim;
    }

    public void setisim(String isim) {
        this.isim = isim;
    }
    
}
