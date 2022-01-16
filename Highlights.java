package instagramOop;

public class Highlights extends Story{
	private String coverImage;

	public Highlights() {
		super();
	}

	public Highlights(String coverImage, String storyImage, String sendMessage, String id, String fullName, String profileImage) {
		super(storyImage,sendMessage,id,fullName,profileImage);
		this.coverImage = coverImage;
	}

	public String getCoverImage() {
		return coverImage;
	}

	public void setCoverImage(String coverImage) {
		this.coverImage = coverImage;
	}
	
}
