package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListRtcAbnormalEventDimensionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    @JacksonXmlProperty(localName = "dimensions")

    private List<AbnormalEventDimensionValue> dimensions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    @JacksonXmlProperty(localName = "X-request-id")

    private String xRequestId;

    public ListRtcAbnormalEventDimensionResponse withDimensions(List<AbnormalEventDimensionValue> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public ListRtcAbnormalEventDimensionResponse addDimensionsItem(AbnormalEventDimensionValue dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public ListRtcAbnormalEventDimensionResponse withDimensions(
        Consumer<List<AbnormalEventDimensionValue>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 异常体验列表
     * @return dimensions
     */
    public List<AbnormalEventDimensionValue> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<AbnormalEventDimensionValue> dimensions) {
        this.dimensions = dimensions;
    }

    public ListRtcAbnormalEventDimensionResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
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
        ListRtcAbnormalEventDimensionResponse listRtcAbnormalEventDimensionResponse =
            (ListRtcAbnormalEventDimensionResponse) o;
        return Objects.equals(this.dimensions, listRtcAbnormalEventDimensionResponse.dimensions)
            && Objects.equals(this.xRequestId, listRtcAbnormalEventDimensionResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimensions, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRtcAbnormalEventDimensionResponse {\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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
