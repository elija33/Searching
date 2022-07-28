package BinarySearchIterative;

public class BSIterative{
    public static int BS(int number[], int target){
     // if the array is sorted, we need to find the mid element of the array.
        // - set the starting index of the array to something like (low), and the ending index of the array to something(hight).
        // Do a loop to compair if the low is equal to the hight
        // find the mid element of the array by doing (low + high) / 2
        //make the med elements the new array and check if the givernumber is in the new array.
        // - if the element is in the array print out the index of element

        // starting index array 
        int low = 0;

        //Ending index array
        int high = number.length - 1;

        // while loop to check if low elements is less than high elements
        while(low <= high){

        // find the mid by doing (low + high) / 2;
            int mid = (low + high) / 2;

        // checking if the mid# is equal to giver# we return the mid#
            if(number[mid] == target) {
                return mid;
            }
        
            // check if the giver# is less than mid# than we search the low side of the array
           else if(number[mid] > target){
                high = mid - 1;
           }

           // otherwise we search the high side of the array
           else {
            low = mid + 1;
           }
        }
         return -1;
    }
    public static void main(String[] args) {

        int number[] = {10, 20, 30, 40, 50, 60};
        int target = 50;
        int giver = 5;
        System.out.println(BS(number, target));
        System.out.println();
        System.out.println(BS(number, giver));
        
    }
}