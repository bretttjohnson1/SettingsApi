package setting;

import java.awt.Color;

public class Example {
	public static void main(String[] args) {
		new Example();
	}
	public Example() {
		
		//Feel free to download and run this code
		//Set up the environment by including the .jar file in project or the source files themselves
		//Do NOT initialize two elements with the same name
		
		SettingsWindow w = new SettingsWindow();
		//textboxes can be initialized with or without starting text. The first parameter is the Name of the text box. the second is the starting text
		w.addTextbox("Thing");
		w.addTextbox("Thing2","starttext");
		
		//toggles must be initialized with a list of options to chose from and can range from 2 up
		String[] listofoptions = {"waffle","pancake","muffin"};
		w.addToggle("Toggle",listofoptions , 0);
		
		//Color selectors can be added with or without a predefined color, when added with an instance of a Color, no getVal() is needed (see lower in example) 
		Color c = new Color(255,0,0);
		w.addColorSelector("Color1");
		w.addColorSelector("Color2", c);
		
		//File selectors can be added with a second term to submit an existing file, for compiling purposes I have not included an example of this.
		w.addFileSelector("FileSelect1");
		w.start();
		
		//After done is hit, Values must be retrieved from the textbox. values are retrieved by name so duplicates break things.
		//The value is returned as an Object
		System.out.println(w.getVal("Thing"));
		System.out.println(w.getVal("Thing2"));
		System.out.println(w.getVal("Toggle"));
		System.out.println(w.getVal("Color1").toString());
		System.out.println(w.getVal("Color2").toString());
		System.out.println(w.getVal("FileSelect1"));
		
		//Thats it, thanks for reading
		
	}
}
