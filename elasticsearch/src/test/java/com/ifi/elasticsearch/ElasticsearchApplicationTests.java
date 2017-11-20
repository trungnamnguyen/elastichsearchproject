package com.ifi.elasticsearch;


import com.google.gson.Gson;
import com.ifi.elasticsearch.entity.Issues;

import com.taskadapter.redmineapi.IssueManager;
import com.taskadapter.redmineapi.RedmineException;
import com.taskadapter.redmineapi.RedmineManager;
import com.taskadapter.redmineapi.RedmineManagerFactory;
import com.taskadapter.redmineapi.bean.Issue;
import org.apache.http.HttpHost;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElasticsearchApplicationTests {

	@Test
	public void contextLoads() throws RedmineException, IOException {
//		System.setProperty("http.proxyHost","10.225.3.1");
//		System.setProperty("http.proxyPort","3128");

//		String uri = "http://apis.ifisolution.local:8080/projects/training-project";
		String uri="http://www.redmine.org/projects/redmine/issues";
		String apiAccessKey = "a3221bfcef5750219bd0a2df69519416dba17fc9";

		String projectKey = "issues";
		Integer queryId = null; // any
		List<Issues> issuesList = new ArrayList<Issues>();
		Issues iss = new Issues();
		RedmineManager mgr = RedmineManagerFactory.createWithUserAuth(uri, "phamduyan102", "Ph@mduyan9X");
		IssueManager issueManager = mgr.getIssueManager();
		List<Issue> issues = issueManager.getIssues(projectKey, queryId);
//		RestClient restClient = RestClient.builder(
//				new HttpHost("10.225.3.252", 9200, "http")).build();
//		RestHighLevelClient client =
//				new RestHighLevelClient(restClient);
		for (Issue issue : issues) {
			System.out.println(issue.toString());
			iss.setId(issue.getId());
			iss.setSubject(issue.getSubject());
			iss.setAssignee(issue.getAssignee().getFullName());
//			iss.setCategory(issue.getCategory().getName());
			iss.setPriority(issue.getPriorityText());
			iss.setStatus(issue.getStatusName());
			iss.setTracker(issue.getTracker().getName());
			iss.setUpdated(issue.getUpdatedOn());
			System.out.println(iss.toString());

//			Gson gson=new Gson();
//			String issuesGson=gson.toJson(iss);
//			System.out.println(issuesGson);

//			IndexRequest request=new IndexRequest("issue_redmine","issues",String.valueOf(iss.getId()));
//			request.source(issuesGson, XContentType.JSON);
//			client.index(request);

		}
//		GetRequest request=new GetRequest("issue_redmine","issues","24599");
//		GetResponse getResponse = client.get(request);
		SearchRequest searchRequest=new SearchRequest();
//		GetRequest getRequest=new GetRequest("issue_redmine","issues","24599");
//		System.out.println(issuesList.size());
//		issuesRepository.findAll();
	}
//	@Test
//	public void getListIssue() throws RedmineException {
//		System.setProperty("http.proxyHost","10.225.3.1");
//		System.setProperty("http.proxyPort","3128");
//
//		String uri = "http://apis.ifisolution.local:8080/projects/training-project";
//		String apiAccessKey = "a3221bfcef5750219bd0a2df69519416dba17fc9";
//
//		String projectKey = "training-project";
//		Integer queryId = null; // any
//		List<Issues> issuesList = new ArrayList<Issues>();
//		Issues iss = new Issues();
//		RedmineManager mgr = RedmineManagerFactory.createWithUserAuth(uri, "Fresher12", "12345678");
//		IssueManager issueManager = mgr.getIssueManager();
//		List<Issue> issues = issueManager.getIssues(projectKey, queryId);
//	}
//
//	@Test
//	public void

}
