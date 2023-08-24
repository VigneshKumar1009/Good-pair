public class Main {
    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4};
        int B1 = 7;
        System.out.println(hasGoodPair(A1, B1)); // Output: 1

        int[] A2 = {1, 2, 4};
        int B2 = 4;
        System.out.println(hasGoodPair(A2, B2)); // Output: 0

        int[] A3 = {1, 2, 2};
        int B3 = 4;
        System.out.println(hasGoodPair(A3, B3)); // Output: 1
    }

    public static int hasGoodPair(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return 1; // Good pair found
                }
            }
        }
        return 0; // No good pair found
    }
}

