package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：训练作业调度策略。 **约束限制**：不涉及。
 */
public class JobUpdateRequestBodySpecSchedulePolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preemptible")

    private Boolean preemptible;

    public JobUpdateRequestBodySpecSchedulePolicy withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * **参数解释**：训练作业优先级。 **约束限制**： - 仅使用专属资源池训练时才支持设置训练作业优先级。 - 作业优先级取值为1~3，默认优先级为1，最高优先级为3。 默认用户权限可选择优先级1和2，配置了“设置作业为高优先级权限”的用户可选择优先级1~3。  **取值范围**：1-3 **默认取值**：不涉及。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public JobUpdateRequestBodySpecSchedulePolicy withPreemptible(Boolean preemptible) {
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
        JobUpdateRequestBodySpecSchedulePolicy that = (JobUpdateRequestBodySpecSchedulePolicy) obj;
        return Objects.equals(this.priority, that.priority) && Objects.equals(this.preemptible, that.preemptible);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority, preemptible);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobUpdateRequestBodySpecSchedulePolicy {\n");
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
