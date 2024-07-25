package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 动态脱敏策略算法详情
 */
public class AlgorithmDetailDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Integer start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end")

    private Integer end;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "int_target")

    private Integer intTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "string_target")

    private String stringTarget;

    public AlgorithmDetailDTO withStart(Integer start) {
        this.start = start;
        return this;
    }

    /**
     * 开始位数，该值需要大于0且小于end值。
     * minimum: 0
     * maximum: 9999
     * @return start
     */
    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public AlgorithmDetailDTO withEnd(Integer end) {
        this.end = end;
        return this;
    }

    /**
     * 结束位数，该值需要大于或等于start值。
     * minimum: 0
     * maximum: 9999
     * @return end
     */
    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public AlgorithmDetailDTO withIntTarget(Integer intTarget) {
        this.intTarget = intTarget;
        return this;
    }

    /**
     * 数值类型。
     * minimum: 0
     * maximum: 9
     * @return intTarget
     */
    public Integer getIntTarget() {
        return intTarget;
    }

    public void setIntTarget(Integer intTarget) {
        this.intTarget = intTarget;
    }

    public AlgorithmDetailDTO withStringTarget(String stringTarget) {
        this.stringTarget = stringTarget;
        return this;
    }

    /**
     * 字符串类型。可输入参数为\"*\"或者\"#\"。
     * @return stringTarget
     */
    public String getStringTarget() {
        return stringTarget;
    }

    public void setStringTarget(String stringTarget) {
        this.stringTarget = stringTarget;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlgorithmDetailDTO that = (AlgorithmDetailDTO) obj;
        return Objects.equals(this.start, that.start) && Objects.equals(this.end, that.end)
            && Objects.equals(this.intTarget, that.intTarget) && Objects.equals(this.stringTarget, that.stringTarget);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, intTarget, stringTarget);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlgorithmDetailDTO {\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    intTarget: ").append(toIndentedString(intTarget)).append("\n");
        sb.append("    stringTarget: ").append(toIndentedString(stringTarget)).append("\n");
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
