class Solution {

    public boolean isVowel(char ch){
        if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }


    public int maxVowels(String s, int k) {
        int n = s.length();

        int max = 0;
        int i=0,j=0;

        int sum = 0;


        while(j<n){
            if(isVowel(s.charAt(j))){
                sum += 1;

            }

            if(j-i+1<k){
                j++;
            }

            else if(j-i+1 == k){

                max = Math.max(max,sum);
                System.out.println(max);
                // System.out.println(i);
                // System.out.println(j);
                 if(max == k){
                    return max;
                 }

                if(isVowel(s.charAt(i))){
                    sum-=1;
                    
                }

                i++;
                j++;
            }
        }

        System.out.println("hello");

        return max;

    }
}