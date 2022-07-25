package CountOccurrencesSorted;

public class NaiveCountOccurrencesS {
    public static int NCOSI(int number[], int givenumber){
        int cout = 0;
        for(int i = 0; i < number.length; i++){
            if(number[i] == givenumber){
                cout++; 
            }
        }
        return cout; 
    }
    public static void main(String[] args) {
        int number[] = {1,4,7,8,8,11,11,11,11,11,12,12,13};
        int givenumber = 11;
        System.out.println(NCOSI(number, givenumber));
    }
    
}
