import java.util.Calendar;
import java.util.GregorianCalendar;


public class helloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	String timer = "09/22/82";
		Integer clearMonth = Integer.parseInt(timer.substring(0,2));
	    Integer    clearDate = Integer.parseInt(timer.substring(3,5));
	    Integer    clearYear = Integer.parseInt(timer.substring(6,8));
	    
	    System.out.println("m="+ clearMonth + " d=" + clearDate + " y="+ clearYear);
		
		/*
        @SuppressWarnings("unused")
		int years, months, dates, dayOfWeek,hours,mins;
        
        Calendar tempC = new GregorianCalendar();
        System.out.println(tempC.getTimeInMillis());
        tempC.setTimeInMillis(System.currentTimeMillis());
        
        years = tempC.get(Calendar.YEAR);
        months = tempC.get(Calendar.MONTH);
        dates =  tempC.get(Calendar.DATE);
        dayOfWeek = tempC.get(Calendar.DAY_OF_WEEK);
        hours = tempC.get(Calendar.HOUR);
        mins = tempC.get(Calendar.MINUTE);
        
        tempC.set(years, months, dates, hours, mins-61, 1);
        
        System.out.println(tempC.getTime());

*/
	}

}
