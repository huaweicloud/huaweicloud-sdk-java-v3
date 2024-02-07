package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDetachInternetBandwidthsGlobalEipSegmentRequestBody
 */
public class BatchDetachInternetBandwidthsGlobalEipSegmentRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_eip_segments")

    private List<DetachInternetBandwidth> globalEipSegments = null;

    public BatchDetachInternetBandwidthsGlobalEipSegmentRequestBody withGlobalEipSegments(
        List<DetachInternetBandwidth> globalEipSegments) {
        this.globalEipSegments = globalEipSegments;
        return this;
    }

    public BatchDetachInternetBandwidthsGlobalEipSegmentRequestBody addGlobalEipSegmentsItem(
        DetachInternetBandwidth globalEipSegmentsItem) {
        if (this.globalEipSegments == null) {
            this.globalEipSegments = new ArrayList<>();
        }
        this.globalEipSegments.add(globalEipSegmentsItem);
        return this;
    }

    public BatchDetachInternetBandwidthsGlobalEipSegmentRequestBody withGlobalEipSegments(
        Consumer<List<DetachInternetBandwidth>> globalEipSegmentsSetter) {
        if (this.globalEipSegments == null) {
            this.globalEipSegments = new ArrayList<>();
        }
        globalEipSegmentsSetter.accept(this.globalEipSegments);
        return this;
    }

    /**
     * 请求列表
     * @return globalEipSegments
     */
    public List<DetachInternetBandwidth> getGlobalEipSegments() {
        return globalEipSegments;
    }

    public void setGlobalEipSegments(List<DetachInternetBandwidth> globalEipSegments) {
        this.globalEipSegments = globalEipSegments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDetachInternetBandwidthsGlobalEipSegmentRequestBody that =
            (BatchDetachInternetBandwidthsGlobalEipSegmentRequestBody) obj;
        return Objects.equals(this.globalEipSegments, that.globalEipSegments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalEipSegments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDetachInternetBandwidthsGlobalEipSegmentRequestBody {\n");
        sb.append("    globalEipSegments: ").append(toIndentedString(globalEipSegments)).append("\n");
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
