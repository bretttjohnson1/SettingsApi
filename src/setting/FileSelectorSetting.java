package setting;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class FileSelectorSetting extends Setting implements ActionListener {
	JLabel jlab;
	JButton button;
	File f;

	public FileSelectorSetting(String name, int index, File f) {
		super(name);
		this.f = f;
		button = new JButton("null");
		if (f != null)
			button = new JButton(f.getAbsolutePath());
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

		return f;
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JFileChooser jcol = new JFileChooser();
		int a = jcol.showOpenDialog(null);
		if (a == 0) {
			f = jcol.getSelectedFile();
			button.setText(f.getName());
		}
	}

}
