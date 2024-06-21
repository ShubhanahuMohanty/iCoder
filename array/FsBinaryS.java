public class FsBinaryS {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        int start=0,end=arr.length-1;
        
        int key=10;

        while (start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]==key)
            {
                System.out.println("index="+mid);
                break;
            }
            else if(arr[mid]<key)
            {
                start=mid+1;
            }
            else if(arr[mid]>key)
            {
                end=mid-1;
            }
        }

    }
}
