// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}
// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        
        if(arr.length==1) return 0;
        
        int ans = 1;
        
        int start = 0;
        int end = start+arr[start];
        
        while(end<arr.length-1){
            ans++;
            int maxProvider = 0;
           
            for(int i = start+1;i<=end;i++){
                if(arr[i]+i >= maxProvider+arr[maxProvider]){
                    maxProvider = i;
                }
            }
            if(maxProvider == 0) return -1;
            start = end;
            end = maxProvider+arr[maxProvider];
        }

        return ans;
    }
}