package com.huaweicloud.sdk.evs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 变更云硬盘类型
 */
public class RetypeVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_type")

    private String newType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iops")

    private Integer iops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "throughput")

    private Integer throughput;

    public RetypeVolume withNewType(String newType) {
        this.newType = newType;
        return this;
    }

    /**
     * 变更至指定的云硬盘类型
     * @return newType
     */
    public String getNewType() {
        return newType;
    }

    public void setNewType(String newType) {
        this.newType = newType;
    }

    public RetypeVolume withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * 云硬盘iops大小。
     * @return iops
     */
    public Integer getIops() {
        return iops;
    }

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    public RetypeVolume withThroughput(Integer throughput) {
        this.throughput = throughput;
        return this;
    }

    /**
     * 云硬盘的吞吐量大小。
     * @return throughput
     */
    public Integer getThroughput() {
        return throughput;
    }

    public void setThroughput(Integer throughput) {
        this.throughput = throughput;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetypeVolume that = (RetypeVolume) obj;
        return Objects.equals(this.newType, that.newType) && Objects.equals(this.iops, that.iops)
            && Objects.equals(this.throughput, that.throughput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newType, iops, throughput);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetypeVolume {\n");
        sb.append("    newType: ").append(toIndentedString(newType)).append("\n");
        sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
        sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
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
