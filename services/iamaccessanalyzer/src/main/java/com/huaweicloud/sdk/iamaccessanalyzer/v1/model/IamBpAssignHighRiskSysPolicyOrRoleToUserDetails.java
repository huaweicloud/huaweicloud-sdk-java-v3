package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 为IAM用户授予高风险系统策略或角色分析详细结果。
 */
public class IamBpAssignHighRiskSysPolicyOrRoleToUserDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_name")

    private String permissionName;

    public IamBpAssignHighRiskSysPolicyOrRoleToUserDetails withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户的唯一标识符（ID）。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public IamBpAssignHighRiskSysPolicyOrRoleToUserDetails withPermissionName(String permissionName) {
        this.permissionName = permissionName;
        return this;
    }

    /**
     * 权限名称。
     * @return permissionName
     */
    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IamBpAssignHighRiskSysPolicyOrRoleToUserDetails that = (IamBpAssignHighRiskSysPolicyOrRoleToUserDetails) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.permissionName, that.permissionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, permissionName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IamBpAssignHighRiskSysPolicyOrRoleToUserDetails {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    permissionName: ").append(toIndentedString(permissionName)).append("\n");
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
