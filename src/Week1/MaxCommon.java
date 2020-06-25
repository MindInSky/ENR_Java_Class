
//- Crear un programa que nos permita obtener el maximo comun divisor de 5 numeros
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxCommon {

  static boolean isNumeric(String strNum) { // To help us leave the queue of numbers and identify if input is a number
    if (strNum == null) {
        return false;
    }
    try {
        int i = Integer.parseInt(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
  }

  static ArrayList<Integer> primeNumbers(int n){ // List of prime numbers of n
    ArrayList<Integer> temp = new ArrayList<>();
    for(int i = 1; i <= n ; i++ ){
      if( n%i == 0 ){ //if == 0 its a whole divisor of n
        temp.add(i);
      }
    }
    return temp;
  }
  public static void main( String [] args) {

    ArrayList<Integer> IntArray = new ArrayList<Integer>(); // Array of numbers for us to find gcd

    ArrayList<ArrayList<Integer>> PrimeArr = new ArrayList<ArrayList<Integer>>(); //An Array of Arrays of prime numbers, Matrix of Prime numbers?

    try (Scanner scan = new Scanner(System.in);) {
      String temp = "0"; //this is being used as a place holder and is not passed to the array
      while(isNumeric(temp) == true ){
        System.out.println("Input an integer or any letter to quit");
        temp = scan.nextLine();
        if (isNumeric(temp)){
          IntArray.add(Integer.parseInt(temp));
        }
      }
    }
    
    for(int iTemp : IntArray){ // Add to the Array of Prime numbers
      PrimeArr.add(primeNumbers(iTemp));
    }

    // Lets Pick the shortest array and use it to compare to the others

    ArrayList<Integer> lengths = new ArrayList<>();

    for(ArrayList<Integer> aTemp : PrimeArr){
      lengths.add(aTemp.size());
    }

    int PrimeMinIndex = lengths.indexOf(Collections.min(lengths)); //this gives us the position (base 0) of the array with the least list of prime numbers

    // Need to pick a number from the shortest array, and check if its present on all of the others

    int gcd = 0;
    for ( int x : PrimeArr.get(PrimeMinIndex)){
      boolean presentInAll = false ; // Used to check if X is present in all the arrays
      for(ArrayList<Integer> aTemp : PrimeArr){
        if (aTemp != PrimeArr.get(PrimeMinIndex)){ // So that it doesn't check against itself
          if(aTemp.contains(x)){
            presentInAll = true;
          } else { 
            presentInAll = false;
            break; // Breaking because we already know its not present in one of the arrays, so not GCD, and to stop it from checking on the following one and getting a false positive
          }
        }
      }

      if(presentInAll){
        gcd = x;
      }
    }

    System.out.println("Greatest Common Divisor " + gcd);

  }

}