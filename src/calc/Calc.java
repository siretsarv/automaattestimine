package calc;

//represents reusable domain service which calculates daily salaries
public class Calc {
   public static final int JUNIOR_HOUR_MONEY = 10;
   public static final int SENIOR_HOUR_MONEY = 15;
   public static final int SPECIALIST_HOUR_MONEY = 22;
   
   public static int JUNIOR_MONEY = 0;
   public static int SENIOR_MONEY = 0;
   public static int SPECIALIST_MONEY = 0;
   
   public static final int PAY_BONUS_JUNIOR = 10;
   public static final int PAY_BONUS_SENIOR = 20;
   public static final int PAY_BONUS_SPECIALIST = 30;
   
   public static final int DOUBLE_PAY = 2;
   public static final int TRIPLE_PAY = 3;
   
   public static final int EIGHT_HOURS = 8;
   public static final int NINE_HOURS = 9;
   public static final int TWENTY_HOURS = 20;
   

    //my crappy screen test
    public static void main(final String[] args) {
        Calc c = new Calc();
        
        System.err.println(c.payToSenior(3));
        
    }

    public static int payToJunior(final int workHour) {
    	if (workHour > EIGHT_HOURS) {
    		JUNIOR_MONEY = JUNIOR_HOUR_MONEY * (workHour - EIGHT_HOURS) * DOUBLE_PAY;
    		JUNIOR_MONEY += JUNIOR_HOUR_MONEY * EIGHT_HOURS;
    	} else if (workHour > TWENTY_HOURS){
    		JUNIOR_MONEY += PAY_BONUS_JUNIOR;
    	}
    	else {
    		JUNIOR_MONEY += JUNIOR_HOUR_MONEY * workHour;
    	}
    	return JUNIOR_MONEY;
    }
    	
    
    public static int payToSenior(final int workHour){
    	if (workHour > EIGHT_HOURS) { // if longer than eight hours
    		SENIOR_MONEY = SENIOR_HOUR_MONEY * (workHour - EIGHT_HOURS) * DOUBLE_PAY; // double pay
    		SENIOR_MONEY += SENIOR_HOUR_MONEY * EIGHT_HOURS;
    	} else if (workHour > TWENTY_HOURS){
    		SENIOR_MONEY += PAY_BONUS_SENIOR;
    	}else {
    		SENIOR_MONEY += SENIOR_HOUR_MONEY * workHour;
    	}
    	
    	return SENIOR_MONEY;
    }
    	
    public static int payToSpecialist(final int workHour){
    	if (workHour > NINE_HOURS) { // if longer than nine hours
    		SPECIALIST_MONEY = SPECIALIST_HOUR_MONEY * (workHour - NINE_HOURS) * TRIPLE_PAY; // triple pay after 9 hours
    		SPECIALIST_MONEY += SPECIALIST_HOUR_MONEY * NINE_HOURS;
    	} else if (workHour > TWENTY_HOURS){
    		SPECIALIST_MONEY += PAY_BONUS_SPECIALIST;
    	}
    	else {
    		SPECIALIST_MONEY += SPECIALIST_HOUR_MONEY * workHour;
    	}
    	
    	return SPECIALIST_MONEY;
        
    }

}