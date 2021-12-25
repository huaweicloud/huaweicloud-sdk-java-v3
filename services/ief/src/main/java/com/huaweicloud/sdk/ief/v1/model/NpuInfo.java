package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** NpuInfo */
public class NpuInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "capacity")

    private String capacity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_version")

    private String driverVersion;

    public NpuInfo withName(String name) {
        this.name = name;
        return this;
    }

    /** NPU名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NpuInfo withType(String type) {
        this.type = type;
        return this;
    }

    /** NPU类型
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NpuInfo withCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    /** NPU memory大小
     * 
     * @return capacity */
    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public NpuInfo withDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
        return this;
    }

    /** NPU驱动版本
     * 
     * @return driverVersion */
    public String getDriverVersion() {
        return driverVersion;
    }

    public void setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NpuInfo npuInfo = (NpuInfo) o;
        return Objects.equals(this.name, npuInfo.name) && Objects.equals(this.type, npuInfo.type)
            && Objects.equals(this.capacity, npuInfo.capacity)
            && Objects.equals(this.driverVersion, npuInfo.driverVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, capacity, driverVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NpuInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    driverVersion: ").append(toIndentedString(driverVersion)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
