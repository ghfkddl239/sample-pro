package kr.co.hta.board.vo;

import java.util.Date;

public class Board {

	private int no;
	private String title;
	private String nick;
	private String contents;
	private int like;
	private String filename;
	private Date createDate;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", nick=" + nick + ", contents=" + contents + ", like=" + like
				+ ", filename=" + filename + ", createDate=" + createDate + "]";
	}
	
}
