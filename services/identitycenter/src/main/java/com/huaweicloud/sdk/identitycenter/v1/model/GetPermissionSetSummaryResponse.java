package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class GetPermissionSetSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_sets")

    private Long permissionSets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_sets_quota")

    private Long permissionSetsQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_policy_count_quota")

    private Long permissionPolicyCountQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_policy_quota")

    private Long permissionPolicyQuota;

    public GetPermissionSetSummaryResponse withPermissionSets(Long permissionSets) {
        this.permissionSets = permissionSets;
        return this;
    }

    /**
     * 已创建的权限集数量
     * @return permissionSets
     */
    public Long getPermissionSets() {
        return permissionSets;
    }

    public void setPermissionSets(Long permissionSets) {
        this.permissionSets = permissionSets;
    }

    public GetPermissionSetSummaryResponse withPermissionSetsQuota(Long permissionSetsQuota) {
        this.permissionSetsQuota = permissionSetsQuota;
        return this;
    }

    /**
     * 权限集配额
     * @return permissionSetsQuota
     */
    public Long getPermissionSetsQuota() {
        return permissionSetsQuota;
    }

    public void setPermissionSetsQuota(Long permissionSetsQuota) {
        this.permissionSetsQuota = permissionSetsQuota;
    }

    public GetPermissionSetSummaryResponse withPermissionPolicyCountQuota(Long permissionPolicyCountQuota) {
        this.permissionPolicyCountQuota = permissionPolicyCountQuota;
        return this;
    }

    /**
     * 允许权限集可绑定的策略配额
     * @return permissionPolicyCountQuota
     */
    public Long getPermissionPolicyCountQuota() {
        return permissionPolicyCountQuota;
    }

    public void setPermissionPolicyCountQuota(Long permissionPolicyCountQuota) {
        this.permissionPolicyCountQuota = permissionPolicyCountQuota;
    }

    public GetPermissionSetSummaryResponse withPermissionPolicyQuota(Long permissionPolicyQuota) {
        this.permissionPolicyQuota = permissionPolicyQuota;
        return this;
    }

    /**
     * 允许权限集可绑定的身份策略配额
     * @return permissionPolicyQuota
     */
    public Long getPermissionPolicyQuota() {
        return permissionPolicyQuota;
    }

    public void setPermissionPolicyQuota(Long permissionPolicyQuota) {
        this.permissionPolicyQuota = permissionPolicyQuota;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetPermissionSetSummaryResponse that = (GetPermissionSetSummaryResponse) obj;
        return Objects.equals(this.permissionSets, that.permissionSets)
            && Objects.equals(this.permissionSetsQuota, that.permissionSetsQuota)
            && Objects.equals(this.permissionPolicyCountQuota, that.permissionPolicyCountQuota)
            && Objects.equals(this.permissionPolicyQuota, that.permissionPolicyQuota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionSets, permissionSetsQuota, permissionPolicyCountQuota, permissionPolicyQuota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPermissionSetSummaryResponse {\n");
        sb.append("    permissionSets: ").append(toIndentedString(permissionSets)).append("\n");
        sb.append("    permissionSetsQuota: ").append(toIndentedString(permissionSetsQuota)).append("\n");
        sb.append("    permissionPolicyCountQuota: ").append(toIndentedString(permissionPolicyCountQuota)).append("\n");
        sb.append("    permissionPolicyQuota: ").append(toIndentedString(permissionPolicyQuota)).append("\n");
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
