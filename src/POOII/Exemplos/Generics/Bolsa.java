package POOII.Exemplos.Generics;

import java.util.ArrayList;
import java.util.List;

public class Bolsa<T> {
    private List<T> itens;

    public Bolsa() {
        this.itens = new ArrayList<>();
    }

    public void adicionar(T item) {
        itens.add(item);
    }

    public void apresentarItens() {
        for (T item : itens) {
            System.out.println(item);
        }
    }
}
