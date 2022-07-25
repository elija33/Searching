package FirstOccurrenceSortedIndex;

public class EfficRecursiveFirstOccuSortIndex {
    public static int Effic(int number[], int givernumber){
        int starting = 0;
        int ending = number.length -1;
        
        if(starting > ending){
            return -1;
        }
            int mid = (starting + ending) / 2;

            if(number[mid] < givernumber){
                return starting = mid + 1;
            }
            else if(givernumber > number[mid]){
                return ending = mid + 1;
            }
            else if(mid == 0 || number[mid - 1] != number[mid]){
                return mid;
            }
            else {
                return starting = mid - 1;
            }
        }
    public static void main(String[] args) {
        int number[] = {5, 10, 10, 15, 15, 15, 20, 20, 20};
        int givernumber = 20;
        System.out.println(Effic(number, givernumber));
        
    }
}
