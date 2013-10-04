package ca.ubc.cpsc310.gitlab.client.user;

import java.util.ArrayList;
//<<<<<<< HEAD
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ca.ubc.cpsc310.gitlab.client.products.ProductItem;

// from async: kept the imports
import java.util.List;
import ca.ubc.cpsc310.gitlab.client.products.ProductItem;

@SuppressWarnings("unchecked")
public class User implements IUser {

	/**
	 * 
	 */
	//private static final long serialVersionUID = -6968277136462621810L;

	private static final long serialVersionUID = -4678920906536621479L;

	// take the async version for language and name
//	private final String LANG = "LANG";
//	private final String NAME = "NAME";
	private String name;
	private String language;
	
	private final String WISHLIST = "WISHLIST";
	private final String SHOPPINGCART = "SHOPPINGCART";
	
//	private Map<String, Object> data = new HashMap<String, Object>();
//	
//	public User()
//	{
//		data.put(WISHLIST, new ArrayList<Object>());
//		data.put(SHOPPINGCART, new ArrayList<Object>());
	
	// updated the HashMap to include List<ProductItem> instead of of Object
	private Map<String, List<ProductItem>> data = new HashMap<String, List<ProductItem>>();
	
	public User()
	{
		data.put(WISHLIST, new ArrayList<ProductItem>());
		data.put(SHOPPINGCART, new ArrayList<ProductItem>());
//=======


//public class User implements IUser {
//
//	
//	private static final long serialVersionUID = -4678920906536621479L;
//	
//	private List<ProductItem> shoppingCart = new ArrayList<ProductItem>();
//	private List<ProductItem> wishList = new ArrayList<ProductItem>();
//	
//	private String name;
//	private String language;
//
//	
//	public User()
//	{
//		
//>>>>>>> async
	}
	
	@Override
	public String getLanguage() {
//<<<<<<< HEAD
//		return (String) data.get(LANG);
//======= decided to keep the async version
		return language;
//>>>>>>> async
	}

	@Override
	public String getName() {
//<<<<<<< HEAD
//		return (String) data.get(NAME);
//======= decided to keep the async version
		return name;
//>>>>>>> async
	}

	@Override
	public List<ProductItem> getWishList() {
//<<<<<<< HEAD
		return (List<ProductItem>) data.get(WISHLIST);
//======= decided to keep the master version
//		return wishList;
//>>>>>>> async
	}

	@Override
	public List<ProductItem> getShoppingCart() {
//<<<<<<< HEAD
		return (List<ProductItem>) data.get(SHOPPINGCART);
//======= decided to keep the master version
//		return shoppingCart;
//>>>>>>> async
	}

	@Override
	public void setLanguage(String language) {
//<<<<<<< HEAD
//		data.put(LANG,language);
//======= decided to keep the async version
		this.language = language;
//>>>>>>> async
		
	}

	@Override
	public void setName(String name) {
//<<<<<<< HEAD
//		data.put(NAME, name);
//======= decided to keep the async version
		this.name = name;
//>>>>>>> async
		
	}

	@Override
	public void addItemToWishList(ProductItem o) {
//<<<<<<< HEAD
		((List<ProductItem>) data.get(WISHLIST)).add(o);
	}

	@Override
	public void addItemToShoppingCart(ProductItem o) {
		((List<ProductItem>) data.get(SHOPPINGCART)).add(o);
		
	}

	@Override
	public void removeItemFromWishList(ProductItem o) {
		((List<ProductItem>) data.get(WISHLIST)).remove(o);
//======= decided to keep the master version
//		this.wishList.add(o);
//		
//	}
//	@Override
//	
//	public void removeItemFromWishList(ProductItem o) {
//		this.wishList.remove(o);
//	}
//	
//	@Override
//	public void addItemToShoppingCart(ProductItem o) {
//		this.shoppingCart.add(o);
//		
//>>>>>>> async
	}

	@Override
	public void removeItemFromShoppingCart(ProductItem o) {
//<<<<<<< HEAD
		((List<ProductItem>) data.get(SHOPPINGCART)).add(o);
	}

	
//======= decided to keep the master version
//		this.shoppingCart.remove(o);
//	}
//
//>>>>>>> async
}
