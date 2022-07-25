package LastOccurrenceSortedIndex;

public class NaiveCodeLastOccurSorted {
    public static int NaiveCodeLOSorted(int number[], int givernumber){
        int i;
        for(i = number.length-1; i >= 0; i--){
            if(number[i] == givernumber){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {4,5,5,10,10,10,20,20,20};
        int givernumber = 20;
        System.out.println(NaiveCodeLOSorted(number, givernumber));
    }
    
}
