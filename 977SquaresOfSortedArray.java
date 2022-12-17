class Solution {
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int F = 0, R = n - 1;
        for (int p = n-1; p>=0; p--) {
            if (Math.abs(A[F]) > Math.abs(A[R])) {
                result[p] = A[F] * A[F];
                F++;
            } else {
                result[p] = A[R] * A[R];
                R--;
            }
        }
        return result;
    }
}
