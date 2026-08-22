class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> has=new HashSet<>();
        int len=nums.length;
        int res=0;
        for(int i=0;i<len;i++){
            if(has.contains(nums[i])){
                res=nums[i];
            }else{
                has.add(nums[i]);
            }
        }
        return res;

        
    }
}