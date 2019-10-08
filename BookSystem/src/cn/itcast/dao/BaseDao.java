package cn.itcast.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

//����
public interface BaseDao<T> {
	void save(T t);//���һ��ʵ��
	void delete(T t);//ɾ��һ��ʵ��
	void delete(Serializable id);//����idɾ��һ��ʵ��
	void update(T t);//����һ��ʵ��
	T	getById(Serializable id);//����id��ȡʵ��
	Integer	getTotalCount(DetachedCriteria dc);//��ȡ���߲�ѯ����ļ�¼������
	List<T> getPageList(DetachedCriteria dc,Integer start,Integer pageSize);//��ȡʵ�弯��
	
}
