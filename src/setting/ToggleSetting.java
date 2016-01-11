package setting;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ToggleSetting extends Setting implements ActionListener {

	int stringarrayindex;
	String[] list;
	JButton button;
	JLabel jlab;

	public ToggleSetting(String name, String[] list, int stringarrayindex,
			int index) {
		super(name);
		this.list = list;
		button = new JButton(list[stringarrayindex]);
		button.setLocation(10, (index) * 50);
		button.setSize(100, 50);
		this.stringarrayindex = stringarrayindex;
		button.addActionListener(this);
		jlab = new JLabel(name);
		jlab.setLocation(110, (index) * 50);
		jlab.setSize(200, 50);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		stringarrayindex++;
		if (stringarrayindex >= list.length)
			stringarrayindex -= list.length;
		button.setText(list[stringarrayindex]);
	}

	@Override
	public void addto(Container c) {
		// TODO Auto-generated method stub
		c.add(button);
		c.add(jlab);
	}

	@Override
	public String getVal() {
		// TODO Auto-generated method stub
		return button.getText();
	}

}
