package SquareRoot;

public class EfficientSquaredRoot {
    public static int SquareRoot(int number){
        int starting = 1;
        int ending = number;
        int ans = -1;

        while(starting <= ending){
            int mid = starting + (starting-ending) / 2;
            int msq = mid * mid;

            if(msq == number){
                return msq;
            }
            else{
                if(msq > number){
                    ending = mid - 1;
                }
                else {
                    starting = mid + 1;
                        ans = mid;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(SquareRoot(10));
    }
}
