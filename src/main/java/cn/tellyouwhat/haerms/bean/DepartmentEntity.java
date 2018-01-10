package cn.tellyouwhat.haerms.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Department", schema = "dbo", catalog = "Haerms")
public class DepartmentEntity {
    private int departmentId;
    private String chinesaeName;
    private String englishName;
    private String introduction;
    private String image;

    @Id
    @Column(name = "DepartmentId", nullable = false)
    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Basic
    @Column(name = "ChinesaeName", nullable = false, length = 30)
    public String getChinesaeName() {
        return chinesaeName;
    }

    public void setChinesaeName(String chinesaeName) {
        this.chinesaeName = chinesaeName;
    }

    @Basic
    @Column(name = "EnglishName", nullable = false, length = 50)
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @Basic
    @Column(name = "Introduction", nullable = true, length = 500)
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Basic
    @Column(name = "Image", nullable = true, length = 100)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepartmentEntity that = (DepartmentEntity) o;
        return departmentId == that.departmentId &&
                Objects.equals(chinesaeName, that.chinesaeName) &&
                Objects.equals(englishName, that.englishName) &&
                Objects.equals(introduction, that.introduction) &&
                Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {

        return Objects.hash(departmentId, chinesaeName, englishName, introduction, image);
    }
}
