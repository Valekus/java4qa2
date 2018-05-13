package hw_LR_4;

public class Solution {

    public int solution(int number) {
        //TODO: Code stuff here
        int Ar[];
        Ar = new int[number];
        Ar[0] = 1;



        int i;
        int sum = 0;
        for (i = 0; i < Ar.length; i++){
            if (Ar[i]  % 3 == 0 || Ar[i] % 5 == 0 ){
                sum = sum + Ar[i];

            }
        }
        return sum;
    }
}