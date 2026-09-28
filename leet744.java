public class leet744 {
    
public static void main(String[] args)
    {
        char letters[]={'a','c','d','f','h','z'};
        char target='g';
        char ans = ceiling(letters,target);
        System.out.println(ans);
    }

   static char ceiling(char[] letters , char target)
    {

        int start=0;
        int end=letters.length-1;

        while(start<=end)
        {

        int mid=start+(end-start)/2;

        
        if(target<letters[mid])
        {
            end=mid-1;
        }
        else
        {
            start=mid+1;
        

        }
 
    }
         // for ceiling of number return start and for floor end ewill be returned
        return letters[start % letters.length]; 
    }

}
