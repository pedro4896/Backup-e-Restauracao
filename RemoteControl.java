import command.*;
import devices.*;

import java.util.List;

public class RemoteControl {

    public void pressButton(Command command) {
        command.execute();
    }

    // Reexecuta comandos salvos
    public void recover() {
        System.out.println("\n🔄 Recuperando comandos após pane elétrica...");

        List<String> linhas = CommandStore.load();

        for (String s : linhas) {
            switch (s) {
                case "LIGHT_ON":
                    new LightOnCommand(new Light()).execute();
                    break;
                case "LIGHT_OFF":
                    new LightOffCommand(new Light()).execute();
                    break;
                case "TV_ON":
                    new TVOnCommand(new TV()).execute();
                    break;
                case "TV_OFF":
                    new TVOffCommand(new TV()).execute();
                    break;
            }
        }
    }
}
