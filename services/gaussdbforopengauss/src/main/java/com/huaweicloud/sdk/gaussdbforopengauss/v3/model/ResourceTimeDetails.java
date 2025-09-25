package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 资源耗时详细信息
 */
public class ResourceTimeDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_time")

    private Long cpuTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_io_time")

    private Long dataIoTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_time")

    private Long otherTime;

    public ResourceTimeDetails withCpuTime(Long cpuTime) {
        this.cpuTime = cpuTime;
        return this;
    }

    /**
     * **参数解释**: CPU时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return cpuTime
     */
    public Long getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(Long cpuTime) {
        this.cpuTime = cpuTime;
    }

    public ResourceTimeDetails withDataIoTime(Long dataIoTime) {
        this.dataIoTime = dataIoTime;
        return this;
    }

    /**
     * **参数解释**: IO上的时间花费（单位：微秒）。 **取值范围**: 不涉及。
     * @return dataIoTime
     */
    public Long getDataIoTime() {
        return dataIoTime;
    }

    public void setDataIoTime(Long dataIoTime) {
        this.dataIoTime = dataIoTime;
    }

    public ResourceTimeDetails withOtherTime(Long otherTime) {
        this.otherTime = otherTime;
        return this;
    }

    /**
     * **参数解释**: 其余耗时（单位：微秒）。 **取值范围**: 不涉及。
     * @return otherTime
     */
    public Long getOtherTime() {
        return otherTime;
    }

    public void setOtherTime(Long otherTime) {
        this.otherTime = otherTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceTimeDetails that = (ResourceTimeDetails) obj;
        return Objects.equals(this.cpuTime, that.cpuTime) && Objects.equals(this.dataIoTime, that.dataIoTime)
            && Objects.equals(this.otherTime, that.otherTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuTime, dataIoTime, otherTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceTimeDetails {\n");
        sb.append("    cpuTime: ").append(toIndentedString(cpuTime)).append("\n");
        sb.append("    dataIoTime: ").append(toIndentedString(dataIoTime)).append("\n");
        sb.append("    otherTime: ").append(toIndentedString(otherTime)).append("\n");
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
