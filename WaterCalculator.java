import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WaterCalculator {

	private JFrame frame;
	private JTextField txtHowMuchWater;
	private JTextField txtMyWeightkg;
	private JTextField textField1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WaterCalculator window = new WaterCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WaterCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtHowMuchWater = new JTextField();
		txtHowMuchWater.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtHowMuchWater.setHorizontalAlignment(SwingConstants.CENTER);
		txtHowMuchWater.setText("How much water should I drink?");
		txtHowMuchWater.setBounds(38, 13, 352, 48);
		frame.getContentPane().add(txtHowMuchWater);
		txtHowMuchWater.setColumns(10);
		
		txtMyWeightkg = new JTextField();
		txtMyWeightkg.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtMyWeightkg.setHorizontalAlignment(SwingConstants.CENTER);
		txtMyWeightkg.setText("My Weight (kg): ");
		txtMyWeightkg.setBounds(12, 74, 202, 56);
		frame.getContentPane().add(txtMyWeightkg);
		txtMyWeightkg.setColumns(10);
		
		JButton btnTellMe = new JButton("Tell Me!!");
		btnTellMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int weight1;
				double ans;
				try {
				weight1 = Integer.parseInt(textField1.getText());
					ans = weight1 * 0.033;
			
				JOptionPane.showMessageDialog(null, "Buddy, you should drink " + ans + "L of water a day!");
				
				
			}catch(Exception e) {
				
				JOptionPane.showMessageDialog(null, "Please Enter Valid Number!");
			
		}
			}
	});
		btnTellMe.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnTellMe.setBounds(134, 151, 167, 56);
		frame.getContentPane().add(btnTellMe);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField1.setHorizontalAlignment(SwingConstants.CENTER);
		textField1.setBounds(226, 75, 194, 55);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
	}
}
