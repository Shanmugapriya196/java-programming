public class nperfect 
{
public static void main(String[] args) 
{
int n = 3; // the number of perfect numbers to print
int count = 0; // counter for the number of perfect numbers found
int num = 1; // starting number for checking perfect numbers

        while (count < n) {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (sum == num) {
                System.out.println(num);
                count++;
            }

            num++;
        }
    }
}
