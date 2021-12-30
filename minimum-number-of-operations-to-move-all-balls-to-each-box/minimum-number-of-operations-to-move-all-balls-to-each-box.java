class Solution {
     public int[] minOperations(String boxes) {
        int[] answer = new int[boxes.length()];
        int[] answer2 = new int[boxes.length()];

//        let's count how many balls are there in the left for each member.
        int ballsAtLeftFromCurrentIndex = 0;
        for (int i = 1; i < answer.length; i++) {
            if(Integer.parseInt(String.valueOf(boxes.charAt(i-1)))==1){
                ballsAtLeftFromCurrentIndex+=1;
            }
            answer[i]=answer[i-1]+ ballsAtLeftFromCurrentIndex;
        }
//        if we were to move all the balls in right to the current box

        int ballsAtRightFromCurrentIndex=0;
        int moveMentsForPreviousIndex = 0;
        for (int i = answer.length-2; i >-1; i--) {
            if(Integer.parseInt(String.valueOf(boxes.charAt(i+1)))==1){
                ballsAtRightFromCurrentIndex+=1;
            }
            moveMentsForPreviousIndex+=ballsAtRightFromCurrentIndex;
            answer[i]+=moveMentsForPreviousIndex ;
            
        }
        for (int i = 0; i < answer.length; i++) {
            answer[i]+=answer2[i];
        }

        return answer;


    }
}