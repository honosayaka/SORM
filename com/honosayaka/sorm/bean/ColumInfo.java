package com.honosayaka.sorm.bean;

//表中一个字段的信息
public class ColumInfo {
	private String name;

	private String dataType;
	private int keyType;// 0:普通键 1:主键 2:外键.

	public ColumInfo() {
		super();
	}

	public ColumInfo(String name, String dataType, int keyType) {
		super();
		this.name = name;
		this.dataType = dataType;
		this.keyType = keyType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public int getKeyType() {
		return keyType;
	}

	public void setKeyType(int keyType) {
		this.keyType = keyType;
	}
}
