class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer>list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                secondMin=min;
                min=arr[i];
            }else if(arr[i]<secondMin && arr[i]>min){
                secondMin=arr[i];
                
            }
            
        }
        if(secondMin==Integer.MAX_VALUE){
            list.add(-1);
        }else{
            list.add(min);
            list.add(secondMin);
        }
        return list;
        
    }
}
