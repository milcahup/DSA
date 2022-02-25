public class Quiz1Sort {

    public static void main(String[] args) {
        int[] a = {5, 1, 6, 20, 12, 0, 8, 8, 9};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // Sort method
    public static void sort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] > a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
        }
    }
}
