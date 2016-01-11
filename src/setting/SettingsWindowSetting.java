package setting;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class SettingsWindowSetting extends Setting implements ActionListener {
	JLabel jlab;
	JButton button;
	SettingsWindow s;

	public SettingsWindowSetting(String name, int index, SettingsWindow s) {
		super(name);
		this.s = s;
		button = new JButton();
		button.setLocation(10, (index) * 50);
		button.setSize(100, 50);
		button.addActionListener(this);
		jlab = new JLabel(name);
		jlab.setLocation(110, (index) * 50);
		jlab.setSize(200, 50);
		// TODO Auto-generated constructor stub

	}

	public void addto(Container c) {
		// TODO Auto-generated method stub
		c.add(button);
		c.add(jlab);
	}

	@Override
	public Object getVal() {

		return s;
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		s.start();
	}
}
