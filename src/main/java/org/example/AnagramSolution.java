package org.example;

public class AnagramSolution {

    public boolean isAnagram(String first, String second) {

        first = first.toLowerCase().replaceAll("[^a-z]", "");
        second = second.toLowerCase().replaceAll("[^a-z]", "");

        if (first.length() != second.length() || first.equals(second)) {
            return false;
        }

        int[] counter = new int[26];

        for (int i = 0; i < first.length(); i++) {
            counter[first.charAt(i) - 'a']++;
            counter[second.charAt(i) - 'a']--;
        }

        for (int j : counter) {
            if (j != 0) {
                return false;
            }
        }

        return true;
    }
}
