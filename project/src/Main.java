import POO.cabeca.Boca;
import POO.cabeca.Cabeca;
import POO.cabeca.Olhos;
import POO.cabeca.Orelha;
import reader.Read_file;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        Pessoa samuel = new Pessoa();
        String path = "C:/pessoa/project/texto.txt";

        Read_file arquivo = new Read_file();
        arquivo.leitor(path);

        System.out.println("amount of balls " + samuel.inferior.partes.qtdBalls);
    }
}

