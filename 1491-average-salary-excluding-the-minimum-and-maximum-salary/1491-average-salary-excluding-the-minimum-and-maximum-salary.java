class Solution {
    public double average(int[] salary) {
        int min = Math.min(salary[0], salary[1]);
        int max =  Math.max(salary[0], salary[1]);
        double sum = 0;
        
        for(int i = 2;i<salary.length;i++){
            if(salary[i]<min){
                sum+=min;
                min = salary[i];
            }else if(salary[i]>max){
                sum+=max;
                max = salary[i];
            }else{
                sum+=salary[i];
            }
        }
        return sum/(salary.length-2);
    }
}