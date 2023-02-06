//Q5. Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0} Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor. Leftmost and rightmost element cannot be a peak element.

public class Q5__FindPeak {
    static void peak(int arr[]) {
        for (int i = 2; i < arr.length; i++) {
            if (arr[i - 2] < arr[i - 1] && arr[i - 1] > arr[i]) {
                System.out.println(arr[i - 1]);

            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 3, 4, 2, 3, 5, 7, 0 };

        peak(arr);
        // first peak element is 4
        // And second peak element is 7

    }
}
