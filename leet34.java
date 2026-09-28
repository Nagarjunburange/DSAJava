class leet34
{
    public static void main(String[] args)
    {
        int arr[]={5,7,7,7,7,8,8,10};
        int target=7;
        int ans = search(arr,target, true);
        System.out.println(ans);
    }

     static int searchRange(int[] nums , int target, boolean findFirst)
    {

        int ans={-1,-1};

        int start=0;
        int end=nums.length-1;

        while(start<=end)
        {

        int mid=start+(end-start)/2;

        if(target<nums[mid])
        {
            end=mid-1;
        }
        else if(target>nums[mid])
        {
            start=mid+1;
        }
        else
        {
            return mid;
        }

        }
          // for ceiling of number return start and for floor end ewill be returned
    }
}