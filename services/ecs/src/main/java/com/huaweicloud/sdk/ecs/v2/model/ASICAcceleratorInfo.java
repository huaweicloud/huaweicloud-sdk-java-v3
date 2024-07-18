package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ASICAcceleratorInfo
 */
public class ASICAcceleratorInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_mb")

    private Integer memoryMb;

    public ASICAcceleratorInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * ASIC设备名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ASICAcceleratorInfo withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * ASIC设备数量。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ASICAcceleratorInfo withMemoryMb(Integer memoryMb) {
        this.memoryMb = memoryMb;
        return this;
    }

    /**
     * ASIC设备的内存，单位为MB。
     * @return memoryMb
     */
    public Integer getMemoryMb() {
        return memoryMb;
    }

    public void setMemoryMb(Integer memoryMb) {
        this.memoryMb = memoryMb;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ASICAcceleratorInfo that = (ASICAcceleratorInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.count, that.count)
            && Objects.equals(this.memoryMb, that.memoryMb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count, memoryMb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ASICAcceleratorInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    memoryMb: ").append(toIndentedString(memoryMb)).append("\n");
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
