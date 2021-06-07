import java.util.*;
class Product
 {

 String pname;
 int pcode;
 float price;
 Product()
 {
 pname='';
 pcode=0;
 price=0.0;
 }

void getval()
 {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Product Name : ");
    String pname = sc.nextLine();
    System.out.println("Enter the Product price : ");
    String price = sc.nextFloat();
    System.out.println("Enter the Product code : ");
    int pcode = sc.nextInt();

 }
 double lowprice(Product p2,Product p3)
 {
 Product smallest=new Product();

  if(this.price<p2.price)
   {
			if(p3.price<this.price)
			 {
				smallest.price = p3.price;
			}
			else
			{
				smallest.price = this.price;
			}
    }
   else
    {
			if(p2.price<p3.price)
			{
				smallest.price = p2.price;
			}
			else
            {
				smallest.price = p3.price;
			}
    }
    return (smallest.price);
}

}
 class ProductMain1
 {
 public static void main(String[] args)
    {
      Product obj1=new Product();
      Product obj2=new Product();
      Product obj3=new Product();
      obj1.getval();
      obj2.getval();
      obj3.getval();
      System.out.println(obj1.lowprice(obj2,obj3));


}
}

