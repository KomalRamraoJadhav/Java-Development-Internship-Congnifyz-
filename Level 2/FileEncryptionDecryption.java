import java.io.*;
import java.util.Scanner;

public class FileEncryptionDecryption {

    // Encryption method (Caesar Cipher)
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char shifted = (char) (character + shift);
                if (Character.isLowerCase(character)) {
                    if (shifted > 'z') shifted -= 26;
                } else if (shifted > 'Z') {
                    shifted -= 26;
                }
                result.append(shifted);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }

    // Decryption method (Caesar Cipher)
    public static String decrypt(String text, int shift) {
        return encrypt(text, -shift);  // Decrypt is reverse of encrypt
    }

    // Method to read file content
    public static String readFile(String filePath) throws IOException {
        StringBuilder fileContent = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            fileContent.append(line).append("\n");
        }
        reader.close();
        return fileContent.toString();
    }

    // Method to write content to a file
    public static void writeFile(String filePath, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(content);
        writer.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask user for action: Encrypt or Decrypt
            System.out.print("Enter 1 for Encryption or 2 for Decryption: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            // Input file path
            System.out.print("Enter the file path: ");
            String filePath = scanner.nextLine();

            // Read the file content
            String fileContent = readFile(filePath);

            // Shift value for Caesar Cipher
            System.out.print("Enter the shift value (1-25): ");
            int shift = scanner.nextInt();

            // Encrypt or Decrypt based on user choice
            String result;
            if (choice == 1) {
                result = encrypt(fileContent, shift);
            } else if (choice == 2) {
                result = decrypt(fileContent, shift);
            } else {
                System.out.println("Invalid choice.");
                return;
            }

            // Output file path
            System.out.print("Enter the output file path: ");
            scanner.nextLine();  // Consume newline
            String outputFilePath = scanner.nextLine();

            // Write result to the new file
            writeFile(outputFilePath, result);
            System.out.println("Operation completed successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
