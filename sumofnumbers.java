import java.util.Scanner;

public class SumOfNNumbers {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of elements: ");
      int n = input.nextInt();

      int[] arr = new int[n];
      int sum = 0;

      System.out.print("Enter the elements: ");
      for (int i = 0; i < n; i++) {
         arr[i] = input.nextInt();
         sum += arr[i];
      }

      System.out.println("Sum of the elements is " + sum);

      input.close();
   }
}