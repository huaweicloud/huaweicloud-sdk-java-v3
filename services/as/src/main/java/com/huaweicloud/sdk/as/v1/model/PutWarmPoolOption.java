package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PutWarmPoolOption
 */
public class PutWarmPoolOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_capacity")

    private Integer minCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_capacity")

    private Integer maxCapacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_init_wait_time")

    private Integer instanceInitWaitTime;

    public PutWarmPoolOption withMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * 暖池最小容量，暖池最小与最大容量必须同时填写或不填写。暖池最小容量和最大容量填写时必须相等
     * @return minCapacity
     */
    public Integer getMinCapacity() {
        return minCapacity;
    }

    public void setMinCapacity(Integer minCapacity) {
        this.minCapacity = minCapacity;
    }

    public PutWarmPoolOption withMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    /**
     * 暖池最大容量，暖池最小与最大容量必须同时填写或不填写。暖池最小容量和最大容量填写时必须相等
     * @return maxCapacity
     */
    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public PutWarmPoolOption withInstanceInitWaitTime(Integer instanceInitWaitTime) {
        this.instanceInitWaitTime = instanceInitWaitTime;
        return this;
    }

    /**
     * 实例初始化等待时间，单位：秒
     * @return instanceInitWaitTime
     */
    public Integer getInstanceInitWaitTime() {
        return instanceInitWaitTime;
    }

    public void setInstanceInitWaitTime(Integer instanceInitWaitTime) {
        this.instanceInitWaitTime = instanceInitWaitTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PutWarmPoolOption that = (PutWarmPoolOption) obj;
        return Objects.equals(this.minCapacity, that.minCapacity) && Objects.equals(this.maxCapacity, that.maxCapacity)
            && Objects.equals(this.instanceInitWaitTime, that.instanceInitWaitTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minCapacity, maxCapacity, instanceInitWaitTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutWarmPoolOption {\n");
        sb.append("    minCapacity: ").append(toIndentedString(minCapacity)).append("\n");
        sb.append("    maxCapacity: ").append(toIndentedString(maxCapacity)).append("\n");
        sb.append("    instanceInitWaitTime: ").append(toIndentedString(instanceInitWaitTime)).append("\n");
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
