package learn;

public class SectionCount {
    public static int count(int length, int section) {
        int rsl = 0;
        while (length >= section) {
            rsl = length / section;
            return rsl;
        }
       return rsl;
    }
}
