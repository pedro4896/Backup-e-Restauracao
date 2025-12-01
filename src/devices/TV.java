package devices;

public class TV {

    public void on() {
        System.out.println("TV ligada.");
    }

    public void off() {
        System.out.println("TV desligada.");
    }

    public void setChannel(int ch) {
        System.out.println("Canal da TV ajustado para " + ch);
    }

    public void setVolume(int v) {
        System.out.println("Volume da TV ajustado para " + v);
    }
}
