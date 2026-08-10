class Solution {
    public int fib(int n) {
        if (n == 1)return 1;
        int no = 1;
        int prevno = 0;
        int sum = 0;
        while (n > 1) {
            sum = no + prevno;
            prevno = no;
            no = sum;
            n--;
        }
        return sum;
    }
}