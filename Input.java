
import javax.swing.JOptionPane;

public class Input {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Hello User ! \nPlease Input two numbers.", "Greeting Message",
				JOptionPane.INFORMATION_MESSAGE);

		int num = 0;
		int num1 = 0;
		int add;
		// int multiply;
		// int divide;
		// int product;

		num = Integer.parseInt(JOptionPane.showInputDialog("Enter 1st Number"));

		num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter 2st Number"));

		add = num + num1;
		// multiply = num + num1;
		// divide = num + num1;
		// product = num + num1;

		int result = add;

		switch (result) {

		}
		JOptionPane.showMessageDialog(null, "Result: " + add);
	}

}
