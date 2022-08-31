package bo.ucb.edu.tallersoftware.dto;

import java.util.Date;

public class UserDto {
    private String name;
    private String email;
    private String nickname;
    private Date createDate;
    private Date updateDate;
    private Integer idTypeUser;


    public UserDto(String name, String email, String nickname, Date createDate, Date updateDate, Integer idTypeUser) {
        this.name = name;
        this.email = email;
        this.nickname = nickname;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.idTypeUser = idTypeUser;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getIdTypeUser() {
        return this.idTypeUser;
    }

    public void setIdTypeUser(Integer idTypeUser) {
        this.idTypeUser = idTypeUser;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", nickname='" + getNickname() + "'" +
            ", createDate='" + getCreateDate() + "'" +
            ", updateDate='" + getUpdateDate() + "'" +
            ", idTypeUser='" + getIdTypeUser() + "'" +
            "}";
    }

    
}
