package setting;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;

public class ColorSelectorSetting extends Setting implements ActionListener {

	JLabel jlab;
	Color c;
	JButton button;

	public ColorSelectorSetting(String name, Color c, int index) {
		super(name);
		this.c = c;
		button = new JButton("Color");
		button.setLocation(10, (index) * 50);
		button.setSize(100, 50);
		button.setBackground(c);
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

		return c;
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JColorChooser jcol = new JColorChooser();
		c = jcol.showDialog(null, "Color", c);
		button.setBackground(c);
	}

}
