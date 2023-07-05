package Currency;
//commented code are for understanding of call by value and call by reference 
public class MergeSort {

	public void sort(int[] arr, int left, int right) {
//		arr[0]=5000;
//		left=45;
		//As long as left<right we keep splitting the array
		if(left<right) {
			
			int mid=(left +right)/2;
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}

	private void merge(int[] arr, int left, int mid, int right) {
		
		//we will take a new array"brr" for  the merged now sorted array
		int i=left;
		int j=mid+1;
		int k=left;
		int brr[]=new int[arr.length];//we can also take size of array here as"right+1"
		
		while(i<=mid  &&  j<=right) {
			if(arr[i]>=arr[j])
			{
				brr[k]=arr[i];
				i++;
				k++;
			}
			else
			{
				brr[k]=arr[j];
				j++;
				k++;
			}
		}
		
		if(i>mid)
		{
			while(j<=right)
			{
				brr[k]=arr[j];
			    j++;
			    k++;
			    }
		}
		else
		{
			while(i<=mid)
			{
				brr[k]=arr[i];
				i++;
				k++;
			}
		}
		for(int z=left;z<=right;z++)
			arr[z]=brr[z];

	}

}
