package MajorityElement;

public class NavieMajorityElement {
    public static int MajorityElementIndex(int number[]){

        // for loop that gos thought the whole array
        for(int i = 0; i < number.length; i++){

            // set count as 1
            int count = 1;

            // for loop that go's thought the whole array again 
            for(int j = i + 1; j<number.length; j++){

            //Compair the first loop to the second loop
                if(number[i] == number[j]){
            
            // increasement count 
                    count++;
                }

            // when you compair count and the array 
                if(count > number.length/2){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] ={8,7,6,8,8,8,6};
        System.out.println(MajorityElementIndex(number));
    }
    
}
