package POO.inferior;

public class Inferior {
    public Perna pernaDireita;
    public Perna pernaEsquerda;
    public Sinuca partes;

    public Inferior(){
        this.pernaDireita = new Perna();
        this.pernaEsquerda = new Perna();
        this.partes = new Sinuca();
    }
}
