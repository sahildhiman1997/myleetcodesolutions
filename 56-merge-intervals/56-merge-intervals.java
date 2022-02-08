class Solution {
     public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1,o2)-> o1[0]-o2[0]);

        List<List<Integer>> ans = new ArrayList();

        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 0; i<intervals.length;i++){
            if(intervals[i][0]<=end){
                end = Math.max(intervals[i][1], end);
            }else{
                int finalStart = start;
                int finalEnd = end;
                List<Integer> current = new ArrayList(){{add(finalStart);add(finalEnd);}};
                ans.add(current);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        int finalStart1 = start;
        int finalEnd1 = end;
        List<Integer> current = new ArrayList(){{add(finalStart1);add(finalEnd1);}};
         ans.add(current);
         
        int[][] finalAns = new int[ans.size()][2];
         for(int i =0;i<ans.size();i++){
             finalAns[i][0]= ans.get(i).get(0);
             finalAns[i][1]= ans.get(i).get(1);
         }
         return finalAns;
    }
}