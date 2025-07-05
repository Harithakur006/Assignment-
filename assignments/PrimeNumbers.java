package assignments;

public class PrimeNumbers {

	private static final int Count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,check;

System.out.println();

		for(i=1; i<=100; i++);
		{
			check=0;
			for(j=2; j<i; j++)
			{
				if(i%j == 0)
				{
				check++;
				break;
		}
	}		
			
		if(check==0)
			System.out.println(i);
		
		}
		
	}

}
