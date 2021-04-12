public class Main {

    public static void main(String[] args) {
        System.out.println(checkIfIsPalindrome("kayak"));
    }

    public static boolean checkIfIsPalindrome(String word) {
        String lowerCaseWord=word.toLowerCase();
        for (int i = 0; i < (word.length() + 1 )/ 2; i++) {
                if(lowerCaseWord.charAt(i)!=lowerCaseWord.charAt(word.length()-1-i)){
                    return false;
            }
        }
        return true;
    }
}
