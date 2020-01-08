
public class Book extends Product{
	private String publisher;
	private int yearPublished;
	
	public Book(double regularPrice,String publisher,int yearPublished) {
		super(regularPrice);
		this.publisher=publisher;
		this.yearPublished=yearPublished;
	}

	@Override
	public double computerSalePrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getRegularPrice() {
		// TODO Auto-generated method stub
		return super.getRegularPrice();
	}

	@Override
	public void setRegularPrice(double regularPrice) {
		// TODO Auto-generated method stub
		super.setRegularPrice(regularPrice);
	}

}
