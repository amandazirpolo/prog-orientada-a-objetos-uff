package turma;

import java.io.IOException;

public class MainTurma {

    public static void main(String[] args) throws IOException {
        Turma t = new Turma("TCC00328", "307", "11H - 13H", new Professor("Isabel Rosseti", "pika"));

        t.preencheTurma();

        t.escreveArquivo();
    }
}
