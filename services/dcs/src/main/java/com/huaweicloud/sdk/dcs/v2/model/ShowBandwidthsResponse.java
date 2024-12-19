package com.huaweicloud.sdk.dcs.v2.model;

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
public class ShowBandwidthsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Integer bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_bandwidth")

    private Integer maxBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_modify")

    private Boolean allowModify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_bandwidths")

    private List<GroupBandwidthInfo> groupBandwidths = null;

    public ShowBandwidthsResponse withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 实例当前带宽(Mbit/s)。
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public ShowBandwidthsResponse withMaxBandwidth(Integer maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
        return this;
    }

    /**
     * 实例最大带宽(Mbit/s)。
     * @return maxBandwidth
     */
    public Integer getMaxBandwidth() {
        return maxBandwidth;
    }

    public void setMaxBandwidth(Integer maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public ShowBandwidthsResponse withAllowModify(Boolean allowModify) {
        this.allowModify = allowModify;
        return this;
    }

    /**
     * 是否支持调带宽。
     * @return allowModify
     */
    public Boolean getAllowModify() {
        return allowModify;
    }

    public void setAllowModify(Boolean allowModify) {
        this.allowModify = allowModify;
    }

    public ShowBandwidthsResponse withGroupBandwidths(List<GroupBandwidthInfo> groupBandwidths) {
        this.groupBandwidths = groupBandwidths;
        return this;
    }

    public ShowBandwidthsResponse addGroupBandwidthsItem(GroupBandwidthInfo groupBandwidthsItem) {
        if (this.groupBandwidths == null) {
            this.groupBandwidths = new ArrayList<>();
        }
        this.groupBandwidths.add(groupBandwidthsItem);
        return this;
    }

    public ShowBandwidthsResponse withGroupBandwidths(Consumer<List<GroupBandwidthInfo>> groupBandwidthsSetter) {
        if (this.groupBandwidths == null) {
            this.groupBandwidths = new ArrayList<>();
        }
        groupBandwidthsSetter.accept(this.groupBandwidths);
        return this;
    }

    /**
     * 分片带宽列表。
     * @return groupBandwidths
     */
    public List<GroupBandwidthInfo> getGroupBandwidths() {
        return groupBandwidths;
    }

    public void setGroupBandwidths(List<GroupBandwidthInfo> groupBandwidths) {
        this.groupBandwidths = groupBandwidths;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBandwidthsResponse that = (ShowBandwidthsResponse) obj;
        return Objects.equals(this.bandwidth, that.bandwidth) && Objects.equals(this.maxBandwidth, that.maxBandwidth)
            && Objects.equals(this.allowModify, that.allowModify)
            && Objects.equals(this.groupBandwidths, that.groupBandwidths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidth, maxBandwidth, allowModify, groupBandwidths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBandwidthsResponse {\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
        sb.append("    allowModify: ").append(toIndentedString(allowModify)).append("\n");
        sb.append("    groupBandwidths: ").append(toIndentedString(groupBandwidths)).append("\n");
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
