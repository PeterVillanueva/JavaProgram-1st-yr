package PracticalTest;

public class Convert {
	public static void main(String[] args) {
		ConvertTemp temp;
		temp = (ConvertTemp) new FahrenheitTocelsius();
		temp.enterTemp();
		temp.compute();

		temp = (ConvertTemp) new CelsiusTofahrenheit();
		temp.enterTemp();
		temp.compute();

	}
}
