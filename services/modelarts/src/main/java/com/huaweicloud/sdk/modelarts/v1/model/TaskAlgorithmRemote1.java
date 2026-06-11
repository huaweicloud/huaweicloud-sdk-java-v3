package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：数据实际输出信息。 **约束限制**：不涉及。
 */
public class TaskAlgorithmRemote1 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs")

    private TaskAlgorithmRemote1Obs obs;

    public TaskAlgorithmRemote1 withObs(TaskAlgorithmRemote1Obs obs) {
        this.obs = obs;
        return this;
    }

    public TaskAlgorithmRemote1 withObs(Consumer<TaskAlgorithmRemote1Obs> obsSetter) {
        if (this.obs == null) {
            this.obs = new TaskAlgorithmRemote1Obs();
            obsSetter.accept(this.obs);
        }

        return this;
    }

    /**
     * Get obs
     * @return obs
     */
    public TaskAlgorithmRemote1Obs getObs() {
        return obs;
    }

    public void setObs(TaskAlgorithmRemote1Obs obs) {
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
        TaskAlgorithmRemote1 that = (TaskAlgorithmRemote1) obj;
        return Objects.equals(this.obs, that.obs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskAlgorithmRemote1 {\n");
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
