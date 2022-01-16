package instagramOop;

public class Store extends User {
	private String[] productImages;
	private String productLink;
	private int productPrice;
	public Store() {
		super();
	}
	public Store(String[] productImages, String productLink, int productPrice, String id, String fullName, String profileImage) {
		super(id, fullName, profileImage);
		this.productImages = productImages;
		this.productLink = productLink;
		this.productPrice = productPrice;
	}
	public String[] getProductImages() {
		return productImages;
	}
	public void setProductImages(String[] productImages) {
		this.productImages = productImages;
	}
	public String getProductLink() {
		return productLink;
	}
	public void setProductLink(String productLink) {
		this.productLink = productLink;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
}
