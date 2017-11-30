/**
 * 
 */
package com.phn.dao;

import java.util.List;

import com.phn.bean.Helps;


public interface HelpDao {
	public List<Helps> getAll();

	/**
	 * @param index
	 * @return
	 */
	public Helps find(int index);

	/**
	 * @param thelp
	 */
	public void add(Helps thelp);

	/**
	 * @param thelp
	 */
	public void update(Helps thelp);

}
