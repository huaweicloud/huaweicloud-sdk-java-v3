package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowProgressDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private Integer taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private ProgressDetailV2 progress;

    public ShowProgressDetailResponse withTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 任务状态,0表示检查中，1表示检查失败，2表示检查成功，3表示任务中止
     * @return taskStatus
     */
    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public ShowProgressDetailResponse withProgress(ProgressDetailV2 progress) {
        this.progress = progress;
        return this;
    }

    public ShowProgressDetailResponse withProgress(Consumer<ProgressDetailV2> progressSetter) {
        if (this.progress == null) {
            this.progress = new ProgressDetailV2();
            progressSetter.accept(this.progress);
        }

        return this;
    }

    /**
     * Get progress
     * @return progress
     */
    public ProgressDetailV2 getProgress() {
        return progress;
    }

    public void setProgress(ProgressDetailV2 progress) {
        this.progress = progress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProgressDetailResponse that = (ShowProgressDetailResponse) obj;
        return Objects.equals(this.taskStatus, that.taskStatus) && Objects.equals(this.progress, that.progress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskStatus, progress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProgressDetailResponse {\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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
