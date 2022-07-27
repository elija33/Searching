package SquareRoot;

public class NaiveSquareRoot {
    public static int sqroots(int givennumber){
        int j = 1;
        while(j * j <= givennumber){
            j++;
        }
        return (j - 1);
    }
    public static void main(String[] args) {
        System.out.println(sqroots(15));
    }
}
