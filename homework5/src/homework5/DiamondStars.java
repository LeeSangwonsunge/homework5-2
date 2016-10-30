package homework5;

import java.util.Scanner;

public class DiamondStars {
	Scanner s = new Scanner(System.in);
	
	public void DiamondStars()
	{
		System.out.print("다이아몬드의 크기입력 : ");
		int size = s.nextInt();

		for(int i = 0; i<size; i++)
		{
			System.out.print("     ");
				for(int j =0; j<size-(i+1); j++)
					System.out.print(" ");
				for(int k =0; k<((i+1)*2)-1; k++)
					System.out.print("*");
			System.out.println();
		}
		
		for(int i = size-1; i>0; i--)
		{
			System.out.print("     ");
				for(int j =0; j<size-i; j++)
					System.out.print(" ");
				for(int k =0; k<((i+1)*2)-3; k++)
					System.out.print("*");
			System.out.println();
		}
	}
}