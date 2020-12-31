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
 * 迁移用户响应体
 */
public class QueryUserDetailResp  {



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
    @JsonProperty(value="roles")
    
    private List<String> roles = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="selected")
    
    private Boolean selected;

    public QueryUserDetailResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 用户账户id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryUserDetailResp withAccount(String account) {
        this.account = account;
        return this;
    }

    


    /**
     * 账户。
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public QueryUserDetailResp withComment(String comment) {
        this.comment = comment;
        return this;
    }

    


    /**
     * 说明。
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public QueryUserDetailResp withIsTransfer(Boolean isTransfer) {
        this.isTransfer = isTransfer;
        return this;
    }

    


    /**
     * 是否迁移
     * @return isTransfer
     */
    public Boolean getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(Boolean isTransfer) {
        this.isTransfer = isTransfer;
    }

    public QueryUserDetailResp withPrivileges(List<String> privileges) {
        this.privileges = privileges;
        return this;
    }

    
    public QueryUserDetailResp addPrivilegesItem(String privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    public QueryUserDetailResp withPrivileges(Consumer<List<String>> privilegesSetter) {
        if(this.privileges == null ){
            this.privileges = new ArrayList<>();
        }
        privilegesSetter.accept(this.privileges);
        return this;
    }

    /**
     * 权限
     * @return privileges
     */
    public List<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<String> privileges) {
        this.privileges = privileges;
    }

    public QueryUserDetailResp withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 密码。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public QueryUserDetailResp withRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    
    public QueryUserDetailResp addRolesItem(String rolesItem) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public QueryUserDetailResp withRoles(Consumer<List<String>> rolesSetter) {
        if(this.roles == null ){
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * 拥有的角色
     * @return roles
     */
    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public QueryUserDetailResp withSelected(Boolean selected) {
        this.selected = selected;
        return this;
    }

    


    /**
     * 是否选择。
     * @return selected
     */
    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
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
        QueryUserDetailResp queryUserDetailResp = (QueryUserDetailResp) o;
        return Objects.equals(this.id, queryUserDetailResp.id) &&
            Objects.equals(this.account, queryUserDetailResp.account) &&
            Objects.equals(this.comment, queryUserDetailResp.comment) &&
            Objects.equals(this.isTransfer, queryUserDetailResp.isTransfer) &&
            Objects.equals(this.privileges, queryUserDetailResp.privileges) &&
            Objects.equals(this.password, queryUserDetailResp.password) &&
            Objects.equals(this.roles, queryUserDetailResp.roles) &&
            Objects.equals(this.selected, queryUserDetailResp.selected);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, account, comment, isTransfer, privileges, password, roles, selected);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryUserDetailResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    isTransfer: ").append(toIndentedString(isTransfer)).append("\n");
        sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

