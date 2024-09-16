package app;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		interfaceGrafica();		
		SpringApplication.run(Main.class, args);
	}

    public static void interfaceGrafica() {
		JFrame frame = new JFrame();	
		frame.setTitle("Tomcat");
		frame.setPreferredSize(new Dimension(190, 190));
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
		
		JLabel label = new JLabel();
		label.setText("Web service iniciado!");
		label.setBounds(15, 15, 160, 100);
		frame.add(label);

        frame.setVisible(true);
    }	
}