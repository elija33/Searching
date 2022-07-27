package SearchSortedRotatedArray;

public class NaiveSearchSorRotated {
    public static int SearchSortedRotatedArray(int number[], int target){
        for(int i = 0; i<number.length; i++){
            if(number[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {100, 200, 400, 1000, 20100, 200, 400, 1000, 10, 20};
        int target = 10;
        System.out.println(SearchSortedRotatedArray(number, target));
    }
}
