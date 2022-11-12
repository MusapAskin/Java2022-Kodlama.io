package kodlama.io.rentACar.entities.concretes;

public class Brand {
	private int id;
	private String brandName;

	public Brand() {
		super();
	}

	public Brand(int id, String brandName) {
		super();
		this.id = id;
		this.brandName = brandName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brandName;
	}

	public void setBrand(String brand) {
		this.brandName = brand;
	}

}
