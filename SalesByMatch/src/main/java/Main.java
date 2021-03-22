import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] ar = {42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42};
        System.out.println(sockMerchant(9, ar));
    }

    static int sockMerchant(int n, int[] ar) {
        int pairsCount=0;
        List<Boolean> outOfPairList = new ArrayList<>();
        for (int number : ar) {
            outOfPairList.add(false);
        }

        for (int i = 0; i <= outOfPairList.size() - 1; i++) {
            if (outOfPairList.get(i) == true) {
                continue;
            }
            for (int j = i + 1; j <= outOfPairList.size() - 1; j++) {
                if (outOfPairList.get(j) == true) {
                    continue;
                }
                if (ar[i] == ar[j]) {
                    outOfPairList.set(i, true);
                    outOfPairList.set(j, true);
                    pairsCount++;
                    break;

                }
            }
        }
        return pairsCount;
    }
}
