package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 执行异步命令响应
 */
public class InstanceAsyncCommandsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmd_jobs")

    private List<CmdJob> cmdJobs = null;

    public InstanceAsyncCommandsInfo withTaskId(String taskId) {
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

    public InstanceAsyncCommandsInfo withCmdJobs(List<CmdJob> cmdJobs) {
        this.cmdJobs = cmdJobs;
        return this;
    }

    public InstanceAsyncCommandsInfo addCmdJobsItem(CmdJob cmdJobsItem) {
        if (this.cmdJobs == null) {
            this.cmdJobs = new ArrayList<>();
        }
        this.cmdJobs.add(cmdJobsItem);
        return this;
    }

    public InstanceAsyncCommandsInfo withCmdJobs(Consumer<List<CmdJob>> cmdJobsSetter) {
        if (this.cmdJobs == null) {
            this.cmdJobs = new ArrayList<>();
        }
        cmdJobsSetter.accept(this.cmdJobs);
        return this;
    }

    /**
     * 响应任务列表
     * @return cmdJobs
     */
    public List<CmdJob> getCmdJobs() {
        return cmdJobs;
    }

    public void setCmdJobs(List<CmdJob> cmdJobs) {
        this.cmdJobs = cmdJobs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceAsyncCommandsInfo that = (InstanceAsyncCommandsInfo) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.cmdJobs, that.cmdJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, cmdJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceAsyncCommandsInfo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    cmdJobs: ").append(toIndentedString(cmdJobs)).append("\n");
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
