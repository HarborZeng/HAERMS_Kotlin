package cn.tellyouwhat.haerms.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Teacher", schema = "dbo", catalog = "Haerms")
public class TeacherEntity {
    private int teacherId;
    private String name;
    private String jobNumber;
    private String password;
    private int departmentId;
    private String introduction;
    private boolean banned;
    private String headImage;
    private String title;

    @Id
    @Column(name = "TeacherId", nullable = false)
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "JobNumber", nullable = false, length = 8)
    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    @Basic
    @Column(name = "Password", nullable = false, length = 32)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "DepartmentId", nullable = false)
    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "Introduction", nullable = true, length = 2147483647)
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Basic
    @Column(name = "Banned", nullable = false)
    public boolean isBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }

    @Basic
    @Column(name = "HeadImage", nullable = true, length = 100)
    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    @Basic
    @Column(name = "Title", nullable = true, length = 40)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherEntity that = (TeacherEntity) o;
        return teacherId == that.teacherId &&
                departmentId == that.departmentId &&
                banned == that.banned &&
                Objects.equals(name, that.name) &&
                Objects.equals(jobNumber, that.jobNumber) &&
                Objects.equals(password, that.password) &&
                Objects.equals(introduction, that.introduction) &&
                Objects.equals(headImage, that.headImage) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(teacherId, name, jobNumber, password, departmentId, introduction, banned, headImage, title);
    }
}
