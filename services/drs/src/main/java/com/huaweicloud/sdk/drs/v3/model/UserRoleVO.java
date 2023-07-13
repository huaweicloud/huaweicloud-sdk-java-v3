package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用户的角色信息
 */
public class UserRoleVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_transfer")

    private Boolean isTransfer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileges")

    private String privileges;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inherits_roles")

    private List<String> inheritsRoles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selected")

    private Boolean selected;

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

    public UserRoleVO withIsTransfer(Boolean isTransfer) {
        this.isTransfer = isTransfer;
        return this;
    }

    /**
     * 是否支持迁移。
     * @return isTransfer
     */
    public Boolean getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(Boolean isTransfer) {
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
        if (this.inheritsRoles == null) {
            this.inheritsRoles = new ArrayList<>();
        }
        this.inheritsRoles.add(inheritsRolesItem);
        return this;
    }

    public UserRoleVO withInheritsRoles(Consumer<List<String>> inheritsRolesSetter) {
        if (this.inheritsRoles == null) {
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

    public UserRoleVO withSelected(Boolean selected) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserRoleVO that = (UserRoleVO) obj;
        return Objects.equals(this.role, that.role) && Objects.equals(this.comment, that.comment)
            && Objects.equals(this.isTransfer, that.isTransfer) && Objects.equals(this.privileges, that.privileges)
            && Objects.equals(this.inheritsRoles, that.inheritsRoles) && Objects.equals(this.selected, that.selected);
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
