/**
 * 
 */
package com.syy.service;

import com.syy.bean.Comments;
import com.syy.bean.Topics;
import com.syy.bean.Users;


public interface CommentService {

	public boolean newComment(Comments comment, Users user, Topics topic);


	/**
	 * @param comment
	 * @param topic 
	 */
	public void deleteComment(Comments comment, Topics topic);
}
