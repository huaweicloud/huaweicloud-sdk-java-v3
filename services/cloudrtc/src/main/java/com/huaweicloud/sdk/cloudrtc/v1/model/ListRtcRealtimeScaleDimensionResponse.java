package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListRtcRealtimeScaleDimensionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    private List<RealtimeScaleDimensionValue> dimensions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListRtcRealtimeScaleDimensionResponse withDimensions(List<RealtimeScaleDimensionValue> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public ListRtcRealtimeScaleDimensionResponse addDimensionsItem(RealtimeScaleDimensionValue dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public ListRtcRealtimeScaleDimensionResponse withDimensions(
        Consumer<List<RealtimeScaleDimensionValue>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /** 维度分布信息
     * 
     * @return dimensions */
    public List<RealtimeScaleDimensionValue> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<RealtimeScaleDimensionValue> dimensions) {
        this.dimensions = dimensions;
    }

    public ListRtcRealtimeScaleDimensionResponse withXRequestId(String xRequestId) {
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
        ListRtcRealtimeScaleDimensionResponse listRtcRealtimeScaleDimensionResponse =
            (ListRtcRealtimeScaleDimensionResponse) o;
        return Objects.equals(this.dimensions, listRtcRealtimeScaleDimensionResponse.dimensions)
            && Objects.equals(this.xRequestId, listRtcRealtimeScaleDimensionResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimensions, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRtcRealtimeScaleDimensionResponse {\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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
