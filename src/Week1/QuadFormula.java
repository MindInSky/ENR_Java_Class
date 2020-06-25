import java.util.Scanner;
// Crear un programa que nos ayude a resolver ecuaciones cuadraticas con la formula general

public class QuadFormula {

  public static void main(String [] args) {
    double a;
    double b;
    double c;
    double res1;
    double res2;

    try (Scanner scan = new Scanner(System.in);) {
      System.out.println("Input 'a'");
      a = Double.parseDouble(scan.nextLine());
      System.out.println("Input 'b'");
      b = Double.parseDouble(scan.nextLine());
      System.out.println("Input 'c'");
      c = Double.parseDouble(scan.nextLine());
    }

    double insideRoot = b * b - 4.0 * a * c;

    if(insideRoot > 0.0){
      res1= (-b - insideRoot)/(2*a);
      res2= (-b + insideRoot)/(2*a);
      System.out.println("The roots are: " + res1 + " , " + res2);
    } else if (insideRoot == 0){
      res1 = -b/(2*a);
      System.out.println("The root is: " + res1);
    } else {
      double firstHalf = -b/(2*a);
      res1= (- insideRoot)/(2*a);
      res2= (insideRoot)/(2*a);
      System.out.println("The roots are: " + firstHalf + "+" + res1 + "i , " + firstHalf + res2 + "i" );
    }
  }
}