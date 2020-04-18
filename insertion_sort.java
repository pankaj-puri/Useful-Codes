public class insertion_sort
{
	public static void main(String []args)
	{
		int arr[]={56,32,10,89,40,91,27,74,65};
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int temp=arr[i];
			int ptr=i-1;
			while(ptr>=0 && temp<arr[ptr])
			{
				arr[ptr+1]=arr[ptr];
				ptr--;
			}
			arr[ptr+1]=temp;
			
		}
		for(int i:arr)
			System.out.println(i);
	}
}