package org.springframework.social.slack.api.impl.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackSearchListResponse {

	@JsonProperty("total")
	private Integer total;
	
	@JsonProperty("pagination")
	private Pagination pagination;
	
	@JsonProperty("paging")
	private Paging paging;
	
	@JsonProperty("matches")
	private List<SlackSearchMatch> matches = new ArrayList<SlackSearchMatch>();

	public Integer getTotal() {
		return total;
	}

	public Pagination getPagination() {
		return pagination;
	}

	public Paging getPaging() {
		return paging;
	}

	public List<SlackSearchMatch> getMatches() {
		return matches;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	public void setPaging(Paging paging) {
		this.paging = paging;
	}

	public void setMatches(List<SlackSearchMatch> matches) {
		this.matches = matches;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
