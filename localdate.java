import java.time.localdate;
public class localdatedemo{
	public static void main(String[] args){
		localdate date = localdate.now();
		localdate yesterday = date.minusdays(2);
		localdate tomorrow = yesterday.plusdays(2);
		System.out.println("today date :" +date);
		System.out.println("yesterday date :" +yesterday);
		System.out.println("tomorrow date :" +tomorrow);
		System.out.println(date.getyear());
		System.out.println(date.getmonth());
		System.out.println(date.getmonthvalue());
		System.out.println(date.isleapyear());
		System.out.println(date.getdayofmonth());
	}
}