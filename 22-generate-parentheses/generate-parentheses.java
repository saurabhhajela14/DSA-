class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        fun("", 0, 0, n, list);
        return list;
    }
    void fun(String s, int open, int close, int n, List<String> list) {
        if (s.length() == n * 2) {
            list.add(s);
            return;
        }
        if (open < n)
            fun(s + "(", open + 1, close, n, list);
        if (close < open)
            fun(s + ")", open, close + 1, n, list);
    }
}