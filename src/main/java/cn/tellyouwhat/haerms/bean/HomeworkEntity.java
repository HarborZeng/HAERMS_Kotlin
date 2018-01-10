package cn.tellyouwhat.haerms.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Homework", schema = "dbo", catalog = "Haerms")
public class HomeworkEntity {
    private int homeworkId;
    private String name;
    private String path;
    private int studentId;
    private Integer mark;
    private int courseHomeworkId;

    @Id
    @Column(name = "HomeworkId", nullable = false)
    public int getHomeworkId() {
        return homeworkId;
    }

    public void setHomeworkId(int homeworkId) {
        this.homeworkId = homeworkId;
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
    @Column(name = "CourseHomeworkId", nullable = false)
    public int getCourseHomeworkId() {
        return courseHomeworkId;
    }

    public void setCourseHomeworkId(int courseHomeworkId) {
        this.courseHomeworkId = courseHomeworkId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeworkEntity that = (HomeworkEntity) o;
        return homeworkId == that.homeworkId &&
                studentId == that.studentId &&
                courseHomeworkId == that.courseHomeworkId &&
                Objects.equals(name, that.name) &&
                Objects.equals(path, that.path) &&
                Objects.equals(mark, that.mark);
    }

    @Override
    public int hashCode() {

        return Objects.hash(homeworkId, name, path, studentId, mark, courseHomeworkId);
    }
}
