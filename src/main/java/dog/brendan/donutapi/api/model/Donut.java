package dog.brendan.donutapi.api.model;

public class Donut {

    private String id;

    private String name;

    private int calories;

    private String[] extras;

    private String photo;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public String[] getExtras() {
        return extras;
    }

    public String getPhoto() {
        return photo;
    }
}
