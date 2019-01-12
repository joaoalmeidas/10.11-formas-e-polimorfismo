import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DesenhoTeste {

	public static void main(String[] args) {
		
		
		DesenhoPanel panel = new DesenhoPanel();
		JFrame app = new JFrame();
		JLabel status = new JLabel(panel.retornaStatus());
		
		
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.add(status, BorderLayout.SOUTH);
		app.setSize(300, 300);
		app.setVisible(true);

	}

}
