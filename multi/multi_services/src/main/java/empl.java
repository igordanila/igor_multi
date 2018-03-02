public class empl {
    private long id;
    private String first;
    public empl(){

    }

    public long getId() {
        return id;
    }

    public String getFirst() {
        return first;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    @Override
    public String toString() {
        return "empl1{" +
                "id=" + id +
                ", first='" + first + '\'' +
                '}';
    }
}
