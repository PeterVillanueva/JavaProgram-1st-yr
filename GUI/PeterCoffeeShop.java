package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class PeterCoffeeShop extends JFrame implements ActionListener {
	private JLabel headerLabel, orderLabel, successLabel;
	private JComboBox<String> drinkBox, edibleBox;
	private JButton submitButton;

	private final String[] drinkOptions = { "Coffee", "Cola", "Beer", "Milk Tea" };
	private final String[] edibleOptions = { "Cake", "Sandwich", "Bacon", "Carbonara" };
	private final double[] drinkPrices = { 2.50, 1.75, 3.00, 3.50 };
	private final double[] ediblePrices = { 2.00, 4.50, 3.00, 5.00 };

	public PeterCoffeeShop() {
		setTitle("Peter Coffee Shop");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(255, 218, 185)); // Peach background

		// Header
		headerLabel = new JLabel("Peter Coffee Shop");
		headerLabel.setFont(new Font("Century Gothic", Font.BOLD, 32));
		headerLabel.setBounds(200, 50, 400, 50);
		add(headerLabel);

		// Order label
		orderLabel = new JLabel("Please choose your order:");
		orderLabel.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		orderLabel.setBounds(50, 120, 200, 30);
		add(orderLabel);

		// Drink selection
		drinkBox = new JComboBox<>(drinkOptions);
		drinkBox.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		drinkBox.setBounds(50, 160, 150, 30);
		add(drinkBox);

		// Edible selection
		edibleBox = new JComboBox<>(edibleOptions);
		edibleBox.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		edibleBox.setBounds(50, 200, 150, 30);
		add(edibleBox);

		// Submit button
		submitButton = new JButton("Confirm");
		submitButton.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		submitButton.setBounds(50, 240, 100, 30);
		submitButton.addActionListener(this);
		add(submitButton);

		// Success message
		successLabel = new JLabel();
		successLabel.setFont(new Font("Century Gothic", Font.BOLD, 16));
		successLabel.setBounds(50, 300, 700, 30);
		add(successLabel);

		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		// Calculate total price
		int drinkIndex = drinkBox.getSelectedIndex();
		int edibleIndex = edibleBox.getSelectedIndex();
		if (drinkIndex < 0 || edibleIndex < 0) {
			successLabel.setText("Please select a drink and an edible.");
			return;
		}
		double totalPrice = drinkPrices[drinkIndex] + ediblePrices[edibleIndex];

		// Display success message
		String drinkChoice = drinkBox.getSelectedItem().toString();
		String edibleChoice = edibleBox.getSelectedItem().toString();
		successLabel.setText(
				"Success! You ordered a " + drinkChoice + " and a " + edibleChoice + " for $" + totalPrice + ".");

		// Reset the program
		/*drinkBox.setSelectedIndex(0);
		edibleBox.setSelectedIndex(0);
		successLabel.setText("");*/
	}

	public static void main(String[] args) {
		new PeterCoffeeShop();
		
	}

}
