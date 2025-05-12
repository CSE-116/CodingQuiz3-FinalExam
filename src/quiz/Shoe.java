package quiz;

public abstract class Shoe {
    protected int size;
    protected int price;

    public Shoe(int size, int price){
        this.size = size;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract Shoe checkShoes(Shoe shoe);
}
