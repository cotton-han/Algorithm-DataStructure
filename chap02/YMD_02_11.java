package chap02;

import java.util.Scanner;

public class YMD_02_11 {
		int y; 
		int m;
		int d;

		YMD_02_11(int y,int m,int d){
			this.y=y;
			this.m=m;
			this.d=d;
		}

		// 각 달의 일수
		int[][] mdays = { 
				{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
				{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 윤년
		};

		// 서기 year년은 윤년인가? (윤년：1／평년：0)
		int isLeap(int year) {
			return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
		}

		YMD_02_11 after(int n) {
			/*
			//문제점 : 이렇게하면 예를 들어 n이 60일때 값을 제대로 계산하지 못한다. 반복문을 이용해야함.
			if(m==1||m==3||m==5||m==7||m==8||m==10||m==12) {
				if(d+n>31&&m==12) {
					this.m+=1;this.d=n+d-31;this.y+=1;
				}
				else if(d+n>31){
					this.m+=1;this.d=n+d-31;
				}
				else
					this.d+=n;
			}
			else if(m==2&&(y % 4 == 0 && y % 100 != 0 || y % 400 == 0)) {
				if(d+n>29) {
					this.m+=1;this.d=n+d-29;
				}
				else
					this.d+=n;
			}
			else if(m==2&&(!(y % 4 == 0 && y % 100 != 0 || y % 400 == 0))) {
				if(d+n>28) {
					this.m+=1;this.d=n+d-28;
				}
				else
					this.d+=n;
			}
			else {
				if(d+n>30&&m==12) {
					this.m+=1;this.d=n+d-30;this.y+=1;
				}
				else if(d+n>30){
					this.m+=1;this.d=n+d-30;
				}
				else
					this.d+=n;
			}
			return this;
			 */
			YMD_02_11 temp = new YMD_02_11(this.y, this.m, this.d);
			if (n < 0)
				return (before(-n));

			temp.d += n;

			while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
				temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
				if (++temp.m > 12) {
					temp.y++;
					temp.m = 1;
				}
			}
			return temp;
		}
		YMD_02_11 before(int n) {
			/*
			if(m==2||m==4||m==6||m==9||m==11) {
				if(d-n<1&&m==1) {
					this.m=12;this.d=n-d+31;this.y-=1;
				}
				else if(d-n<1){
					this.m-=1;this.d=n-d+31;
				}
				else
					this.d-=n;
			}
			else if(m==3&&(y % 4 == 0 && y % 100 != 0 || y % 400 == 0)) {
				if(d-n<1) {
					this.m-=1;this.d=n-d+29;
				}
				else
					this.d-=n;
			}
			else if(m==3&&(!(y % 4 == 0 && y % 100 != 0 || y % 400 == 0))) {
				if(d-n>1) {
					this.m-=1;this.d=n-d+28;
				}
				else
					this.d-=n;
			}
			else {
				if(d-n<1&&m==1) {
					this.m-=1;this.d=n-d+30;this.y-=1;
				}
				else if(d-n<1){
					this.m-=1;this.d=n-d+30;
				}
				else
					this.d-=n;
			}
			return this;
			 */
			YMD_02_11 temp = new YMD_02_11(this.y, this.m, this.d);
			if (n < 0)
				return (after(-n));

			temp.d -= n;

			while (temp.d < 1) {
				if (--temp.m < 1) {
					temp.y--;
					temp.m = 12;
				}
				temp.d += mdays[isLeap(temp.y)][temp.m - 1];
			}
			return temp;
		}
	


	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("날짜를 입력하세요.\n");
		System.out.print("년：");
		int y = stdIn.nextInt();
		System.out.print("월：");
		int m = stdIn.nextInt();
		System.out.print("일：");
		int d = stdIn.nextInt();
		YMD_02_11 date = new YMD_02_11(y, m, d);

		System.out.print("몇 일 앞/뒤의 날짜를 구할까요?：");
		int n = stdIn.nextInt();

		YMD_02_11 d1 = date.after(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, d1.y, d1.m, d1.d);

		YMD_02_11 d2 = date.before(n);
		System.out.printf("%d일 앞의 날짜는 %d년 %d월 %d일입니다.\n", n, d2.y, d2.m, d2.d);
	}
}

