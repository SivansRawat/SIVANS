#User function Template for python3
class Solution:
    def perfectSum(self, arr, n, sum):
        MOD = 10**9 + 7

        # Initialize a list to store the count of subsets
        dp = [0] * (sum + 1)

        # There is one way to make sum = 0, which is by not including any element
        dp[0] = 1

        # Fill the dp list using a bottom-up approach
        for i in range(n):
            for j in range(sum, arr[i] - 1, -1):
                # If the current element can be included in the subset
                # (i.e., it is less than or equal to the current sum),
                # update dp[j] by adding dp[j - arr[i]]
                dp[j] = (dp[j] + dp[j - arr[i]]) % MOD

        # The result is stored in dp[sum]
        return dp[sum]


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		n,sum = input().split()
		n,sum = int(n),int(sum)
		arr = [int(x) for x in input().split()]
		ob = Solution()
		ans = ob.perfectSum(arr,n,sum)
		print(ans)

# } Driver Code Ends