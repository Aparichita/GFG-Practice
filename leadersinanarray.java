class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer>leaders=new ArrayList<>();
        int n=arr.length;
        int temp[]=new int[n];
        temp[n-1]=arr[n-1];
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--){
            max=Math.max(max,arr[i]);
            temp[i]=max;
        }
        for(int i=0;i<n;i++){
            if(arr[i]-temp[i]==0){
                leaders.add(temp[i]);
            }
        }
        return leaders;
        
        
    }
}
