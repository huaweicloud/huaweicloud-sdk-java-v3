package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListRtcHistoryUsageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private List<RtcHistoryUsage> usage = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListRtcHistoryUsageResponse withUsage(List<RtcHistoryUsage> usage) {
        this.usage = usage;
        return this;
    }

    public ListRtcHistoryUsageResponse addUsageItem(RtcHistoryUsage usageItem) {
        if (this.usage == null) {
            this.usage = new ArrayList<>();
        }
        this.usage.add(usageItem);
        return this;
    }

    public ListRtcHistoryUsageResponse withUsage(Consumer<List<RtcHistoryUsage>> usageSetter) {
        if (this.usage == null) {
            this.usage = new ArrayList<>();
        }
        usageSetter.accept(this.usage);
        return this;
    }

    /** 时间戳及相应时间的指标数值列表
     * 
     * @return usage */
    public List<RtcHistoryUsage> getUsage() {
        return usage;
    }

    public void setUsage(List<RtcHistoryUsage> usage) {
        this.usage = usage;
    }

    public ListRtcHistoryUsageResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /** Get xRequestId
     * 
     * @return xRequestId */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRtcHistoryUsageResponse listRtcHistoryUsageResponse = (ListRtcHistoryUsageResponse) o;
        return Objects.equals(this.usage, listRtcHistoryUsageResponse.usage)
            && Objects.equals(this.xRequestId, listRtcHistoryUsageResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usage, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRtcHistoryUsageResponse {\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
