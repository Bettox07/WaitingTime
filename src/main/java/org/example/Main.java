package org.example;
import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

import java.io.*;
public class Main {
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public static void salvaSuFile(Persona persona) {
        String json = gson.toJson(persona);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("persona.json"))) {
            writer.write(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Persona leggiFile(String file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            return gson.fromJson(reader, Persona.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
