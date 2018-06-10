package com.honosayaka.sorm.core;

import java.util.List;

//��ѯ�ӿ�
@SuppressWarnings("all")
public interface Query {

	/**
	 * ִ��һ��dml���
	 * 
	 * @param sql
	 *            sql���
	 * @param params
	 *            ����
	 * @return
	 */
	public int executeDML(String sql, Object[] params);

	// insert an Object
	public void insert(Object obj);

	/**
	 * ɾ��C��ʾ���Ӧ���м�¼
	 * 
	 * @param c
	 *            �ͱ��Ӧ�����class����
	 * @param id
	 *            ������ֵ
	 * @return
	 */
	public int delete(Class c, int id);

	/**
	 * ɾ�����������ݿ��ж�Ӧ�ļ�¼,���Ӧ����������Ӧ����¼
	 * 
	 * @param o
	 */
	public void delete(Object o);

	/**
	 * ���¶����Ӧ�ļ�¼,����ֻ�����ƶ��ļ�¼
	 * 
	 * @param o
	 *            ��Ҫ���µĶ���
	 * @param fieldNames
	 *            ���µ��б�
	 * @return Ӱ�������
	 */
	public int update(Object o, String[] fieldNames);

	/**
	 * ��ѯ���ض��м�¼,����¼��װ��classָ��������
	 * 
	 * @param sql
	 *            ��ѯ���
	 * @param clazz
	 *            ���ݶ�Ӧ��JavaBean����
	 * @param params
	 *            sql�Ĳ���
	 * @return ��ѯ���
	 */
	public List queryRows(String sql, Class clazz, Object[] params);

	/**
	 * ��ѯ����һ�м�¼,����¼��װ��classָ��������
	 * 
	 * @param sql
	 *            ��ѯ���
	 * @param clazz
	 *            ���ݶ�Ӧ��JavaBean����
	 * @param params
	 *            sql�Ĳ���
	 * @return ��ѯ���
	 */
	public Object queryUniqueRow(String sql, Class clazz, Object[] params);

	/**
	 * ��ѯ����һ��ֵ(һ��һ��),������ֵ����
	 * 
	 * @param sql
	 * @param params
	 * @return
	 */
	public Object queryValue(String sql, Object[] params);

	/**
	 * ��ѯ����һ������,������ֵ����
	 * 
	 * @param sql
	 * @param params
	 * @return
	 */
	public Number queryNumber(String sql, Object[] params);

}
