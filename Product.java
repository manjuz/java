import java.util.*;

class product1{
    int pcode;
    String pname;
    double price;

    void setdata(int code,String name,double prc ){
        pcode=code;
        pname=name;
        price=prc;
    }
    void getdata(){
        System.out.print("Product name : "+pname);
        System.out.println("Product code : "+pcode);
        System.out.println("Product price : "+price);
    }
    void lowprice(product1 p1,product1 p2){

        if(price<=p1.price && price<=p2.price)
            System.out.println(price+" has the smallest price");
        else if (p1.price<=price && p1.price<=p2.price)
            System.out.println(p1.price+" has the smallest price");
        else
        //prints c if the above conditions are false
            System.out.println(p2.price+" has the smallest price");
    }
}
class Product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int code;
        double price;
        String name;
        product1 prod1=new product1();
        product1 prod2=new product1();
        product1 prod3=new product1();
        System.out.println("Enter the details of 1st product : ");
        System.out.println("Enter the Product name : ");
        name=sc.nextLine();
        System.out.println("Enter the Product code : ");
        code=sc.nextInt();
        System.out.println("Enter the Product price : ");
        price=sc.nextDouble();
        prod1.setdata(code, name, price);

        System.out.println("Enter the details of 2nd product : ");
        sc.nextLine();
        System.out.print("Enter the Product name : ");
        name=sc.nextLine();
        System.out.println("Enter the Product code : ");
        code=sc.nextInt();
        System.out.println("Enter the Product price : ");
        price=sc.nextDouble();
        prod2.setdata(code, name, price);

        System.out.println("Enter the details of 3rd product : ");
        sc.nextLine();
        System.out.print("Enter the Product name : ");
        name=sc.nextLine();
        System.out.println("Enter the Product code : ");
        code=sc.nextInt();
        System.out.println("Enter the Product price : ");
        price=sc.nextDouble();
        prod3.setdata(code, name, price);

        System.out.println("Product 1 ");
        prod1.getdata();
        System.out.println("Product 2 ");
        prod2.getdata();
        System.out.println("Product 3 ");
        prod3.getdata();

        prod1.lowprice(prod2, prod3);

    }
}
