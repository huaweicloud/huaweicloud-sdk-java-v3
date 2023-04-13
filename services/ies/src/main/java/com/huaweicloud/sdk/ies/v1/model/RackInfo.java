package com.huaweicloud.sdk.ies.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 机柜信息
 */
public class RackInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "power")

    private Integer power;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_lock")

    private Boolean hasLock;

    public RackInfo withPower(Integer power) {
        this.power = power;
        return this;
    }

    /**
     * 机柜功率，单位：w
     * @return power
     */
    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public RackInfo withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * 机柜尺寸，如100\\*200\\*200，单位：cm
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public RackInfo withHasLock(Boolean hasLock) {
        this.hasLock = hasLock;
        return this;
    }

    /**
     * 是否有机柜锁。
     * @return hasLock
     */
    public Boolean getHasLock() {
        return hasLock;
    }

    public void setHasLock(Boolean hasLock) {
        this.hasLock = hasLock;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RackInfo rackInfo = (RackInfo) o;
        return Objects.equals(this.power, rackInfo.power) && Objects.equals(this.size, rackInfo.size)
            && Objects.equals(this.hasLock, rackInfo.hasLock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, size, hasLock);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RackInfo {\n");
        sb.append("    power: ").append(toIndentedString(power)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    hasLock: ").append(toIndentedString(hasLock)).append("\n");
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
