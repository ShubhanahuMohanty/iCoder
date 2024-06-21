public class AtoK {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,9};
        int brr[]=new int[5];
        int i=0,k=3,idk,j=0;
        idk=arr.length-k;

        for(i=idk;i<arr.length;i++)
        {
           // System.out.println(arr[idk+j]);
            brr[j]=arr[idk+j];
            //System.out.println("idk="+(idk+j));
            j++;
            
            
        }
        for(i=0;i<idk;i++)
        {
            brr[j]=arr[i];
            System.out.println("arr[m]="+arr[i]);
            j++;
        }


        System.out.println(idk);

        for(i=0;i<brr.length;i++)
        {
            System.out.print(brr[i]);
        }
    }
}
