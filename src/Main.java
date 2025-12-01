import command.*;
import devices.*;

public class Main {
    public static void main(String[] args) {

        RemoteControl rc = new RemoteControl();

        Light light = new Light();
        TV tv = new TV();

        // Executar comandos
        rc.pressButton(new LightOnCommand(light));
        rc.pressButton(new TVOnCommand(tv));
        rc.pressButton(new LightOffCommand(light));
        rc.pressButton(new TVOffCommand(tv));

        System.out.println("\n⚠ SIMULANDO PANE ELÉTRICA...");
        System.out.println("Sistema desligado!");

        // Recuperar sistema
        rc.recover();
    }
}
