package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GpuInfo
 */
public class GpuInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_version")

    private String driverVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private String capacity;

    public GpuInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * GPU卡名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GpuInfo withDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
        return this;
    }

    /**
     * GPU卡驱动版本
     * @return driverVersion
     */
    public String getDriverVersion() {
        return driverVersion;
    }

    public void setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
    }

    public GpuInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * GPU卡类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GpuInfo withCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * GPU卡容量
     * @return capacity
     */
    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GpuInfo that = (GpuInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.driverVersion, that.driverVersion)
            && Objects.equals(this.type, that.type) && Objects.equals(this.capacity, that.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driverVersion, type, capacity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GpuInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    driverVersion: ").append(toIndentedString(driverVersion)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
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
