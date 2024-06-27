package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实例节点存储信息。
 */
public class ClickHouseNodeInfoVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private String used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iops")

    private Integer iops;

    public ClickHouseNodeInfoVolume withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 实例节点存储类型。 取值范围： - SSD：超高IO - ESSD：极速型SSD
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClickHouseNodeInfoVolume withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * 实例节点存储大小。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ClickHouseNodeInfoVolume withUsed(String used) {
        this.used = used;
        return this;
    }

    /**
     * 实例节点存储使用大小。
     * @return used
     */
    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    public ClickHouseNodeInfoVolume withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * 实例节点存储IOPS大小。
     * @return iops
     */
    public Integer getIops() {
        return iops;
    }

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClickHouseNodeInfoVolume that = (ClickHouseNodeInfoVolume) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.size, that.size)
            && Objects.equals(this.used, that.used) && Objects.equals(this.iops, that.iops);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, size, used, iops);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClickHouseNodeInfoVolume {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
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
