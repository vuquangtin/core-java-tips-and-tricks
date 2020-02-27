package core.java.tips;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

/**
 *
 * 
 * 
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:0377443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/core-java-tips-and-tricks">https://github.com/vuquangtin/core-java-tips-and-tricks</a>
 *
 */

public class FlexibleApp {
	public static final int HEADLESS = 0;
	public static final int HEADED = 1;

	public FlexibleApp() {

		if (GraphicsEnvironment.isHeadless()) {
			System.out.println("Hello World");
		} else {
			JOptionPane.showMessageDialog(null, "Hello World");
		}

	}

	public static int iAmFlexible() {
		if (GraphicsEnvironment.isHeadless()) {
			return HEADLESS;
		} else {
			return HEADED;
		}
	}
}