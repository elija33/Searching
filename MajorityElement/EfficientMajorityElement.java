package MajorityElement;

public class EfficientMajorityElement {

    public static int findMajorityElement(int number[]){
        int reslt = 0;
        int count = 1;
        for(int i = 1; i<number.length; i++){
            if(number[reslt] == number[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                reslt = i;
                count = 1;
            }
        }
        count = 0;
        for(int i = 0; i<number.length; i++){
            if(number[reslt] == number[i]){
                count++;
            }
            if(count < number.length/2){
                reslt = -1;
            }
        }
        return reslt;
    }
    public static void main(String[] args) {
        int number[] = {8,7,6,8,8,8,6};
        System.out.println(findMajorityElement(number));
    }
}
