import java.util.Scanner;

public class Calc {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    double num1 = 0.0;
    double num2 = 0.0;
    double resultado = 0.0;
    char operacao;
    char novoCalculo = 's';
    Scanner entrada = new Scanner(System.in);
    
    do{
    	System.out.println("=== CALCULADORA SIMPLES ===");
    	System.out.println("---------------------------");
    	System.out.print("Digite um numero: ");
    	num1 = entrada.nextDouble();
    	System.out.print("Digite o segundo numero: ");
    	num2 = entrada.nextDouble();
    	System.out.println("---------------------------\n" +
    			" Escolha a operação:\n Soma (+)\n Subtração (-)\n" +
    			" Multiplicação (*)\n Divisão (/)\n Potência (p)" +
    			"\n---------------------------");
    	
    	operacao = entrada.next().charAt(0);
    	switch(operacao)
    	{
	    	case '+':
	    		resultado = num1 + num2;
	    		System.out.println("---------------------------");
	    		System.out.println(num1 + " + " + num2 + " = " + resultado);
	    		break;
	
	    	case '-':
	    		resultado = num1 - num2;
	    		System.out.println("---------------------------");
	    		System.out.println(num1 + " - " + num2 + " = " + resultado);
	    		break;
	
	    	case '*':
	    		resultado = num1 * num2;
	    		System.out.println("---------------------------");
	    		System.out.println(num1 + " * " + num2 + " = " + resultado);
	    		break;
	
	    	case '/':
	    		resultado = num1 / num2;
	    		System.out.println("---------------------------");
	    		System.out.println(num1 + " / " + num2 + " = " + resultado);
	    		break;
	
	    	case 'p':
	    		resultado = num1;
	    		for(int i = 1; i < num2; i++) 
	    		{
	    			resultado = resultado * num1;
	    			//System.out.println(resultado);
	    		}
	    		System.out.println("---------------------------");
	    		System.out.println(num1 + " ^ " + num2 + " = " + resultado);
	    		break;
	    		
	    	default:
	    		System.out.println("---------------------------\n" +
	    				"Operacao invalida!\nSelecione um caracter valido.");
	    		break;
    	}
    	System.out.println("Deseja fazer um novo calculo? (s/n)");
    	novoCalculo= entrada.next().charAt(0);
	    
    } while(novoCalculo == 's' || novoCalculo == 'S');
    System.out.println("============================\n" +
    		"         Finalizado           " +
    		"\n============================");
    
    System.exit(0);
  }
}
