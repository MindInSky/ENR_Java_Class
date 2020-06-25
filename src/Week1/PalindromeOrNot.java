import java.util.Scanner;

//- Crear un programa que valide si una cadena es un palindromo

public class PalindromeOrNot {

  public static void main(String[] args) {
    
    String palindrome = "";
    System.out.println("Input phrase or word to check if its a palindrome");

    try (Scanner scan = new Scanner(System.in);) {
      palindrome = scan.nextLine();
    }

    palindrome = palindrome.trim().toLowerCase().replaceAll("\\s+", "");

    char[] charArr = palindrome.toCharArray();
    int char1 = 0;
    int char2 = charArr.length -1;
    boolean isPalindrome = true;

    while(char2 > char1) {
      if(charArr[char1] != charArr[char2]){
        isPalindrome = false;
        break;
      }
      char1++;
      char2--;
    }

    if(isPalindrome){
      System.out.println("Is a palindrome");
    } else {
      System.out.println("Is not a palindrome");
    }

  }
}