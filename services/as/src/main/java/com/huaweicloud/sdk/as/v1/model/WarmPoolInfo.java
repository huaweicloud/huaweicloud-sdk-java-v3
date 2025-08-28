package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WarmPoolInfo
 */
public class WarmPoolInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_capacity")

    private Integer minCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_capacity")

    private Integer maxCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_init_wait_time")

    private Integer instanceInitWaitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public WarmPoolInfo withMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * 暖池最小容量
     * @return minCapacity
     */
    public Integer getMinCapacity() {
        return minCapacity;
    }

    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    public WarmPoolInfo withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    /**
     * 暖池最大容量
     * @return maxCapacity
     */
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public WarmPoolInfo withInstanceInitWaitTime(Integer instanceInitWaitTime) {
        this.instanceInitWaitTime = instanceInitWaitTime;
        return this;
    }

    /**
     * 实例初始化等待时间
     * @return instanceInitWaitTime
     */
    public Integer getInstanceInitWaitTime() {
        return instanceInitWaitTime;
    }

    public void setInstanceInitWaitTime(Integer instanceInitWaitTime) {
        this.instanceInitWaitTime = instanceInitWaitTime;
    }

    public WarmPoolInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 暖池状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WarmPoolInfo that = (WarmPoolInfo) obj;
        return Objects.equals(this.minCapacity, that.minCapacity) && Objects.equals(this.maxCapacity, that.maxCapacity)
            && Objects.equals(this.instanceInitWaitTime, that.instanceInitWaitTime)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minCapacity, maxCapacity, instanceInitWaitTime, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WarmPoolInfo {\n");
        sb.append("    minCapacity: ").append(toIndentedString(minCapacity)).append("\n");
        sb.append("    maxCapacity: ").append(toIndentedString(maxCapacity)).append("\n");
        sb.append("    instanceInitWaitTime: ").append(toIndentedString(instanceInitWaitTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
