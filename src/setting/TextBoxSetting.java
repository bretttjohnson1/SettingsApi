package setting;
import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextBoxSetting extends Setting {
	JLabel jlab;
	JTextField jin;

	public TextBoxSetting(String name, int index) {
		super(name);
		jlab = new JLabel(name);
		jlab.setLocation(110, (index) * 50);
		jlab.setSize(200, 50);
		jin = new JTextField();
		jin.setLocation(10, (index) * 50);
		jin.setSize(100, 50);
	}

	public TextBoxSetting(String name, int index, String val) {
		super(name);
		jlab = new JLabel(name);
		jlab.setLocation(110, (index) * 50);
		jlab.setSize(200, 50);
		jin = new JTextField(val);
		jin.setLocation(10, (index) * 50);
		jin.setSize(100, 50);
	}

	@Override
	public String getVal() {
		// TODO Auto-generated method stub
		return jin.getText();
	}

	@Override
	public void addto(Container c) {
		c.add(jlab);
		c.add(jin);
	}
}
