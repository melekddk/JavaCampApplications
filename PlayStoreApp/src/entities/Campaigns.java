package entities;

public class Campaigns {
	private int Id;
	private String CampaignName;
	private int DiscountDate; //indirim tarihi
	private int PercentageOfDiscount; //indirim yüzdesi
	
	public Campaigns(int id, String CampaignName, int DiscountDate, int PercetageOfDiscount) {
	
		this.Id= id;
		this.CampaignName= CampaignName;
		this.DiscountDate = DiscountDate;
		this.PercentageOfDiscount= PercetageOfDiscount;
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getCampaignName() {
		return CampaignName;
	}
	public void setCampaignName(String campaignName) {
		this.CampaignName = campaignName;
	}
	public int getDiscountDate() {
		return DiscountDate;
	}
	public void setDiscountDate(int discountDate) {
		this.DiscountDate = discountDate;
	}
	public int getPercentageOfDiscount() {
		return PercentageOfDiscount;
	}
	public void setPercentageOfDiscount(int percentageOfDiscount) {
		this.PercentageOfDiscount = percentageOfDiscount;
	}

}
