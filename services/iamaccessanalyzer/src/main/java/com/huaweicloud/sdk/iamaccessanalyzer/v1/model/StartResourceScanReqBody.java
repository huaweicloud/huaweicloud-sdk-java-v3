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
    @JsonProperty(value = "resource_urn")

    private String resourceUrn;

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
     * 拥有资源的账户ID。
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return resourceOwnerAccount;
    }

    public void setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
    }

    public StartResourceScanReqBody withResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
        return this;
    }

    /**
     * 访问分析的唯一资源标识。
     * @return resourceUrn
     */
    public String getResourceUrn() {
        return resourceUrn;
    }

    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
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
            && Objects.equals(this.resourceUrn, that.resourceUrn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceOwnerAccount, resourceUrn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartResourceScanReqBody {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceOwnerAccount: ").append(toIndentedString(resourceOwnerAccount)).append("\n");
        sb.append("    resourceUrn: ").append(toIndentedString(resourceUrn)).append("\n");
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
