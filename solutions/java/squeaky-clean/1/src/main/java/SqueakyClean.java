class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        char[] asArray = identifier.toCharArray();
        boolean capitalizeNext = false;
        for(char ch: asArray){
            switch(ch){
                case '4':
                    builder.append('a');
                    break;
                case '3':
                    builder.append('e');
                    break;
                case '0':
                    builder.append('o');
                    break;
                case '1':
                    builder.append('l');
                    break;
                case '7':
                    builder.append('t');
                    break;
                case '-':
                    capitalizeNext = true;
                    break;
                default:
                    if(Character.isWhitespace(ch)){
                        builder.append('_');
                    }
                    else if(Character.isLetter(ch)){
                        if(capitalizeNext){
                            builder.append(Character.toUpperCase(ch));
                            capitalizeNext = false;
                            }
                        else{
                            builder.append(ch);
                        }
                    }
                    break;
            }
        }
        return builder.toString();
    }
}
