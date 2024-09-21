import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of grades:");
        int numGrade = sc.nextInt();

        double[] arr = new double[numGrade];
        double sum =0;
        System.out.println("Enter grades:");
        for(int i =0; i<numGrade;i++){
            arr[i] = sc.nextDouble();
            sum = sum + arr[i];
        }

        double average = sum / numGrade;

        System.out.println("The average of grades is "+ average);
    }
}
