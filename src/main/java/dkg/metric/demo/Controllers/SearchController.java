package dkg.metric.demo.Controllers;


import dkg.metric.demo.DTOs.Dkg.DkgDTO;
import dkg.metric.demo.DTOs.Search.SearchContentDTO;
import dkg.metric.demo.DTOs.Search.SearchDTO;
import dkg.metric.demo.Entities.Search;
import dkg.metric.demo.Services.DkgService;
import dkg.metric.demo.Services.SearchService;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SearchController {

    private static final String API_KEY = "AIzaSyDjDC4sRPAofjlsLV5kpJdp73C-j2a66Ng";
    private static final String CX = "0708e8db012094b1c";
    private static final String SEARCH_URL = "https://www.googleapis.com/customsearch/v1";

    @Autowired
    private SearchService service;

    @Autowired
    private DkgService dkgService;

    @CrossOrigin(origins = "http://127.0.0.1:8081")
    @PostMapping("/search")
    public String searchGoogle(@RequestParam String URL_CONTENT, @RequestBody SearchDTO search) throws Exception {

        String requestUrl = SEARCH_URL + "?key=" + API_KEY + "&cx=" + CX + "&q=" + URL_CONTENT +"&lr=lang_pt&gl=br";

        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(requestUrl);

            String jsonResponse = EntityUtils.toString(httpClient.execute(request).getEntity());

            // Parse the response (JSON parsing could be done here)
            JSONObject responseJson = new JSONObject(jsonResponse);
            JSONObject content = responseJson.getJSONObject("searchInformation");
            SearchContentDTO contentDTO = new SearchContentDTO(URL_CONTENT,content.getString("totalResults"), content.getDouble("searchTime"), search.user_id());
            service.create(contentDTO);
            return responseJson.toString();
            
        }
    }

    @CrossOrigin(origins = "http://127.0.0.1:8081")
    @GetMapping("/all")
    public ResponseEntity<List<Search>> findAll(){
        List<Search> searches = this.service.findAll();
        return new ResponseEntity<List<Search>>(searches, HttpStatus.OK);

    }

/*    @PostMapping("/dkg")
    public ResponseEntity<String> calculate(@RequestBody DkgDTO dkgData){
        return new ResponseEntity<>(dkgService.teste(),HttpStatus.OK);
    }*/
}
