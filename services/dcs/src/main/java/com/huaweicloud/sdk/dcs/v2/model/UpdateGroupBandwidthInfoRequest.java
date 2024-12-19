package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateGroupBandwidthInfoRequest
 */
public class UpdateGroupBandwidthInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_bandwidth")

    private Integer targetBandwidth;

    public UpdateGroupBandwidthInfoRequest withGroupId(String groupId) {
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

    public UpdateGroupBandwidthInfoRequest withTargetBandwidth(Integer targetBandwidth) {
        this.targetBandwidth = targetBandwidth;
        return this;
    }

    /**
     * 目标带宽（Mbit/s）。
     * @return targetBandwidth
     */
    public Integer getTargetBandwidth() {
        return targetBandwidth;
    }

    public void setTargetBandwidth(Integer targetBandwidth) {
        this.targetBandwidth = targetBandwidth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGroupBandwidthInfoRequest that = (UpdateGroupBandwidthInfoRequest) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.targetBandwidth, that.targetBandwidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, targetBandwidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGroupBandwidthInfoRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    targetBandwidth: ").append(toIndentedString(targetBandwidth)).append("\n");
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
