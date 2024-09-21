import java.util.*;

public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the password: ");
        int length = sc.nextInt();

        String numbers = "0123456789";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCahracters = "!@#$%^&*()-_=+[]{}|:;,.<>?";

        System.out.println("Include numbers? Yes/No");
        boolean includeNum = sc.next().equalsIgnoreCase("Yes");

        System.out.println("Include lowercase? Yes/No");
        boolean includeLower = sc.next().equalsIgnoreCase("Yes");

        System.out.println("Include uppercase? Yes/No");
        boolean includeUpper = sc.next().equalsIgnoreCase("Yes");

        System.out.println("Include special characters? Yes/No");
        boolean includeSpecial = sc.next().equalsIgnoreCase("Yes");

        StringBuilder passwordCreater = new StringBuilder();
        if(includeNum) passwordCreater.append(numbers);
        if(includeLower) passwordCreater.append(lowercase);
        if(includeUpper) passwordCreater.append(uppercase);
        if(includeSpecial) passwordCreater.append(specialCahracters);

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for(int i =0; i<length;i++){
            int j = random.nextInt(passwordCreater.length());
            password.append(passwordCreater.charAt(j));
        }

        System.out.println("Your generated password is: " + password.toString());

    }
}
