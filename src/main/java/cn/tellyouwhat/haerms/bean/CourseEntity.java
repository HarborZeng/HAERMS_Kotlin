package cn.tellyouwhat.haerms.bean;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Course", schema = "dbo", catalog = "Haerms")
public class CourseEntity {
    private int courseId;
    private String name;
    private String shortIntroduction;
    private String description;
    private Date beginDate;
    private Date endDate;
    private int teacherId;
    private int classId;
    private String schoolYear;
    private String semester;
    private String introImage;
    private Integer theoryClassHour;
    private Integer experimentClassHour;

    @Id
    @Column(name = "CourseId", nullable = false)
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
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
    @Column(name = "ShortIntroduction", nullable = true, length = 500)
    public String getShortIntroduction() {
        return shortIntroduction;
    }

    public void setShortIntroduction(String shortIntroduction) {
        this.shortIntroduction = shortIntroduction;
    }

    @Basic
    @Column(name = "Description", nullable = true, length = 2147483647)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "BeginDate", nullable = true)
    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    @Basic
    @Column(name = "EndDate", nullable = true)
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "TeacherId", nullable = false)
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Basic
    @Column(name = "ClassId", nullable = false)
    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Basic
    @Column(name = "SchoolYear", nullable = true, length = 9)
    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    @Basic
    @Column(name = "Semester", nullable = true, length = 1)
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Basic
    @Column(name = "IntroImage", nullable = true, length = 100)
    public String getIntroImage() {
        return introImage;
    }

    public void setIntroImage(String introImage) {
        this.introImage = introImage;
    }

    @Basic
    @Column(name = "TheoryClassHour", nullable = true)
    public Integer getTheoryClassHour() {
        return theoryClassHour;
    }

    public void setTheoryClassHour(Integer theoryClassHour) {
        this.theoryClassHour = theoryClassHour;
    }

    @Basic
    @Column(name = "ExperimentClassHour", nullable = true)
    public Integer getExperimentClassHour() {
        return experimentClassHour;
    }

    public void setExperimentClassHour(Integer experimentClassHour) {
        this.experimentClassHour = experimentClassHour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseEntity that = (CourseEntity) o;
        return courseId == that.courseId &&
                teacherId == that.teacherId &&
                classId == that.classId &&
                Objects.equals(name, that.name) &&
                Objects.equals(shortIntroduction, that.shortIntroduction) &&
                Objects.equals(description, that.description) &&
                Objects.equals(beginDate, that.beginDate) &&
                Objects.equals(endDate, that.endDate) &&
                Objects.equals(schoolYear, that.schoolYear) &&
                Objects.equals(semester, that.semester) &&
                Objects.equals(introImage, that.introImage) &&
                Objects.equals(theoryClassHour, that.theoryClassHour) &&
                Objects.equals(experimentClassHour, that.experimentClassHour);
    }

    @Override
    public int hashCode() {

        return Objects.hash(courseId, name, shortIntroduction, description, beginDate, endDate, teacherId, classId, schoolYear, semester, introImage, theoryClassHour, experimentClassHour);
    }
}
