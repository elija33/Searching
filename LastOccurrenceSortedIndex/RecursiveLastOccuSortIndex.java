package LastOccurrenceSortedIndex;

public class RecursiveLastOccuSortIndex {
    public static int RLOSI(int number[], int givenumber){
        int starting = 0;
        int ending = number.length -1;
         if(starting > ending){
            return -1;
         }
         int mid = (starting + ending) / 2;
         if(givenumber > number[mid]){
            ending = mid + 1;
         }
         else if(givenumber < number[mid]){
            starting = mid - 1;
         }
         else if(mid == number.length || number[mid + 1] != number[mid]){
            return mid;
         }
         else{
            ending = mid + 1;
         }
         return -1;
    }
    public static void main(String[] args) {
        int number[] = {5, 10, 10, 10, 10, 20, 20};
        int givenumber = 20;
        System.out.println(RLOSI(number, givenumber));
    }
}
