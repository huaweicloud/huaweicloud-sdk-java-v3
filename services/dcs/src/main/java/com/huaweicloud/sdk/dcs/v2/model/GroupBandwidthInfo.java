package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GroupBandwidthInfo
 */
public class GroupBandwidthInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private Integer bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_bandwidth")

    private Integer maxBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assured_bandwidth")

    private Integer assuredBandwidth;

    public GroupBandwidthInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 分片ID。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public GroupBandwidthInfo withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间，UTC时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public GroupBandwidthInfo withBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    /**
     * 当前带宽(Mbit/s)。
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public GroupBandwidthInfo withMaxBandwidth(Integer maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
        return this;
    }

    /**
     * 最大带宽(Mbit/s)。
     * @return maxBandwidth
     */
    public Integer getMaxBandwidth() {
        return maxBandwidth;
    }

    public void setMaxBandwidth(Integer maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public GroupBandwidthInfo withAssuredBandwidth(Integer assuredBandwidth) {
        this.assuredBandwidth = assuredBandwidth;
        return this;
    }

    /**
     * 基准带宽(Mbit/s)。
     * @return assuredBandwidth
     */
    public Integer getAssuredBandwidth() {
        return assuredBandwidth;
    }

    public void setAssuredBandwidth(Integer assuredBandwidth) {
        this.assuredBandwidth = assuredBandwidth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupBandwidthInfo that = (GroupBandwidthInfo) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.bandwidth, that.bandwidth) && Objects.equals(this.maxBandwidth, that.maxBandwidth)
            && Objects.equals(this.assuredBandwidth, that.assuredBandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, updatedAt, bandwidth, maxBandwidth, assuredBandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupBandwidthInfo {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
        sb.append("    assuredBandwidth: ").append(toIndentedString(assuredBandwidth)).append("\n");
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
