
public class MyDegree {
	
	private double fahrenheit ;
	private double celsius;
	public MyDegree() {
	}
	
	public MyDegree(double temperature, String temperatureType)
	{
		if (temperatureType.equals("Fahrenheit")){
			temperature=fahrenheit ;	
			celsius= (5/9)*(temperature-32);
		}else if (temperatureType.equals("Celsius")){
			temperature=celsius;
			fahrenheit= (9/5)*temperature +32;
		}

	}
	public double getFahrenheit(){
		return fahrenheit ;
	}
	public double getCelsius(){
		return celsius;
	}
	public void setFahrenheit (double temperature){
		fahrenheit=temperature;
		celsius= (5/9)*(temperature-32);
	}
	public void setCelsius(double temperature){
		celsius =temperature;
		fahrenheit= (9/5)*temperature +32;
	}
}
