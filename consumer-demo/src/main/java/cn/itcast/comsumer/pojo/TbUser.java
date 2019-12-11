package cn.itcast.comsumer.pojo;

import java.util.Date;
import java.util.Objects;


/*//@Data*/
public class TbUser {

    private Long id;
    private String username;
    private String password;
    private String phone;
    private Date created;

    public TbUser() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbUser tbUser = (TbUser) o;
        return Objects.equals(id, tbUser.id) &&
                Objects.equals(username, tbUser.username) &&
                Objects.equals(password, tbUser.password) &&
                Objects.equals(phone, tbUser.phone) &&
                Objects.equals(created, tbUser.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, phone, created);
    }

}
