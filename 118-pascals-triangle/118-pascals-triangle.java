class Solution {
public static List<List<Integer>> generate(int numRows) {

    List<List<Integer>> ans = new ArrayList<>();

    List<Integer> current = new ArrayList<Integer>();
    int i = 0;
    while(i<numRows){
        current.add(1);
        int currentIndex = current.size()-2;
//        int temp= current.get(current.size()-1);

        while(currentIndex>0){
            int temp = current.get(currentIndex-1);
            current.set(currentIndex, current.get(currentIndex)+temp);
            currentIndex--;
        }

      ans.add(new ArrayList<>(current));
        i++;

    }

return ans;
}
}