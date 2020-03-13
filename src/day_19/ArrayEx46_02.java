package day_19;

import java.util.Random;

public class ArrayEx46_02 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[][] lottoSet = new int[5][7];
		
		int win = 0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<7;j++)
			{
				int r = ran.nextInt(2);
				if(r == 1)
				{
					lottoSet[i][j] = 3;
				}
				else
				{
					lottoSet[i][j] = 0;
				}
			}
			
			int check = -1;
			int count = 0;
			for(int j=0;j<7;j++)
			{
				if(lottoSet[i][j] == 3)
				{
					count++;
				}
				else
				{
					count = 0;
				}
				if(count == 3)
				{
					check = 1;
				}
			}
			
			if(check==1 && win==0)
			{
				win = 1;
			}
			else if(check==1 && win==1)
			{
				i--;
			}
			else if(check==-1 && win==0)
			{
				i--;
			}
		}
		
		for(int i=0; i<5; i++) 
		{
			for(int j=0; j<7; j++) 
			{
				System.out.print(lottoSet[i][j] + " ");
			}
			System.out.println();
		}
	}
}
