public class ReverceArray {
    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        int brr[]=new int[arr.length];
        int i=0,n=0;
        n=arr.length-1;

        for(i=0;i<arr.length;i++)
        {
            brr[i]=arr[n-i];
        }

        for(i=0;i<brr.length;i++)
        {
            System.out.print(brr[i]);
        }
    }
}
