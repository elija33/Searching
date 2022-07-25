package LastOccurrenceSortedIndex;

public class IterativeLastOccuSort{

    public static int LOS(int number[], int givenumber){
        int starting = 0;
        int ending = number.length;

        while(starting <= ending){
            int mid = (starting + ending) / 2;
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
                        starting = mid + 1;
                    }
                } 
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] number = {10,20,20,30,30,};
        int givenumber = 30;
        System.out.println(LOS(number, givenumber));
    }
}
