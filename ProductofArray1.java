public class ProductofArray1 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = new int[4];

        for (int i = 0; i < 4; i++) {
            b[i] = 1;

            for (int j = 0; j < 4; j++) {
                if (i != j) {
                    b[i] = b[i] * a[j];
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
    

