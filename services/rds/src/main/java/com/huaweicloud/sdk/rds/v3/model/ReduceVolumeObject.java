package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实例磁盘缩容时必填。
 */
public class ReduceVolumeObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_delay")

    private Boolean isDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iops")

    private Integer iops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "throughput")

    private Integer throughput;

    public ReduceVolumeObject withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 缩容后实例磁盘的目标大小。每次缩容至少缩小10GB；目标大小必须为10的整数倍。 为确保实例的正常使用，根据当前磁盘的使用量情况存在磁盘容量下限，当此参数小于磁盘容量下限时，缩容会下发失败，此时请适当调大此参数。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ReduceVolumeObject withIsDelay(Boolean isDelay) {
        this.isDelay = isDelay;
        return this;
    }

    /**
     * 是否定时变更。 - true，为定时在运维时间窗做变更。 - false，为立即变更，默认该方式。
     * @return isDelay
     */
    public Boolean getIsDelay() {
        return isDelay;
    }

    public void setIsDelay(Boolean isDelay) {
        this.isDelay = isDelay;
    }

    public ReduceVolumeObject withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * 该参数只有磁盘类型为Flexible SSD（GPSSD2）和极速型SSDV2（ESSD2）的磁盘必填。 对于Flexible SSD类型的磁盘，IOPS值配置的范围为3000~128000，具体可配置值受磁盘大小限制，需要小于等于500*磁盘容量。 对于极速型SSDV2类型的磁盘，IOPS值配置的范围为100~256000，具体可配置值受磁盘大小限制，需要小于等于1000*磁盘容量。
     * @return iops
     */
    public Integer getIops() {
        return iops;
    }

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    public ReduceVolumeObject withThroughput(Integer throughput) {
        this.throughput = throughput;
        return this;
    }

    /**
     * 该参数只有磁盘类型为Flexible SSD（GPSSD2）的磁盘必填。 对于Flexible SSD类型的磁盘，throughput值配置的范围为125~1000 MiB/s，具体可配置值受IOPS大小限制，需要小于等于IOPS/4。
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
        ReduceVolumeObject that = (ReduceVolumeObject) obj;
        return Objects.equals(this.size, that.size) && Objects.equals(this.isDelay, that.isDelay)
            && Objects.equals(this.iops, that.iops) && Objects.equals(this.throughput, that.throughput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, isDelay, iops, throughput);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReduceVolumeObject {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    isDelay: ").append(toIndentedString(isDelay)).append("\n");
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
