package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTestCaseScriptDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tmss_case_uri")

    private String tmssCaseUri;

    public ListTestCaseScriptDetailRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID，固定长度32位字符（字母和数字）。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListTestCaseScriptDetailRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 执行任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListTestCaseScriptDetailRequest withTmssCaseUri(String tmssCaseUri) {
        this.tmssCaseUri = tmssCaseUri;
        return this;
    }

    /**
     * TMSS用例uri
     * @return tmssCaseUri
     */
    public String getTmssCaseUri() {
        return tmssCaseUri;
    }

    public void setTmssCaseUri(String tmssCaseUri) {
        this.tmssCaseUri = tmssCaseUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTestCaseScriptDetailRequest that = (ListTestCaseScriptDetailRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.tmssCaseUri, that.tmssCaseUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, taskId, tmssCaseUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTestCaseScriptDetailRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    tmssCaseUri: ").append(toIndentedString(tmssCaseUri)).append("\n");
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
