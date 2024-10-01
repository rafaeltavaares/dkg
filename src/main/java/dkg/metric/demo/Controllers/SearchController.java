package dkg.metric.demo.Controllers;


import dkg.metric.demo.DTOs.SearchDTO;
import dkg.metric.demo.Services.SearchService;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/search")
public class SearchController {

    private static final String API_KEY = "AIzaSyDjDC4sRPAofjlsLV5kpJdp73C-j2a66Ng";
    private static final String CX = "0708e8db012094b1c";
    private static final String SEARCH_URL = "https://www.googleapis.com/customsearch/v1";

    @Autowired
    private SearchService service;

    @PostMapping("/dkg")
    public String searchGoogle(@RequestBody SearchDTO search) throws Exception {

        String requestUrl = SEARCH_URL + "?key=" + API_KEY + "&cx=" + CX + "&q=" + search.content() +"&lr=lang_pt&gl=br";

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(requestUrl);

            String jsonResponse = EntityUtils.toString(httpClient.execute(request).getEntity());



            // Parse the response (JSON parsing could be done here)
            JSONObject responseJson = new JSONObject(jsonResponse);
            return responseJson.toString();
        }
    }

}
