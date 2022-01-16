package instagramOop;

public class Search {
	private String searchIt;
	private String[] imagesURL;
	public Search() {
		super();
	}
	public Search(String searchIt, String[] imagesURL) {
		super();
		this.searchIt = searchIt;
		this.imagesURL = imagesURL;
	}
	public String getSearchIt() {
		return searchIt;
	}
	public void setSearchIt(String searchIt) {
		this.searchIt = searchIt;
	}
	public String[] getImagesURL() {
		return imagesURL;
	}
}
