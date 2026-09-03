package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class UpdateSecurityPolicyControlResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled_count")

    private Integer enabledCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled_count")

    private Integer disabledCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public UpdateSecurityPolicyControlResponse withEnabledCount(Integer enabledCount) {
        this.enabledCount = enabledCount;
        return this;
    }

    /**
     * 开启安全策略管控的资源数量。
     * @return enabledCount
     */
    public Integer getEnabledCount() {
        return enabledCount;
    }

    public void setEnabledCount(Integer enabledCount) {
        this.enabledCount = enabledCount;
    }

    public UpdateSecurityPolicyControlResponse withDisabledCount(Integer disabledCount) {
        this.disabledCount = disabledCount;
        return this;
    }

    /**
     * 关闭安全策略管控的资源数量。
     * @return disabledCount
     */
    public Integer getDisabledCount() {
        return disabledCount;
    }

    public void setDisabledCount(Integer disabledCount) {
        this.disabledCount = disabledCount;
    }

    public UpdateSecurityPolicyControlResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSecurityPolicyControlResponse that = (UpdateSecurityPolicyControlResponse) obj;
        return Objects.equals(this.enabledCount, that.enabledCount)
            && Objects.equals(this.disabledCount, that.disabledCount)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabledCount, disabledCount, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecurityPolicyControlResponse {\n");
        sb.append("    enabledCount: ").append(toIndentedString(enabledCount)).append("\n");
        sb.append("    disabledCount: ").append(toIndentedString(disabledCount)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
