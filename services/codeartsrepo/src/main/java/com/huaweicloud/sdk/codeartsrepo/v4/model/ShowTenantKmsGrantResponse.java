package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowTenantKmsGrantResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assumed")

    private Boolean assumed;

    public ShowTenantKmsGrantResponse withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * **参数解释：** 租户id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ShowTenantKmsGrantResponse withAssumed(Boolean assumed) {
        this.assumed = assumed;
        return this;
    }

    /**
     * **参数解释：** 是否有委托和授权。
     * @return assumed
     */
    public Boolean getAssumed() {
        return assumed;
    }

    public void setAssumed(Boolean assumed) {
        this.assumed = assumed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTenantKmsGrantResponse that = (ShowTenantKmsGrantResponse) obj;
        return Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.assumed, that.assumed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId, assumed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTenantKmsGrantResponse {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    assumed: ").append(toIndentedString(assumed)).append("\n");
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
