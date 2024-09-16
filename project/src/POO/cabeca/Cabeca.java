package POO.cabeca;

public class Cabeca {
    public Olhos olho;
    public Boca boca;
    public Orelha orelha;

    public Cabeca(){
        this.olho = new Olhos();
        this.boca = new Boca();
        this.orelha = new Orelha();
    }
}
