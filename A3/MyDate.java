import javax.swing.JOptionPane;

import CS212.MyDegree;

public class MyDate {
	
		private int date;
		private int month;
		private int year;
		private MyDegree high;
		private MyDegree low;
		
		MyDate(int date, int month , int year){
			if(isValid(date, month, year)){
				this.date=date;
				this.month=month;
				this.year= year;
			}else{
				JOptionPane.showMessageDialog(null, "The input is not valid. Data will be 05/15/1995.");
				this.date=05;
				this.month=15;
				this.year=1995;
			};
		}
		public boolean isValid(int day, int month, int year){
			  
			if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				if(month==2 && day>=1 && day<=29) return true;
				else if((month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) && (day>=1 && day<=31)) return true;
				else if((month==4 || month==6 || month==9 || month==11) && (day>=1 && day<=30)) return true;
				else return false;
			}
			else {
				if(month==2 && day>=1 && day<=28) return true;
				else if((month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) && (day>=1 && day<=31)) return true;
				else if((month==4 || month==6 || month==9 || month==11) && (day>=1 && day<=30)) return true;
				else return false;
			}
		}
		public void setLowCelsius(int low) {
			this.low=new MyDegree();
			this.low.setCelsius(low);
		}
		
		
		public void setHighCelsius(int high) {
			this.high=new MyDegree();
			this.high.setCelsius(high);
		}
		
		
		public void setLowFahrenheit(int low) {
			this.low=new MyDegree();
			this.low.setFahrenheit(low);
		}
		
		
		public void setHighFahrenheit(int high) {
			this.high=new MyDegree();
			this.high.setFahrenheit(high);
		}
		
		
		
		
		public int getFahrenheitHigh() {
			int fahrenheit=(int)high.getFahrenheit();
			return fahrenheit;
		}
		
		public int getCelsiusHigh() {
			int celsius=(int)high.getCelsius();
			return celsius;
		}
			
		public int getFahrenheitLow() {
			int fahrenheit=(int)low.getFahrenheit();
			return fahrenheit;
		}
		
		public int getCelsiusLow() {
			int celsius=(int)low.getCelsius();
			return celsius;
		}
		
		
		public int getDate() {
			return date;
		}
		
		public int getMonth() {
			return month;
		}
		
		public int getYear() {
			return year;
		}
}
