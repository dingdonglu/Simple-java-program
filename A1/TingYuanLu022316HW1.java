package CS212;
import javax.swing.JOptionPane;
public class TingYuanLu022316HW1 {


		public static void main(String[] args){
			
			int x[]={5,10,3,3};
			avag(x);
			String decNum1,decNum2,input,string;
			decNum1=JOptionPane.showInputDialog("Please enter two decimal numbers :");
			decNum2=JOptionPane.showInputDialog("Please enter two decimal numbers :");
		    CalculateSum(decNum1,decNum2) ;
			input = JOptionPane.showInputDialog("What is your name ? ");
			reverse(input);
			string =JOptionPane.showInputDialog("Enter a string");
			reMoveSpace(string);
		}
		
		public static void reMoveSpace(String string) {
			
			int c=0;
			for (int i=0; i < string.length(); i++){
				 char ch=string.charAt(i);
		            if(ch==' ')
		            c++;
			}
			JOptionPane.showMessageDialog(null, "Number of spaces is : " + c);
		}

		public static void reverse(String input) {
			 char[] outputArray = new char[input.length()];
			 	int j=0;
			 	String output = "";
			  for(int i = input.length() - 1; i >= 0 ; i--){
				  outputArray[j] = input.charAt(i);
			      output += outputArray[j];
			              j++;
			  }

			  JOptionPane.showMessageDialog(null, "Your name reversed is: " + output);
			
		}

		public static void avag (int x[]){
			int sum=0;
			double cout=0;
			double avg=0;
			for(int i=0;i<x.length;i++){
				sum+=x[i];
				cout++;
			}
			avg=sum/cout;
			JOptionPane.showMessageDialog(null,avg);  
		}
		public static void CalculateSum(String x, String y){
			double num1,num2,sum;
			if(x.matches("[0-9.]*") && y.matches("[0-9.]*")){
				num1=Double.parseDouble(x);
				num2=Double.parseDouble(y);
				sum=num1+num2;
				JOptionPane.showMessageDialog(null, "The sum of two decimal is "+ sum);
			}else{
				JOptionPane.showMessageDialog(null, "not void entry ");
			}
				

			
		}
	}

