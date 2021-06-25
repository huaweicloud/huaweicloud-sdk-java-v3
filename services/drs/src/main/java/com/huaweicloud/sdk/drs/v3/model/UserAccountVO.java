package com.huaweicloud.sdk.drs.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 用户信息
 */
public class UserAccountVO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="account")
    
    private String account;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="comment")
    
    private String comment;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_transfer")
    
    private Boolean isTransfer;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="privileges")
    
    private List<String> privileges = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_set_password")
    
    private Boolean isSetPassword;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roles")
    
    private List<String> roles = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="selected")
    
    private String selected;

    public UserAccountVO withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 用户账户ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public UserAccountVO withAccount(String account) {
        this.account = account;
        return this;
    }

    


    /**
     * 用户
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    

    public UserAccountVO withComment(String comment) {
        this.comment = comment;
        return this;
    }

    


    /**
     * 说明
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    

    public UserAccountVO withIsTransfer(Boolean isTransfer) {
        this.isTransfer = isTransfer;
        return this;
    }

    


    /**
     * 是否支持迁移
     * @return isTransfer
     */
    public Boolean getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(Boolean isTransfer) {
        this.isTransfer = isTransfer;
    }

    

    public UserAccountVO withPrivileges(List<String> privileges) {
        this.privileges = privileges;
        return this;
    }

    
    public UserAccountVO addPrivilegesItem(String privilegesItem) {
        if(this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    public UserAccountVO withPrivileges(Consumer<List<String>> privilegesSetter) {
        if(this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        privilegesSetter.accept(this.privileges);
        return this;
    }

    /**
     * 权限列表
     * @return privileges
     */
    public List<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<String> privileges) {
        this.privileges = privileges;
    }

    

    public UserAccountVO withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    public UserAccountVO withIsSetPassword(Boolean isSetPassword) {
        this.isSetPassword = isSetPassword;
        return this;
    }

    


    /**
     * 是否重置密码。
     * @return isSetPassword
     */
    public Boolean getIsSetPassword() {
        return isSetPassword;
    }

    public void setIsSetPassword(Boolean isSetPassword) {
        this.isSetPassword = isSetPassword;
    }

    

    public UserAccountVO withRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    
    public UserAccountVO addRolesItem(String rolesItem) {
        if(this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public UserAccountVO withRoles(Consumer<List<String>> rolesSetter) {
        if(this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * 角色
     * @return roles
     */
    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    

    public UserAccountVO withSelected(String selected) {
        this.selected = selected;
        return this;
    }

    


    /**
     * 是否选择。
     * @return selected
     */
    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserAccountVO userAccountVO = (UserAccountVO) o;
        return Objects.equals(this.id, userAccountVO.id) &&
            Objects.equals(this.account, userAccountVO.account) &&
            Objects.equals(this.comment, userAccountVO.comment) &&
            Objects.equals(this.isTransfer, userAccountVO.isTransfer) &&
            Objects.equals(this.privileges, userAccountVO.privileges) &&
            Objects.equals(this.password, userAccountVO.password) &&
            Objects.equals(this.isSetPassword, userAccountVO.isSetPassword) &&
            Objects.equals(this.roles, userAccountVO.roles) &&
            Objects.equals(this.selected, userAccountVO.selected);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, account, comment, isTransfer, privileges, password, isSetPassword, roles, selected);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserAccountVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    isTransfer: ").append(toIndentedString(isTransfer)).append("\n");
        sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    isSetPassword: ").append(toIndentedString(isSetPassword)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
        sb.append("    selected: ").append(toIndentedString(selected)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}

