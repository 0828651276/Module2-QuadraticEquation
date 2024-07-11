import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number a: ");
        double a = sc.nextDouble();
        System.out.println("Enter a number b: ");
        double b = sc.nextDouble();
        System.out.println("Enter a number c: ");
        double c = sc.nextDouble();

        System.out.println("a la: " + a);
        System.out.println("a la: " + b);
        System.out.println("a la: " + c);
        QuadraticEquation q = new QuadraticEquation(a, b, c);
        System.out.println("Nghiem 1 la:" + q.getRoof1());
        System.out.println("Nghiem 2 la:" + q.getRoof2());
    }
}