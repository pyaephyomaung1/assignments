import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
    if(s == null || s.isEmpty()){
       return s;
    }
    StringBuilder camelCase = new StringBuilder();
    String[] words = s.split("-_");
    for(int i = 0 ; i < words.length ; i++){
        String word = words[i];
        if( i == 0 ){
            camelCase.append(word);
        } else {
            if(!word.isEmpty()){
                camelCase.append(Character.toUpperCase(word.charAt(0)));
                camelCase.append(word.substring(1));
            }
        }
    }
    return camelCase.toString();
  }
}