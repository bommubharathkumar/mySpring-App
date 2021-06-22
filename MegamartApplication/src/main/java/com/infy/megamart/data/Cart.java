package com.infy.megamart.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "cart")
public class Cart {

	private @Id String  cartId;
    private @NotBlank String productName;
    private @NotBlank String sellerName;
    private @NotBlank int quantity;
    private @NotBlank double cartOfferPrice;
    
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCartOfferPrice() {
		return cartOfferPrice;
	}
	public void setCartOfferPrice(double cartOfferPrice) {
		this.cartOfferPrice = cartOfferPrice;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", productName=" + productName + ", sellerName=" + sellerName + ", quantity="
				+ quantity + ", cartOfferPrice=" + cartOfferPrice + "]";
	}
    
}
