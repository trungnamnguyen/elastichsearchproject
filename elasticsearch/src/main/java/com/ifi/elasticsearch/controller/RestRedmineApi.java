package com.ifi.elasticsearch.controller;//package com.ifi.elasticsearch.controller;
//
//import com.ifi.elasticsearch.entity.Issues;
//import com.ifi.elasticsearch.service.IssueService;
//
//import org.springframework.beans.factory.annotation.Autowired;
import com.ifi.elasticsearch.entity.Issues;
import org.apache.http.HttpHost;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200"})
public class RestRedmineApi {

    @RequestMapping(value = "/issues/", method = RequestMethod.GET)
    public ResponseEntity<GetResponse> listAllCreditcard() throws IOException {
        List<Issues> list=new ArrayList<Issues>();
        RestClient restClient = RestClient.builder(
                new HttpHost("10.225.3.252", 9200, "http")).build();
        RestHighLevelClient client =
                new RestHighLevelClient(restClient);


        GetRequest request=new GetRequest("issue_redmine","issues","24599");
        GetResponse getResponse = null;
        try {
             getResponse = client.get(request);
        } catch (IOException e) {
            e.printStackTrace();
        }
       
        
        if (list.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<GetResponse>(getResponse, HttpStatus.OK);
    }
////
//////    @RequestMapping(value = "/issues/{id}", method = RequestMethod.GET)
//////    public ResponseEntity<?> getIssues(@PathVariable("id") int id) {
////////        logger.info("Fetching User with id {}", id);
//////        Issues issues = issueService.findOne(id);
////////        if (cardholders == null) {
////////            return new ResponseEntity(new CustomErrorType("User with id " + id
////////                    + " not found"), HttpStatus.NOT_FOUND);
////////        }
//////        return new ResponseEntity<Issues>(issues, HttpStatus.OK);
//////    }
////}
}
