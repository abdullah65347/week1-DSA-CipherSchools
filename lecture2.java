public class lecture2 {
	 void sort(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;

	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }

	    // Driver method
	    public static void main(String args[])
	    {
	        int arr[] = {50,25,100,200,30 };

	        lecture2 ob = new lecture2();
	        ob.sort(arr);
	        for(int i=0;i<2;i++) {
	            System.out.print(arr[i]+" ");
	        }
	    }
	

}
