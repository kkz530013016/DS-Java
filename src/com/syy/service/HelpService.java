/**
 * 
 */
package com.syy.service;

import java.util.List;

import com.syy.bean.Helps;
import com.syy.bean.Pages;


public interface HelpService {
	public List<Helps> getAll();

	/**
	 * @param pageSize
	 * @param nowPage
	 * @return
	 */
	public Pages ManageAllForPages(int pageSize, int nowPage);

	/**
	 * @param index
	 * @return
	 */
	public Helps find(int index);

	/**
	 * @param thelp
	 */
	public void ManageAdd(Helps thelp);

	/**
	 * @param thelp
	 */
	public void ManageUpdate(Helps thelp);
}
