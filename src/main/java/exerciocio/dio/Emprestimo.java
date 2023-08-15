package exerciocio.dio;

public class Emprestimo {
    
    public static int getDuasParcelas (){
        return 2;
    }
    
    public static int getTresParcelas(){
        return 3;

    }

    public static double getTaxaDuasParcelas(){
        return 0.2;
    }

    public static double getTaxaTresParcelas(){
        return 0.35;
    }


    public static void calcular(double valor, int parcelas) {
        if (parcelas == 2){

            double valorFinal = valor + ( valor * getTaxaDuasParcelas());

            System.out.println("O valor do emprestimo para 2 parcelas é: R$ " + valorFinal);
        
        } else if (parcelas == 3) { 

            double valorFinal = valor + ( valor * getTaxaTresParcelas());

            System.out.println("O valor do emprestimo para 3 parcelas é: R$ " + valorFinal);

        } else {

            System.out.println("O numero de parcela é invalido.");
        }    

    }   
}

