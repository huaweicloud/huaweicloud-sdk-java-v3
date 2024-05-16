package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FE节点存储规格。
 */
public class StarRocksCreateRequestFeVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_type")

    private String ioType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity_in_gb")

    private Integer capacityInGb;

    public StarRocksCreateRequestFeVolume withIoType(String ioType) {
        this.ioType = ioType;
        return this;
    }

    /**
     * 磁盘类型。通过查询HTAP引擎资源返回消息获取。
     * @return ioType
     */
    public String getIoType() {
        return ioType;
    }

    public void setIoType(String ioType) {
        this.ioType = ioType;
    }

    public StarRocksCreateRequestFeVolume withCapacityInGb(Integer capacityInGb) {
        this.capacityInGb = capacityInGb;
        return this;
    }

    /**
     * 磁盘容量，单位GB 增长的步长：10GB。
     * minimum: 50
     * maximum: 1000
     * @return capacityInGb
     */
    public Integer getCapacityInGb() {
        return capacityInGb;
    }

    public void setCapacityInGb(Integer capacityInGb) {
        this.capacityInGb = capacityInGb;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StarRocksCreateRequestFeVolume that = (StarRocksCreateRequestFeVolume) obj;
        return Objects.equals(this.ioType, that.ioType) && Objects.equals(this.capacityInGb, that.capacityInGb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ioType, capacityInGb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StarRocksCreateRequestFeVolume {\n");
        sb.append("    ioType: ").append(toIndentedString(ioType)).append("\n");
        sb.append("    capacityInGb: ").append(toIndentedString(capacityInGb)).append("\n");
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
