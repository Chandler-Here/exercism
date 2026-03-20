class IsogramChecker {

    boolean isIsogram(String phrase) {

        String str = phrase.toLowerCase().replaceAll("[ -]","");

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

}
