package simplecal;



	import java.awt.BorderLayout;
	import java.awt.Color;
	//import java.awt.GridLayout;

	import javax.swing.JFrame;
	import javax.swing.JPanel;

	import simplecal.Calframe;

	public class Calframe extends JFrame{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Calframe(){
			JPanel mainJP = new JPanel();
			mainJP.setBackground(Color.blue);
			mainJP.setLayout(new BorderLayout());
			//mainJP.setLayout(new GridLayout(,3));
			
			Calpanel jp1 = new Calpanel();
			mainJP.add(jp1);

			add(mainJP);
			
			setSize(500,500);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

	}