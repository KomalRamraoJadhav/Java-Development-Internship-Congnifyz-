import java.util.*;

public class PalindromeChecker {

    public static boolean isPalindrome(String phrase){
        String removeSpace = phrase.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reversePhrase = new StringBuilder(removeSpace).reverse().toString();

        return removeSpace.equals(reversePhrase);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase = sc.nextLine();

        if(isPalindrome(phrase)){
            System.out.println("Given phrase or word is palindrome");
        }else{
            System.out.println("Given phrase or word is not palindrome");
        }

    }
}
