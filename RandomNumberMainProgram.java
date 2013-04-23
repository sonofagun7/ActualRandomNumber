import javax.swing.JOptionPane;

public class RandomNumberMainProgram
{
	public static void main( String[] args )
	{	
		boolean gameNotOver = true;
		
		while (gameNotOver)
		{

			RandomNumber whateverItIs = new RandomNumber();
			
			int variable1 = whateverItIs.GetANumber();
			int variable2 = whateverItIs.GetANumber();
			int variable3 = whateverItIs.GetANumber();			
			
			JOptionPane.showMessageDialog( null, "The three variables are " + variable1 + ", " + variable2 + ", and " + variable3 + "." );
			
			String doItAgain = JOptionPane.showInputDialog( null, "Would you like to show another random number?\n" + 
																	"Enter 1 for Yes and 2 for No." );
			
			if (doItAgain.equals("2"))
			{
				gameNotOver = false;
			}
			
		}		
	}
}