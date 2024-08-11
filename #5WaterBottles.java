class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;

        while(numBottles>=numExchange){
            int newBottle=numBottles/numExchange;

            int remBottle=numBottles%numExchange;

            sum=sum+newBottle;
            numBottles=newBottle+remBottle;
        }
        return sum;

    }
}
