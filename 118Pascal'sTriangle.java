class Solution {
    static List<List<Integer>> ans;
    public List<List<Integer>> generate(int numRows) {
        ans = new ArrayList<List<Integer>>();
        List temp = new ArrayList<Integer>();
        temp.add(1);
        ans.add(new ArrayList<Integer>(temp));
        if(numRows == 1){
            return ans;
        }
        temp = new ArrayList<Integer>();
        temp.add(1);
        temp.add(1);
        ans.add(new ArrayList<Integer>(temp));
        for(int i=2;i<numRows;i++){
            temp = new ArrayList<Integer>();
            temp.add(1);
            for(int j=1;j<i;j++){
                temp.add((ans.get(i-1)).get(j-1) + (ans.get(i-1)).get(j));
            }
            temp.add(1);
            ans.add(new ArrayList<Integer>(temp));
        }
        return ans;
    }
}
