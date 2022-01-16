package instagramOop;

public class User {
	private String id;
	private String fullName;
	private String profileImage;
	
	public User() {
		super();
	}
	public User(String id, String fullName, String profileImage) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.profileImage = profileImage;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
}
