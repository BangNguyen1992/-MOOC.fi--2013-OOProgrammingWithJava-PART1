
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        int differenceInYears = 0;
        if (comparedDate.earlier(this)) {
            differenceInYears = this.year - comparedDate.year;
            if (comparedDate.month > this.month) {
                differenceInYears--;
            }
            if (comparedDate.month == this.month && comparedDate.day > this.day) {
                differenceInYears--;
            }
            return differenceInYears;
        } else {
            differenceInYears = comparedDate.year - this.year;
            if (comparedDate.month < this.month) {
                differenceInYears--;
            }
            if (comparedDate.month == this.month && comparedDate.day < this.day) {
                differenceInYears--;
            }
            return differenceInYears;
        }
    }
}

/* 
 public int differenceInYears(MyDate comparedDate) {
 int differenceInDays = 0;
 MyDate dummiedate = new MyDate(comparedDate.day, comparedDate.month, comparedDate.year);
 while (true) {
 if (this.day == dummiedate.day && this.month == dummiedate.month && this.year == dummiedate.year) {
 break;
 }
 dummiedate.advance();
 differenceInDays++;
 }
 System.out.println(dummiedate);
 System.out.println(differenceInDays);
 return (differenceInDays / 360);
 }
    
 public void advance() {
 this.day++;
 if (this.day > 30) {
 this.month++;
 this.day = 1;
 if (this.month > 12) {
 this.year++;
 this.month = 1;
 }
 }
 }
 }
 */
