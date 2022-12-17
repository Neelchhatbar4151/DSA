class Solution {
   public static int fib(int n){
       if(n == 0){
           return 0;
       }
       int sum = 1;
       int History = 0;
       for(int i =1;i<n;i++){
           int temp = sum;
           sum += History;
           History = temp;
       }
        return sum;
    }
}
