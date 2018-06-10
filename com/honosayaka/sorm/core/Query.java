package com.honosayaka.sorm.core;

import java.util.List;

//查询接口
@SuppressWarnings("all")
public interface Query {

	/**
	 * 执行一个dml语句
	 * 
	 * @param sql
	 *            sql语句
	 * @param params
	 *            参数
	 * @return
	 */
	public int executeDML(String sql, Object[] params);

	// insert an Object
	public void insert(Object obj);

	/**
	 * 删除C表示类对应表中记录
	 * 
	 * @param c
	 *            和表对应的类的class对象
	 * @param id
	 *            主键的值
	 * @return
	 */
	public int delete(Class c, int id);

	/**
	 * 删除对象在数据库中对应的记录,类对应到表主键对应到记录
	 * 
	 * @param o
	 */
	public void delete(Object o);

	/**
	 * 更新对象对应的记录,而且只更新制定的记录
	 * 
	 * @param o
	 *            所要更新的对象
	 * @param fieldNames
	 *            更新的列表
	 * @return 影响的行数
	 */
	public int update(Object o, String[] fieldNames);

	/**
	 * 查询返回多行记录,将记录封装到class指定对象中
	 * 
	 * @param sql
	 *            查询语句
	 * @param clazz
	 *            数据对应的JavaBean对象
	 * @param params
	 *            sql的参数
	 * @return 查询结果
	 */
	public List queryRows(String sql, Class clazz, Object[] params);

	/**
	 * 查询返回一行记录,将记录封装到class指定对象中
	 * 
	 * @param sql
	 *            查询语句
	 * @param clazz
	 *            数据对应的JavaBean对象
	 * @param params
	 *            sql的参数
	 * @return 查询结果
	 */
	public Object queryUniqueRow(String sql, Class clazz, Object[] params);

	/**
	 * 查询返回一个值(一行一列),并将改值返回
	 * 
	 * @param sql
	 * @param params
	 * @return
	 */
	public Object queryValue(String sql, Object[] params);

	/**
	 * 查询返回一个数字,并将改值返回
	 * 
	 * @param sql
	 * @param params
	 * @return
	 */
	public Number queryNumber(String sql, Object[] params);

}
