

package fit.iuh.edu.week01_microservicedemo.entites;
public class Product {


    private String id;
    private String name;

    private double price;

    private User user;
    public Product(String id, String name,double price,User user) {
        this.id = id;
        this.name = name;
        this.price=price;
        this.user=user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", user=" + user +
                '}';
    }
}
