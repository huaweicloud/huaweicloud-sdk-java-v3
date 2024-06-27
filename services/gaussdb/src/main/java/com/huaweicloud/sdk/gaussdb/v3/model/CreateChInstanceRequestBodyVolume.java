package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 存储规格。
 */
public class CreateChInstanceRequestBodyVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_type")

    private String ioType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity_in_gb")

    private Integer capacityInGb;

    public CreateChInstanceRequestBodyVolume withIoType(String ioType) {
        this.ioType = ioType;
        return this;
    }

    /**
     * 磁盘IO类型。 取值范围： - SSD：超高IO - ESSD：极速型SSD
     * @return ioType
     */
    public String getIoType() {
        return ioType;
    }

    public void setIoType(String ioType) {
        this.ioType = ioType;
    }

    public CreateChInstanceRequestBodyVolume withCapacityInGb(Integer capacityInGb) {
        this.capacityInGb = capacityInGb;
        return this;
    }

    /**
     * 磁盘容量。取值范围：50GB~32000GB。
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
        CreateChInstanceRequestBodyVolume that = (CreateChInstanceRequestBodyVolume) obj;
        return Objects.equals(this.ioType, that.ioType) && Objects.equals(this.capacityInGb, that.capacityInGb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ioType, capacityInGb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChInstanceRequestBodyVolume {\n");
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
