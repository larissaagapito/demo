package exerciocio.dio;

public class Main {
    public static void main(String[] args) {

            //Calculadora
            System.out.println("Exercicio 1 = Calculadora");    
            Calculadora.soma(3, 7);
            Calculadora.subtracao(9, 1.5);
            Calculadora.multiplicacao(3, 5);
            Calculadora.divisao(8, 2);

            //Mensagem
            System.out.println("Exercicio 2 = Mensagem");
            Mensagem.obterMensagem(8);
            Mensagem.obterMensagem(16);
            Mensagem.obterMensagem(0);
        
            //Emprestimo
            System.out.println("Exercicio 3 = Emprestimo");
            Emprestimo.calcular(200, Emprestimo.getDuasParcelas());
            Emprestimo.calcular(500, 3);
            Emprestimo.calcular(350, 5);
        
        }
}