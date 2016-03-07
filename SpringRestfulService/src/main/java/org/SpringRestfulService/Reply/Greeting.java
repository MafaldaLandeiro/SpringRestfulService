package org.SpringRestfulService.Reply;

import java.util.Date;

public class Greeting {
	
	private Date date;
	
	private String content;

	/**
	 * @param date
	 * @param content
	 */
	public Greeting(Date date, String content) {
		super();
		this.date = date;
		this.content = content;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Greeting [date=" + date + ", content=" + content + "]";
	}

}
