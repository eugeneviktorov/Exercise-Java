import java.util.Scanner;

public class Main{

	public static void main(String []args){
	
	Scanner in = new Scanner(System.in);
	System.out.print("Введите первое слово: ");
	String a = in.nextLine();
	System.out.print("Введите второе слово: ");
	String b = in.nextLine();

	System.out.printf(a+" "+b);
	
	in.close();
}}