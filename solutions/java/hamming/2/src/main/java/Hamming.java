public class Hamming {
    private final String left;
    private final String right;
    private int leftLength;
    private int rightLength;
    public Hamming(String leftStrand, String rightStrand) {
        leftLength = leftStrand.length();
        rightLength = rightStrand.length();
        if(leftLength != rightLength){
            throw new IllegalArgumentException("strands must be of equal length");
        }
        this.left = leftStrand;
        this.right = rightStrand;
    }

    public int getHammingDistance() {
        int count = 0;

        for(int i=0;i<leftLength;i++){
            if(left.charAt(i) != right.charAt(i)){
                count++;
            }
        }
        return count;

        // return (int)IntStream.range(0,str1.length()).filter(i -> str1.charAt(i) != str2.charAt(i)).count();
        
    }
}
