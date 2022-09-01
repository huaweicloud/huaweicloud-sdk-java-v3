package com.huaweicloud.sdk.eip.v2.model;

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
public class BatchCreateSharedBandwidthsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidths")

    @JacksonXmlProperty(localName = "bandwidths")

    private List<BatchBandwidthResp> bandwidths = null;

    public BatchCreateSharedBandwidthsResponse withBandwidths(List<BatchBandwidthResp> bandwidths) {
        this.bandwidths = bandwidths;
        return this;
    }

    public BatchCreateSharedBandwidthsResponse addBandwidthsItem(BatchBandwidthResp bandwidthsItem) {
        if (this.bandwidths == null) {
            this.bandwidths = new ArrayList<>();
        }
        this.bandwidths.add(bandwidthsItem);
        return this;
    }

    public BatchCreateSharedBandwidthsResponse withBandwidths(Consumer<List<BatchBandwidthResp>> bandwidthsSetter) {
        if (this.bandwidths == null) {
            this.bandwidths = new ArrayList<>();
        }
        bandwidthsSetter.accept(this.bandwidths);
        return this;
    }

    /**
     * 批创的带宽对象的列表
     * @return bandwidths
     */
    public List<BatchBandwidthResp> getBandwidths() {
        return bandwidths;
    }

    public void setBandwidths(List<BatchBandwidthResp> bandwidths) {
        this.bandwidths = bandwidths;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCreateSharedBandwidthsResponse batchCreateSharedBandwidthsResponse =
            (BatchCreateSharedBandwidthsResponse) o;
        return Objects.equals(this.bandwidths, batchCreateSharedBandwidthsResponse.bandwidths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateSharedBandwidthsResponse {\n");
        sb.append("    bandwidths: ").append(toIndentedString(bandwidths)).append("\n");
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
