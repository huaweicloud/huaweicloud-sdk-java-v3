package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateProvisioningTenantResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_time")

    private BigDecimal creationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scim_endpoint")

    private String scimEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    public CreateProvisioningTenantResponse withCreationTime(BigDecimal creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 创建时间
     * @return creationTime
     */
    public BigDecimal getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(BigDecimal creationTime) {
        this.creationTime = creationTime;
    }

    public CreateProvisioningTenantResponse withScimEndpoint(String scimEndpoint) {
        this.scimEndpoint = scimEndpoint;
        return this;
    }

    /**
     * SCIM终端节点
     * @return scimEndpoint
     */
    public String getScimEndpoint() {
        return scimEndpoint;
    }

    public void setScimEndpoint(String scimEndpoint) {
        this.scimEndpoint = scimEndpoint;
    }

    public CreateProvisioningTenantResponse withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 开启自动预配后生成的全局唯一标识符（ID）
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateProvisioningTenantResponse that = (CreateProvisioningTenantResponse) obj;
        return Objects.equals(this.creationTime, that.creationTime)
            && Objects.equals(this.scimEndpoint, that.scimEndpoint) && Objects.equals(this.tenantId, that.tenantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creationTime, scimEndpoint, tenantId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProvisioningTenantResponse {\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    scimEndpoint: ").append(toIndentedString(scimEndpoint)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
