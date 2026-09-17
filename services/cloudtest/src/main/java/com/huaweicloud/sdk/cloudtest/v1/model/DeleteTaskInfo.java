package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 删除测试套件参数
 */
public class DeleteTaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_uris")

    private List<String> taskUris = null;

    public DeleteTaskInfo withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 分支/迭代id
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    public DeleteTaskInfo withTaskUris(List<String> taskUris) {
        this.taskUris = taskUris;
        return this;
    }

    public DeleteTaskInfo addTaskUrisItem(String taskUrisItem) {
        if (this.taskUris == null) {
            this.taskUris = new ArrayList<>();
        }
        this.taskUris.add(taskUrisItem);
        return this;
    }

    public DeleteTaskInfo withTaskUris(Consumer<List<String>> taskUrisSetter) {
        if (this.taskUris == null) {
            this.taskUris = new ArrayList<>();
        }
        taskUrisSetter.accept(this.taskUris);
        return this;
    }

    /**
     * 任务id数组
     * @return taskUris
     */
    public List<String> getTaskUris() {
        return taskUris;
    }

    public void setTaskUris(List<String> taskUris) {
        this.taskUris = taskUris;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteTaskInfo that = (DeleteTaskInfo) obj;
        return Objects.equals(this.versionUri, that.versionUri) && Objects.equals(this.taskUris, that.taskUris);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionUri, taskUris);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTaskInfo {\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    taskUris: ").append(toIndentedString(taskUris)).append("\n");
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
