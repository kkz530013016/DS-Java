/**
 * 
 */
package com.syy.service;

import java.util.List;

import com.syy.bean.Categorys;
import com.syy.bean.Pages;
import com.syy.bean.Topics;
import com.syy.bean.Types;


public interface CategoryService {
	public boolean add(Categorys cate);

	public boolean delete(int index);

	public boolean update(Categorys cate);

	public List<Categorys> getAll();

	/**
	 * @param id
	 * @return
	 */
	public List<Types> getType(int id);

	public List<Types> new_getType(int id);

	/**
	 * @param listType
	 * @return
	 */
	public List<Topics> getTopic(List<Types> listType);

	/**
	 * @param i
	 * @param nowPage
	 * @param listType
	 * @return
	 */
	public Pages getAllForPages(int pageSize, int nowPage, List<Types> listType);

	/**
	 * @param id
	 * @return
	 */
	public Categorys find(int id);

	/**
	 * @param id
	 * @return
	 */
	public List<Types> manageType(int id);
}
