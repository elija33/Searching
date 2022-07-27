package SearchInfiniteSizedArray;

public class NaiveSearchInfiniteSorted {
    public static int SearchInfiniteSortedArray(int number[], int target){
        for(int i = 0; i<number.length; i++){
            if(number[i] == target){
                return i;
            }
            else{ if(number[i] > target)
                return -1;
            }
            i++;
        }
        return 1;
    }
    
    public static void main(String[] args) {
        int number[] = {1, 2, 3, 5, 6};
        int target = 5;
        System.out.println(SearchInfiniteSortedArray(number, target));
    }
}
