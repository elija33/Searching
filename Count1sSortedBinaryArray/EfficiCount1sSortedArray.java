package Count1sSortedBinaryArray;

public class EfficiCount1sSortedArray {
    public static int EfficiNumber(int number[]){

        // starting val of the array 
        int starting = 0;

        // Ending val of the array
        int ending = number.length - 1;

        //Loop that compair starting to ending array
        while(starting <= ending){

            //finding the milder index array by taking the starting and ending dived by 2
            int mid = (starting + ending) / 2;

            //if the milder is equal to 0 start from the right of the array side 
            if(number[mid] == 0){
                ending = mid + 1;
            }
            else{
                if(mid == 0 || number[mid - 1] == 0){
                    return (number.length - mid);
                }
                else{
                    ending = mid - 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int number[] = {0,0,0,0,0,0,1,1,1,1,1,1,1,1};
        System.out.println(EfficiNumber(number));
    }
}
