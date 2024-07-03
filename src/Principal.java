import br.com.desafio.modelos.Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Maria");
        pessoa1.setIdade(19);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Natan");
        pessoa2.setIdade(20);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Cauã");
        pessoa3.setIdade(3);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("O tamanho da lista de pessoas é: " + listaDePessoas.size());
        System.out.println("A primeira pessoa dessa lista é: " + listaDePessoas.get(0));
        System.out.println("Lista de pessoas completa de pessoas: \n" + listaDePessoas);

    }
}
