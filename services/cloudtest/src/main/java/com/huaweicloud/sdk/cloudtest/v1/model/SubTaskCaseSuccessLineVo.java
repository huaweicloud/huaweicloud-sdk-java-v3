package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SubTaskCaseSuccessLineVo
 */
public class SubTaskCaseSuccessLineVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private List<SubTaskCaseSuccessLineDetailVo> detail = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    public SubTaskCaseSuccessLineVo withDetail(List<SubTaskCaseSuccessLineDetailVo> detail) {
        this.detail = detail;
        return this;
    }

    public SubTaskCaseSuccessLineVo addDetailItem(SubTaskCaseSuccessLineDetailVo detailItem) {
        if (this.detail == null) {
            this.detail = new ArrayList<>();
        }
        this.detail.add(detailItem);
        return this;
    }

    public SubTaskCaseSuccessLineVo withDetail(Consumer<List<SubTaskCaseSuccessLineDetailVo>> detailSetter) {
        if (this.detail == null) {
            this.detail = new ArrayList<>();
        }
        detailSetter.accept(this.detail);
        return this;
    }

    /**
     * 用例成功率统计信息
     * @return detail
     */
    public List<SubTaskCaseSuccessLineDetailVo> getDetail() {
        return detail;
    }

    public void setDetail(List<SubTaskCaseSuccessLineDetailVo> detail) {
        this.detail = detail;
    }

    public SubTaskCaseSuccessLineVo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public SubTaskCaseSuccessLineVo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubTaskCaseSuccessLineVo that = (SubTaskCaseSuccessLineVo) obj;
        return Objects.equals(this.detail, that.detail) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.taskName, that.taskName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detail, taskId, taskName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubTaskCaseSuccessLineVo {\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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
