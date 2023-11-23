package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AuthModel
 */
public class AuthModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Boolean status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name")

    private List<String> roleName = null;

    public AuthModel withStatus(Boolean status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public AuthModel withRoleName(List<String> roleName) {
        this.roleName = roleName;
        return this;
    }

    public AuthModel addRoleNameItem(String roleNameItem) {
        if (this.roleName == null) {
            this.roleName = new ArrayList<>();
        }
        this.roleName.add(roleNameItem);
        return this;
    }

    public AuthModel withRoleName(Consumer<List<String>> roleNameSetter) {
        if (this.roleName == null) {
            this.roleName = new ArrayList<>();
        }
        roleNameSetter.accept(this.roleName);
        return this;
    }

    /**
     * 角色列表
     * @return roleName
     */
    public List<String> getRoleName() {
        return roleName;
    }

    public void setRoleName(List<String> roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthModel that = (AuthModel) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.roleName, that.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, roleName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthModel {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
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
