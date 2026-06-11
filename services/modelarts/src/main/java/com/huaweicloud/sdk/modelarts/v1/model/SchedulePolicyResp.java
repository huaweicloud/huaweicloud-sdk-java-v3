package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业调度策略
 */
public class SchedulePolicyResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required_affinity")

    private RequiredAffinityResp requiredAffinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preemptible")

    private Boolean preemptible;

    public SchedulePolicyResp withRequiredAffinity(RequiredAffinityResp requiredAffinity) {
        this.requiredAffinity = requiredAffinity;
        return this;
    }

    public SchedulePolicyResp withRequiredAffinity(Consumer<RequiredAffinityResp> requiredAffinitySetter) {
        if (this.requiredAffinity == null) {
            this.requiredAffinity = new RequiredAffinityResp();
            requiredAffinitySetter.accept(this.requiredAffinity);
        }

        return this;
    }

    /**
     * Get requiredAffinity
     * @return requiredAffinity
     */
    public RequiredAffinityResp getRequiredAffinity() {
        return requiredAffinity;
    }

    public void setRequiredAffinity(RequiredAffinityResp requiredAffinity) {
        this.requiredAffinity = requiredAffinity;
    }

    public SchedulePolicyResp withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * **参数解释**：训练作业优先级。 **取值范围**：0-3
     * minimum: 0
     * maximum: 3
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public SchedulePolicyResp withPreemptible(Boolean preemptible) {
        this.preemptible = preemptible;
        return this;
    }

    /**
     * **参数解释**：是否可以被抢占。 **取值范围**： - true：可以被抢占 - false：不可以被抢占
     * @return preemptible
     */
    public Boolean getPreemptible() {
        return preemptible;
    }

    public void setPreemptible(Boolean preemptible) {
        this.preemptible = preemptible;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SchedulePolicyResp that = (SchedulePolicyResp) obj;
        return Objects.equals(this.requiredAffinity, that.requiredAffinity)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.preemptible, that.preemptible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requiredAffinity, priority, preemptible);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchedulePolicyResp {\n");
        sb.append("    requiredAffinity: ").append(toIndentedString(requiredAffinity)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    preemptible: ").append(toIndentedString(preemptible)).append("\n");
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
