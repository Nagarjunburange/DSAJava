public class sortedMatrix 
{
    public static void  main(String[] args)
    {

    }

    static int[] binarySearch(int[][] matrix,int row,int cstart,int cend,int target)
{
    while(cstart<=cend)
    {
        int mid = cstart + (cend-cstart)/2;
        if(matrix[row][mid]==target)
        {
            return new int[]{row,mid};
        }
        if (matrix[row][mid]<target)
        {
            cstart=mid+1;
        }
        else
        {
            cend=mid-1;
        }
    }
    return new int[]{-1,-1};
}

static int[] search(int[][],int target)
{
    int rows = matrix.length;
    int cols = matrix[0].lemgth;

    if (rows == 1) {
        
        return binarySearch(matrix, 0, 0, cols-1, target);
    }

    int rStart = 0;
    int rEnd = rows-1;
    int cMid = cols/2;

    while (rstart < (rend -1)) 
    {
        int mid = rstart + (rend- rstart)/2;
        if(matrix[][cmid])
         
    }
}