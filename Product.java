public class Product {
    int pcode;
    String pname;
    int price;
    public static void main(String[] args) {
       
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
p1.pcode=101;
p1.pname="Mobile";
p1.price=30000;

p2.pcode=102;
p2.pname="Laptop";
p2.price=60000;

p3.pcode=103;
p3.pname="Television";
p3.price=40000;

    System.out.println("PRODUCT 1");
    System.out.println("code:"+p1.pcode);
    System.out.println("Product name:"+p1.pname);
    System.out.println("price:"+p1.price);
   
    System.out.println("PRODUCT 2");
    System.out.println("code:"+p2.pcode);
    System.out.println("Product name:"+p2.pname);
    System.out.println("price:"+p2.price);
   
    System.out.println("PRODUCT 3");
    System.out.println("code:"+p3.pcode);
    System.out.println("Product name:"+p3.pname);
    System.out.println("price:"+p3.price);
   
    if (p1.price<p2.price)
    {
    if(p1.price<p3.price)
    {
    System.out.println("PRODUCT 1 have low price ");
    }
    else
    {
    System.out.println("PRODUCT 3 have low price");
    }
    }
    else
    {
    if(p2.price<p3.price)
    {
    System.out.println("PRODUCT 2  have low price");
    }
    else
    {
    System.out.println("PRODUCT 3 have low price");
    }
    }
    }
    }

