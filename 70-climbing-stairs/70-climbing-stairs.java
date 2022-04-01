class Solution {
    public int climbStairs(int n) {
        if(n<3) return n;
        
        int last = 2;
        int secondLast = 1;
        
        int temp = 0;
        for(int i =3;i<=n;i++){
            temp = last+secondLast;
            secondLast = last;
            last = temp;
        }
        return last;
    }
}