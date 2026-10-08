
    import java.util.Arrays;
public class Threesum3 {

    public static void main(String[] args) {

        int[] a = {-1, 0, 1, 2, -1, -4};

        Arrays.sort(a);

        for (int i = 0; i < a.length - 2; i++) {

            int j = i + 1;
            int k = a.length - 1;

            while (j < k) {

                int sum = a[i] + a[j] + a[k];

                if (sum == 0) {
                    System.out.println(a[i] + " " + a[j] + " " + a[k]);
                    j++;
                    k--;
                }
                else if (sum < 0)
                    j++;
                else
                    k--;
            }
        }
    }
}
    

