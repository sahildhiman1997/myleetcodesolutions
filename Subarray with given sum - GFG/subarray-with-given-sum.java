// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int start = 0;
        int end = 0;
        long sum = arr[0];
        while(sum!=s && end<arr.length){
            
            if(sum<s){
                end++;
                if(end<arr.length) {
                    sum+=arr[end];
                }
            }else{
                sum-=arr[start];
                start++;
                
                if(start>end) {
                    end = start;
                    if(start<arr.length) sum = arr[start];
                }
            }
            // System.out.println("Start: "+start+"end: "+end+"sum: "+sum);
        }
        
        if(sum==s){
            int ss = start;
            int e = end;
            return new ArrayList<Integer>(){{add(ss+1);add(e+1);}};
        }
        
        return new ArrayList<Integer>(){{add(-1);}};
    }
}