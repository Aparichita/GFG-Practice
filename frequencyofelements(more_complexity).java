class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        int n=arr.length;
        int visited=-1;
        int freq[]=new int[n];
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                     freq[j]=visited;
                }
                
            }
            if(freq[i]!=visited){
                    freq[i]=count;
                }
        }
        for(int i=0;i<n;i++){
        if(freq[i]!=visited){
            ArrayList<Integer>list=new ArrayList<>();
            list.add(arr[i]);
            list.add(freq[i]);
            result.add(list);
            
        }
        }
        return result;
        
    }
}
