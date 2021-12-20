


public class Exponentialsearch {
	
static int binarysearch(int[] arr,int left,int right,int key)   //binanry search
{
	
	if(left<=right)                                             //to check if array is empty or not
	{
	int mid=left+(right-left)/2;                                //to get mid number
	
	  if(arr[mid]==key)                                         //if key is in the middle it will return the position of key
	  {
		  return mid;
	  }
	  if(arr[mid]>key)
	  {
		  return binarysearch(arr,left,mid-1,key);             //to check if number is in 1st half
	  }
	  else 
	  {
		  return binarysearch(arr,mid+1,right,key);           //to check if number is in 1st half 
	  }
	  
	}
	return -1;                                                 //returning -1 if number not found
}

 static int exposearch(int arr[],int left,int right, int key)
{
    if(right - left<=0)                                  //if array is empty
    {
    	return -1;
    } 
    int i=1;                                             //because 2^0=1
    while(i<right-left +1)
    {
    	if(arr[i]<key)
    	{
    		i=i*2;                                      //increasing i by power 2 
    	}
    	else
    	{
    		break;
    	}
    }
   
    return binarysearch(arr,i/2,i,key);              //passing the range for binary search
}
 
 
 
 
 
 
public static void main(String[] args)
{
	int arr[]= {10,13,15,26,28, 50, 56, 88, 94, 127, 159, 356, 480, 567, 689, 699, 780, 850, 956, 995};
	int left=0;
	int right= arr.length;
	//System.out.println(right);
	int key=689;
	
	int x;

		if((x=exposearch(arr,left,right,key))==-1)
		{
			System.out.println("Number not found");
		}
		else
		{
			System.out.println("Number  found position "+(x+1));
		}
	 
}

}
