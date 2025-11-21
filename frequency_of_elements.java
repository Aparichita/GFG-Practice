class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<ArrayList<Integer>>result=new ArrayList<>();
        int n=arr.length;
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
            
            
        }
        for(int i=0;i<n;i++){
            int num=arr[i];
            if(map.containsKey(num)){
            ArrayList<Integer>pair=new ArrayList<>();
            pair.add(num);
            pair.add(map.get(num));
            result.add(pair);
            map.remove(num);
            }
            
            
            
            
        }
        return result;
        
    }
}
