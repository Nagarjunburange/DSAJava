public class leet1672 {
    public static void main(String[] args)
    {
        int [][] accounts={{1,8,8},{7,8,1}};
        leet1672 obj=new leet1672();
        System.out.println(obj.maxWealth(accounts));
    }
    public int maxWealth(int [][] accounts)
    {
        int ans=Integer.MIN_VALUE;
        for(int person[]: accounts)
        {
            int sum=0;
            for(int account:person)
            {
                sum+=account;
            }
            if(sum>ans)
            {
                ans=sum;
            }
        }
        return ans;
    }
}