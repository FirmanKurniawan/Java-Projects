
public class MinimumTimeSpecialWriter {

    public static void main(String[] args) {
        String word = "asda";
        int result = minTimeToType(word);
        System.out.println(result);
    }

    public static int minTimeToType(String word) {
        char currentPointer = 'a';
        char[] arrayChar = word.toCharArray();
        int minimumTimeScnd = arrayChar.length;
        for (int i = 0; i < arrayChar.length; i++) {
            int distance = Math.abs(arrayChar[i] - currentPointer);
            if (distance == 0) {
                continue;
            }
            if (distance >= 13) {
                distance = 26 - distance;
            }
            minimumTimeScnd += distance;
            currentPointer = arrayChar[i];
        }
        return minimumTimeScnd;
    }

}
