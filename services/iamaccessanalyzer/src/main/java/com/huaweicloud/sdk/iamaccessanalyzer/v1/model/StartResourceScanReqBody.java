package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StartResourceScanReqBody
 */
public class StartResourceScanReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_owner_account")

    private String resourceOwnerAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_project_id")

    private String resourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_urn")

    private String resourceUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finding_type")

    private FindingType findingType;

    public StartResourceScanReqBody withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源的唯一标识符。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public StartResourceScanReqBody withResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }

    /**
     * 拥有资源的账号ID。
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public StartResourceScanReqBody withResourceProjectId(String resourceProjectId) {
        this.resourceProjectId = resourceProjectId;
        return this;
    }

    /**
     * 资源所属的项目标识符
     * @return resourceProjectId
     */
    public String getResourceProjectId() {
        return resourceProjectId;
    }

    public void setResourceProjectId(String resourceProjectId) {
        this.resourceProjectId = resourceProjectId;
    }

    public StartResourceScanReqBody withResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
        return this;
    }

    /**
     * 资源的唯一资源标识符。
     * @return resourceUrn
     */
    public String getResourceUrn() {
        return resourceUrn;
    }

    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }

    public StartResourceScanReqBody withFindingType(FindingType findingType) {
        this.findingType = findingType;
        return this;
    }

    /**
     * Get findingType
     * @return findingType
     */
    public FindingType getFindingType() {
        return findingType;
    }

    public void setFindingType(FindingType findingType) {
        this.findingType = findingType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartResourceScanReqBody that = (StartResourceScanReqBody) obj;
        return Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceOwnerAccount, that.resourceOwnerAccount)
            && Objects.equals(this.resourceProjectId, that.resourceProjectId)
            && Objects.equals(this.resourceUrn, that.resourceUrn) && Objects.equals(this.findingType, that.findingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceOwnerAccount, resourceProjectId, resourceUrn, findingType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartResourceScanReqBody {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceOwnerAccount: ").append(toIndentedString(resourceOwnerAccount)).append("\n");
        sb.append("    resourceProjectId: ").append(toIndentedString(resourceProjectId)).append("\n");
        sb.append("    resourceUrn: ").append(toIndentedString(resourceUrn)).append("\n");
        sb.append("    findingType: ").append(toIndentedString(findingType)).append("\n");
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
