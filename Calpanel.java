package simplecal;


	import java.awt.Color;
	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;

	public class Calpanel extends JPanel implements ActionListener{
		
//		/**
//		 * 
//		 */
//		private static final long serialVersionUID = 1L;
		private JLabel jlresult;
		private JButton jbAdd, jbSub, jbDivide, jbMultiply;
		private JTextField jtf1, jtf2;
		private Object get;
		private int total;
		
		
		
		public Calpanel(){
			setBackground(Color.lightGray);
			setLayout(new GridLayout(6,2));
			
			jlresult = new JLabel("Results: " + get(total));
			
			
			jtf1 =new JTextField("Put in your number here:");
			jtf2= new JTextField("Put other number here :");
		
					
			jbAdd = new JButton("Add");
			jbSub=new JButton("Sub");		
			jbDivide=new JButton("Divide");
			jbMultiply =new JButton("Mutliply");
			
			
			
			add(jlresult);
			add(jtf1);
			add(jtf2);
			add(jbAdd);
			add(jbSub);
			add(jbDivide);
			add(jbMultiply);
			
			jbAdd.addActionListener(this);
			jbSub.addActionListener(this);
			jbDivide.addActionListener(this);
			jbMultiply.addActionListener(this);
			
			JPanel jbPanel=new JPanel();
			jbPanel.setLayout(new GridLayout(2,2));
			jbPanel.add(jbAdd);
			jbPanel.add(jbSub);
			jbPanel.add(jbDivide);
			jbPanel.add(jbMultiply);
			add(jbPanel);
			
		}
	
		public int getIntFromTextField1() {
			int num1=0;
			num1=Integer.parseInt(jtf1.getText());
			return num1 ;
		}		
		public int getIntFromTextField2() {
			int num2=0;
			num2=Integer.parseInt(jtf2.getText());	
			return num2;
		}
		public double getDoubleFromTextField1() {
			double num1=0;
			num1=Double.parseDouble(jtf1.getText());
			return num1 ;
		}
		

		
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btnClicked = (JButton)e.getSource();
			int num1=getIntFromTextField1();
			double num11=getDoubleFromTextField1();
			int num2 =getIntFromTextField2();
			double total=0;
			if(btnClicked.equals(jbAdd)) {
				total=num11+num2;
				jlresult.setText("sum= " +total);
				
			}
			else if (btnClicked.equals(jbSub)) {
				total=num11 - num2;
				jlresult.setText("Subtraction= "+ total);
				
			}
			else if (btnClicked.equals(jbMultiply)) {
				total= num11* num2;
				jlresult.setText("Multiply= " +total);
				
			}
			else if (btnClicked.equals(jbDivide)) {
				if(num2 ==0) {
					jlresult.setText("sorry cannot divide by 0");
				}
				else {
				total=num11/num2;
				jlresult.setText("Divison= " +total);
				}
			}
		}	
			public int get(int total2) {
		return total; 
		}
			
			
		}
		

