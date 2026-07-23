package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowOpsSubscriptionApmInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private String spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_id")

    private String businessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_name")

    private String businessName;

    public ShowOpsSubscriptionApmInfoResponse withSpec(String spec) {
        this.spec = spec;
        return this;
    }

    /**
     * 规格
     * @return spec
     */
    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public ShowOpsSubscriptionApmInfoResponse withBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }

    /**
     * 应用id
     * @return businessId
     */
    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public ShowOpsSubscriptionApmInfoResponse withBusinessName(String businessName) {
        this.businessName = businessName;
        return this;
    }

    /**
     * 名称
     * @return businessName
     */
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsSubscriptionApmInfoResponse that = (ShowOpsSubscriptionApmInfoResponse) obj;
        return Objects.equals(this.spec, that.spec) && Objects.equals(this.businessId, that.businessId)
            && Objects.equals(this.businessName, that.businessName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spec, businessId, businessName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsSubscriptionApmInfoResponse {\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
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
