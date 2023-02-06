//Q3. Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even elements.

public class Q3__Even {
    static void even(int arr[]) {
        for (int ele : arr) {
            if (ele % 2 == 0) {
                System.out.println(ele);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        even(arr);
    }
}
