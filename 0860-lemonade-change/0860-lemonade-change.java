class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count[] = {0,0,0}; 
       if(bills[0]  == 5){
           count[0] += 1;
           int total = 5;
           int n = bills.length; 
           for(int i = 1 ; i<n; i++){
               int pre = bills[i];
               if(pre == 5){
                   count[0] += 1;
                   total += 5; 
               }else{
                   if(pre==10){
                       count[1] += 1;
                       total += pre;
                       pre -= 5;
                       if(count[0] > 0){
                           total -= pre;
                           count[0] -= 1;
                       }else{
                          return false;
                       }

                   }else{
                       count[2] += 1;
                       pre -= 5;
                       if(count[0] > 0 && count[1]>0){
                           total -= pre;
                           count[0] -= 1;
                           count[1] -= 1;
                       }else if(count[0] > 2){
                           total -= pre;
                           count[0] -= 3;
                       }else{
                           return false;
                       }
                   } 
               }
           }
       }else{
           return false;
       }

       return true; 
    }
}