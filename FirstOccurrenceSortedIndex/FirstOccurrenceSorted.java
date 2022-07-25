package FirstOccurrenceSortedIndex;

public class FirstOccurrenceSorted {
    public static int FistOccuSorted(int number[], int givernumber){
        int starting = 0;
        int ending = number.length-1;
        
        while(starting <= ending){
            int mid = (starting + ending)/2;
        
        if(givernumber > number[mid]){
            starting = mid + 1;
        }
        else if(givernumber < number[mid]){
            ending = mid -1;
        }
        else{
            if(mid == 0 || number[mid - 1] != number[mid]){
                return mid;
            }
            else{
                ending = mid - 1;
            }
        }
    }

        return -1;
    }

    public static void main(String[] args) {
        int number[] = {5, 10, 10, 10, 20};
        int givernumber = 10;
        System.out.println(FistOccuSorted(number, givernumber));
    }
}
