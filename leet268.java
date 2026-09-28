class leet268
{
    public static void main(String[] args)
    {
        int[] arr = {3, 0, 1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct])
            {
                swap(arr, i, correct);
            }
            else
            {
                i++;
            }
        }

        for(int index=0; index<arr.length; index++)
        {
            if(arr[index]!=index)
            {
                return index;
            }
        }

        return arr.length;
        
}
static void swap(int[] arr, int i, int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
}