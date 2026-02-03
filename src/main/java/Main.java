import java.security.cert.Certificate;

public class Main {
    public static void main(String[] args) {
        String nomeFile = "azienda.json";

        Certificazione c = new Certificazione(10.1, 3.13, 5.16);
        Azienda a = new Azienda("Betti.srl","Canotte da basket", "Napoli", "Sportivo", c);

        Scrittore s = new Scrittore(nomeFile, a);
        Lettore l = new Lettore(nomeFile);

        Thread thread_scrittore = new Thread(s);
        Thread thread_lettore = new Thread(l);

        thread_scrittore.start();
        thread_lettore.start();

        try{
            thread_scrittore.join();
            thread_lettore.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
