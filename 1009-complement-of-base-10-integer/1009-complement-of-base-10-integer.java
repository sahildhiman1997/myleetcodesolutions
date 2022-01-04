class Solution {
       public static int bitwiseComplement(int n) {
           
           if(n==0) return 1;
           
        List<Short> mystack = new ArrayList<>();
        while (n > 0) {
          mystack.add((short) ((n % 2)==0?0:1));
            n = n / 2;
        }
        int i =0;
        int answer=0;
        for (int j = 0; j < mystack.size(); j++) {

        
            int k = mystack.get(i);
            if(k==0){

                answer+=Math.pow(2,i);
            }
//            System.out.println(k);
//            System.out.println(answer+"anser after bit "+i);
            i++;
        }

        return answer;
    }
}