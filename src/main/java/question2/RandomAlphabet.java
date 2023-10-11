package question2;

import java.util.TreeSet;

public class RandomAlphabet {

        public static TreeSet<Character> union(TreeSet<Character> set1, TreeSet<Character> set2) {
            TreeSet<Character> unionSet = new TreeSet<>(set1);
            unionSet.addAll(set2);
            return unionSet;
        }

        public static TreeSet<Character> intersection(TreeSet<Character> set1, TreeSet<Character> set2) {
            TreeSet<Character> intersectionSet = new TreeSet<>(set1);
            intersectionSet.retainAll(set2);
            return intersectionSet;
        }
    }

