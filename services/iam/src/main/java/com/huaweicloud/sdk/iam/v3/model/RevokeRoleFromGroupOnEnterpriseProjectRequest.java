package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class RevokeRoleFromGroupOnEnterpriseProjectRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    public RevokeRoleFromGroupOnEnterpriseProjectRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 企业项目ID。
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public RevokeRoleFromGroupOnEnterpriseProjectRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** 用户组ID。
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public RevokeRoleFromGroupOnEnterpriseProjectRequest withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /** 权限ID。
     * 
     * @return roleId */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RevokeRoleFromGroupOnEnterpriseProjectRequest revokeRoleFromGroupOnEnterpriseProjectRequest =
            (RevokeRoleFromGroupOnEnterpriseProjectRequest) o;
        return Objects.equals(this.enterpriseProjectId,
            revokeRoleFromGroupOnEnterpriseProjectRequest.enterpriseProjectId)
            && Objects.equals(this.groupId, revokeRoleFromGroupOnEnterpriseProjectRequest.groupId)
            && Objects.equals(this.roleId, revokeRoleFromGroupOnEnterpriseProjectRequest.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, groupId, roleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RevokeRoleFromGroupOnEnterpriseProjectRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
