package task1;

public class Discount {

    int id;

    float size;

    public Discount(int i, float v) {
    }

    public int getId() {
        return id;
    }

    public float getSize() {
        return size;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "id=" + id +
                ", size=" + size +
                '}';
    }
}
