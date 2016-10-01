package org.springframework.social.slack.util;

public class DataUtil {

	public static String getStringValue(boolean input) {
		if (input)
			return "1";

		return "0";
	}
}
