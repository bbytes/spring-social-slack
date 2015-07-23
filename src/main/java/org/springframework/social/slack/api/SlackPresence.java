package org.springframework.social.slack.api;

public enum SlackPresence {
	UNKNOWN, ACTIVE, AWAY, AUTO;

	public static SlackPresence getEnum(String value) {
		for (SlackPresence sp : values())
			if (sp.toString().equalsIgnoreCase(value))
				return sp;

		return AUTO;
	}
}