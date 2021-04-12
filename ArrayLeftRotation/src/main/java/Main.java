import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] baseArray = {3, 4, 5, 6};
        System.out.println(Arrays.toString(rotLeft(baseArray, 2)));
    }

    static int[] rotLeft(int[] a, int d) {
        int timesRotated = 0;
        int[] arrayBeforeRotation = a;
        int[] rotatedArray = new int[a.length];
        while (d > timesRotated) {

            for (int i = 0; i < arrayBeforeRotation.length; i++) {
                if (i == arrayBeforeRotation.length - 1) {
                    rotatedArray[i] = arrayBeforeRotation[0];
                    arrayBeforeRotation = Arrays.copyOf(rotatedArray,a.length);
                    break;
                }else {
                    rotatedArray[i] = arrayBeforeRotation[i + 1];
                }
            }
            timesRotated++;
        }
        return rotatedArray;
    }
}
