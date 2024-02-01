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
public class DisassociateGlobalConnectionBandwidthInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gcbandwidths")

    private List<DisassociateGlobalConnectionBandwidthInstanceResponseInfo> gcbandwidths = null;

    public DisassociateGlobalConnectionBandwidthInstanceResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public DisassociateGlobalConnectionBandwidthInstanceResponse withGcbandwidths(
        List<DisassociateGlobalConnectionBandwidthInstanceResponseInfo> gcbandwidths) {
        this.gcbandwidths = gcbandwidths;
        return this;
    }

    public DisassociateGlobalConnectionBandwidthInstanceResponse addGcbandwidthsItem(
        DisassociateGlobalConnectionBandwidthInstanceResponseInfo gcbandwidthsItem) {
        if (this.gcbandwidths == null) {
            this.gcbandwidths = new ArrayList<>();
        }
        this.gcbandwidths.add(gcbandwidthsItem);
        return this;
    }

    public DisassociateGlobalConnectionBandwidthInstanceResponse withGcbandwidths(
        Consumer<List<DisassociateGlobalConnectionBandwidthInstanceResponseInfo>> gcbandwidthsSetter) {
        if (this.gcbandwidths == null) {
            this.gcbandwidths = new ArrayList<>();
        }
        gcbandwidthsSetter.accept(this.gcbandwidths);
        return this;
    }

    /**
     * 全域互联带宽解绑实例响应详情。
     * @return gcbandwidths
     */
    public List<DisassociateGlobalConnectionBandwidthInstanceResponseInfo> getGcbandwidths() {
        return gcbandwidths;
    }

    public void setGcbandwidths(List<DisassociateGlobalConnectionBandwidthInstanceResponseInfo> gcbandwidths) {
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
        DisassociateGlobalConnectionBandwidthInstanceResponse that =
            (DisassociateGlobalConnectionBandwidthInstanceResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.gcbandwidths, that.gcbandwidths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, gcbandwidths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateGlobalConnectionBandwidthInstanceResponse {\n");
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
