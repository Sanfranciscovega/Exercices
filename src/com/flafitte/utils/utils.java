package com.flafitte.utils;

public class utils {
	
	public static double fractionToDouble (String fraction) throws Exception {
		if (fraction.contains("/")) {
			String s[] =fraction.split("/");
			try {
				return Double.valueOf(s[0])/Double.valueOf(s[1]);
			}
			catch (ArithmeticException e) {
				throw new Exception (e.getMessage());
			}
		}
		return 0.0;
	}
}
