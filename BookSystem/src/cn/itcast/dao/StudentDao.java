package cn.itcast.dao;

import cn.itcast.domain.Student;

public interface StudentDao extends BaseDao<Student> {
	public Student getByStuNum(String stu_num);//����ѧ����ŷ���ѧ��ʵ��
}
