package text6;

import java.util.GregorianCalendar;

public class T9_5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		GregorianCalendar calendar = new GregorianCalendar();
	    System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR));
	    System.out.println("Month is " + calendar.get(GregorianCalendar.MONTH));
	    System.out.println("Date is " + calendar.get(GregorianCalendar.DATE));

	    calendar.setTimeInMillis(1234567898765L);
	    System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR));
	    System.out.println("Month is " + calendar.get(GregorianCalendar.MONTH));
	    System.out.println("Date is " + calendar.get(GregorianCalendar.DATE));
	}

}
