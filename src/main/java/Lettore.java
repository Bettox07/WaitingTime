import com.google.gson.Gson;
import java.io.*;

public class Lettore implements Runnable{
    private File file;
    private Gson gson = new Gson();

    public Lettore(String nomeFile){
        this.file = new File(nomeFile);
    }

    public Azienda leggiFileJson()
    {
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            return gson.fromJson(br, Azienda.class);
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void run() {
        Azienda a = leggiFileJson();
        if (a == null) {
            System.err.println("Impossibile leggere l'oggetto Azienda dal file");
        } else {
            System.out.println(a);
        }
    }
}

