package one.digitalinovation.basecamp;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("\n");
        System.out.println("Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.2);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);
        System.out.println("\n");

        //Mensagem
        System.out.println("Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
        System.out.println("\n");

        //Emprestimo
        System.out.println("Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
