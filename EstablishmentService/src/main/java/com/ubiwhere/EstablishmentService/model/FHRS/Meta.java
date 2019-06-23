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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataSource == null) ? 0 : dataSource.hashCode());
		result = prime * result + ((extractDate == null) ? 0 : extractDate.hashCode());
		result = prime * result + itemCount;
		result = prime * result + pageNumber;
		result = prime * result + pageSize;
		result = prime * result + ((returncode == null) ? 0 : returncode.hashCode());
		result = prime * result + totalCount;
		result = prime * result + totalPages;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Meta))
			return false;
		Meta other = (Meta) obj;
		if (dataSource == null) {
			if (other.dataSource != null)
				return false;
		} else if (!dataSource.equals(other.dataSource))
			return false;
		if (extractDate == null) {
			if (other.extractDate != null)
				return false;
		} else if (!extractDate.equals(other.extractDate))
			return false;
		if (itemCount != other.itemCount)
			return false;
		if (pageNumber != other.pageNumber)
			return false;
		if (pageSize != other.pageSize)
			return false;
		if (returncode == null) {
			if (other.returncode != null)
				return false;
		} else if (!returncode.equals(other.returncode))
			return false;
		if (totalCount != other.totalCount)
			return false;
		if (totalPages != other.totalPages)
			return false;
		return true;
	}
    
}
