/**
 * 
 */
package com.syy.service;


import com.syy.bean.Pages;
import com.syy.bean.Types;



public interface TypeService {
	public Pages getAllForPages(int pageSize, int nowPage, int typeId);

	/**
	 * @param id
	 * @return
	 */
	public Types find(int id);

	/**
	 * @param type
	 */
	public void add(Types type);

	/**
	 * @param type
	 */
	public void update(Types type);
	
}
