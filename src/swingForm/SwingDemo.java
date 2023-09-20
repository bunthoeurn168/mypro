package swingForm;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SwingDemo extends JFrame implements ActionListener{
	JLabel lbl;
	JCheckBox ck1, ck2, ck3;
	JButton btnOrder;
	public SwingDemo() { 
		setTitle("Form");
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\ASUS\\Desktop\\PCCFPI Teaching\\JavaFx\\y3s2g3\\swingApp\\src\\images\\icon.png");  
		lbl = new JLabel("Pizz Company");
		lbl.setBounds(120, 30, 100, 25);
		ck1 = new JCheckBox("Piza: $100");
		ck1.setBounds(150, 70, 100, 30);
		ck2 = new JCheckBox("Burgure: $50");
		ck2.setBounds(150, 100, 100, 30);
		ck3 = new JCheckBox("Tea: $10");
		ck3.setBounds(150, 130, 100, 30);
		btnOrder = new JButton("Order");
		btnOrder.setBounds(140, 180, 70, 30);
		add(lbl);
		add(ck1);
		add(ck2);
		add(ck3);
		add(btnOrder);
		btnOrder.addActionListener(this);
		setIconImage(icon);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SwingDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		float amount = 0;
		String msg ="";
		if (ck1.isSelected()) {
			amount += 100;
			msg += "Piza: $100\n";
		}
		if (ck2.isSelected()) {
			amount += 50;
			msg += "Burgure: $50\n";
		}
		if (ck3.isSelected()) {
			amount += 10;
			msg += "Tea: $10\n";
		}
		msg += "------------------\n";
		JOptionPane.showMessageDialog(this, msg + "Total: " + amount);
		
	}

}
