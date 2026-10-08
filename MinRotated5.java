public class MinRotated5 {
    public static void main(String[] args) {

        int[] a = {3, 4, 5, 1, 2};

        int low = 0;
        int high = a.length - 1;

        while (low < high) {

            int mid = (low + high) / 2;

            if (a[mid] > a[high])
                low = mid + 1;
            else
                high = mid;
        }

        System.out.println(a[low]);
    }
}
    

