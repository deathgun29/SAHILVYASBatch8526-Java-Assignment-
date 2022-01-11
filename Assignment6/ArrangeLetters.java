import java.util.Arrays;

public class ArrangeLetters {
	public static void main(String[] args)
	{
		String str="Hello every one";
		String[] strarr=str.split(" ");
		String temp;
		System.out.println(Arrays.toString(strarr));
		for(int i=0;i<strarr.length;i++)
		{
			System.out.println(strarr[i]+"1");
			for(int j=1;j<strarr.length;j++)
			{
				
			if(strarr[i].length()>strarr[j].length())
			{
				System.out.println(strarr[i]);
				System.out.println(strarr[j]);
				temp= strarr[i];
				strarr[i]=strarr[j];
				strarr[j]=temp;
			}
		}
		
	}
		System.out.println(Arrays.toString(strarr));

}
}
