/*
 * # 당첨복권 1셋트
 * 1. 3이 연속으로 3번 등장하면 당첨복권이다.
 * 2. 랜덤으로 5개의 복권을 생성하되,
 *    당첨복권은 한 개만 생성되도록 설정한다.
 */

package day_19;

import java.util.Random;

public class ArrayEx46 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[][] lottoSet = new int[5][7];
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<7;i++)
			{
				int num = ran.nextInt(10);
				lottoSet[i][j] = num;
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<7;i++)
			{
				System.out.print(lottoSet[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
