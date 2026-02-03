import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Scrittore implements Runnable{
    private File file;
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private Azienda a;

    public Scrittore(String nomeFile, Azienda a)
    {
        this.file = new File(nomeFile);
        this.a = a;
    }

    public void scriviFileJson(Azienda a)
    {
        String json = gson.toJson(a);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            bw.write(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
        scriviFileJson(a);
    }
}
