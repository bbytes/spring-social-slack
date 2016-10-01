package org.springframework.social.slack.api.impl;

import org.springframework.social.slack.api.SearchOperations;
import org.springframework.social.slack.api.impl.model.SlackSearchResponse;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

public class SearchTemplate extends AbstractTemplate implements SearchOperations {

	public SearchTemplate(RestOperations restOperations) {
		super(restOperations);
	}

	@Override
	public SlackSearchResponse searchAll(String query) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("query", query);
		SlackSearchResponse slackResponse = get("/search.all", paramMap, SlackSearchResponse.class);
		return slackResponse;
	}

	@Override
	public SlackSearchResponse searchAll(String query, String sort, String sortDirection) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("query", query);
		paramMap.add("sort", sort);
		paramMap.add("sort_dir", sortDirection);
		SlackSearchResponse slackResponse = get("/search.all", paramMap, SlackSearchResponse.class);
		return slackResponse;
	}

	@Override
	public SlackSearchResponse searchAll(String query, int count, int page) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("query", query);
		paramMap.add("count", new Integer(count).toString());
		paramMap.add("page", new Integer(page).toString());
		SlackSearchResponse slackResponse = get("/search.all", paramMap, SlackSearchResponse.class);
		return slackResponse;
	}

	@Override
	public SlackSearchResponse searchAll(String query, String sort, String sortDirection, boolean highlight, int count,
			int page) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("query", query);
		paramMap.add("sort", sort);
		paramMap.add("sort_dir", sortDirection);
		paramMap.add("count", new Integer(count).toString());
		paramMap.add("page", new Integer(page).toString());
		SlackSearchResponse slackResponse = get("/search.all", paramMap, SlackSearchResponse.class);
		return slackResponse;
	}

	@Override
	public SlackSearchResponse searchFiles(String query) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("query", query);
		SlackSearchResponse slackResponse = get("/search.files", paramMap, SlackSearchResponse.class);
		return slackResponse;
	}

	@Override
	public SlackSearchResponse searchFiles(String query, String sort, String sortDirection) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("query", query);
		paramMap.add("sort", sort);
		paramMap.add("sort_dir", sortDirection);
		SlackSearchResponse slackResponse = get("/search.files", paramMap, SlackSearchResponse.class);
		return slackResponse;
	}

	@Override
	public SlackSearchResponse searchFiles(String query, int count, int page) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("query", query);
		paramMap.add("count", new Integer(count).toString());
		paramMap.add("page", new Integer(page).toString());
		SlackSearchResponse slackResponse = get("/search.files", paramMap, SlackSearchResponse.class);
		return slackResponse;
	}

	@Override
	public SlackSearchResponse searchFiles(String query, String sort, String sortDirection, boolean highlight,
			int count, int page) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("query", query);
		paramMap.add("sort", sort);
		paramMap.add("sort_dir", sortDirection);
		paramMap.add("count", new Integer(count).toString());
		paramMap.add("page", new Integer(page).toString());
		SlackSearchResponse slackResponse = get("/search.files", paramMap, SlackSearchResponse.class);
		return slackResponse;
	}

	@Override
	public SlackSearchResponse searchMessages(String query) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("query", query);
		SlackSearchResponse slackResponse = get("/search.messages", paramMap, SlackSearchResponse.class);
		return slackResponse;
	}

	@Override
	public SlackSearchResponse searchMessages(String query, String sort, String sortDirection) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("query", query);
		paramMap.add("sort", sort);
		paramMap.add("sort_dir", sortDirection);
		SlackSearchResponse slackResponse = get("/search.messages", paramMap, SlackSearchResponse.class);
		return slackResponse;
	}

	@Override
	public SlackSearchResponse searchMessages(String query, int count, int page) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("query", query);
		paramMap.add("count", new Integer(count).toString());
		paramMap.add("page", new Integer(page).toString());
		SlackSearchResponse slackResponse = get("/search.messages", paramMap, SlackSearchResponse.class);
		return slackResponse;
	}

	@Override
	public SlackSearchResponse searchMessages(String query, String sort, String sortDirection, boolean highlight,
			int count, int page) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("query", query);
		paramMap.add("sort", sort);
		paramMap.add("sort_dir", sortDirection);
		paramMap.add("count", new Integer(count).toString());
		paramMap.add("page", new Integer(page).toString());
		SlackSearchResponse slackResponse = get("/search.messages", paramMap, SlackSearchResponse.class);
		return slackResponse;
	}

}
