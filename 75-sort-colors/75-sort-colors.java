class Solution {
    public void sortColors(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length -1;
        
        while(mid<=high){
            int temp;
            switch(arr[mid]){
                    
                case 1:
                    mid++;
                    break; 
                    
                case 0: 
                    temp =arr[low];
                    arr[low]=0;
                    low++;
                    arr[mid]=temp;
                    mid++;
                    break;
                    
                case 2:
                    temp = arr[high];
                    arr[high]=2;
                    high--;
                    arr[mid]=temp;
                    break;
                default:
                    System.out.println("only 3 colors allowed");
            }
            
            System.out.println(Arrays.toString(arr)+" at mid "+mid);
            
            
            
            
            
        }
        
      
    }
}