package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination {

	@JsonProperty("total_count")
	private Integer totalCount;

	@JsonProperty("page")
	private Integer page;

	@JsonProperty("per_page")
	private Integer perPage;

	@JsonProperty("page_count")
	private Integer pageCount;

	@JsonProperty("first")
	private Integer first;

	@JsonProperty("last")
	private Integer last;

	public Integer getTotalCount() {
		return totalCount;
	}

	public Integer getPage() {
		return page;
	}

	public Integer getPerPage() {
		return perPage;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public Integer getFirst() {
		return first;
	}

	public Integer getLast() {
		return last;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public void setPerPage(Integer perPage) {
		this.perPage = perPage;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public void setFirst(Integer first) {
		this.first = first;
	}

	public void setLast(Integer last) {
		this.last = last;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}