public class Toy implements Comparable<Toy> {

    private Integer id;
    private String name;
    private Integer count;
    private Integer droprate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getDroprate() {
        return droprate;
    }

    public void setDroprate(Integer droprate) {
        this.droprate = droprate;
    }

    public Toy(Integer id, String name, Integer count, int droprate) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.droprate = droprate;
    }

    @Override
    public int compareTo(Toy o) {
        return droprate.compareTo(o.getDroprate());
    }

    @Override
    public String toString() {
        return "ID: " + getId() +
                ", Игрушка: " + getName() +
                ", Количество: " + getCount() +
                ", Шанс выпадания: " + getDroprate();
    }
}