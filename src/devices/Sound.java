package devices;

public class Sound {

    public void on() { System.out.println("Som ligado."); }
    public void off() { System.out.println("Som desligado."); }

    public void setCD() { System.out.println("CD selecionado."); }
    public void setRadio() { System.out.println("Rádio selecionado."); }
    public void setVolume(int v) { System.out.println("Volume do som: " + v); }
}
