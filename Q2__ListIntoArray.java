
public class Q2__ListIntoArray {
    static void stringToArray(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        String[] arr = { "ab", "bc", "cd", "de", "ef", "fg", "gh" };
        stringToArray(arr);
    }

}
