package instagramOop;

public class DirectMessage extends User {
	private String[] chats;
	
	public DirectMessage() {
		super();
	}

	public DirectMessage(String[] chats, String id, String fullName, String profileImage) {
		super(id, fullName, profileImage);
		this.chats = chats;
	}

	public String[] getChats() {
		return chats;
	}

	public void setChats(String[] chats) {
		this.chats = chats;
	}
}
