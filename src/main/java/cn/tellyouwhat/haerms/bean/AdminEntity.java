package cn.tellyouwhat.haerms.bean;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Admin", schema = "dbo", catalog = "Haerms")
public class AdminEntity {
    private int adminId;
    private String name;
    private String jobNumber;
    private String password;

    @Id
    @Column(name = "AdminId", nullable = false)
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
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
    @Column(name = "JobNumber", nullable = false, length = 15)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminEntity that = (AdminEntity) o;
        return adminId == that.adminId &&
                Objects.equals(name, that.name) &&
                Objects.equals(jobNumber, that.jobNumber) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(adminId, name, jobNumber, password);
    }
}
