public class Maskify {
    public static String maskify(String str) {
        // throw new UnsupportedOperationException("Unimplemented");
        char[] text = str.toCharArray();
        int n = text.length;
        int j = n - 4;
        for(int i = 0; i < j + 1 ; i++){
            text[i] = '#';
        }
        return new String(text);
    }
}
