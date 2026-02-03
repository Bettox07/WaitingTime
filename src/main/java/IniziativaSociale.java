public class IniziativaSociale {
    private float importo;
    private String descrizione;
    private String dataAvvio;
    private int durataGiorni;

    public IniziativaSociale(float importo, String descrizione, String dataAvvio, int durataGiorni) {
        this.importo = importo;
        this.descrizione = descrizione;
        this.dataAvvio = dataAvvio;
        this.durataGiorni = durataGiorni;
    }

    public float getImporto() {
        return importo;
    }

    public void setImporto(float importo) {
        this.importo = importo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDataAvvio() {
        return dataAvvio;
    }

    public void setDataAvvio(String dataAvvio) {
        this.dataAvvio = dataAvvio;
    }

    public int getDurataGiorni() {
        return durataGiorni;
    }

    public void setDurataGiorni(int durataGiorni) {
        this.durataGiorni = durataGiorni;
    }

    @Override
    public String toString() {
        return "SanzioneAmbientale{" +
                "importo=" + importo +
                ", descrizione='" + descrizione + '\'' +
                ", dataAvvio='" + dataAvvio + '\'' +
                ", durataGiorni=" + durataGiorni +
                '}';
    }
}
