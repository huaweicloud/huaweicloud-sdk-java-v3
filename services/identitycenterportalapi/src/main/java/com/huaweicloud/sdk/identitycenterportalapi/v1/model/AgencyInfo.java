package com.huaweicloud.sdk.identitycenterportalapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 包含委托或信任委托信息的对象
 */
public class AgencyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_set_name")

    private String permissionSetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_urn")

    private String agencyUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public AgencyInfo withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 分配给用户的账号的全局唯一标识符（ID）
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public AgencyInfo withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 分配给用户的委托或信任委托的名称
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public AgencyInfo withPermissionSetName(String permissionSetName) {
        this.permissionSetName = permissionSetName;
        return this;
    }

    /**
     * 权限集名称
     * @return permissionSetName
     */
    public String getPermissionSetName() {
        return permissionSetName;
    }

    public void setPermissionSetName(String permissionSetName) {
        this.permissionSetName = permissionSetName;
    }

    public AgencyInfo withAgencyUrn(String agencyUrn) {
        this.agencyUrn = agencyUrn;
        return this;
    }

    /**
     * 委托或信任委托的统一资源名称（URN）
     * @return agencyUrn
     */
    public String getAgencyUrn() {
        return agencyUrn;
    }

    public void setAgencyUrn(String agencyUrn) {
        this.agencyUrn = agencyUrn;
    }

    public AgencyInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgencyInfo that = (AgencyInfo) obj;
        return Objects.equals(this.accountId, that.accountId) && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.permissionSetName, that.permissionSetName)
            && Objects.equals(this.agencyUrn, that.agencyUrn) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, agencyName, permissionSetName, agencyUrn, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyInfo {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    permissionSetName: ").append(toIndentedString(permissionSetName)).append("\n");
        sb.append("    agencyUrn: ").append(toIndentedString(agencyUrn)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
