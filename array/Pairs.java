public class Pairs {
    public static void main(String[] args) {
        int arr[]={2,4,6,7,8};
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
}
