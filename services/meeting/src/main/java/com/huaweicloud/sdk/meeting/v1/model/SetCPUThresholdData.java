package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CPU阈值设置请求体 */
public class SetCPUThresholdData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    public SetCPUThresholdData withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /** CPU阈值设定值，单位为百分比(%)。 取值范围：0 - 100。 minimum: 0 maximum: 100
     * 
     * @return cpu */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetCPUThresholdData setCPUThresholdData = (SetCPUThresholdData) o;
        return Objects.equals(this.cpu, setCPUThresholdData.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetCPUThresholdData {\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
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
