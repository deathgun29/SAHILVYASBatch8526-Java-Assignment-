package Dec14;
//to check which character is repeating maximum times
public class calculateAlpha {
	public static void main(String[] args)
	{
		String s="helo okktkvyk";
		char[] charr=s.toCharArray();
		int[] arr=new int[s.length()];
		int count=1;
		int max=0;
		int k;
		int maxnum = 0;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if((charr[i]==charr[j]) && (charr[i]!='0') && (charr[i]!=' '))
				{
					count++;
					arr[i]=count;
										
					charr[j]='0';
					
				}
				
			}
			count=1;
		}
		
		
		for(k=0;k<arr.length;k++)
		{
			//System.out.print(arr[k]);
			if(max<arr[k])
			{
				max=arr[k];
				
				maxnum=k;
			}
			
		}
		System.out.println(charr[maxnum]);
		
	}

}
