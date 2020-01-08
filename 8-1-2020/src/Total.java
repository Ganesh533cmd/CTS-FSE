
public class Total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Product[] ga=new Product[4];
 ga[0]= (Product) new TV(500,"LG",25);
 ga[1]=(Product) new TV(542,"apple",32);
 ga[2] = (Product) new Book(34, "Sun press", 1992);
 ga[3] = (Product) new Book(15, "Korea press", 1986);
 
 double totalRegularPrice = 0;
 double totalSalePrice = 0;
 
 for (int i=0; i<ga.length; i++){
     
        totalRegularPrice += ga[i].getRegularPrice();
     totalSalePrice += ga[i].computerSalePrice();
     
     System.out.println("Item number " + i +
             ": Type = " + ga[i].getClass().getName() +
             ", Regular price = " + ga[i].getRegularPrice() +
             ", Sale price = " + ga[i].computerSalePrice());
 }
 System.out.println("totalRegularPrice = " + totalRegularPrice);
 System.out.println("totalSalePrice = " + totalSalePrice);
	}

}
