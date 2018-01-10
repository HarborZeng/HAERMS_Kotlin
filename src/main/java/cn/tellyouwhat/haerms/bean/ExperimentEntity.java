package cn.tellyouwhat.haerms.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Experiment", schema = "dbo", catalog = "Haerms")
public class ExperimentEntity {
    private int experimentId;
    private String name;
    private String path;
    private int studentId;
    private Integer mark;
    private int courseExperimentId;

    @Id
    @Column(name = "ExperimentId", nullable = false)
    public int getExperimentId() {
        return experimentId;
    }

    public void setExperimentId(int experimentId) {
        this.experimentId = experimentId;
    }

    @Basic
    @Column(name = "Name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Path", nullable = true, length = 100)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "StudentId", nullable = false)
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "Mark", nullable = true)
    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    @Basic
    @Column(name = "CourseExperimentId", nullable = false)
    public int getCourseExperimentId() {
        return courseExperimentId;
    }

    public void setCourseExperimentId(int courseExperimentId) {
        this.courseExperimentId = courseExperimentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExperimentEntity that = (ExperimentEntity) o;
        return experimentId == that.experimentId &&
                studentId == that.studentId &&
                courseExperimentId == that.courseExperimentId &&
                Objects.equals(name, that.name) &&
                Objects.equals(path, that.path) &&
                Objects.equals(mark, that.mark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(experimentId, name, path, studentId, mark, courseExperimentId);
    }
}
