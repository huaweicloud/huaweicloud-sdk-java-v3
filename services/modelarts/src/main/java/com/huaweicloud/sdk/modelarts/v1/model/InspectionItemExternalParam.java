package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 巡检项扩展参数。
 */
public class InspectionItemExternalParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stress_count")

    private Integer stressCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stress_time")

    private Long stressTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_size")

    private Integer groupSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_divide")

    private Boolean isDivide;

    public InspectionItemExternalParam withStressCount(Integer stressCount) {
        this.stressCount = stressCount;
        return this;
    }

    /**
     * item_type取值为DEEP_AI_CORE时生效，表示Ai Core压测项的压测轮次
     * @return stressCount
     */
    public Integer getStressCount() {
        return stressCount;
    }

    public void setStressCount(Integer stressCount) {
        this.stressCount = stressCount;
    }

    public InspectionItemExternalParam withStressTime(Long stressTime) {
        this.stressTime = stressTime;
        return this;
    }

    /**
     * item_type取值为DEEP_HBM时生效，表示HBM压测项的秒级压测时长
     * minimum: 60
     * maximum: 604800
     * @return stressTime
     */
    public Long getStressTime() {
        return stressTime;
    }

    public void setStressTime(Long stressTime) {
        this.stressTime = stressTime;
    }

    public InspectionItemExternalParam withGroupSize(Integer groupSize) {
        this.groupSize = groupSize;
        return this;
    }

    /**
     * is_divide取值为true时生效，表示分组多机HCCL测试时每组大小
     * minimum: 2
     * @return groupSize
     */
    public Integer getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(Integer groupSize) {
        this.groupSize = groupSize;
    }

    public InspectionItemExternalParam withIsDivide(Boolean isDivide) {
        this.isDivide = isDivide;
        return this;
    }

    /**
     * 是否开启分组多机HCCL测试
     * @return isDivide
     */
    public Boolean getIsDivide() {
        return isDivide;
    }

    public void setIsDivide(Boolean isDivide) {
        this.isDivide = isDivide;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InspectionItemExternalParam that = (InspectionItemExternalParam) obj;
        return Objects.equals(this.stressCount, that.stressCount) && Objects.equals(this.stressTime, that.stressTime)
            && Objects.equals(this.groupSize, that.groupSize) && Objects.equals(this.isDivide, that.isDivide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stressCount, stressTime, groupSize, isDivide);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InspectionItemExternalParam {\n");
        sb.append("    stressCount: ").append(toIndentedString(stressCount)).append("\n");
        sb.append("    stressTime: ").append(toIndentedString(stressTime)).append("\n");
        sb.append("    groupSize: ").append(toIndentedString(groupSize)).append("\n");
        sb.append("    isDivide: ").append(toIndentedString(isDivide)).append("\n");
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
