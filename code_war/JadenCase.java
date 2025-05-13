public class JadenCase {
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null; // or return ""; depending on how you want to handle it
        }

        String[] words = phrase.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0))); // capitalize first letter
                if (word.length() > 1) {
                    sb.append(word.substring(1)); // add rest of the word
                }
            }
            sb.append(" "); // add space after each word
        }

        return sb.toString().trim(); // trim the trailing space
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase("hello world"));         // Hello World
        System.out.println(toJadenCase("java is awesome"));     // Java Is Awesome
    }
}