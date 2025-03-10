class Equillibrium {
    static void findEquilibrium(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int leftSum = 0, rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i + 1; j < n; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                System.out.println("Equilibrium Index: " + i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        findEquilibrium(arr);
    }
}