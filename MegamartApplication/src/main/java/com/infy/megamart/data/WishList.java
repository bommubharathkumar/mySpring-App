package com.infy.megamart.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "wishlist")
public class WishList {

	
	private @Id String  wishId;
    private @NotBlank String displayName;
    private @NotBlank String shortDiscreption;
    private @NotBlank String category;
    
	public String getWishId() {
		return wishId;
	}
	public void setWishId(String wishId) {
		this.wishId = wishId;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getShortDiscreption() {
		return shortDiscreption;
	}
	public void setShortDiscreption(String shortDiscreption) {
		this.shortDiscreption = shortDiscreption;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "WishList [wishId=" + wishId + ", displayName=" + displayName + ", shortDiscreption=" + shortDiscreption
				+ ", category=" + category + "]";
	}
	
}
