package command;

import devices.TV;

public class TVOffCommand implements Command {

    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
        CommandStore.store(this);
    }

    @Override
    public String serialize() {
        return "TV_OFF";
    }
}
