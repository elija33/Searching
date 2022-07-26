package Count1sSortedBinaryArray;

public class NaiveCount1sSortedBinaryArray {
    public static int Count1Sorted(int number[]){
        int count = 0;
        for(int i = 0; i<number.length; i++){
            if(number[i] == 1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int number[] = {0,0,0,1,1,1,1,1};
        System.out.println(Count1Sorted(number));
    }
    
}
