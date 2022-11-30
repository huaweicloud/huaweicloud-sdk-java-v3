package com.huaweicloud.sdk.cph.v1.model;

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
public class ShowBandwidthDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_widths")

    private List<Bandwidth> bandWidths = null;

    public ShowBandwidthDetailResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowBandwidthDetailResponse withBandWidths(List<Bandwidth> bandWidths) {
        this.bandWidths = bandWidths;
        return this;
    }

    public ShowBandwidthDetailResponse addBandWidthsItem(Bandwidth bandWidthsItem) {
        if (this.bandWidths == null) {
            this.bandWidths = new ArrayList<>();
        }
        this.bandWidths.add(bandWidthsItem);
        return this;
    }

    public ShowBandwidthDetailResponse withBandWidths(Consumer<List<Bandwidth>> bandWidthsSetter) {
        if (this.bandWidths == null) {
            this.bandWidths = new ArrayList<>();
        }
        bandWidthsSetter.accept(this.bandWidths);
        return this;
    }

    /**
     * 带宽信息
     * @return bandWidths
     */
    public List<Bandwidth> getBandWidths() {
        return bandWidths;
    }

    public void setBandWidths(List<Bandwidth> bandWidths) {
        this.bandWidths = bandWidths;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBandwidthDetailResponse showBandwidthDetailResponse = (ShowBandwidthDetailResponse) o;
        return Objects.equals(this.requestId, showBandwidthDetailResponse.requestId)
            && Objects.equals(this.bandWidths, showBandwidthDetailResponse.bandWidths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, bandWidths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBandwidthDetailResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    bandWidths: ").append(toIndentedString(bandWidths)).append("\n");
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
