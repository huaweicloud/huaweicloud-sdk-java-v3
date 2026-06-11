package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 训练作业亲和要求
 */
public class RequiredAffinityResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affinity_type")

    private String affinityType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affinity_group_size")

    private Integer affinityGroupSize;

    public RequiredAffinityResp withAffinityType(String affinityType) {
        this.affinityType = affinityType;
        return this;
    }

    /**
     * **参数解释**：亲和调度策略。 **取值范围**： - cabinet：强整柜调度 - hyperinstance：超节点亲和调度
     * @return affinityType
     */
    public String getAffinityType() {
        return affinityType;
    }

    public void setAffinityType(String affinityType) {
        this.affinityType = affinityType;
    }

    public RequiredAffinityResp withAffinityGroupSize(Integer affinityGroupSize) {
        this.affinityGroupSize = affinityGroupSize;
        return this;
    }

    /**
     * **参数解释**：亲和组大小。 **取值范围**：不涉及。
     * @return affinityGroupSize
     */
    public Integer getAffinityGroupSize() {
        return affinityGroupSize;
    }

    public void setAffinityGroupSize(Integer affinityGroupSize) {
        this.affinityGroupSize = affinityGroupSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RequiredAffinityResp that = (RequiredAffinityResp) obj;
        return Objects.equals(this.affinityType, that.affinityType)
            && Objects.equals(this.affinityGroupSize, that.affinityGroupSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(affinityType, affinityGroupSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequiredAffinityResp {\n");
        sb.append("    affinityType: ").append(toIndentedString(affinityType)).append("\n");
        sb.append("    affinityGroupSize: ").append(toIndentedString(affinityGroupSize)).append("\n");
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
