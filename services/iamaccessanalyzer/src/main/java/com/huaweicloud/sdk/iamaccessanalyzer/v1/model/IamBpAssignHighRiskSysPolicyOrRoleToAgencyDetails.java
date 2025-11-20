package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 为IAM委托授予高风险系统权限或角色分析详细结果。
 */
public class IamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_id")

    private String agencyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_name")

    private String permissionName;

    public IamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails withAgencyId(String agencyId) {
        this.agencyId = agencyId;
        return this;
    }

    /**
     * 委托的唯一标识符（ID）。
     * @return agencyId
     */
    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public IamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails withPermissionName(String permissionName) {
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
        IamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails that =
            (IamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails) obj;
        return Objects.equals(this.agencyId, that.agencyId) && Objects.equals(this.permissionName, that.permissionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyId, permissionName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IamBpAssignHighRiskSysPolicyOrRoleToAgencyDetails {\n");
        sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
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
