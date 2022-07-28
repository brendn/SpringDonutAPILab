package dog.brendan.donutapi.api;

import dog.brendan.donutapi.api.model.Donut;
import java.util.List;

public class DonutResponse {

    private List<Donut> results;

    private int count;

    public int getCount() {
        return count;
    }

    public List<Donut> getResults() {
        return results;
    }
}
