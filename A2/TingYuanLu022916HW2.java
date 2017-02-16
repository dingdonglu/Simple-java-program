package CS212;

import javax.swing.JOptionPane;


public class TingYuanLu022916HW2 {
	
	public static void main(String[] args) {
		
		rollingDice();
		reverseNum();
		ticTacToe();
		
	}
	public static void rollingDice(){
		
			int[] count = new int[10];
			double randamNum;
			int num;
			
			for (int i=0; i < 300; i++) {
				randamNum = Math.ceil(Math.random() * 6);
				num = (int) randamNum;
				count[num]++;
			}
			
			for (int j = 1; j <=6; j++) {
				System.out.println(j+": " + count[j]);
			}	
	
	  }
	public static void reverseNum(){
		
	 	int count=0;
	 	String output = "";
		
		String userInput= JOptionPane.showInputDialog("Enter a number");
		if(userInput.matches("[0-9]*")){
			char[] outputArray = new char[userInput.length()];
		 	
		  for(int i = userInput.length() - 1; i >= 0 ; i--){
			  outputArray[count] = userInput.charAt(i);
		      output += outputArray[count];
		              count++;
		  }

		  JOptionPane.showMessageDialog(null, "Your number reversed is: " + output);
		
		}
		else{
			JOptionPane.showMessageDialog(null,"Involvet input");
		}
	}
	
	public static void ticTacToe(){
		
		String inputNum;
		boolean checkWinner=false, draw;
		int userNum=0, count=0;
		int usedNum[]=new int[9];
		char board[][] = new char[3][3];
		
		for (int i=0; i<9;i++){
			usedNum[i]=1;
		}
		
		for (int r =0; r<3;r++){
			for (int c = 0; c<3;c++){
				board[r][c] = '*';
			}
		};
		
		while(checkWinner==false){
			
				if (count%2==1){
					inputNum= JOptionPane.showInputDialog("What is your move P2\n"+"123\n"+"456\n"+"789\n");	
				}else{				
					inputNum=JOptionPane.showInputDialog("What is your move P1\n"+"123\n"+"456\n"+"789\n");
				}
					
				userNum=Integer.parseInt(inputNum)-1;
				usedNum[userNum]--;
			
				
				while(usedNum[userNum]<0){
					usedNum[userNum]++;	
					inputNum= JOptionPane.showInputDialog("Please enter vaild Number \n"+"123\n"+"456\n"+"789\n");
					userNum=Integer.parseInt(inputNum)-1;			
					usedNum[userNum]--;
					
				}
				
				count++;
				if(count%2==1){					
					board[userNum/3][(userNum%3)]='X';
					
				
				}else{
					board[userNum/3][(userNum%3)]='O';
				}
					dispaly(board);
					
				checkWinner=checkWinner(board);
				draw=checkDraw(usedNum);
				if (draw == true) break;
		}
		
		if( checkWinner &&count%2==1){					
			JOptionPane.showMessageDialog(null, "P1 'X' is a winner");
			
		
		}else if( checkWinner && count%2==0){
			JOptionPane.showMessageDialog(null, "P2 'O' is a winner");
		}else{
			JOptionPane.showMessageDialog(null,"is a draw");
		}
		
	}
	public static boolean checkDraw(int []numTrack){
		 boolean checkDraw=false;
			for(int i=0; i<numTrack.length;i++){
				if(numTrack[i]==0){
					checkDraw=true;
				}else{
					checkDraw=false;
					break;
				}
			}
			return checkDraw;
		
	}
	public static boolean checkWinner(char [][] board) {
		
		if ( ( board[0][1]=='X' && board[0][2]=='X'&& board[0][0]=='X') ||( board[0][1]=='O' && board[0][2]=='O'&& board[0][0]=='O')){
			return true;
		}if ( ( board[1][1]=='X' && board[1][2]=='X'&& board[1][0]=='X') ||( board[1][1]=='O' && board[1][2]=='O'&& board[1][0]=='O')){
			return true;
		}if ( ( board[2][1]=='X' && board[2][2]=='X'&& board[2][0]=='X') ||( board[2][1]=='O' && board[2][2]=='O'&& board[2][0]=='O')){
			return true;
		}if ( ( board[1][1]=='X' && board[0][0]=='X'&& board[2][2]=='X') ||( board[1][1]=='O' && board[0][0]=='O'&& board[2][2]=='O')){
			return true;
		}if ( ( board[2][1]=='X' && board[1][1]=='X'&& board[0][1]=='X') ||( board[2][1]=='O' && board[1][1]=='O'&& board[0][1]=='O')){
			return true;
		}if ( ( board[2][2]=='X' && board[0][2]=='X'&& board[1][2]=='X') ||( board[2][2]=='O' && board[0][2]=='O'&& board[1][2]=='O')){
			return true;
		}if ( ( board[0][2]=='X' && board[1][1]=='X'&& board[2][0]=='X') ||( board[0][2]=='O' && board[1][1]=='O'&& board[2][0]=='O')){
			return true;
		}if ( ( board[1][0]=='X' && board[2][0]=='X'&& board[0][0]=='X') ||( board[1][0]=='O' && board[2][0]=='O'&& board[0][0]=='O')){
			return true;
		}return false;
	
		
	}

		
		
	
	public static void dispaly(char board[][]){
		 StringBuilder builder = new StringBuilder();
		    for (int x = 0;  x < 3; x++)
		    {
		        for (int y = 0; y < 3; y++)
		        {
		            builder.append(board[x][y] + " ");
		        }
		        builder.append("\n");
		    }
		    JOptionPane.showMessageDialog(null, builder,"Arrays",JOptionPane.INFORMATION_MESSAGE);
			
	
	}
	

}


