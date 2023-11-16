package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ExecuteUnblockIpRequestBody
 */
public class ExecuteUnblockIpRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocking_time")

    private Long blockingTime;

    public ExecuteUnblockIpRequestBody withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * ip地址
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ExecuteUnblockIpRequestBody withBlockingTime(Long blockingTime) {
        this.blockingTime = blockingTime;
        return this;
    }

    /**
     * 用于查询IP的封堵时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return blockingTime
     */
    public Long getBlockingTime() {
        return blockingTime;
    }

    public void setBlockingTime(Long blockingTime) {
        this.blockingTime = blockingTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteUnblockIpRequestBody that = (ExecuteUnblockIpRequestBody) obj;
        return Objects.equals(this.ip, that.ip) && Objects.equals(this.blockingTime, that.blockingTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, blockingTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteUnblockIpRequestBody {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    blockingTime: ").append(toIndentedString(blockingTime)).append("\n");
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
