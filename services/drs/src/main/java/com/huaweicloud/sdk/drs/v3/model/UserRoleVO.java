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
 * 用户的角色信息
 */
public class UserRoleVO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role")
    
    private String role;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="comment")
    
    private String comment;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_transfer")
    
    private String isTransfer;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="privileges")
    
    private String privileges;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="inherits_roles")
    
    private List<String> inheritsRoles = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="selected")
    
    private String selected;

    public UserRoleVO withRole(String role) {
        this.role = role;
        return this;
    }

    


    /**
     * 角色
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    

    public UserRoleVO withComment(String comment) {
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

    

    public UserRoleVO withIsTransfer(String isTransfer) {
        this.isTransfer = isTransfer;
        return this;
    }

    


    /**
     * 是否支持迁移。
     * @return isTransfer
     */
    public String getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(String isTransfer) {
        this.isTransfer = isTransfer;
    }

    

    public UserRoleVO withPrivileges(String privileges) {
        this.privileges = privileges;
        return this;
    }

    


    /**
     * 权限
     * @return privileges
     */
    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        this.privileges = privileges;
    }

    

    public UserRoleVO withInheritsRoles(List<String> inheritsRoles) {
        this.inheritsRoles = inheritsRoles;
        return this;
    }

    
    public UserRoleVO addInheritsRolesItem(String inheritsRolesItem) {
        if(this.inheritsRoles == null) {
            this.inheritsRoles = new ArrayList<>();
        }
        this.inheritsRoles.add(inheritsRolesItem);
        return this;
    }

    public UserRoleVO withInheritsRoles(Consumer<List<String>> inheritsRolesSetter) {
        if(this.inheritsRoles == null) {
            this.inheritsRoles = new ArrayList<>();
        }
        inheritsRolesSetter.accept(this.inheritsRoles);
        return this;
    }

    /**
     * 继承角色列表
     * @return inheritsRoles
     */
    public List<String> getInheritsRoles() {
        return inheritsRoles;
    }

    public void setInheritsRoles(List<String> inheritsRoles) {
        this.inheritsRoles = inheritsRoles;
    }

    

    public UserRoleVO withSelected(String selected) {
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
        UserRoleVO userRoleVO = (UserRoleVO) o;
        return Objects.equals(this.role, userRoleVO.role) &&
            Objects.equals(this.comment, userRoleVO.comment) &&
            Objects.equals(this.isTransfer, userRoleVO.isTransfer) &&
            Objects.equals(this.privileges, userRoleVO.privileges) &&
            Objects.equals(this.inheritsRoles, userRoleVO.inheritsRoles) &&
            Objects.equals(this.selected, userRoleVO.selected);
    }
    @Override
    public int hashCode() {
        return Objects.hash(role, comment, isTransfer, privileges, inheritsRoles, selected);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserRoleVO {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    isTransfer: ").append(toIndentedString(isTransfer)).append("\n");
        sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
        sb.append("    inheritsRoles: ").append(toIndentedString(inheritsRoles)).append("\n");
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

