package FirstOccurrenceSortedIndex;

public class NaiveCodeFirstOccurSortedIndex {
    public static int NaiveCodeFOccurSorted(int number[], int givernumber){
        for(int i = 0; i<number.length; i++){
            if(number[i] == givernumber){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {4,5,5,10,10,10,20,20,20};
        int givernumber = 20;
        System.out.println(NaiveCodeFOccurSorted(number, givernumber));
    }
    
}
