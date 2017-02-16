import javax.swing.JOptionPane;
import java.util.*;

public class Assignment3 {
	public static void main(String[] args) {
		
		MyDate array [] = new MyDate[5];
		int day, month, year;
		Random rand = new Random();
		boolean valid=true;
		while(valid==true) {
			String sMonth=JOptionPane.showInputDialog(null,"Please input Month of the day:");
			month=Integer.parseInt(sMonth);
			String sDay=JOptionPane.showInputDialog(null,"Please input Day of the day:");
			day=Integer.parseInt(sDay);
			String sYear=JOptionPane.showInputDialog(null,"Please input Year of the day:");
			year=Integer.parseInt(sYear);
		
			int result=JOptionPane.showConfirmDialog(null, "Is the input right?\n" +"Chose no option, try it again.\n"+ month + " / " + day + " / " + year ,
				null, JOptionPane.YES_NO_OPTION);
			switch(result) {
	    	
			case JOptionPane.YES_OPTION:
				array[0]=new MyDate(day,month,year);
				valid=false;
				break;
				
	    		
			case JOptionPane.NO_OPTION:
				JOptionPane.showMessageDialog(null, "Please, try it again.");
				break;
	    	
			}
		}
		
		
	    day=array[0].getDate();
	    month=array[0].getMonth();
	    year=array[0].getYear();
	    
	    int num=1;
	    while(num<5) {
	    	int c[][]=new int [1][3];
	    	c=addDate(day,month,year);
	    	day=c[0][0];
	    	month=c[0][1];
	    	year=c[0][2];
	    	array[num]=new MyDate(day, month, year);
	    	num++;
	    }
	  
		
	    String TemperatureType=JOptionPane.showInputDialog(null,"What type of temperature do you want to Output??\n "
	    		+ "Celsius or Fahrenheit?");
	    String UpCaseTempType= TemperatureType.toUpperCase();
	    
	    
	    if(UpCaseTempType.equals("CELSIUS")) {
	    	 System.out.println("Temperature in Celsius for the next five days :");
			 for(int i=0; i<5;i++){
		
			 array[i].setHighCelsius(rand.nextInt(10)+30);
			 array[i].setLowCelsius(rand.nextInt(10)+20);
			 System.out.println(array[i].getMonth() + " /" + array[i].getDate() + " /" + array[i].getYear() + " High " +
					 array[i].getCelsiusHigh() + " Low " + array[i].getCelsiusLow());
			 }
		 }else if(UpCaseTempType.equals("FAHRENHEIT")){
			 System.out.println("Temperature in Fahrenheit for the next five days :");
			 for(int j=0; j<5;j++){
			 array[j].setHighFahrenheit(rand.nextInt(10)+30);
			 array[j].setLowFahrenheit(rand.nextInt(10)+20);
			 System.out.println(array[j].getMonth() + " /" + array[j].getDate() + " /" + array[j].getYear() + " High " +
				    	array[j].getFahrenheitHigh() + " Low " + array[j].getFahrenheitLow());
			 }
		 
		}
	  
	    
	}
	
	
	
	public static int[][] addDate(int day, int month, int year) {
		int [][]calendar =new int [1][3];
		int addDay,addMonth,addYear;
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			if(month==2 && day==29) {
				addYear=year;
				addMonth=3;
				addDay=1;
			}
			else if(month==12 && day==31) {
				addYear=year+1;
				addMonth=1;
				addDay=1;
			}
			else if((month==1 || month==3 || month==5 || month==7 || month==8 || month==10) && (day==31)) {
				addYear=year;
				addMonth=month+1;
				addDay=1;
			}
			else if((month==4 || month==6 || month==9 || month==11) && (day==30)) {
				addYear=year;
				addMonth=month+1;
				addDay=1;
			}
			else {
				addYear=year;
				addMonth=month;
				addDay=day+1;
			}
		}
		
		else {
			if(month==2 && day==28) {
				addYear=year;
				addMonth=3;
				addDay=1;
			}
			else if(month==12 && day==31) {
				addYear=year+1;
				addMonth=1;
				addDay=1;
			}
			else if((month==1 || month==3 || month==5 || month==7 || month==8 || month==10) && (day==31)) {
				addYear=year;
				addMonth=month+1;
				addDay=1;
			}
			else if((month==4 || month==6 || month==9 || month==11) && (day==30)) {
				addYear=year;
				addMonth=month+1;
				addDay=1;
			}
			else {
				addYear=year;
				addMonth=month;
				addDay=day+1;
			}
		}
		calendar[0][0]=addDay;
		calendar[0][1]=addMonth;
		calendar[0][2]=addYear;
		return calendar;
	}

	
}


