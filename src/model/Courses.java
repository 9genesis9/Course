/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author revanthane
 */
public class Courses {
    private Integer courseId;
    private String courseName;
    private String courseDescription;

    /**
     * @return the courseId
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * @param courseId the courseId to set
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * @return the courseDescription
     */
    public String getCourseDescription() {
        return courseDescription;
    }

    /**
     * @param courseDescription the courseDescription to set
     */
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
}
