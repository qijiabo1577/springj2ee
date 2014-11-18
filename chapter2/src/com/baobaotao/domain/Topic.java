package com.baobaotao.domain;

import java.util.Date;

public class Topic extends BaseDomain {
	private String topicId;
	private String topicTitle;
	private Date createTime;
	private Date lastPost;
	private int views;
	private int replies;
	private int digest;
	private User user;
	
	
	
	//------------------------
	public String getTopicId() {
		return topicId;
	}
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	public String getTopicTitle() {
		return topicTitle;
	}
	public void setTopicTitle(String topicTitle) {
		this.topicTitle = topicTitle;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastPost() {
		return lastPost;
	}
	public void setLastPost(Date lastPost) {
		this.lastPost = lastPost;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getReplies() {
		return replies;
	}
	public void setReplies(int replies) {
		this.replies = replies;
	}
	public int getDigest() {
		return digest;
	}
	public void setDigest(int digest) {
		this.digest = digest;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
