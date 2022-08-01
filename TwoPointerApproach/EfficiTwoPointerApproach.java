package TwoPointerApproach;

// Given a sorted array and a sum, find if there is a pair with given sum.

public class EfficiTwoPointerApproach {
    public static boolean TwoPointerApproach(int number[], int target){
        int starting = 0;
        int ending = number.length - 1;
        while(starting < ending){
            if(number[starting] + number[ending] == target){
                return true;
            }
            else{
                if(number[starting] + number[ending] < target){
                        starting++;
                } 
            else{
                if(number[starting] + number[ending] > target){
                       ending--;
                }
            }
        }
           
        }
        return false;
       
    }
    
    public static void main(String[] args) {
        
    }
}
