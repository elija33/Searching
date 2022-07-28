package FindPeakElement;

public class NaviePeakElement {
    public static int PeakElement(int number[]){

    //checking if the array is geater than one
        if(number.length == 1){
            return number[0];
        }

    //check if the first element is great than the second element, we return that.
        if(number[0] >= number[1]){
            return number[0];
        }
    
    // check if the last element is great or equal to the second last element, we return that.
        if(number[number.length - 1] >= number[number.length - 2]){
            return number[number.length - 1];
        }
    // Loop tha gos throught all the array and compair each element of the array to the first and last element of the array.
        for(int i = 1; i<number.length -1; i++){
            if (number[i] >= number[i - 1] && number[i] >= number[i + 1]){
                return number[i];
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int number[] = {5, 20, 40, 30, 20, 50, 60};
        System.out.println(PeakElement(number));
    }
    
}
