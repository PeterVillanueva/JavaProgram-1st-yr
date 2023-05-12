package Convert;

public class Convert {

	public static void main(String[] args) {
		
		ConvertTemp temp;
		
		temp = new FahrenheitToCelcius();
		temp.enterTemp();
		temp.compute();
		temp = new CelciusToFahrenheit();
		temp.enterTemp();
		temp.compute();
		
	}

}
