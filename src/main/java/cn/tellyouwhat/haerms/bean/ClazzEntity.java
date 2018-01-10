package cn.tellyouwhat.haerms.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Class", schema = "dbo", catalog = "Haerms")
public class ClazzEntity {
    private int classId;
    private String name;
    private int grade;
    private int departmentId;
    private Integer classSize;

    @Id
    @Column(name = "ClassId", nullable = false)
    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 12)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Grade", nullable = false)
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
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
    @Column(name = "ClassSize", nullable = true)
    public Integer getClassSize() {
        return classSize;
    }

    public void setClassSize(Integer classSize) {
        this.classSize = classSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClazzEntity that = (ClazzEntity) o;
        return classId == that.classId &&
                grade == that.grade &&
                departmentId == that.departmentId &&
                Objects.equals(name, that.name) &&
                Objects.equals(classSize, that.classSize);
    }

    @Override
    public int hashCode() {

        return Objects.hash(classId, name, grade, departmentId, classSize);
    }
}
