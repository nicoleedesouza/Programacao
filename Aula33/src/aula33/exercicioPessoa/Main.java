package aula33.exercicioPessoa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();

        lista.add(new Pessoa("Ana", "Silva"));
        Pessoa p1 = new Pessoa("Pedro", "Fones");
        lista.add(p1);
        System.out.println(lista);
    }
}
