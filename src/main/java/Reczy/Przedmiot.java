package Reczy;

public class Przedmiot {
    private String rozdzielczosc; // FULL HD, ULTRA, 4k
    private int rozmiar; // ile cali
    private String wyswietlacz; // QLED, LCD
    private String marka; //Panasonic, Samsung, LG, Sony
    private boolean HDR;
    private boolean Smart;
    private boolean WIFI;
    private int cena;
    protected final int id;
    protected static int id_global;

    public Przedmiot(String rozdzielczosc, int rozmiar, String wyswietlacz, String marka, boolean HDR, boolean smart, boolean WIFI, int cena) {
        this.rozdzielczosc = rozdzielczosc;
        this.rozmiar = rozmiar;
        this.wyswietlacz = wyswietlacz;
        this.marka = marka;
        this.HDR = HDR;
        Smart = smart;
        this.WIFI = WIFI;
        this.cena = cena;
        this.id = id_global;
        id_global++;
    }


    public String getRozdzielczosc() {
        return rozdzielczosc;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public String getWyswietlacz() {
        return wyswietlacz;
    }

    public String getMarka() {
        return marka;
    }

    public boolean isHDR() {
        return HDR;
    }

    public boolean isSmart() {
        return Smart;
    }

    public boolean isWIFI() {
        return WIFI;
    }

    public int getCena() {
        return cena;
    }

    Przedmiot()
    {
        id = 0;
    }
}
