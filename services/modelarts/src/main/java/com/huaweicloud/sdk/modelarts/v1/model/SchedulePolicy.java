package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业调度策略
 */
public class SchedulePolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required_affinity")

    private RequiredAffinity requiredAffinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preferred_affinity")

    private PreferredAffinity preferredAffinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preemptible")

    private Boolean preemptible;

    public SchedulePolicy withRequiredAffinity(RequiredAffinity requiredAffinity) {
        this.requiredAffinity = requiredAffinity;
        return this;
    }

    public SchedulePolicy withRequiredAffinity(Consumer<RequiredAffinity> requiredAffinitySetter) {
        if (this.requiredAffinity == null) {
            this.requiredAffinity = new RequiredAffinity();
            requiredAffinitySetter.accept(this.requiredAffinity);
        }

        return this;
    }

    /**
     * Get requiredAffinity
     * @return requiredAffinity
     */
    public RequiredAffinity getRequiredAffinity() {
        return requiredAffinity;
    }

    public void setRequiredAffinity(RequiredAffinity requiredAffinity) {
        this.requiredAffinity = requiredAffinity;
    }

    public SchedulePolicy withPreferredAffinity(PreferredAffinity preferredAffinity) {
        this.preferredAffinity = preferredAffinity;
        return this;
    }

    public SchedulePolicy withPreferredAffinity(Consumer<PreferredAffinity> preferredAffinitySetter) {
        if (this.preferredAffinity == null) {
            this.preferredAffinity = new PreferredAffinity();
            preferredAffinitySetter.accept(this.preferredAffinity);
        }

        return this;
    }

    /**
     * Get preferredAffinity
     * @return preferredAffinity
     */
    public PreferredAffinity getPreferredAffinity() {
        return preferredAffinity;
    }

    public void setPreferredAffinity(PreferredAffinity preferredAffinity) {
        this.preferredAffinity = preferredAffinity;
    }

    public SchedulePolicy withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * **参数解释**：训练作业优先级。 **约束限制**： - 仅使用专属资源池训练时才支持设置训练作业优先级。 - 作业优先级取值为1~3，默认优先级为1，最高优先级为3。 默认用户权限可选择优先级1和2，配置了“设置作业为高优先级权限”的用户可选择优先级1~3。  **取值范围**：0-3 **默认取值**：不涉及。
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

    public SchedulePolicy withPreemptible(Boolean preemptible) {
        this.preemptible = preemptible;
        return this;
    }

    /**
     * **参数解释**：是否可以被抢占。 **约束限制**：不涉及。 **取值范围**： - true：可以被抢占 - false：不可以被抢占  **默认取值**：不涉及。
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
        SchedulePolicy that = (SchedulePolicy) obj;
        return Objects.equals(this.requiredAffinity, that.requiredAffinity)
            && Objects.equals(this.preferredAffinity, that.preferredAffinity)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.preemptible, that.preemptible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requiredAffinity, preferredAffinity, priority, preemptible);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchedulePolicy {\n");
        sb.append("    requiredAffinity: ").append(toIndentedString(requiredAffinity)).append("\n");
        sb.append("    preferredAffinity: ").append(toIndentedString(preferredAffinity)).append("\n");
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
