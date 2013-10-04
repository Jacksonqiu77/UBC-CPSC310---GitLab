package ca.ubc.cpsc310.gitlab.client.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ca.ubc.cpsc310.gitlab.client.products.ProductItem;

import java.util.List;

import ca.ubc.cpsc310.gitlab.client.products.ProductItem;

@SuppressWarnings("unchecked")
public class User implements IUser {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4678920906536621479L;
	
	private String name;
	private String language;

	
	private final String WISHLIST = "WISHLIST";
	private final String SHOPPINGCART = "SHOPPINGCART";
	
	private Map<String, List<ProductItem>> data = new HashMap<String, List<ProductItem>>();
	public User()
	{
		data.put(WISHLIST, new ArrayList<ProductItem>());
		data.put(SHOPPINGCART, new ArrayList<ProductItem>());
	}
	
	
	@Override
	public void setLanguage(String language) {
		this.language = language;
		
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getLanguage() {
		return language;
	}

	@Override
	public String getName() {
		return name;
	}

		
	@Override
	public List<ProductItem> getWishList() {
		return (List<ProductItem>) data.get(WISHLIST);
	}

	@Override
	public List<ProductItem> getShoppingCart() {
		return (List<ProductItem>) data.get(SHOPPINGCART);
	}

	

	@Override
	public void addItemToWishList(ProductItem o) {
		((List<ProductItem>) data.get(WISHLIST)).add(o);
	}

	@Override
	public void addItemToShoppingCart(ProductItem o) {
		((List<ProductItem>) data.get(SHOPPINGCART)).add(o);
		
	}

	@Override
	public void removeItemFromWishList(ProductItem o) {
		((List<ProductItem>) data.get(WISHLIST)).remove(o);
	}

	@Override
	public void removeItemFromShoppingCart(ProductItem o) {
		((List<ProductItem>) data.get(SHOPPINGCART)).add(o);
	}

}
