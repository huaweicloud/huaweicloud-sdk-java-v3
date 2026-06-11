package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 执行动作策略。
 */
public class ExecutionActionPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rerun_steps")

    private List<String> rerunSteps = null;

    public ExecutionActionPolicy withRerunSteps(List<String> rerunSteps) {
        this.rerunSteps = rerunSteps;
        return this;
    }

    public ExecutionActionPolicy addRerunStepsItem(String rerunStepsItem) {
        if (this.rerunSteps == null) {
            this.rerunSteps = new ArrayList<>();
        }
        this.rerunSteps.add(rerunStepsItem);
        return this;
    }

    public ExecutionActionPolicy withRerunSteps(Consumer<List<String>> rerunStepsSetter) {
        if (this.rerunSteps == null) {
            this.rerunSteps = new ArrayList<>();
        }
        rerunStepsSetter.accept(this.rerunSteps);
        return this;
    }

    /**
     * 重跑的节点。
     * @return rerunSteps
     */
    public List<String> getRerunSteps() {
        return rerunSteps;
    }

    public void setRerunSteps(List<String> rerunSteps) {
        this.rerunSteps = rerunSteps;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecutionActionPolicy that = (ExecutionActionPolicy) obj;
        return Objects.equals(this.rerunSteps, that.rerunSteps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rerunSteps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecutionActionPolicy {\n");
        sb.append("    rerunSteps: ").append(toIndentedString(rerunSteps)).append("\n");
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
