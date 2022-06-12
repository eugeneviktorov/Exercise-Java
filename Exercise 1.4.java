import java.util.Scanner;
import java.lang.Math;
public class Main
{
    static int function(int a,int b,int c)
    {
        int p=a+b+c;
        return p;
    }
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Программа вычисляет площадь треугольника");
        System.out.println ("Введите 3 стороны треугольника");
        System.out.print("a= ");        
        int a = scan.nextInt();
        System.out.print("b= ");
        int b = scan.nextInt();
        System.out.print("c= ");
        int c  = scan.nextInt();
        
        double p1 = (a+b+c)/2.0;
        double s = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
            System.out.println("Площадь:"+s);
     }
}