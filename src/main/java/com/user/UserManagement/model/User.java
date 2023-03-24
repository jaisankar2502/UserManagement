package com.user.UserManagement.model;
import com.user.UserManagement.form.UserForm;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "user")
public class User {
    public static enum Status {
        DELETED((byte) 0),
        ACTIVE((byte) 1);

        public final byte value;

        private Status(byte value) {
            this.value = value;
        }
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @Column(nullable = false)
    private String userName;

    @Column(nullable = false,unique = true)
    private String email;

    private String phone;

  private  byte status;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }



    public long getUserid() {
        return userId;
    }

    public void setUserid(long userid) {
        this.userId = userid;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User() {
    }

    public User(UserForm form) {
        this.userName= form.getName();
        this.email= form.getEmail();
        this.phone= form.getPhone();
        this.status= Status.ACTIVE.value;
        Date dt= new Date();
        this.createDate =dt;
        this.updateDate=dt;
    }
}
