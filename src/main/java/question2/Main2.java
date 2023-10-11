package question2;

import java.util.Random;
import java.util.TreeSet;

public class Main2 {

        public static void main(String[] args) {
            TreeSet<Character> set1 = new TreeSet<>();
            TreeSet<Character> set2 = new TreeSet<>();
            Random random = new Random();

//     PART 1
            System.out.println("Before adding to set:");
            while (set1.size()<10){
                char randomChar1 = (char) (random.nextInt('z' -'a') + 'a');
                set1.add(randomChar1);
            }

            while (set2.size()<10){
                char randomChar2 = (char) (random.nextInt('z' -'a') + 'a');
                set2.add(randomChar2);
            }


            System.out.println("After adding to set:");
            System.out.println("SET 1: " + set1);
            System.out.println(set1.size());
            System.out.println("SET 2: " + set2);
            System.out.println(set2.size());

//      PART 2

            TreeSet<Character> unionSet = RandomAlphabet.union(set1, set2);
            System.out.println("UNION: " + unionSet);

//      PART 3

            TreeSet<Character> intersectionSet = RandomAlphabet.intersection(set1, set2);
            System.out.println("INTERSECTION: " + intersectionSet);
        }
    }

