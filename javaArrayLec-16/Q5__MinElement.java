//Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method for calculating the minimum element.

public class Q5__MinElement {
    static int findMin(int arr[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = { 2, -3, 5, 8, 1, 0, -4 };
        System.out.println("Min element is : " + findMin(arr));
    }

}
