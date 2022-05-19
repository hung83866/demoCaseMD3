package model;

public class Product {
    private int id;
    private String name;
    private String image;
    private int price;
    private String note;

    public Product(int id, String name, String image, int price, String note) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.note = note;
    }

    public Product(String name, String image, int price, String note) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.note = note;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}
