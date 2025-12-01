package command;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CommandStore {

    private static final String FILE = "backup.txt";

    public static void store(Command command) {
        try (FileWriter fw = new FileWriter(FILE, true)) {
            fw.write(command.serialize() + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao salvar comando: " + e.getMessage());
        }
    }

    public static List<String> load() {
        List<String> linhas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                linhas.add(line);
            }
        } catch (IOException e) {
            System.out.println("Nenhum backup encontrado.");
        }

        return linhas;
    }
}
