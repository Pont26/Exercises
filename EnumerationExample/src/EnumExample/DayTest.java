package EnumExample;

enum Day{
	Monday,
	Tuesday,
	Wednesday,
	Thursday,
	Friday,
	Saturaday,
	Sunday;
	
}

public class DayTest {
	Day day;
	
	//consturctor
	public DayTest( Day day) {
		this.day = day;	
	}
	
	public void dayIsLike() {
		switch(day) {
		case Monday:
			System.out.println("Guys, Today is the Monday Day X(");
		    break;
		case Friday:
			System.out.print("Guys!! Today is Friday! XD");
			break;
		case Saturaday:
		case Sunday:
			System.out.println("Weekends are best! : )");
			break;
		default:
			System.out.println("Midweek days : (");
			break;
		}
		
	}

	public static void main(String[] args) {
	     String str= "Monday";
	     DayTest test=new DayTest(Day.valueOf(str));
	     test.dayIsLike();
	     
	}
}
