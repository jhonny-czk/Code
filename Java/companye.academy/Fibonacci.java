import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t1 = 0; 
		int t2 = 1;
		int proximoTermo;
		int nTermos;
		Scanner entrada = new Scanner(System.in);
		
    	System.out.println("========================== Sequencia de Fibonacci ==========================");
    	//System.out.println("----------------------------------------------------------------------------");
    	/*System.out.println("Na matemática, a sucessão de Fibonacci, é uma sequência de números inteiros, \n" + 
    			"na qual cada termo subsequente corresponde à soma dos dois anteriores.\n" + 
    			"\n                          Dado pela formula:\n"+ 
    			"                         Fn = (Fn-1) + (Fn-2) \n" + 
    			"\nSequencia de Fibonacci: (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, … )\n" +
    			"----------------------------------------------------------------------------"); */
		System.out.print("Digite o numero de termos de Fibonnaci que devem ser gerados: ");
		nTermos = entrada.nextInt();
		
	    for(int i=1; i <= nTermos; i++) 
	    {
	        if(i == 1){
	            System.out.print(" " + t1);
	        }
	        if(i == 2){
	        	 System.out.print(" " + t2);
	        }
	        proximoTermo = t1 + t2;
	        t1 = t2;
	        t2 = proximoTermo;
	        
	        System.out.print(" " + proximoTermo);
	    }
		
		System.exit(0);
	}
}
