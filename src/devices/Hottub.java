package devices;

public class Hottub {

    public void circulate() {
        System.out.println("Hottub circulando água.");
    }

    public void jetsOn() {
        System.out.println("Jatos do Hottub ligados.");
    }

    public void jetsOff() {
        System.out.println("Jatos do Hottub desligados.");
    }

    public void setTemperature(int t) {
        System.out.println("Temperatura do Hottub ajustada para " + t);
    }
}
