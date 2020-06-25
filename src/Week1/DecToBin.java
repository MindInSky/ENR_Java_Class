
import java.util.ArrayList;
import java.util.Scanner;

public class DecToBin {

// Crear un programa que convierta un numero de decimal a un numero binario
  public static void main( String [] args ) {

    int decVal;
    String binVal = "";
    ArrayList<Integer> binArray = new ArrayList<>();

    System.out.println("Input a decimal number");
    try (Scanner scan = new Scanner(System.in);) {
      decVal = Integer.parseInt(scan.nextLine());
    }

    int temp = decVal;
    while (temp != 0) {
      binArray.add(temp%2);
      temp = temp/2;
    }

    while (binArray.size() > 0) {
      binVal += binArray.remove(binArray.size() - 1);
    }

    String binMethod = Integer.toBinaryString(decVal);

    System.out.println("Decimal Value was: " + decVal);
    System.out.println("Binary is: " + binVal);
    System.out.println("With Method: " + binMethod);

  }

}