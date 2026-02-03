import java.util.ArrayList;
import java.util.List;

public class Azienda {
    private String nome;
    private String ragioneSociale;
    private String provincia;
    private String settore;
    private Certificazione certificazione;
    private List<IniziativaSociale> iniziativeSociale;
    private List<SanzioneAmbientale> sanzioneAmbientale;

    public Azienda(String nome, String ragioneSociale, String provincia, String settore, Certificazione certificazione) {
        this.nome = nome;
        this.ragioneSociale = ragioneSociale;
        this.provincia = provincia;
        this.settore = settore;
        this.certificazione = certificazione;
        this.iniziativeSociale = new ArrayList<>();
        this.sanzioneAmbientale = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Azienda{" +
                "nome='" + nome + '\'' +
                ", ragioneSociale='" + ragioneSociale + '\'' +
                ", provincia='" + provincia + '\'' +
                ", settore='" + settore + '\'' +
                ", certificazione=" + certificazione +
                ", iniziativeSociale=" + iniziativeSociale +
                ", sanzioneAmbientale=" + sanzioneAmbientale +
                '}';
    }
}
