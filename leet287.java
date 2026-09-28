public class leet287
{

    public static void main(String[] args)
    {
        leet287 obj = new leet287();
        int[] arr = {3,1,3,4,2};
        System.out.println(obj.leet287(arr));
    }

    
    public int leet287(int[] arr)
    {
        int i = 0;
        while (i < nums.length)
        {
            if(nums[i] != i + 1)
            {
                 int correctIndex = nums[i] - 1;
                if(nums[i] != nums[correctIndex])
                {
                    swap(nums,i,correctIndex);

                }
                else
                {
                    return nums[i];
                }
            }
            else

                {
                    i++;
                }
    }
        return -1;
    }
    void swap(int[] nums,int first,int second)
    {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;   
    }
}