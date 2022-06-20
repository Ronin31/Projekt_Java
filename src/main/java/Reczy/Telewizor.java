package Reczy;

public final class Telewizor extends Przedmiot {

    private String HDRek, siec, Smarcik;

    public String toString(){
        String napis;

        if(isHDR() == true)
        {
            HDRek = "HDR";
        }
        else
        {
            HDRek = "";
        }
        if(isWIFI() == true)
        {
            siec = "WiFi";
        }
        else
        {
            siec = "";
        }
        if(isSmart() == true)
        {
            Smarcik = "SmartTV";
        }
        else
        {
            Smarcik = "";
        }
        napis =  (id+1) + " " + getMarka() + " " +getRozdzielczosc() + " " + getRozmiar() + " cali " + getWyswietlacz() + " " + HDRek + " " + siec + " " + Smarcik + " " + getCena() + " zl";
        return napis;
    }

    public Telewizor(String rozdzielczosc, int rozmiar, String wyswietlacz, String marka, boolean HDR, boolean smart, boolean WIFI, int cena) {
        super(rozdzielczosc, rozmiar, wyswietlacz, marka, HDR, smart, WIFI, cena);

    }
}
