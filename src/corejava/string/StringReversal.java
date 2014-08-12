package corejava.string;

public class StringReversal {
    public static void main(String[] args) {
        String s = "123456789";
        char[] output = s.toCharArray();
        for (int i = 0; i < (s.length() / 2); i++) {
            char c = output[i];
            output[i] = output[(s.length() - 1) - i];
            output[(s.length() - 1) - i] = c;
        }
        System.out.println("Original String " + s + "\nReversed String " + new String(output));
    }
}
