
 public abstract class Product {
	 
	 private double regularprice;
	 
	 public Product(double regularprice) {
		 this.regularprice=regularprice;
		 
	 }
	 public abstract double computerSalePrice();

	 public double getRegularPrice1() {
		 return regularprice;
		 
	 }

	    public void setRegularPrice(double regularPrice) {
	        this.regularprice = regularPrice;
}
		public double getRegularPrice() {
			// TODO Auto-generated method stub
			return 0;
		}
}