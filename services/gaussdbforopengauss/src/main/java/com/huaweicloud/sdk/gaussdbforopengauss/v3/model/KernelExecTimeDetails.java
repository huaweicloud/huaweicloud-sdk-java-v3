package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 内核耗时详细信息
 */
public class KernelExecTimeDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_time")

    private Long executionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_time")

    private Long otherTime;

    public KernelExecTimeDetails withExecutionTime(Long executionTime) {
        this.executionTime = executionTime;
        return this;
    }

    /**
     * **参数解释**: 执行器内执行时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return executionTime
     */
    public Long getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Long executionTime) {
        this.executionTime = executionTime;
    }

    public KernelExecTimeDetails withOtherTime(Long otherTime) {
        this.otherTime = otherTime;
        return this;
    }

    /**
     * **参数解释**: 执行器内执行时间（单位：微秒）。 **取值范围**: 不涉及。
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
        KernelExecTimeDetails that = (KernelExecTimeDetails) obj;
        return Objects.equals(this.executionTime, that.executionTime) && Objects.equals(this.otherTime, that.otherTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionTime, otherTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KernelExecTimeDetails {\n");
        sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
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
