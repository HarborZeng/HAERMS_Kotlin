package cn.tellyouwhat.haerms.bean;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "CourseHomework", schema = "dbo", catalog = "Haerms")
public class CourseHomeworkEntity {
    private int courseHomeworkId;
    private String name;
    private Timestamp issuedTime;
    private Timestamp deadline;
    private String content;
    private int courseId;

    @Id
    @Column(name = "CourseHomeworkId", nullable = false)
    public int getCourseHomeworkId() {
        return courseHomeworkId;
    }

    public void setCourseHomeworkId(int courseHomeworkId) {
        this.courseHomeworkId = courseHomeworkId;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "IssuedTime", nullable = false)
    public Timestamp getIssuedTime() {
        return issuedTime;
    }

    public void setIssuedTime(Timestamp issuedTime) {
        this.issuedTime = issuedTime;
    }

    @Basic
    @Column(name = "Deadline", nullable = false)
    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    @Basic
    @Column(name = "Content", nullable = false, length = 2147483647)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "CourseId", nullable = false)
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseHomeworkEntity that = (CourseHomeworkEntity) o;
        return courseHomeworkId == that.courseHomeworkId &&
                courseId == that.courseId &&
                Objects.equals(name, that.name) &&
                Objects.equals(issuedTime, that.issuedTime) &&
                Objects.equals(deadline, that.deadline) &&
                Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {

        return Objects.hash(courseHomeworkId, name, issuedTime, deadline, content, courseId);
    }
}
