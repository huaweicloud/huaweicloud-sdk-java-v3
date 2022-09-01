package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PreheatingTaskRequest
 */
public class PreheatingTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preheating_task")

    @JacksonXmlProperty(localName = "preheating_task")

    private PreheatingTaskRequestBody preheatingTask;

    public PreheatingTaskRequest withPreheatingTask(PreheatingTaskRequestBody preheatingTask) {
        this.preheatingTask = preheatingTask;
        return this;
    }

    public PreheatingTaskRequest withPreheatingTask(Consumer<PreheatingTaskRequestBody> preheatingTaskSetter) {
        if (this.preheatingTask == null) {
            this.preheatingTask = new PreheatingTaskRequestBody();
            preheatingTaskSetter.accept(this.preheatingTask);
        }

        return this;
    }

    /**
     * Get preheatingTask
     * @return preheatingTask
     */
    public PreheatingTaskRequestBody getPreheatingTask() {
        return preheatingTask;
    }

    public void setPreheatingTask(PreheatingTaskRequestBody preheatingTask) {
        this.preheatingTask = preheatingTask;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PreheatingTaskRequest preheatingTaskRequest = (PreheatingTaskRequest) o;
        return Objects.equals(this.preheatingTask, preheatingTaskRequest.preheatingTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preheatingTask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreheatingTaskRequest {\n");
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
