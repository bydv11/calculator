// namme : Bhagwati Yadav 
//roll no: 201350
package calculator;
import javax.swing.*;
import java.awt.event.*;

public class demo {
	
	 
	class Calc implements ActionListener
	{
	JFrame f;
	JTextField t;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bDivide,bMultiply,bSubtract,bAdd,bDecimal,bEquals,bDelete,bClear;
	 
	static double a=0,b=0,result=0;
	static int operator=0;
	 
	Calc()
	{
	f=new JFrame("Calculator");
	t=new JTextField();
	t.setEditable(false);
	b1=new JButton("1");
	b2=new JButton("2");
	b3=new JButton("3");
	b4=new JButton("4");
	b5=new JButton("5");
	b6=new JButton("6");
	b7=new JButton("7");
	b8=new JButton("8");
	b9=new JButton("9");
	b0=new JButton("0");
	bDivide=new JButton("/");
	bMultiply=new JButton("*");
	bSubtract=new JButton("-");
	bAdd=new JButton("+");
	bDecimal=new JButton(".");
	bEquals=new JButton("=");
	bDelete=new JButton("Delete One");
	bClear=new JButton("Clear All");
	t.setBounds(30,40,280,30);
	b7.setBounds(40,100,50,40);
	b8.setBounds(110,100,50,40);
	b9.setBounds(180,100,50,40);
	bDivide.setBounds(250,100,50,40);
	b4.setBounds(40,170,50,40);
	b5.setBounds(110,170,50,40);
	b6.setBounds(180,170,50,40);
	bMultiply.setBounds(250,170,50,40);
	b1.setBounds(40,240,50,40);
	b2.setBounds(110,240,50,40);
	b3.setBounds(180,240,50,40);
	bSubtract.setBounds(250,240,50,40);
	bDecimal.setBounds(40,310,50,40);
	b0.setBounds(110,310,50,40);
	bEquals.setBounds(180,310,50,40);
	bAdd.setBounds(250,310,50,40);
	bDelete.setBounds(60,380,100,40);
	bClear.setBounds(180,380,100,40);
	f.add(t);
	f.add(b7);
	f.add(b8);
	f.add(b9);
	f.add(bDivide);
	f.add(b4);
	f.add(b5);
	f.add(b6);
	f.add(bMultiply);
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(bSubtract);
	f.add(bDecimal);
	f.add(b0);
	f.add(bEquals);
	f.add(bAdd);
	f.add(bDelete);
	f.add(bClear);
	f.setLayout(null);
	f.setVisible(true);
	f.setSize(350,500);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setResizable(false);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	b0.addActionListener(this);
	bAdd.addActionListener(this);
	bDivide.addActionListener(this);
	bMultiply.addActionListener(this);
	bSubtract.addActionListener(this);
	bDecimal.addActionListener(this);
	bEquals.addActionListener(this);
	bDelete.addActionListener(this);
	bClear.addActionListener(this);
	}
	 
	public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==b1)
	t.setText(t.getText().concat("1"));
	if(e.getSource()==b2)
	t.setText(t.getText().concat("2"));
	if(e.getSource()==b3)
	t.setText(t.getText().concat("3"));
	if(e.getSource()==b4)
	t.setText(t.getText().concat("4"));
	if(e.getSource()==b5)
	t.setText(t.getText().concat("5"));
	if(e.getSource()==b6)
	t.setText(t.getText().concat("6"));
	if(e.getSource()==b7)
	t.setText(t.getText().concat("7"));
	if(e.getSource()==b8)
	t.setText(t.getText().concat("8"));
	if(e.getSource()==b9)
	t.setText(t.getText().concat("9"));
	if(e.getSource()==b0)
	t.setText(t.getText().concat("0"));
	if(e.getSource()==bDecimal)
	t.setText(t.getText().concat("."));
	if(e.getSource()==bAdd)
	{
	a=Double.parseDouble(t.getText());
	operator=1;
	t.setText("");
	}
	if(e.getSource()==bSubtract)
	{
	a=Double.parseDouble(t.getText());
	operator=2;
	t.setText("");
	}
	if(e.getSource()==bMultiply)
	{
	a=Double.parseDouble(t.getText());
	operator=3;
	t.setText("");
	}
	if(e.getSource()==bDivide)
	{
	a=Double.parseDouble(t.getText());
	operator=4;
	t.setText("");
	}
	if(e.getSource()==bEquals)
	{
	b=Double.parseDouble(t.getText());
	switch(operator)
	{
	case 1: result=a+b;
	break;
	case 2: result=a-b;
	break;
	case 3: result=a*b;
	break;
	case 4: result=a/b;
	break;
	default: result=0;
	}
	t.setText(""+result);
	}
	if(e.getSource()==bClear)
	t.setText("");
	if(e.getSource()==bDelete)
	{
	String s=t.getText();
	t.setText("");
	for(int i=0;i<s.length()-1;i++)
	t.setText(t.getText()+s.charAt(i));
	}
	}
	 
	public static void main(String s)
	{
	new Calc();
	}
	}
	}