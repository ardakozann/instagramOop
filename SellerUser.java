package instagramOop;

public class SellerUser extends User {
	private String websiteURL;

	public SellerUser() {
		super();
	}

	public SellerUser(String websiteURL, String id, String fullName, String profileImage) {
		super(id, fullName, profileImage);
		this.websiteURL = websiteURL;
	}

	public String getWebsiteURL() {
		return websiteURL;
	}

	public void setWebsiteURL(String websiteURL) {
		this.websiteURL = websiteURL;
	}
	
}
