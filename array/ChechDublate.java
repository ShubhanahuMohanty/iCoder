public class ChechDublate
{
    public static void main(String[] args) {
        int x=3;
        int sum=0;
        int arr[]={1,2,3,1,-1};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    sum=arr[i]+arr[j];
                    if (sum==x) {
                        System.out.println("found");
                    }
                }
                if(arr[i]+arr[j]==0)
                {
                    sum=arr[i]+arr[j];
                    if (sum==x) {
                        System.out.println("found");
                    }
                }
            }
        }
    }
}