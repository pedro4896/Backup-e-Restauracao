package command;

import devices.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
        CommandStore.store(this);
    }

    @Override
    public String serialize() {
        return "LIGHT_ON";
    }
}
