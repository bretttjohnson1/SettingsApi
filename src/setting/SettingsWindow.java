package setting;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SettingsWindow extends JFrame implements ActionListener {
	private ArrayList<Setting> settinglist;
	private JButton done = new JButton("done");
	public static final int TEXTBOX = 0;
	public static final int SCROLLDOWN = 1;
	public static final int TOGLE = 2;
	boolean isdone = false;

	public SettingsWindow() {
		settinglist = new ArrayList<Setting>();
		setTitle("Settings");
		setSize(400, 52);
		setVisible(false);
		setLocation(100, 100);
		setLayout(null);
		done.setSize(80, 50);
		done.setLocation(300, 0);
		done.setVisible(true);
		done.addActionListener(this);
		add(done);

	}

	public SettingsWindow(String title) {
		settinglist = new ArrayList<Setting>();
		setTitle(title);
		setSize(400, 52);
		setVisible(false);
		setLocation(100, 100);
		setLayout(null);
		done.setSize(80, 50);
		done.setLocation(300, 0);
		done.setVisible(true);
		done.addActionListener(this);
		add(done);

	}

	public void addTextbox(String s) {
		TextBoxSetting set = new TextBoxSetting(s, settinglist.size());
		settinglist.add(set);
		set.addto(this);

		setSize(getWidth(), getHeight() + 50);
	}

	public void addTextbox(String s, String initval) {
		TextBoxSetting set = new TextBoxSetting(s, settinglist.size(), initval);
		settinglist.add(set);
		set.addto(this);

		setSize(getWidth(), getHeight() + 50);
	}

	public void addToggle(String name, String[] optionslist, int initindex) {
		ToggleSetting set = new ToggleSetting(name, optionslist, initindex,
				settinglist.size());
		settinglist.add(set);
		set.addto(this);

		setSize(getWidth(), getHeight() + 50);
	}

	public void addColorSelector(String name) {
		ColorSelectorSetting set = new ColorSelectorSetting(name, new Color(0),
				settinglist.size());
		settinglist.add(set);
		set.addto(this);

		setSize(getWidth(), getHeight() + 50);
	}
	public void addColorSelector(String name, Color c) {
		ColorSelectorSetting set = new ColorSelectorSetting(name, c,
				settinglist.size());
		settinglist.add(set);
		set.addto(this);

		setSize(getWidth(), getHeight() + 50);
	}

	public void addFileSelector(String name, File f) {
		FileSelectorSetting set = new FileSelectorSetting(name,
				settinglist.size(), f);
		settinglist.add(set);
		set.addto(this);

		setSize(getWidth(), getHeight() + 50);
	}
	public void addFileSelector(String name) {
		FileSelectorSetting set = new FileSelectorSetting(name,
				settinglist.size(), null);
		settinglist.add(set);
		set.addto(this);

		setSize(getWidth(), getHeight() + 50);
	}

	public Object getVal(String s) {

		for (int a = 0; a < settinglist.size(); a++) {
			// System.out.println(settinglist.get(a).name);
			if (settinglist.get(a).name.equals(s))
				return settinglist.get(a).getVal();
		}
		return "Nan";

	}

	public void start() {
		setVisible(true);
		repaint();
		while (!isdone && isVisible()) {
			repaint();
		}
		dispose();
	}

	public Object[] getList() {
		Object s[] = new Object[settinglist.size()];
		for (int a = 0; a < s.length; a++) {
			s[a] = settinglist.get(a).getVal();
		}
		return s;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub\

		if (e.getActionCommand().equals("done")) {
			isdone = true;
		}
	}
}
