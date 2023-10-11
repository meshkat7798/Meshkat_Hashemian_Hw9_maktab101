package question3;

import java.util.ArrayList;

public class AppropriatePair {

        public void removeInappropriatePairs(ArrayList<Integer> numbers) {

            int size = numbers.size();

            if (size % 2 != 0) {
                size--;
            }

            for (int i = 0; i < size; i += 2) {
                int left = numbers.get(i);
                int right = numbers.get(i + 1);

                if (left > right) {
                    numbers.remove(i + 1);
                    numbers.remove(i);
                    size -= 2;
                    i -= 2;
                }
            }
            if(numbers.size()%2!=0){
                numbers.remove(numbers.size()-1);
            }
        }
    }

