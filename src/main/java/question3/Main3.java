package question3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
        public static void main(String[] args) {
            AppropriatePair appropriatePair = new AppropriatePair();
            ArrayList<Integer> numbers = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter The Size Of The Arraylist: ");
            int count = scanner.nextInt();

            System.out.println("Enter The Elements:");
            for (int i = 0; i < count; i++) {
                int number = scanner.nextInt();
                numbers.add(number);
            }

            System.out.println("Before: " + numbers);
            appropriatePair.removeInappropriatePairs(numbers);
            System.out.println("After: " + numbers);
        }
    }

