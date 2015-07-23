package org.springframework.social.slack.api.impl;

import org.springframework.social.slack.api.UsersOperations;
import org.springframework.web.client.RestOperations;

/**
 * UsersOperations impl
 * @author Thanneer
 *
 */
public class UsersTemplate extends AbstractTemplate implements UsersOperations {

	public UsersTemplate(RestOperations restOperations) {
		super(restOperations);
	}

}
