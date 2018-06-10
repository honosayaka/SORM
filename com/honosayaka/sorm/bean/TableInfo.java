package com.honosayaka.sorm.bean;

import java.util.Map;

//存储表结构的信息
public class TableInfo {
	private String tname;

	private Map<String, ColumInfo> columns;
	private ColumInfo priKey;
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Map<String, ColumInfo> getColumns() {
		return columns;
	}
	public void setColumns(Map<String, ColumInfo> columns) {
		this.columns = columns;
	}
	public ColumInfo getPriKey() {
		return priKey;
	}
	public void setPriKey(ColumInfo priKey) {
		this.priKey = priKey;
	}
	public TableInfo(String tname, Map<String, ColumInfo> columns, ColumInfo priKey) {
		super();
		this.tname = tname;
		this.columns = columns;
		this.priKey = priKey;
	}
	public TableInfo() {
		super();
	}
}
