class Solution {
    public int numRescueBoats(int[] people, int limit) {
                int[] sortedPeople = Arrays.stream(people).sorted().toArray();
                int answer = 0;
                int i=0;
                int j= sortedPeople.length-1;
                while(j>=i){
                    int filledCapacity = sortedPeople[j];
                    if(filledCapacity+sortedPeople[i]<=limit){
                        i++;
                    }
                    j--;
                    answer++;
                }
                return answer;
    }
}