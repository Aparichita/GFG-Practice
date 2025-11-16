class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        ArrayList<Integer>list=new ArrayList<>();
        int n=arr.length;
        int pref[]=new int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];
            
        }
        for(int num:pref){
            list.add(num);
        }
        return list;
        
        
        
        
        
        
    }
}
