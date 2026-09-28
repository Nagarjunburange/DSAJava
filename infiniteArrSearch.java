
public class infiniteArrSearch
 {
    public static void main(String[] args)
    {
        int[] arr={3,5,7,9,12,16,19,23,52,98,99,100,111,121};
        int target =23;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target)
    {
        int start=0;
        int end=1;

        while(target > arr[end])
        {
            int temp=end+1;
            end = end+(end-start +1) * 2;
            start=temp;
        }
        return search(arr, target, start, end);
    }

 
 static int search(int[] arr , int target,int start,int end)
    {


        while(start<=end)
        {

        int mid=start+(end-start)/2;

        if(target>arr[mid])
        {
            start=mid+1;
        }
        else if(target<arr[mid])
        {
            end=mid-1;
        }
        else
        {
            return mid;
        }

        }
    return -1;
    } // for ceiling of number return start and for floor end ewill be returned
}