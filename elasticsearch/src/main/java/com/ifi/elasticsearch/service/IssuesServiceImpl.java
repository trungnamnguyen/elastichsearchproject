//package com.ifi.elasticsearch.service;
//
//import com.ifi.elasticsearch.entity.Issues;
//import com.ifi.elasticsearch.repositories.IssuesRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class IssuesServiceImpl implements IssueService {
//    @Autowired
//    private IssuesRepository issuesRepository;
//    @Override
//    public Issues save(Issues issues) {
//        return issuesRepository.save(issues);
//    }
//
//    @Override
//    public void delete(Issues issues) {
//        issuesRepository.delete(issues);
//    }
//
//    @Override
//    public Optional<Issues> findOne(int id) {
//        return issuesRepository.findById(id);
//    }
//
//    @Override
//    public Iterable<Issues> findAll() {
//        return issuesRepository.findAll();
//    }
//}
