package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 网络设备规格
 */
public class NetworkDeviceSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "power")

    private Integer power;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private Integer unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "performance_type")

    private String performanceType;

    public NetworkDeviceSpec withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 网络设备规格ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NetworkDeviceSpec withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 网络设备规格名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NetworkDeviceSpec withPower(Integer power) {
        this.power = power;
        return this;
    }

    /**
     * 设备功率。单位：w
     * @return power
     */
    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public NetworkDeviceSpec withUnit(Integer unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 设备高度。U位数。
     * @return unit
     */
    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public NetworkDeviceSpec withPerformanceType(String performanceType) {
        this.performanceType = performanceType;
        return this;
    }

    /**
     * 用途
     * @return performanceType
     */
    public String getPerformanceType() {
        return performanceType;
    }

    public void setPerformanceType(String performanceType) {
        this.performanceType = performanceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkDeviceSpec that = (NetworkDeviceSpec) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.power, that.power) && Objects.equals(this.unit, that.unit)
            && Objects.equals(this.performanceType, that.performanceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, power, unit, performanceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkDeviceSpec {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    power: ").append(toIndentedString(power)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    performanceType: ").append(toIndentedString(performanceType)).append("\n");
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
