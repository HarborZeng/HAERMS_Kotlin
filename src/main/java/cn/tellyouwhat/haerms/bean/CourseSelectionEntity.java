package cn.tellyouwhat.haerms.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CourseSelection", schema = "dbo", catalog = "Haerms")
public class CourseSelectionEntity {
    private int courseSelectionId;
    private int courseId;
    private int studentId;

    @Id
    @Column(name = "CourseSelectionId", nullable = false)
    public int getCourseSelectionId() {
        return courseSelectionId;
    }

    public void setCourseSelectionId(int courseSelectionId) {
        this.courseSelectionId = courseSelectionId;
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
    @Column(name = "StudentId", nullable = false)
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseSelectionEntity that = (CourseSelectionEntity) o;
        return courseSelectionId == that.courseSelectionId &&
                courseId == that.courseId &&
                studentId == that.studentId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(courseSelectionId, courseId, studentId);
    }
}
