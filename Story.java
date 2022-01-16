package instagramOop;

public class Story extends User{
	private String storyImage;
	private String sendMessage;
	public Story() {
		super();
	}
	public Story(String storyImage, String sendMessage, String id, String fullName, String profileImage) {
		super(id, fullName, profileImage);
		this.storyImage = storyImage;
		this.sendMessage = sendMessage;
	}
}
