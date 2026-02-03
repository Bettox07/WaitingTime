public class SanzioneAmbientale {
    private float importo;
    private String descrizione;
    private String data;
    private boolean pagata;

    public SanzioneAmbientale(float importo, String descrizione, String data, boolean pagata) {
        this.importo = importo;
        this.descrizione = descrizione;
        this.data = data;
        this.pagata = pagata;
    }

    public boolean isPagata() {
        return pagata;
    }

    public void setPagata(boolean pagata) {
        this.pagata = pagata;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public float getImporto() {
        return importo;
    }

    public void setImporto(float importo) {
        this.importo = importo;
    }

    @Override
    public String toString() {
        return "SanzioneAmbientale{" +
                "importo=" + importo +
                ", descrizione='" + descrizione + '\'' +
                ", data='" + data + '\'' +
                ", pagata=" + pagata +
                '}';
    }
}
