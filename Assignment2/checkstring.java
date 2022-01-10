import java.awt.*;
import java.awt.event.*;
import java.io.*;
class checkstring extends Frame
{
	Label l1,l2;
	Button b,b2,b3;
	TextField t1,t2,t3;
	CheckboxGroup ch;
	Checkbox sl,sr;
public checkstring()
{
	l1=new Label("enter");
	t1=new TextField(10);
	t2=new TextField(10);
	t3=new TextField(10);
	ch=new CheckboxGroup();
	sl=new Checkbox("String length",ch,true);
	sr=new Checkbox("String length",ch,false);
	b=new Button("exit");
	b2=new Button("fact");
	b3=new Button("clear");
	add(l1);
	add(t1);
	add(t2);
	add(t3);
    add(sl);
    add(sr);
    add(b);
    add(b2);
    add(b3);
    setLayout(new FlowLayout());
    setSize(400,400);
    setVisible(true);
    b.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			System.exit(0);
    		}
    	});
    sl.addItemListener(new ItemListener()
    	{
    		public void itemStateChanged(ItemEvent e)
    		{
    			String s=t1.getText();
    			t2.setText(" "+s.length());
    		}
    	});
    sr.addItemListener(new ItemListener()
    	{
    		public void itemStateChanged(ItemEvent e)
    		{
    		StringBuffer sb=new StringBuffer(t1.getText());
    		String g; 
    		//sb=t1.getText();
    		g=sb.reverse().toString();
    			t2.setText(" "+g);
    		}
    	});
    b2.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{   int sum=1;
    			int x=Integer.parseInt(t3.getText());
    			for(int i=1;i<=x;i++)
    			{
                      sum=sum*i;
    			}
    			t3.setText("fact="+sum);
    		}
    	});
    b3.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent e)
    		{
    			t1.setText(" ");
    			t2.setText(" ");
    			t3.setText(" ");

    		}
    	});
}
    public static void main(String[] args) {
    	new checkstring();
    }
}