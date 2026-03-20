import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;
public class PangramChecker {

    public boolean isPangram(String input) {

        String s = input.toLowerCase().replaceAll("[^a-z]","");

        // Set<Character> charSet = new HashSet<>();

        // for(char c: s.toCharArray()){
        //     charSet.add(c);
        // }
        // if(charSet.size() == 26){
        //     return true;
        // }
        // return false;

        return (s.chars().filter(c -> Character.isLetter(c)).distinct().count() == 26);

        

        
        
    }

}
