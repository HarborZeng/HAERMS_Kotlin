package cn.tellyouwhat.haerms.bean;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "CourseAttachment", schema = "dbo", catalog = "Haerms")
public class CourseAttachmentEntity {
    private int attachmentId;
    private String name;
    private String path;
    private int courseId;
    private Timestamp issuedTime;

    @Id
    @Column(name = "AttachmentId", nullable = false)
    public int getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(int attachmentId) {
        this.attachmentId = attachmentId;
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
        CourseAttachmentEntity that = (CourseAttachmentEntity) o;
        return attachmentId == that.attachmentId &&
                courseId == that.courseId &&
                Objects.equals(name, that.name) &&
                Objects.equals(path, that.path) &&
                Objects.equals(issuedTime, that.issuedTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(attachmentId, name, path, courseId, issuedTime);
    }
}
