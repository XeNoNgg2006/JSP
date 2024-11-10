package AgeCalculator;

import java.util.Scanner;
import java.time.*;



public class AgeCalculator {
    public static void main (String[] args)
    {
     userInputBirthday();
    }

    public static void userInputBirthday()
    {
        Scanner inputBirthday = new Scanner(System.in);
        System.out.print("Geben Sie Ihren Geburtstag ein (z.B: 12.05.2000): ");
        String birthday = inputBirthday.nextLine();
        calculateAge(birthday);
        inputBirthday.close();
    }
    
    

    public static void calculateAge(String birthday) {
    	LocalDate YearMonthDay = LocalDate.now();
    	
    	 int currentYear = YearMonthDay.getYear();
    	 int currentMonth = YearMonthDay.getMonthValue();
    	 int currentDay = YearMonthDay.getDayOfMonth();
    	 
    	
    	
    	int birthdayNumbers = Integer.parseInt(birthday.replaceAll("\\D", ""));
        int birthYear = birthdayNumbers % 10000;
        birthdayNumbers = birthdayNumbers / 10000;
        int birthMonth = birthdayNumbers % 100;
        birthdayNumbers = birthdayNumbers / 100;
        int birthDay = birthdayNumbers;
        
        int ageYear = currentYear - birthYear;
        int ageMonth = 0;
        int ageDays = 0;
        if (birthMonth > currentMonth) {
            ageYear = ageYear - 1;
            ageMonth = 12 - (birthMonth - currentMonth);
        } else if (birthMonth < currentMonth) {
            ageMonth = currentMonth - birthMonth;
        } else {
            ageMonth = 0;
        }

		if (birthDay < currentDay) {
            ageDays = currentDay - birthDay;
            
        } else if (birthDay > currentDay) {
            ageMonth -= 1;
            ageDays = 30 - (birthDay - currentDay);
        } else {
            ageDays = 0;
        }
        System.out.println("You are " + ageYear + " years " + ageMonth + " Months " + ageDays + " Days old");
    }
}
