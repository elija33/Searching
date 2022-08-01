package FIndingTriplet;

// Using the Brute Force Method.

public class NaiveTriplet {
    public static void Triplet(int number[], int target){
        for(int i = 0; i<number.length - 1; i++){
            for(int j = i + 1; j<number.length -1; j++){
                for(int k = j + 1; k<number.length - 1; k++){
                    if(number[i] + number[j] + number[k] == target){
                        System.out.println(number[i] + " " + number[j] + " " + number[k]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int number[] = {2,3,4,8,9,20,40};
        int target = 32;
        Triplet(number, target);
    }
}
