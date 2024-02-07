package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListInternetBandwidthLimitsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_bandwidth_limits")

    private List<ListInternetBandwidthLimits> internetBandwidthLimits = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListInternetBandwidthLimitsResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 本次请求的编号
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListInternetBandwidthLimitsResponse withInternetBandwidthLimits(
        List<ListInternetBandwidthLimits> internetBandwidthLimits) {
        this.internetBandwidthLimits = internetBandwidthLimits;
        return this;
    }

    public ListInternetBandwidthLimitsResponse addInternetBandwidthLimitsItem(
        ListInternetBandwidthLimits internetBandwidthLimitsItem) {
        if (this.internetBandwidthLimits == null) {
            this.internetBandwidthLimits = new ArrayList<>();
        }
        this.internetBandwidthLimits.add(internetBandwidthLimitsItem);
        return this;
    }

    public ListInternetBandwidthLimitsResponse withInternetBandwidthLimits(
        Consumer<List<ListInternetBandwidthLimits>> internetBandwidthLimitsSetter) {
        if (this.internetBandwidthLimits == null) {
            this.internetBandwidthLimits = new ArrayList<>();
        }
        internetBandwidthLimitsSetter.accept(this.internetBandwidthLimits);
        return this;
    }

    /**
     * 全域公网带宽限制列表
     * @return internetBandwidthLimits
     */
    public List<ListInternetBandwidthLimits> getInternetBandwidthLimits() {
        return internetBandwidthLimits;
    }

    public void setInternetBandwidthLimits(List<ListInternetBandwidthLimits> internetBandwidthLimits) {
        this.internetBandwidthLimits = internetBandwidthLimits;
    }

    public ListInternetBandwidthLimitsResponse withXRequestId(String xRequestId) {
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
        ListInternetBandwidthLimitsResponse that = (ListInternetBandwidthLimitsResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.internetBandwidthLimits, that.internetBandwidthLimits)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, internetBandwidthLimits, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInternetBandwidthLimitsResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    internetBandwidthLimits: ").append(toIndentedString(internetBandwidthLimits)).append("\n");
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
