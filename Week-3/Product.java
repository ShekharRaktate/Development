public class Product {
    public static void main(String[] args) {
        InnerProduct prod=new InnerProduct();
        prod.setProduct(101,"Apple",23.0f,10);
        System.out.println(prod.getId());
        System.out.println(prod.getName());
        System.out.println(prod.getQuantity());
        System.out.println(prod.getPrice());
    }
}
class InnerProduct {

    private int id;
    private String name;
    private float price;
    private int quantity;
    public void setProduct(int id,String name,float price,int quantity){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public float getPrice(){
        return price;
    }
}