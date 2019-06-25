import java.util.Scanner;
public class ScannerLearn{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter your name");
	String name = in.nextLine();
	System.out.printf("Your name is "+name);
	in.close();
    }
}