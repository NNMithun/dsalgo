package strings.easy;

public class ReverseStringAndWords {
    public static void main(String[] args) {
        String input = "I love my india";
        String output = reverseWordsAndLetters(input);
        System.out.println(output);
    }

    public static String reverseWordsAndLetters(String str) {
        // Split the input string into words
        String[] words = str.split(" ");
        
        // StringBuilder to hold the reversed string
        StringBuilder reversedString = new StringBuilder();
        
        // Iterate through each word
        for (String word : words) {
            // Reverse each word and append it to the result
            reversedString.insert(0, new StringBuilder(word).reverse().toString() + " ");
        }
        
        // Trim to remove the last space
        return reversedString.toString().trim();
    }
}
