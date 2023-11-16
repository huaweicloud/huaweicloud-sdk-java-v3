package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 封堵信息
 */
public class IpStatusDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_time")

    private Long blockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unblock_time")

    private Long unblockTime;

    public IpStatusDetail withBlockTime(Long blockTime) {
        this.blockTime = blockTime;
        return this;
    }

    /**
     * 封堵时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return blockTime
     */
    public Long getBlockTime() {
        return blockTime;
    }

    public void setBlockTime(Long blockTime) {
        this.blockTime = blockTime;
    }

    public IpStatusDetail withUnblockTime(Long unblockTime) {
        this.unblockTime = unblockTime;
        return this;
    }

    /**
     * 解封时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return unblockTime
     */
    public Long getUnblockTime() {
        return unblockTime;
    }

    public void setUnblockTime(Long unblockTime) {
        this.unblockTime = unblockTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IpStatusDetail that = (IpStatusDetail) obj;
        return Objects.equals(this.blockTime, that.blockTime) && Objects.equals(this.unblockTime, that.unblockTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockTime, unblockTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IpStatusDetail {\n");
        sb.append("    blockTime: ").append(toIndentedString(blockTime)).append("\n");
        sb.append("    unblockTime: ").append(toIndentedString(unblockTime)).append("\n");
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
