class Solution {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("word1", "word"));
    }

    static public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int minLen = word1.length() < word2.length() ? word1.length() : word2.length();
        for (int i = 0; i < minLen; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        result.append(word1.substring(minLen));
        result.append(word2.substring(minLen));

        return result.toString();
    }
}