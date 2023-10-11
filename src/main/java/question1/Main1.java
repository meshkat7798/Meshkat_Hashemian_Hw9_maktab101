package question1;

import java.util.List;
import java.util.Scanner;

public class Main1 {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Permutation permutation = new Permutation();

//   PART 1

                System.out.println("Please Enter The String:");
                String word1 = scanner.next();
                List<String> permutations = permutation.generatePermutations(word1);
                for (String permute : permutations) {
                    System.out.println(permute);
                }

//    PART 2

                System.out.println("Please Enter The 2nd String :");
                String word2 = scanner.next();
                if (permutations.contains(word2)) {
                    System.out.println("PASS");
                } else
                    System.out.println("FAIL");
            }
        }

