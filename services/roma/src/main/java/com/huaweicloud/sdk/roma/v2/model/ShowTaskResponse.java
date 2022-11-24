package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task")

    private TaskBasicRsp task;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_detail")

    private String taskDetail;

    public ShowTaskResponse withTask(TaskBasicRsp task) {
        this.task = task;
        return this;
    }

    public ShowTaskResponse withTask(Consumer<TaskBasicRsp> taskSetter) {
        if (this.task == null) {
            this.task = new TaskBasicRsp();
            taskSetter.accept(this.task);
        }

        return this;
    }

    /**
     * Get task
     * @return task
     */
    public TaskBasicRsp getTask() {
        return task;
    }

    public void setTask(TaskBasicRsp task) {
        this.task = task;
    }

    public ShowTaskResponse withTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
        return this;
    }

    /**
     * 参数类型为string，参数结构参照附录中“数据集成参数说明>RawFormDataResponse”章节
     * @return taskDetail
     */
    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTaskResponse showTaskResponse = (ShowTaskResponse) o;
        return Objects.equals(this.task, showTaskResponse.task)
            && Objects.equals(this.taskDetail, showTaskResponse.taskDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, taskDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskResponse {\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    taskDetail: ").append(toIndentedString(taskDetail)).append("\n");
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
