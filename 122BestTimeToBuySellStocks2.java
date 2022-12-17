class Solution {
    public int maxProfit(int[] p) {
        int Bought = -1;
        int pr = 0;
        for(int i =0;i<p.length-1;i++){
            if(Bought == -1){
                if(p[i+1] > p[i]){
                    Bought = p[i];
                }
            }
            else{
                if(p[i+1] > p[i]){
                    continue;
                }
                else{
                    pr += p[i]-Bought;
                    Bought = -1;
                }
            }
        }
        if(Bought != -1){
            if(p[p.length-1]-Bought > 0){
                pr += p[p.length-1] - Bought;
            }
        }
        return pr;
    }
}
