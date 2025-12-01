package command;

import devices.TV;

public class TVOnCommand implements Command {

    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
        CommandStore.store(this);
    }

    @Override
    public String serialize() {
        return "TV_ON";
    }
}
