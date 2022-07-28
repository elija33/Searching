package SearchInfiniteSizedArray;

public class EfficientSearchinfiniteSorted {
    public static int BSearch(int number[], int target){
        int starting = 0;
        int ending = number.length;

        if(starting > ending){
            return -1;
        }

            int mid = starting + ending / 2;

            if(number[mid] == target){
                return mid;
            }
            else if(number[mid] > target){
                ending = mid + 1;
            }
            else{
                starting = mid - 1;
            }

            return 0;
        }

    public static int EfficientSearch(int number[], int target){
        int i = 1;
        if(number[0] == target){
            return 0;
        }
        while(number[i] < target){
            i = i * 2;
        }
        if(number[i] == target){
            return i;
        }
        return EfficientSearch(number, i/2 + 1, i - 1, target);
    }
    public static void main(String[] args) {
        
    }
}
