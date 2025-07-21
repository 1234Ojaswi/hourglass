class hg {
    public static void main(String[] args) {
        int i, j, k, n = 5;
        for (i = n; i >= 1; i--) {
            for (k = i; k < n; k++) {
                System.out.print(" ");
            }
            for (j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (i = 2; i <= n; i++) {
            for (k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
