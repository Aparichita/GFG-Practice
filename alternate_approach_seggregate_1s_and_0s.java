// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
                
            } if(arr[left]==0){
                left++;
            } if(arr[right]==1){
                right--;
            }
        }
       
        
    }
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
}
