import POO.cabeca.Cabeca;
import POO.inferior.Inferior;
import POO.tronco.Tronco;

public class Pessoa {
    public int age;
    public float higth;
    public String name;
    public Cabeca cabeca;
    public Tronco tronco;
    public Inferior inferior;

    public Pessoa() {
        this.age = 18;
        this.higth = 1.80f;
        this.name = "Samuel";

        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferior = new Inferior();
    }
}
