package entities;

public class Game {
	private int Id;
	private String GameName;
	private double Price;
	private double DiscountProductsPrice;
	private double DiscountRate;
	private String DiscountProducts;
	
	public Game(int id, String gameName, double price, double discountProductsPrice,
			double discountRate, String discountProducts) 
	{
		this.Id= id;
		this.GameName= gameName;
		this.Price= price;
		this.DiscountProductsPrice = discountProductsPrice;
		this.DiscountRate = discountRate;
		this.DiscountProducts = discountProducts; 
	}
	
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		this.Id = id;
	}
	
	public String getGameName() {
		return GameName;
	}
	
	public void setGameName(String gameName) {
		this.GameName = gameName;
	}
	
	public double getPrice() {
		return Price;
	}
	
	public void setPrice(double price) {
		this.Price = price;
	}
	
	
	public double getDiscountProductsPrice() {
		return DiscountProductsPrice;
	}
	
	public void setDiscountProductsPrice(double discountProductsPrice) {
		this.DiscountProductsPrice = discountProductsPrice;
	}
	
	
	public double getDiscountRate() {
		return DiscountRate;
	}
	
	public void setDiscountRate(double discountRate) {
		this.DiscountRate = discountRate;
	}
	
	
	public String getDiscountProducts() {
		return DiscountProducts;
	}
	
	public void setDiscountProducts(String discountProducts) {
		this.DiscountProducts = discountProducts;
	}


}
