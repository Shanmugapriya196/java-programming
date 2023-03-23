import java.util.*; 
  
 public class StatsCalculator { 
      
     public static void main(String[] args) { 
         Scanner input = new Scanner(System.in); 
         System.out.print("Enter the number of elements: "); 
         int n = input.nextInt(); 
         int[] numbers = new int[n]; 
         System.out.print("Enter the elements: "); 
         for (int i = 0; i < n; i++) { 
             numbers[i] = input.nextInt(); 
         } 
          
         double mean = calculateMean(numbers); 
         System.out.println("Mean: " + mean); 
          
         double median = calculateMedian(numbers); 
         System.out.println("Median: " + median); 
          
         int mode = calculateMode(numbers); 
         System.out.println("Mode: " + mode); 
     } 
      
     public static double calculateMean(int[] numbers) { 
         int sum = 0; 
         for (int num : numbers) { 
             sum += num; 
         } 
         return (double) sum / numbers.length; 
     } 
      
     public static double calculateMedian(int[] numbers) { 
         Arrays.sort(numbers); 
         int middle = numbers.length / 2; 
         if (numbers.length % 2 == 0) { 
             return (double) (numbers[middle - 1] + numbers[middle]) / 2; 
         } else { 
             return (double) numbers[middle]; 
         } 
     } 
      
     public static int calculateMode(int[] numbers) { 
         Map<Integer, Integer> frequencyMap = new HashMap<>(); 
         int maxFrequency = 0; 
         int mode = 0; 
         for (int num : numbers) { 
             int frequency = frequencyMap.getOrDefault(num, 0) + 1; 
             frequencyMap.put(num, frequency); 
             if (frequency > maxFrequency) { 
                 maxFrequency = frequency; 
                 mode = num; 
             } 
         } 
         return mode; 
     } 
 }