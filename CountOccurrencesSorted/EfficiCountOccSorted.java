package CountOccurrencesSorted;

public class EfficiCountOccSorted {
    public static int firstOccurrencesSorted(int number[], int givenumber){
        int starting = 0;
        int ending = number.length - 1;

        while(starting <= ending){

            //finding the mild number of the array.
            int mid = (starting + ending) / 2;

            if(givenumber > number[mid]){
                starting = mid + 1;
            }
            else{
                if(givenumber < number[mid]){
                    ending = mid - 1;
                }
                else{
                    if(mid == 0 || number[mid -1] != number[mid]){
                        return mid;
                    }
                    else {
                        ending = mid - 1;
                    }
                }
            }
        }
        return -1;
    }

    public static int lastOccurrencesSorted(int number[], int givenumber){
        int starting = 0;
        int ending = number.length -1;

        while(starting <= ending){
            int mid = starting + (starting + ending) / 2;
            if(givenumber > number[mid]){
                starting = mid + 1;
            }
            else{
                if(givenumber < number[mid]){
                    ending = mid - 1;
                }
                else{
                    if(mid == number.length - 1 || number[mid + 1] != number[mid]){
                        return mid;
                    }
                    else{
                        ending = mid + 1;
                    }
                }
            }
        }
        return -1;
    }

    public static int CountOccurrencesSorted(int number[], int givenumber){
        int firstOccuSorted = firstOccurrencesSorted(number, givenumber);
            if(firstOccuSorted == -1){
                return 0;
            }
            else{
                return lastOccurrencesSorted(number, givenumber) - firstOccuSorted + 1;
            }    
    }
    public static void main(String[] args) {
        int number[] = {10,20,20,20,40,40};
        int givenumber = 20;
        System.out.println(CountOccurrencesSorted(number, givenumber));
    }
    
}
