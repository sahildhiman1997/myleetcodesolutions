class Solution {
  public int[] countPoints(int[][] points, int[][] queries) {
        int[] countPoints = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int count =0;
            int[] query = queries[i];
            int h = query[0];
            int k = query[1];
            int r2 = query[2] * query[2];
            for (int[] point : points) {
                int x = point[0];
                int y = point[1];
                if (Math.pow((x - h), 2) + Math.pow((y - k), 2) <= r2) {
                    count++;
                }
            }
            countPoints[i]=count;

        }
        return countPoints;
    }
}