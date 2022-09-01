package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RefreshTaskRequest
 */
public class RefreshTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refresh_task")

    @JacksonXmlProperty(localName = "refresh_task")

    private RefreshTaskRequestBody refreshTask;

    public RefreshTaskRequest withRefreshTask(RefreshTaskRequestBody refreshTask) {
        this.refreshTask = refreshTask;
        return this;
    }

    public RefreshTaskRequest withRefreshTask(Consumer<RefreshTaskRequestBody> refreshTaskSetter) {
        if (this.refreshTask == null) {
            this.refreshTask = new RefreshTaskRequestBody();
            refreshTaskSetter.accept(this.refreshTask);
        }

        return this;
    }

    /**
     * Get refreshTask
     * @return refreshTask
     */
    public RefreshTaskRequestBody getRefreshTask() {
        return refreshTask;
    }

    public void setRefreshTask(RefreshTaskRequestBody refreshTask) {
        this.refreshTask = refreshTask;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RefreshTaskRequest refreshTaskRequest = (RefreshTaskRequest) o;
        return Objects.equals(this.refreshTask, refreshTaskRequest.refreshTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refreshTask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RefreshTaskRequest {\n");
        sb.append("    refreshTask: ").append(toIndentedString(refreshTask)).append("\n");
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
