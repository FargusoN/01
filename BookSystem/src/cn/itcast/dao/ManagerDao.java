package cn.itcast.dao;



import cn.itcast.domain.Manager;

public interface ManagerDao extends BaseDao<Manager> {
	public Manager getByManagerNum(String Manager_num);//���ݹ���Ա��ŷ��ع���Աʵ��

}
