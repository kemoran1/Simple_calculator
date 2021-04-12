package simplecal;

//import simplecal.Calframe;

public class Showcal {
	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				Calframe gui = new Calframe();
			
			}
		});
		
	}

}

