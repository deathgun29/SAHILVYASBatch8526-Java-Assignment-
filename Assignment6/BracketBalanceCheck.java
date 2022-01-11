import java.util.Stack;

class check
{
	Stack<Character> s=new Stack<Character>();
	String str="{{[[][)";
	boolean checkStack()
	{
		for(int i=0;i<str.length();i++)
		{
			char x=str.charAt(i);
			if(x=='{' || x=='(' || x=='[')
			{
				s.push(x);
				continue;
			}
			
			if(s.isEmpty())
				return false;
			char check;
			switch(x)
			{
			case ')':
			{
				check=s.pop();
				if(check=='{' || check=='[')
					return false;
				break;
			}
			case '}':
			{
				check=s.pop();
				if(check=='(' || check=='[')
					return false;
				break;
			}
			case ']':
			{
				check=s.pop();
				if(check=='{' || check=='(')
					return false;
				break;
			}
			}
			
		
		}
		return (s.isEmpty());
	}
}
public class BracketBalanceCheck {
	public static void main(String[] args)
	{
		check c=new check();
		if(c.checkStack())
		{
			System.out.println("Balanced");
		}
		else
			System.out.println("Not Balanced");
	}

}
