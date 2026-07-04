import java.util.LinkedHashMap;
import java.util.Map;

public class Products {
    private int id;
    private  String pname;   
    private int qty;
    private float price;
    public Products(int id,String pname, int qty,float price){
        this.id=id;
        this.pname=pname;
        this.qty=qty;
        this.price=price;

    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public String getPname() {
        return pname;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public int getQty() {
        return qty;
    }
    public void setPrice(float price){
        this.price=price;
    }
    public float getPrice() {
        return price;
    }
    public static void main(String[] args) {
        Products p1=new Products(101, "soap", 10, 25.25f);
        Products p2=new Products(102,"Shampoo" , 50, 9.99f);
        Products p3=new Products(103, "HandWash", 28,17.80f );
        Products p4=new Products(104, "Hanger", 5, 99.99f);
        LinkedHashMap<Integer,Products> product=new LinkedHashMap<>();
        product.put(1, p1);
        product.put(2, p2);
        product.put(3, p3);
        product.put(4, p4);
        for (Map.Entry<Integer,Products> m : product.entrySet()) {
            // System.out.println(m.getKey()+" "+m.getValue());
            int k=m.getKey();
            Products b=m.getValue();
            System.out.println(k+"Details");
            System.out.println("ID: "+b.id+" Product Name: "+b.pname+" Quantity: "+b.qty+" Price: "+b.price);
        }
    }
}
