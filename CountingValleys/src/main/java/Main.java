public class Main {
    public static void main(String[] args) {
        System.out.println(countingValleys(12, "UDDUDDUUDUUD"));
    }

    public static int countingValleys(int steps, String path) {
        int currentLevel = 0;
        int valleyCount = 0;
        int currentStepNumber = 0;

        while (currentStepNumber < steps) {
            if (currentLevel == 0 && 'D' == (path.charAt(currentStepNumber))) {
                valleyCount++;
                currentLevel--;
                currentStepNumber++;
                continue;
            }
            if ('D' == path.charAt(currentStepNumber)) {
                currentLevel--;
                currentStepNumber++;
                continue;
            }
            if ('U' == path.charAt(currentStepNumber)) {
                currentLevel++;
                currentStepNumber++;
                continue;
            }
        }
        return valleyCount;
    }
}
