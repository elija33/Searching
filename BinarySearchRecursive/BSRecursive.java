package BinarySearchRecursive;

public class BSRecursive {
    public static int bSearch(int arr[], int low, int high, int x) {
        //Base case to check if the low is big than high
        if (low > high)
            return -1;

        // finding the mid index of the array
        int mid = (low + high) / 2;

        // Check to 
        if (arr[mid] == x)
            return mid;

        else if (arr[mid] > x)
            return bSearch(arr, low, mid - 1, x);

        else
            return bSearch(arr, mid + 1, high, x);
    }

    public static void main(String args[]) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 }, n = 7;

        int x = 20;

        System.out.println(bSearch(arr, 0, n - 1, x));
    }
}
