public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length,k;
        while(j>=i && i<nums.length){
            k = (i+j)/2;
            if(nums[k] == target)return k;
            else if(nums[k] < target) i=k+1;
            else j = k-1;
        }
        return i;
    }

    public static void main(String[] args) {
        int []arg = {1,3,5,6};
        int target = 6;
        SearchInsertPosition s = new SearchInsertPosition();
        int x = s.searchInsert(arg, target);
        System.out.println(x);
    }
}
