public class Persist {
    public static int persistence(long n){
        int[] firstStep =getDigits(n);
        for(int i = 0 ; i < firstStep.length ; i++){
            
        }
        return 0;
    }

    public static int[] getDigits(long n) {
    String numStr = Long.toString(n);
    int[] digits = new int[numStr.length()];
    
    for (int i = 0; i < numStr.length(); i++) {
        digits[i] = numStr.charAt(i) - '0'; 
    }

    return digits;
}
}
