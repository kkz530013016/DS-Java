/**
 * 
 */
package com.phn.service;

import com.phn.bean.Comments;
import com.phn.bean.Topics;
import com.phn.bean.Users;


public interface CommentService {

	public boolean newComment(Comments comment, Users user, Topics topic);


	/**
	 * @param comment
	 * @param topic 
	 */
	public void deleteComment(Comments comment, Topics topic);
}
