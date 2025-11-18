class Solution {
    public int getSecondLargest(int[] arr) {
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }else if(arr[i]>secondMax && arr[i]<max){
                secondMax=arr[i];
            }
           
           
    
            
            
        }
        return secondMax;
        
    }
}
