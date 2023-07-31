import java.util.Scanner;

public class Part1
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.next();
        
        int L=printNameLength( name );
        	printNameCharacters( name );
        System.out.println(L);
        console.close();
    }

    private static int printNameLength( String name )
    {
    	return name.length();
        //TODO implement this code
    }

    private static void printNameCharacters( String name )
    {
        for (int i = 0; i < name.length(); i++) {
        	System.out.println(name.charAt(i));
		}
    }
}