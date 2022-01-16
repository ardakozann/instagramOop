package instagramOop;

public class Notification extends User {
	private String notificationDescription;
	private String postLink;
	public Notification() {
		super();
	}
	public Notification(String notificationDescription, String postLink, String id, String fullName, String profileImage) {
		super(id,fullName,profileImage);
		this.notificationDescription = notificationDescription;
		this.postLink = postLink;
	}
	public String getPostLink() {
		return postLink;
	}
	public void setPostLink(String postLink) {
		this.postLink = postLink;
	}//bildirim açýklamasý sabit olduðu için set kullanmadým.
	public String getNotificationDescription() {
		return notificationDescription;
	}
	
}
