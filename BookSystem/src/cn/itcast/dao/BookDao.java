package cn.itcast.dao;

import cn.itcast.domain.Book;

public interface BookDao extends BaseDao<Book>{
	public void updateGive(Long book_id);//�����鱾���ɽ�
	
	public Long getBook_id(String book_num);//�����鱾��ŷ����鱾id
	
	public void updateBack(Long book_id);//�����鱾�ɽ�
}
