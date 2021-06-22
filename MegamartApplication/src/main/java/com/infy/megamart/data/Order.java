package com.infy.megamart.data;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "order")
public class Order {
	private @Id String  orderId;
    private @NotBlank String displayName;
    private @NotBlank String category;
    private @NotBlank String sellerName;
	private @NotBlank double  price;
    private @NotBlank int quantity;
    private @NotBlank double totalPrice;
    private @NotBlank Date orderedDate;
    private @NotBlank String orderStatus;
    
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Date getOrderedDate() {
		return orderedDate;
	}
	public void setOrderedDate(Date orderedDate) {
		this.orderedDate = orderedDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", displayName=" + displayName + ", category=" + category + ", sellerName="
				+ sellerName + ", price=" + price + ", quantity=" + quantity + ", totalPrice=" + totalPrice
				+ ", orderedDate=" + orderedDate + ", orderStatus=" + orderStatus + "]";
	}
    
}
