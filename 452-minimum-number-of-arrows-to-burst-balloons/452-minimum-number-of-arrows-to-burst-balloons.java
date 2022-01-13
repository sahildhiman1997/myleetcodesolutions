class Solution {
  public int findMinArrowShots(int[][] points) {
     
        Map<Integer, Integer> balloonSizeStartingAtIndex = new TreeMap<Integer,Integer>();
      if(points == null){
          return 0;
      }
        int ans = 0;
        for(int[] point : points){
            if(balloonSizeStartingAtIndex.containsKey(point[0])){

                balloonSizeStartingAtIndex.put(point[0], Math.min(balloonSizeStartingAtIndex.get(point[0]),point[1]));

            }else{
                balloonSizeStartingAtIndex.put(point[0],point[1]);

            }
        }

        long previousEnd = Long.MIN_VALUE;
        for (Integer k : balloonSizeStartingAtIndex.keySet()){
            System.out.println("k is "+k+" and previousEnd is "+previousEnd);
           if(k>previousEnd){
                ans++;
                previousEnd = balloonSizeStartingAtIndex.get(k);
            }else{
                previousEnd = Math.min(balloonSizeStartingAtIndex.get(k), previousEnd);
            }
        }
      return ans;
    }
}