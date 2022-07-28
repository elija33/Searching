package FindPeakElement;

public class EfficiPeakElementArray {
    public static int EPeakElement(int number[]){

        // create a starting value of the array
        int starting = 0;

        // create a ending vaule of the array
        int ending = number.length - 1;

        //find the mild of the array        
        while(starting < ending){
            int mid = starting + ending / 2;

        // check if the mid of the array is the peak element
            //- if the mid of the array is the peak element, we check right and left element to find the bigger element
            // - if the next bigger element is on the right, we start looking for the peak element from the right
            // - if the next bigger element is on the left, we start looking for the peak element from teh left.
            if((mid == 0 || number[mid - 1] <= number[mid]) && (mid == number.length - 1 || number[mid+1] <= number[mid])){
                return mid;
            }
            // looking for the peak element from the left side of the array.
            if(mid > 0 && number[mid - 1] >= number[mid]){
                ending = mid + 1;
            }
            else{
                starting = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {5, 20, 40, 30, 20, 50, 60};
        System.out.println(EPeakElement(number));
    }
}
