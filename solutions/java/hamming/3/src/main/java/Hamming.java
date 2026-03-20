public class Hamming {
    int count = 0;
    public Hamming(String leftStrand, String rightStrand) {
        if(leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException("strands must be of equal length");
        }
        for(int i=0;i<leftStrand.length();i++){
            if(leftStrand.charAt(i) != rightStrand.charAt(i)){
                count++;
            }
        }
    }

    public int getHammingDistance() {
        return count;

        // return (int)IntStream.range(0,str1.length()).filter(i -> str1.charAt(i) != str2.charAt(i)).count();
        
    }
}
