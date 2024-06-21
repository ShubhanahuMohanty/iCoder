public class SubArray {
    public static void main(String[] args) {
        int arr[]={2,4,6,8};

        int start,end,i,j,k;
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                start=i;
                end=j;
                //System.out.print("(");
                System.out.println("i="+i+"j=");
                for(k=start;k<=end;k++)
                {
                    //System.out.print(arr[k]+",");
                    
                }
               // System.out.print(")");
            }
            
        }
    }
}
