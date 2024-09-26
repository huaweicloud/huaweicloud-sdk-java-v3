package com.huaweicloud.sdk.cc.v3.model;

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
public class AssociateGlobalConnectionBandwidthInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gcbandwidths")

    private List<AssociateGlobalConnectionBandwidthInstanceResponseInfo> gcbandwidths = null;

    public AssociateGlobalConnectionBandwidthInstanceResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public AssociateGlobalConnectionBandwidthInstanceResponse withGcbandwidths(
        List<AssociateGlobalConnectionBandwidthInstanceResponseInfo> gcbandwidths) {
        this.gcbandwidths = gcbandwidths;
        return this;
    }

    public AssociateGlobalConnectionBandwidthInstanceResponse addGcbandwidthsItem(
        AssociateGlobalConnectionBandwidthInstanceResponseInfo gcbandwidthsItem) {
        if (this.gcbandwidths == null) {
            this.gcbandwidths = new ArrayList<>();
        }
        this.gcbandwidths.add(gcbandwidthsItem);
        return this;
    }

    public AssociateGlobalConnectionBandwidthInstanceResponse withGcbandwidths(
        Consumer<List<AssociateGlobalConnectionBandwidthInstanceResponseInfo>> gcbandwidthsSetter) {
        if (this.gcbandwidths == null) {
            this.gcbandwidths = new ArrayList<>();
        }
        gcbandwidthsSetter.accept(this.gcbandwidths);
        return this;
    }

    /**
     * 全域互联带宽绑定实例响应详情。
     * @return gcbandwidths
     */
    public List<AssociateGlobalConnectionBandwidthInstanceResponseInfo> getGcbandwidths() {
        return gcbandwidths;
    }

    public void setGcbandwidths(List<AssociateGlobalConnectionBandwidthInstanceResponseInfo> gcbandwidths) {
        this.gcbandwidths = gcbandwidths;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateGlobalConnectionBandwidthInstanceResponse that =
            (AssociateGlobalConnectionBandwidthInstanceResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.gcbandwidths, that.gcbandwidths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, gcbandwidths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateGlobalConnectionBandwidthInstanceResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    gcbandwidths: ").append(toIndentedString(gcbandwidths)).append("\n");
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
