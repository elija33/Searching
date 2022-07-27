package SearchSortedRotatedArray;

public class EfficiSearchSorRotated {

    public static int SearchSortedRotatedArray(int number[], int target){
        int starting = 0;
        int ending = number.length - 1;
        while(starting <= ending){
            int mid = starting + (starting - ending) / 2;

        if(number[mid] == target){
            return mid;
        }

        if(number[starting] < number[mid]){
            if(target >= number[starting] && target < number[mid]){
                ending = mid - 1;
            }
            else{
                starting = mid + 1;
            }
        }
            else {
                if(target > number[mid] && target <= number[ending]){
                    starting = mid + 1;
                }
                else{
                    ending = mid - 1;
                }
            }
    }
    return -1;
}
    public static void main(String[] args) {
        int number[] = {10, 20, 40, 60, 5, 8};
        int target = 5;
        System.out.println(SearchSortedRotatedArray(number, target));
    }
}
