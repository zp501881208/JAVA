package com.magict.magic.entity.dto;

/**
 * （简单的）分页对象
 * Title: Page
 * Description: 
 * @author yzh
 * @date 2017年12月15日下午3:49:25
 */
public class Page {

	/**
	 * 每页大小
	 */
	private Integer pageSize = 20;

	/**
	 * 当前页数
	 */
	private Integer currentPage;

	public Integer getCurrentPage() {
		return this.currentPage == null ? 1 : this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
