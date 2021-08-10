package com.huaweicloud.sdk.moderation.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class RunTaskSumbitResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private TaskSumbitResponseResult result;

    public RunTaskSumbitResponse withResult(TaskSumbitResponseResult result) {
        this.result = result;
        return this;
    }

    public RunTaskSumbitResponse withResult(Consumer<TaskSumbitResponseResult> resultSetter) {
        if (this.result == null) {
            this.result = new TaskSumbitResponseResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /** Get result
     * 
     * @return result */
    public TaskSumbitResponseResult getResult() {
        return result;
    }

    public void setResult(TaskSumbitResponseResult result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunTaskSumbitResponse runTaskSumbitResponse = (RunTaskSumbitResponse) o;
        return Objects.equals(this.result, runTaskSumbitResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunTaskSumbitResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
