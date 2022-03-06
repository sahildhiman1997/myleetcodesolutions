class Solution {
    public int countOrders(int n) {
         long previous = 1L;
        for(int i =2;i<=n;i++){
            int emptySpaces = ((i-1)*2)+1;
             long possibilities = emptySpaces*(emptySpaces+1)/2;
            previous=(previous*possibilities)%1000000007;
        } 
        return (int) previous;
    }
}