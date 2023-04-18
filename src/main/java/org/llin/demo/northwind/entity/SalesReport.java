package org.llin.demo.northwind.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name=_EntityNames.SALES_REPORT)
public class SalesReport {

	@Id
	private String id;
	
	
	@Value(value = "group_by")
	private String groupBy;
	
	private String display;
	private String title;
	
	@Value(value = "filter_row_source")
	private String filterRowSource;
	
	@Value(value = "default_data")
	private boolean defaultData;

	public SalesReport() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGroupBy() {
		return groupBy;
	}

	public void setGroupBy(String groupBy) {
		this.groupBy = groupBy;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFilterRowSource() {
		return filterRowSource;
	}

	public void setFilterRowSource(String filterRowSource) {
		this.filterRowSource = filterRowSource;
	}

	public boolean isDefaultData() {
		return defaultData;
	}

	public void setDefaultData(boolean defaultData) {
		this.defaultData = defaultData;
	}

	@Override
	public String toString() {
		return "SalesReport [id=" + id + ", groupBy=" + groupBy + ", display=" + display + ", title=" + title
				+ ", filterRowSource=" + filterRowSource + ", defaultData=" + defaultData + "]";
	}
		
}
