package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListSubnetBandwidthsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidths")

    private List<SubnetBandwidthDetail> bandwidths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListSubnetBandwidthsResponse withBandwidths(List<SubnetBandwidthDetail> bandwidths) {
        this.bandwidths = bandwidths;
        return this;
    }

    public ListSubnetBandwidthsResponse addBandwidthsItem(SubnetBandwidthDetail bandwidthsItem) {
        if (this.bandwidths == null) {
            this.bandwidths = new ArrayList<>();
        }
        this.bandwidths.add(bandwidthsItem);
        return this;
    }

    public ListSubnetBandwidthsResponse withBandwidths(Consumer<List<SubnetBandwidthDetail>> bandwidthsSetter) {
        if (this.bandwidths == null) {
            this.bandwidths = new ArrayList<>();
        }
        bandwidthsSetter.accept(this.bandwidths);
        return this;
    }

    /**
     * 云办公带宽信息。
     * @return bandwidths
     */
    public List<SubnetBandwidthDetail> getBandwidths() {
        return bandwidths;
    }

    public void setBandwidths(List<SubnetBandwidthDetail> bandwidths) {
        this.bandwidths = bandwidths;
    }

    public ListSubnetBandwidthsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubnetBandwidthsResponse that = (ListSubnetBandwidthsResponse) obj;
        return Objects.equals(this.bandwidths, that.bandwidths) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidths, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubnetBandwidthsResponse {\n");
        sb.append("    bandwidths: ").append(toIndentedString(bandwidths)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
