package br.ufrgs.inf.sid.business.util;

import org.joda.time.DateTime;

public class SidUtil {

	public static boolean isNullOrEmpty(String text){
		boolean res = false;
		if(text == null)
			return true;
		if("".equals(text.trim()))
			return true;
		return res;
	}
	
	public static Integer convertInteger(String number){
		if(!isNullOrEmpty(number)){
			try{
				return Integer.parseInt(number);
			} catch(Exception e){
				return null;
			}
		}
		return null;
	}
	
	public static boolean isAValidDate(int year){
		DateTime dt = new DateTime();
		int diffYears = dt.getYear() - year;
		if(diffYears <= SidConstants.VALID_YEARS)
			return true;
		return false;
	}
}