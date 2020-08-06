package Hot031;

class Solution {

    public void nextPermutation(int[] nums) {

        int pos1;
        int pos2;

        for(int i = nums.length-1; i >= 0 ; i--){

            if(i == 0){
                conver(nums,0,nums.length-1);
                break;
            }

            if(nums[i-1] < nums[i]){
                pos1 = i-1;
                pos2 = -1;
                int min = Integer.MAX_VALUE;

                for(int j = nums.length-1; j> pos1 ; j--){

                    if(nums[j] > nums[pos1] && nums[j] < min){
                        min = Math.min(nums[j],min);
                        pos2 = j;
                    }
                }
                Swap(nums,pos1,pos2);
                conver(nums,pos1+1,nums.length-1);
                break;
            }

        }

    }




    public void conver(int[] nums, int left , int right){
        while(left < right){
            Swap(nums,left,right);
            left++;
            right--;
        }
    }

    public void Swap(int[] nums, int left , int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
