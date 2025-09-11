package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SystemInfo
 */
public class SystemInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_use")

    private Double cpuUse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_use")

    private Double memUse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    public SystemInfo withCpuUse(Double cpuUse) {
        this.cpuUse = cpuUse;
        return this;
    }

    /**
     * CPU使用量
     * @return cpuUse
     */
    public Double getCpuUse() {
        return cpuUse;
    }

    public void setCpuUse(Double cpuUse) {
        this.cpuUse = cpuUse;
    }

    public SystemInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 记录ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SystemInfo withMemUse(Double memUse) {
        this.memUse = memUse;
        return this;
    }

    /**
     * 内存使用量
     * @return memUse
     */
    public Double getMemUse() {
        return memUse;
    }

    public void setMemUse(Double memUse) {
        this.memUse = memUse;
    }

    public SystemInfo withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 记录时间
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SystemInfo that = (SystemInfo) obj;
        return Objects.equals(this.cpuUse, that.cpuUse) && Objects.equals(this.id, that.id)
            && Objects.equals(this.memUse, that.memUse) && Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuUse, id, memUse, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemInfo {\n");
        sb.append("    cpuUse: ").append(toIndentedString(cpuUse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    memUse: ").append(toIndentedString(memUse)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
