package com.huaweicloud.sdk.doczip.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAppResourceLimitResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_resource_number")

    private Integer allowedResourceNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Trace-Id")

    private String xTraceId;

    public ShowAppResourceLimitResponse withAllowedResourceNumber(Integer allowedResourceNumber) {
        this.allowedResourceNumber = allowedResourceNumber;
        return this;
    }

    /**
     * **参数解释**： 允许创建的应用数量。 **取值范围**： - 0：不支持创建。 - 大于0：允许创建的应用数量。
     * minimum: 0
     * maximum: 10000
     * @return allowedResourceNumber
     */
    public Integer getAllowedResourceNumber() {
        return allowedResourceNumber;
    }

    public void setAllowedResourceNumber(Integer allowedResourceNumber) {
        this.allowedResourceNumber = allowedResourceNumber;
    }

    public ShowAppResourceLimitResponse withXTraceId(String xTraceId) {
        this.xTraceId = xTraceId;
        return this;
    }

    /**
     * Get xTraceId
     * @return xTraceId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Trace-Id")
    public String getXTraceId() {
        return xTraceId;
    }

    public void setXTraceId(String xTraceId) {
        this.xTraceId = xTraceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAppResourceLimitResponse that = (ShowAppResourceLimitResponse) obj;
        return Objects.equals(this.allowedResourceNumber, that.allowedResourceNumber)
            && Objects.equals(this.xTraceId, that.xTraceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowedResourceNumber, xTraceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAppResourceLimitResponse {\n");
        sb.append("    allowedResourceNumber: ").append(toIndentedString(allowedResourceNumber)).append("\n");
        sb.append("    xTraceId: ").append(toIndentedString(xTraceId)).append("\n");
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
