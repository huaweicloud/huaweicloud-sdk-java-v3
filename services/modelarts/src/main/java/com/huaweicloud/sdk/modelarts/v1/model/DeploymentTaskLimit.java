package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DeploymentTaskLimit
 */
public class DeploymentTaskLimit {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_concurrent_task")

    private Integer maxConcurrentTask;

    public DeploymentTaskLimit withMaxConcurrentTask(Integer maxConcurrentTask) {
        this.maxConcurrentTask = maxConcurrentTask;
        return this;
    }

    /**
     * **参数解释：** 最大并发任务数 **约束限制：** 不填保留原有值。 **取值范围：** [1, 100]。 **默认取值：** 不涉及
     * @return maxConcurrentTask
     */
    public Integer getMaxConcurrentTask() {
        return maxConcurrentTask;
    }

    public void setMaxConcurrentTask(Integer maxConcurrentTask) {
        this.maxConcurrentTask = maxConcurrentTask;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeploymentTaskLimit that = (DeploymentTaskLimit) obj;
        return Objects.equals(this.maxConcurrentTask, that.maxConcurrentTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxConcurrentTask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentTaskLimit {\n");
        sb.append("    maxConcurrentTask: ").append(toIndentedString(maxConcurrentTask)).append("\n");
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
