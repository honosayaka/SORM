package com.honosayaka.srom.core;

/**
 * 将Java类型和数据库数据类型互相转换
 * 
 * @author a330c
 *
 */
public interface TypeConvertor {

	// db-->java
	public String databaseType2JavaType(String columnType);

	// java-->db
	public String JavaType2databaseType(String javaDataType);
}
