package dog.brendan.donutapi.api.service;

import dog.brendan.donutapi.api.DonutResponse;
import dog.brendan.donutapi.api.model.Donut;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class DonutService {

    private RestTemplate request = new RestTemplate();

    public List<Donut> getDonuts() {
        return request.getForObject("https://grandcircusco.github.io/demo-apis/donuts.json", DonutResponse.class).getResults();
    }

    public Donut getDonutinfo(int id) {
        String url = String.format("https://grandcircusco.github.io/demo-apis/donuts/%d.json", id);
        return request.getForObject(url, Donut.class, id);
    }
}
