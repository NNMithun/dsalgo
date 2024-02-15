package strings.easy;

public class ConsistentStrings {
    public static void main(String[] args) {
        String allowed = "cad";
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
//        String[] words = {"a","b","c","ab","ac","bc","abc"};
        System.out.println(countConsistentStrings(allowed,words));

    }

    public static int countConsistentStrings(String allowed, String[] words) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        String[] notAllowed=alphabet.chars()
                                  .filter(ch -> !allowed.toLowerCase().contains(String.valueOf((char) ch)))
                                  .mapToObj(ch -> String.valueOf((char) ch))
                                  .toArray(String[]::new);
        boolean isConsistent = true;
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < notAllowed.length; j++) {
                if (words[i].contains(notAllowed[j])) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                count++;
            }
            isConsistent=true;
        }
        return count;
    }
}
