package TwoPointerApproach;

public class NavieTwoPointerApproach {
    public static void TwoPointerApproach(int number[], int target){
        for(int i = 0; i<number.length - 1; i++){
            for(int j = i + 1; j < number.length - 1; j++){
                if(number[i] + number[j] == target){
                    System.out.println(number[i] + " " + number[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int number[] = {1, 4, 45, 5, 40, 10, 8, 49, 0};
        int target = 50;
        TwoPointerApproach(number, target);
    }
    
}
