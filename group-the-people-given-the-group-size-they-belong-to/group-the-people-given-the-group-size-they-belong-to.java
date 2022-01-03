class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> answer = new ArrayList();
        Map<Integer, List<Integer>> pool = new HashMap();
        for (int i = 0; i < groupSizes.length; i++) {
            if (pool.containsKey(groupSizes[i])) {
                pool.get(groupSizes[i]).add(i);
                // System.out.println("compared"+groupSizes[i]+" and "+pool.get(groupSizes[i]).size());
                if (pool.get(groupSizes[i]).size() == groupSizes[i]) {
                    answer.add(pool.get(groupSizes[i]));
                    pool.remove(groupSizes[i]);
                }
            } else {
                int ii = i;
                List<Integer> val = new ArrayList<>();
                val.add(ii);
                pool.put(groupSizes[i], val);
                if (pool.get(groupSizes[i]).size() == groupSizes[i]) {
                    answer.add(pool.get(groupSizes[i]));
                    pool.remove(groupSizes[i]);
                }
            }
        }
        return answer;
    }
}