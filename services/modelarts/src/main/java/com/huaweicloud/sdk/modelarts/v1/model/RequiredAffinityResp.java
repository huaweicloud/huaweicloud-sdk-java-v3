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
    @JsonProperty(value = "job_level")

    private String jobLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affinity_group_size")

    private Integer affinityGroupSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affinity_group_level")

    private String affinityGroupLevel;

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

    public RequiredAffinityResp withJobLevel(String jobLevel) {
        this.jobLevel = jobLevel;
        return this;
    }

    /**
     * **参数解释**：作业整体的网络拓扑约束。 **约束限制**：affinity_type为networkTopology时有效，系统会将作业的所有task调度至不高于job_level层的节点组中。 用户向超节点资源池投递训练作业，如果未设置作业整体的网络拓扑约束，系统会默认赋值为cluster。 **取值范围**： - cluster：资源池级 - hyperinstanceGroup: 超节点级  **默认取值**：默认值cluster。
     * @return jobLevel
     */
    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel;
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

    public RequiredAffinityResp withAffinityGroupLevel(String affinityGroupLevel) {
        this.affinityGroupLevel = affinityGroupLevel;
        return this;
    }

    /**
     * **参数解释**：亲和组的网络拓扑约束。 **约束限制**：affinity_type为networkTopology时有效，系统会将affinity_group_size个task组成的亲和组调度至不高于affinity_group_level层的节点组中。 用户向超节点资源池投递训练作业，如果未设置亲和组的网络拓扑约束，系统会默认赋值为hyperinstanceGroup。 **取值范围**： - hyperinstance：超节点级 - slice: 柜级  **默认取值**：默认值hyperinstanceGroup。
     * @return affinityGroupLevel
     */
    public String getAffinityGroupLevel() {
        return affinityGroupLevel;
    }

    public void setAffinityGroupLevel(String affinityGroupLevel) {
        this.affinityGroupLevel = affinityGroupLevel;
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
        return Objects.equals(this.affinityType, that.affinityType) && Objects.equals(this.jobLevel, that.jobLevel)
            && Objects.equals(this.affinityGroupSize, that.affinityGroupSize)
            && Objects.equals(this.affinityGroupLevel, that.affinityGroupLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(affinityType, jobLevel, affinityGroupSize, affinityGroupLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequiredAffinityResp {\n");
        sb.append("    affinityType: ").append(toIndentedString(affinityType)).append("\n");
        sb.append("    jobLevel: ").append(toIndentedString(jobLevel)).append("\n");
        sb.append("    affinityGroupSize: ").append(toIndentedString(affinityGroupSize)).append("\n");
        sb.append("    affinityGroupLevel: ").append(toIndentedString(affinityGroupLevel)).append("\n");
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
