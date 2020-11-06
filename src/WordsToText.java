public class WordsToText {
    public static String convert(String[] words) {
        String[] rsl = words;
        String s = "";
        for (int i = 0; i < words.length; i++) {
            s = s + rsl[i] + " ";
        }
        return s.trim();
    }
}
