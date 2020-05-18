package com.huaweicloud.sdk.moderation.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.moderation.v1.model.TaskSumbitResultBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class RunTaskSumbitResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    private TaskSumbitResultBody result = null;

    public RunTaskSumbitResponse withResult(TaskSumbitResultBody result) {
        this.result = result;
        return this;
    }

    public RunTaskSumbitResponse withResult(Consumer<TaskSumbitResultBody> resultSetter) {
        if(this.result == null ){
            this.result = new TaskSumbitResultBody();
        }
        resultSetter.accept(this.result);
        return this;
    }


    /**
     * Get result
     * @return result
     */
    public TaskSumbitResultBody getResult() {
        return result;
    }

    public void setResult(TaskSumbitResultBody result) {
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

