package cn.tellyouwhat.haerms.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Score", schema = "dbo", catalog = "Haerms")
public class ScoreEntity {
    private int studentId;
    private int courseId;
    private Integer mark;
    private int scoreId;

    @Basic
    @Column(name = "StudentId", nullable = false)
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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
    @Column(name = "Mark", nullable = true)
    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    @Id
    @Column(name = "ScoreId", nullable = false)
    public int getScoreId() {
        return scoreId;
    }

    public void setScoreId(int scoreId) {
        this.scoreId = scoreId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScoreEntity that = (ScoreEntity) o;
        return studentId == that.studentId &&
                courseId == that.courseId &&
                scoreId == that.scoreId &&
                Objects.equals(mark, that.mark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(studentId, courseId, mark, scoreId);
    }
}
