package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreatePreheatingTasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preheating_task")

    private String preheatingTask;

    public CreatePreheatingTasksResponse withPreheatingTask(String preheatingTask) {
        this.preheatingTask = preheatingTask;
        return this;
    }

    /**
     * 任务ID
     * @return preheatingTask
     */
    public String getPreheatingTask() {
        return preheatingTask;
    }

    public void setPreheatingTask(String preheatingTask) {
        this.preheatingTask = preheatingTask;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePreheatingTasksResponse that = (CreatePreheatingTasksResponse) obj;
        return Objects.equals(this.preheatingTask, that.preheatingTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preheatingTask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePreheatingTasksResponse {\n");
        sb.append("    preheatingTask: ").append(toIndentedString(preheatingTask)).append("\n");
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
