package command;

public interface Command {
    void execute();
    String serialize(); // para salvar no arquivo
}
