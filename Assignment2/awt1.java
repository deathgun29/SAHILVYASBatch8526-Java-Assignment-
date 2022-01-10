import java.awt.*;
import java.awt.event.*;
class tes  extends WindowAdapter
{ Button b,b2;
	TextField t1,t2;
	Label l1,l2;
 tes()
 {  
  Frame	f=new Frame("test");
    l1=new Label("enter 1st number");
    l2=new Label("enter 2nd number");
 	b=new Button("swap");
 	b2=new Button("exit");
 	t1=new TextField(10);
 	t2=new TextField(10);
 	b.setBounds(10,220,50,50);
 	t1.setBounds(110,35,100,20);
 	l1.setBounds(10,30,100,30);
 	l2.setBounds(10,60,100,30);
 	t2.setBounds(120,65,100,20);
 	b2.setBounds(70,220,80,50);
 	f.add(l1);
 	f.add(t1);
 	f.add(l2);
 	f.add(t2);
 	f.add(b);
 	f.add(b2);
 	f.setSize(300,300);
 	f.setLayout(new FlowLayout());
 	f.setVisible(true);
 	f.addWindowListener(this);
 		
 			 		
 	b.addActionListener(new ActionListener()
 		{
 			public void actionPerformed(ActionEvent e)
 {
   //System.exit(0);
 	String temp=t1.getText();
 	t1.setText(t2.getText());
 	t2.setText(temp);
 }
 });
 	b2.addActionListener(new ActionListener()
 		{
 			public void actionPerformed(ActionEvent e)
 			{
 				System.exit(0);
 			}
 		});
 }
public void windowClosing(WindowEvent e)
 			{
 				System.exit(0);
 			} 
}

class awt1
{
 public static void main(String[] args) {
 	tes a=new tes();
}
}
