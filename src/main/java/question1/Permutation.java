package question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Permutation {


        public List<String> generatePermutations(String word) {
            List<String> permutations = new ArrayList<>();
            Map<Character, Integer> charCount = new HashMap<>();
            for (char c : word.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
            generatePermutationsHelper(word.length(), charCount, "", permutations);
            return permutations;
        }
        public void generatePermutationsHelper(int remainingLength, Map<Character, Integer> charCount, String currentString, List<String> permutations) {
            if (remainingLength == 0) {
                permutations.add(currentString);
                return;
            }
            for (char c : charCount.keySet()) {
                int count = charCount.get(c);
                if (count > 0) {
                    charCount.put(c, count - 1);
                    generatePermutationsHelper(remainingLength - 1, charCount, currentString + c, permutations);
                    charCount.put(c, count);
                }
            }
        }
    }
