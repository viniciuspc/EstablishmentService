package com.ubiwhere.EstablishmentService.model.FHRS;

import java.util.Date;

/**
 * Model of Meta from FHRS API
 * @author vinicius
 *
 */
public class Meta {
	private String dataSource;
    private Date extractDate;
    private int itemCount;
    private String returncode;
    private int totalCount;
    private int totalPages;
    private int pageSize;
    private int pageNumber;
    
	public String getDataSource() {
		return dataSource;
	}
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	public Date getExtractDate() {
		return extractDate;
	}
	public void setExtractDate(Date extractDate) {
		this.extractDate = extractDate;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public String getReturncode() {
		return returncode;
	}
	public void setReturncode(String returncode) {
		this.returncode = returncode;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
    
}
