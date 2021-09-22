

public class MakingBabies
	{

		
	
		
		public static void main(String[] args)
			{
				
				Baby myB1 = new Baby("Leah" , 8.4, true);
				
				Baby myB2 = new Baby("Bob", 9.2, false);
				
				
				
				System.out.println("My first baby's name is " + myB1.getName());
				
				if(myB1.isGirl())
					{
						System.out.println("She's gorgeous!");
					}

				
				Baby.barf();
			}

	}
