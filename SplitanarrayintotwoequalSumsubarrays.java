class Solution {
    public boolean canSplit(int arr[]) {
        int totalSum=findSum(arr);
        int n=arr.length;
        int prefSum=0;
        for(int i=0;i<n;i++){
            prefSum+=arr[i];
            int suffSum=totalSum-prefSum;
            if(prefSum==suffSum){
                return true;
            }
            
        }
        return false;
       
        
    }
    public int findSum(int arr[]){
        int n=arr.length;
        int totalSum=0;
        for(int i=0;i<n;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }
}
