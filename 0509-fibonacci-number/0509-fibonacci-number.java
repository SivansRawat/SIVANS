class Solution {
    public int fib(int n) {
     int first=0,second=1;
           if (n == 0) return first;
        if (n == 1) return second;
        
        for (int i = 2; i <= n; i++) {
            int sum = (first + second) % 1000000007;
            first = second;
            second = sum;
        }
        
        return second;
        
    }
}