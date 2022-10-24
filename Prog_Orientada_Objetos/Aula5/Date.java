package Aula5;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) {
		this.set(day, month, year);
	}

	public void set(int day, int month, int year) {
		if( valid(day, month, year) ) {
			this.day = day;
			this.month = month;
			this.year = year;
		}
	}

	public void increment(int days) {
		while( days > 0 ) {
			if( this.day == monthDays(this.month, this.year) ) {
				this.day = 1;
				if( this.month == 12 ) {
					this.month = 1;
					this.year++; 
				} else {
					this.month++;
				}
			} else {
				this.day++;
			}
			days--;
		}
	}

	public void decrement(int days) {
		while( days > 0 ) {
			if( this.day == 1 ) {
				if( this.month == 1 ) {
					this.month = 12;
					this.year--; 
				} else {
					this.month--;
				}
				this.day = monthDays(this.month, this.year);
			} else {
				this.day--;
			}
			days--;
		}
	}

	public int getDay() {
		return this.day;
	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}

	public String toString() {
		return String.format("%04d-%02d-%02d", this.year, this.month, this.day);
	}
	

	public static boolean validMonth(int month) {
		return month>=1 && month <=12;
	}

	public static int monthDays(int month, int year) {
		if( month == 2 ) {
			return 28 + (leapYear(year) ? 1 : 0);
		} else if( month==1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		} else {
			return 30;
		}
	}

	public static boolean leapYear(int year) {
		return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}

	public static boolean valid(int day, int month, int year) {
		if( month < 1 || month > 12 ) return false;
		int maxMonthDays = monthDays(month, year);
		if( day < 1 || day > maxMonthDays ) return false;
		return true;
	}
}