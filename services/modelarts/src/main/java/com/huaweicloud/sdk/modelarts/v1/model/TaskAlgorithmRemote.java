package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：数据实际输出信息。 **约束限制**：不涉及。
 */
public class TaskAlgorithmRemote {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private TaskAlgorithmRemoteObs obs;

    public TaskAlgorithmRemote withObs(TaskAlgorithmRemoteObs obs) {
        this.obs = obs;
        return this;
    }

    public TaskAlgorithmRemote withObs(Consumer<TaskAlgorithmRemoteObs> obsSetter) {
        if (this.obs == null) {
            this.obs = new TaskAlgorithmRemoteObs();
            obsSetter.accept(this.obs);
        }

        return this;
    }

    /**
     * Get obs
     * @return obs
     */
    public TaskAlgorithmRemoteObs getObs() {
        return obs;
    }

    public void setObs(TaskAlgorithmRemoteObs obs) {
        this.obs = obs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskAlgorithmRemote that = (TaskAlgorithmRemote) obj;
        return Objects.equals(this.obs, that.obs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskAlgorithmRemote {\n");
        sb.append("    obs: ").append(toIndentedString(obs)).append("\n");
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
