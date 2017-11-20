package com.ifi.elasticsearch.entity;



import java.util.Date;
import java.util.UUID;


public class Issues {

//    private int id_primary;

    private int id;
    private String subject;
    private String tracker;
    private String status;
    private String priority;
    private String category;
    private String assignee;
    private Date updated;
    private String statusCrud;
//    public int getId_primary() {
//        return id_primary;
//    }
//
//    public void setId_primary(int id_primary) {
//        this.id_primary = id_primary;
//    }

    public String getStatusCrud() {
        return statusCrud;
    }

    public void setStatusCrud(String statusCrud) {
        this.statusCrud = statusCrud;
    }

    public String getTracker() {
        return tracker;
    }

    public void setTracker(String tracker) {
        this.tracker = tracker;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Issues(int id, String subject) {
        this.id = id;
        this.subject = subject;
    }

    public Issues() {
//        this.id_primary=UUID.randomUUID();
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {

        return subject;
    }

    public int getId() {

        return id;
    }

    @Override
    public String toString() {
        return "Issues{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", tracker='" + tracker + '\'' +
                ", status='" + status + '\'' +
                ", priority='" + priority + '\'' +
                ", category='" + category + '\'' +
                ", assignee='" + assignee + '\'' +
                ", updated=" + updated +
                '}';
    }
}
