import java.util.*;
public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = sc.nextLine();

        int length = password.length();

        int upper = 0;
        int lower = 0;
        int special_char = 0;
        int numbers = 0;
        char ch;

        if(length < 8){
            System.out.println("Your password is too short and weak.");
        }else{
            for(int i =0; i< length; i++){
                ch = password.charAt(i);
                if(Character.isUpperCase(ch)){
                    upper = 1;
                }else if(Character.isLowerCase(ch)){
                    lower = 1;
                }else if(Character.isDigit(ch)){
                    numbers = 1;
                } else {
                    special_char = 1;
                }
            }
            if(upper == 1 && lower == 1 && numbers == 1 && special_char ==1){
                System.out.println("Your password is strong.");
            }else{
                System.out.println("Your password is weak.");
            }
        }
    }
}
