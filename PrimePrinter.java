public class PrimePrinter {
	
	static int FoundPrimeCount = 0;
	static int PrimeListArray[];
	
	public static void main(String[] args) {
	
		int CurrentCheckNum = 3;

		PrimeListArray = new int[30];
		
		AddToPrimeList(1);
		AddToPrimeList(2);
		
		while(FoundPrimeCount < 30)
		{
			boolean IsPrime = CheckIfPrime(CurrentCheckNum);
			
			if(IsPrime)
			{
				AddToPrimeList(CurrentCheckNum);
				
			}
			
			CurrentCheckNum++;
		}

		PrintOutAllThePrimes();
		
	}

	private static boolean CheckIfPrime(int CheckNum)
	{
		for(int CheckNumber = 2; CheckNumber < CheckNum; CheckNumber++)
		{
			if (CheckNum % CheckNumber == 0) 
			{
				return false;
			}
			
		}
		return true;
	}
	
	
	private static void AddToPrimeList(int NewPrime)
	{
		PrimeListArray[FoundPrimeCount] = NewPrime;
		FoundPrimeCount++;
	}
	
	
	private static void PrintOutAllThePrimes()
	{
		for(int PrimeIndex = 0; PrimeIndex < FoundPrimeCount; PrimeIndex++)
		{
			System.out.println(PrimeListArray[PrimeIndex]);
			
		}
	}

}