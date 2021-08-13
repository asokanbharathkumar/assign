package A9;
public class java_A9_Q2 
{
	int newsId;
	String postedByUser;
	String commentByUser;
	String Comment;
	public java_A9_Q2(int newsId, String postedByUser, String commentByUser, String comment) 
	{
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		Comment = comment;
	}
	public int getNewsId() 
	{
		return newsId;
	}
	public String getPostedByUser() 
	{
		return postedByUser;
	}
	public String getCommentByUser() 
	{
		return commentByUser;
	}
	public String getComment() 
	{
		return Comment;
	}
	@Override
	public String toString() 
	{
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", Comment=" + Comment + "]";
	}
}
