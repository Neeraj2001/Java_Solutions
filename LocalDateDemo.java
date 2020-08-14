import java.time.LocalDate;
public class LocalDateDemo{
	public static void main(String[] args){
		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = yesterday.plusDays(2);
		System.out.println("today date :" +date);
		System.out.println("yesterday date :" +yesterday);
		System.out.println("tomorrow date :" +tomorrow);
		System.out.println(date.getYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.isLeapYear());
		System.out.println(date.getDayOfMonth());
	}
}