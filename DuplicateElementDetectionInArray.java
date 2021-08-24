class DuplicateElement {

	public static void main(String[] args) {

      int arr[]= {3,1,2,1,1,3,4,5,1,8,5};
      int n=arr.length;
      
      for(int i=0;i<n;i++)
      { 
    	  for(int j=i+1;j<n;j++)
    	  {
    		  if(arr[i]==arr[j])
    		  {
    			  for(int k=j+1;k<n;k++)
    			  {
    				  arr[k-1]=arr[k];
    			  }
    			  n--;
    			  j--;
    		  }
    	  }
      }
      for(int i=0;i<n;i++)
    	  System.out.print(arr[i]+" ");

	}

}
