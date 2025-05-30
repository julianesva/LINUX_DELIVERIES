package com.springboot.MyTodoList.model;

import javax.persistence.*;

import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.time.OffsetDateTime;

@Entity
@Table(name = "TASKS")
public class ToDoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TASK_ID")  // Match the exact column name from DB
    private Integer id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "MODULE_ID")
    private Integer moduleId = 1;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "DATE_LIMIT")
    private LocalDate dateLimit;

    @Column(name = "RESPONSIBLE")
    private Integer responsible = 2;
    
    @Column(name = "ENDING_DATE") 
    private LocalDate endingDate;

    @Column(name = "ESTIMATED_TIME")
    private Integer estimatedTime;

    @Column(name = "ACTUAL_TIME")
    private Integer actualTime;

    @Column(name = "CREATION_TS")
    private OffsetDateTime creation_ts;

    @Column(name = "DONE")
    private Boolean done;

    @Column(name = "STORY_POINTS")
    private Integer story_Points;

    // Default constructor
    public ToDoItem() {
    }

    // Full constructor matching all fields
    public ToDoItem(Integer id, String title, Integer moduleId, String description, 
                   LocalDate dateLimit, Integer responsible, LocalDate endingDate,
                   Integer estimatedTime, Integer actualTime, OffsetDateTime creationTs, 
                   Boolean done, Integer storyPoints) {
        this.id = id;
        this.title = title;
        this.moduleId = moduleId;
        this.description = description;
        this.dateLimit = dateLimit;
        this.responsible = responsible;
        this.endingDate = endingDate;
        this.estimatedTime = estimatedTime;
        this.actualTime = actualTime;
        this.creation_ts = creationTs;
        this.done = done;
        this.story_Points = storyPoints;
    }

    // Getters and setters with consistent naming
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateLimit() {
        return dateLimit;
    }

    public void setDateLimit(LocalDate dateLimit) {
        this.dateLimit = dateLimit;
    }

    public Integer getResponsible() {
        return responsible;
    }

    public void setResponsible(Integer responsible) {
        this.responsible = responsible;
    }
    
    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }

    public Integer getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public Integer getActualTime() {
        return actualTime;
    }

    public void setActualTime(Integer actualTime) {
        this.actualTime = actualTime;
    }

    public OffsetDateTime getCreation_ts() {
        return creation_ts;
    }

    public void setCreation_ts(OffsetDateTime creationTs) {
        this.creation_ts = creationTs;
    }

    public Boolean isDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Integer getStory_Points() {
        return story_Points;
    }

    public void setStory_Points(Integer storyPoints) {
        this.story_Points = storyPoints;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", moduleId=" + moduleId +
                ", description='" + description + '\'' +
                ", dateLimit=" + dateLimit +
                ", responsible=" + responsible +
                ", endingDate=" + endingDate +
                ", estimatedTime=" + estimatedTime +
                ", actualTime=" + actualTime +
                ", creation_ts=" + creation_ts +
                ", done=" + done +
                ", story_Points=" + story_Points +
                '}';
    }
}