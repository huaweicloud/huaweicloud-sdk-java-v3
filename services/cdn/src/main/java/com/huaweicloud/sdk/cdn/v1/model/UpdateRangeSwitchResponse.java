package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateRangeSwitchResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_range")

    private OriginRangeBody originRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public UpdateRangeSwitchResponse withOriginRange(OriginRangeBody originRange) {
        this.originRange = originRange;
        return this;
    }

    public UpdateRangeSwitchResponse withOriginRange(Consumer<OriginRangeBody> originRangeSetter) {
        if (this.originRange == null) {
            this.originRange = new OriginRangeBody();
            originRangeSetter.accept(this.originRange);
        }

        return this;
    }

    /**
     * Get originRange
     * @return originRange
     */
    public OriginRangeBody getOriginRange() {
        return originRange;
    }

    public void setOriginRange(OriginRangeBody originRange) {
        this.originRange = originRange;
    }

    public UpdateRangeSwitchResponse withXRequestId(String xRequestId) {
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
        UpdateRangeSwitchResponse that = (UpdateRangeSwitchResponse) obj;
        return Objects.equals(this.originRange, that.originRange) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originRange, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRangeSwitchResponse {\n");
        sb.append("    originRange: ").append(toIndentedString(originRange)).append("\n");
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
