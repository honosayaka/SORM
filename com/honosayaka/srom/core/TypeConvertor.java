package com.honosayaka.srom.core;

/**
 * ��Java���ͺ����ݿ��������ͻ���ת��
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
