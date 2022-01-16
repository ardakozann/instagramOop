package instagramOop;

public class Post extends User {
	private String postImage;
	private int like;
	private String comment;
	public Post() {
		super();
	}
	public Post(String postUserId, String postImage, int like, String comment, String id, String fullName, String profileImage) {
		super(id,fullName,profileImage);
		this.postImage = postImage;
		this.like = like;
		this.comment = comment;
	}
	public String getPostImage() {
		return postImage;
	}
	public void setPostImage(String postImage) {
		this.postImage = postImage;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
