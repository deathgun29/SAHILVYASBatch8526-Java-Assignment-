import java.io.*;

class writeinfile
{
   public static void main(String[] args) throws IOException 
   { 
   	File f=new File("abc2.txt");
   	f.createNewFile();
   	FileWriter w=new FileWriter(f);
     // int j;
     // j=79;
      w.write("this \n is \n examle \n wijakhdkgd");
      w.close();
      FileReader r=new FileReader(f);
      char a[]=new char[50];
      r.read(a);
      for(char c:a) //for each loop
      	System.out.print(c);
      r.close();
	}
}
