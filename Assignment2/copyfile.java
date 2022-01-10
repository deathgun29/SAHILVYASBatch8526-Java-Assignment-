import java.io.*;
class copyfile 
{
	public static void main(String[] args) throws IOException 
	{
	   int i;
	   FileInputStream fin=null;
	   FileOutputStream fout=null;
	   try{
	   	fin=new FileInputStream("abc.txt");
	   }
	   catch(FileNotFoundException e)
	   {
	   	System.out.println("filenor found");
	   	return;
	   }
	   try{
	   	fout=new FileOutputStream("abc1.txt");
	   }
	   catch(FileNotFoundException e)
	   {
	   	System.out.println("filenor found");
	   	return;
	   }	

      try
      {
      	
      	while((i=fin.read())!=-1)
      	{
      		fout.write(i+3);
      		
      	}
      }
      catch(IOException e)
      {

      }
      fin.close();
      fout.close();
	}
}