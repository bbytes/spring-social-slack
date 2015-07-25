package org.springframework.social.slack.api.impl.model;

public enum SlackPresence {
	AWAY("away"), AUTO("auto");

	public String name;

	SlackPresence(String name) {
		this.name = name;
	}

	public static SlackPresence getEnum(String value) {
		for (SlackPresence sp : values())
			if (sp.toString().equalsIgnoreCase(value))
				return sp;

		return AUTO;
	}

	public String toString() {
		return name;
	}
}