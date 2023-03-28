public class Araba {
    //kasaTipi,model,kullanimKm,fiyat ve kapı değişkenlerini tanımla
    private String kasaTipi;
    private String model;
    private int kullanimKm;
    private int fiyat;
    private int kapi;
    public Araba(String kasaTipi, String model, int kullanimKm, int fiyat, int kapi) {
        this.kasaTipi = kasaTipi;
        this.model = model;
        this.kullanimKm = kullanimKm;
        this.fiyat = fiyat;
        this.kapi = kapi;
    }

    public String getKasaTipi() {
        return kasaTipi;
    }

    public String getModel() {
        return model;
    }

    public int getKullanimKm() {
        return kullanimKm;
    }

    public int getFiyat() {
        return fiyat;
    }

    public int getKapi() {
        return kapi;
    }


    //arabayiSur methotu oluşturun.Bu metot ile arabanın km si verilen değer ile arttıtılsın ve konsola bir yazı yazılsın
     public void arabayiSur(int surulenKm){
         this.kullanimKm += surulenKm;
         System.out.println("Arabanin yeni kullanım kilometresi " + this.kullanimKm);
     }
    //satısFiyati adında bir metot olusturarak arabanın satıs fiyatını belirleyin.

    public int satisFiyati(int yeniSatısFiyati){
         return this.fiyat = yeniSatısFiyati;
    }
}
