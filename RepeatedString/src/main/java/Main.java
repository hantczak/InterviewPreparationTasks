public class Main {
    public static void main(String[] args) {
        System.out.println(repeatedString("bbbba", 10));
    }


    static long repeatedString(String s, long n) {
        long count = 0;
        int leftoverLength = (int)n%s.length();
        long timesRepeated = n / s.length();
        int occurrencesInBaseString = countLetter('a', s);
        String leftOverStringPart = generateLeftoverStringPart(s,leftoverLength);
        int occurrencesInLeftOverString = countLetter('a',leftOverStringPart);
        count = occurrencesInBaseString*timesRepeated+occurrencesInLeftOverString;
        return count;
    }

    static int countLetter(char letter, String s) {
        int letterCount = 0;
        for(char character:s.toCharArray()){
            if(letter==character){
                letterCount++;
            }
        }
        return letterCount;
    }

    static String generateLeftoverStringPart(String s,int leftoverLength){
        String leftOverStringPart = "";
        for(int i = 0;i<leftoverLength;i++){
            leftOverStringPart = leftOverStringPart + s.charAt(i);
        }
        return leftOverStringPart;
    }
}
