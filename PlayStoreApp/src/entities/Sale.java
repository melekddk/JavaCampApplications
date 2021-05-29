package entities;

public class Sale {
	
	private int Id;
	private String GameName;
	private String GamerName;
	private String TypeOfSale;
	private String SellBy;
	
	public Sale(int id, String gameName, String gamerName, String typeOfSale, String sellBy) {
	
		this.Id = id;
		this.GameName = gameName;
		this.GamerName = gamerName;
		this.TypeOfSale = typeOfSale;
		this.SellBy = sellBy;
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
	
	public String getGamerName() {
		return GamerName;
	}
	
	public void setGamerName(String gamerName) {
		this.GamerName = gamerName;
	}
	
	public String getTypeOfSale() {
		return TypeOfSale;
	}
	
	public void setTypeOfSale(String typeOfSale) {
		this.TypeOfSale = typeOfSale;
	}
	
	public String getSellBy() {
		return SellBy;
	}
	
	public void setSellBy(String sellBy) {
		this.SellBy = sellBy;
	}
	
	

}
