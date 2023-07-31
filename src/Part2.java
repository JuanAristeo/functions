import java.util.Scanner;
public class Part2 {

	public static void main(String[] args) {
    Scanner console = new Scanner( System.in );
    System.out.println( "Enter your firstNum:  " );
    int numero1 = Integer.valueOf(console.next());
    Scanner console2 = new Scanner( System.in );
    System.out.println( "Enter your secondNum:  " );
    int numero2 = Integer.valueOf(console2.next());

    	int suma= suma(numero1,numero2);
    	int resta= resta(numero1,numero2);
    	int multiplicacion= multiplicacion(numero1,numero2);
    	int division= division(numero1,numero2);
    	System.out.println(suma);
    	System.out.println(resta);
    	System.out.println(multiplicacion);
    	System.out.println(division);
    
	}
	public static int suma(int a, int b) {
		return (a+b);
	}
	public static int resta(int a, int b) {
		return (a-b);
	}
	public static int multiplicacion(int a, int b) {
		return (a*b);
	}
	public static int division(int a, int b) {
		return (a/b);
	}
}
