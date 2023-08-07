package saml;
import java.util.Scanner;
public class ProgramScanner {

	public static void main(String[] args) {

Scanner scanner=new Scanner(System.in);
System.out.println("WHat is your name");
String name=scanner.next();
System.out.println("WHat is your favourite color");
String color=scanner.next();
System.out.println("WHat is your roll no");
String roll=scanner.next();
System.out.println("Your name is " + name);
System.out.println("Your favourite color is "+color);
System.out.println("Your roll number is " +roll);
scanner.close();  //close scanner so that there is no resource leak

	}

}
