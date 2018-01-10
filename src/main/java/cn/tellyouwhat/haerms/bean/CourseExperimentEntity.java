package cn.tellyouwhat.haerms.bean;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "CourseExperiment", schema = "dbo", catalog = "Haerms")
public class CourseExperimentEntity {
    private int courseExperimentId;
    private String name;
    private Timestamp deadline;
    private String purpose;
    private String steps;
    private String references;
    private int courseId;
    private Timestamp issuedTime;

    @Id
    @Column(name = "CourseExperimentId", nullable = false)
    public int getCourseExperimentId() {
        return courseExperimentId;
    }

    public void setCourseExperimentId(int courseExperimentId) {
        this.courseExperimentId = courseExperimentId;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Deadline", nullable = true)
    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    @Basic
    @Column(name = "Purpose", nullable = true, length = 500)
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Basic
    @Column(name = "Steps", nullable = true, length = 2147483647)
    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    @Basic
    @Column(name = "References", nullable = true, length = 2147483647)
    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    @Basic
    @Column(name = "CourseId", nullable = false)
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "IssuedTime", nullable = true)
    public Timestamp getIssuedTime() {
        return issuedTime;
    }

    public void setIssuedTime(Timestamp issuedTime) {
        this.issuedTime = issuedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseExperimentEntity that = (CourseExperimentEntity) o;
        return courseExperimentId == that.courseExperimentId &&
                courseId == that.courseId &&
                Objects.equals(name, that.name) &&
                Objects.equals(deadline, that.deadline) &&
                Objects.equals(purpose, that.purpose) &&
                Objects.equals(steps, that.steps) &&
                Objects.equals(references, that.references) &&
                Objects.equals(issuedTime, that.issuedTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(courseExperimentId, name, deadline, purpose, steps, references, courseId, issuedTime);
    }
}
