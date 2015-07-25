
package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Paging {

	@JsonProperty("count")
	private Integer count;
	@JsonProperty("total")
	private Integer total;
	@JsonProperty("page")
	private Integer page;
	@JsonProperty("pages")
	private Integer pages;

	/**
	 * 
	 * @return The count
	 */
	@JsonProperty("count")
	public Integer getCount() {
		return count;
	}

	/**
	 * 
	 * @param count
	 *            The count
	 */
	@JsonProperty("count")
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * 
	 * @return The total
	 */
	@JsonProperty("total")
	public Integer getTotal() {
		return total;
	}

	/**
	 * 
	 * @param total
	 *            The total
	 */
	@JsonProperty("total")
	public void setTotal(Integer total) {
		this.total = total;
	}

	/**
	 * 
	 * @return The page
	 */
	@JsonProperty("page")
	public Integer getPage() {
		return page;
	}

	/**
	 * 
	 * @param page
	 *            The page
	 */
	@JsonProperty("page")
	public void setPage(Integer page) {
		this.page = page;
	}

	/**
	 * 
	 * @return The pages
	 */
	@JsonProperty("pages")
	public Integer getPages() {
		return pages;
	}

	/**
	 * 
	 * @param pages
	 *            The pages
	 */
	@JsonProperty("pages")
	public void setPages(Integer pages) {
		this.pages = pages;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
