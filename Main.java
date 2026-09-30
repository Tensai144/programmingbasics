import java.util.Scanner;
import java.io.PrintStream;

public class Main {
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Считываем 2 вещественных числа с консоли - параметры a и b
        double a = in.nextDouble(), b = in.nextDouble();

        // Особые случаи: a = 0 или b = 0
        if (a==0) {
            // При a = 0 нер-во выполняется всегда, кроме случаев, когда x = 0 или x = b
            if (b>0)
                out.printf("x<0 or 0<x<%s or x>%s",b,b);
            else
                out.printf("x<%s or %s<x<0 or x>0",b,b);
        }
        else if (b==0) {
            // При b = 0 нер-во принимает вид - (a/-x^2)>=0
            if (a>0)
                // Поскольку -x^2<=0 при любых x, тогда при a>0 выражение
                // строго меньше 0 при любых x
                out.print("No such x");
            else
                // Иначе нер-во выполняется при любых x, кроме случая -x^2 = 0, следовательно x!=0
                out.print("x<0 or x>0");
        }
        // Если a!=0 и b!=0
        else {
            if (a>0) {
                // Исходное нер-во сводится к нер-ву вида x(b-x)>0
                if (b>0)
                    out.printf("0<x<%s",b);
                else
                    out.printf("%s<x<0",b);
            }
            else {
                // Исходное нер-во сводится к нер-ву вида x(b-x)<0
                if (b>0)
                    out.printf("x<0 or x>%s",b);
                else
                    out.printf("x<%s or x>0",b);
            }
        }
    }
}