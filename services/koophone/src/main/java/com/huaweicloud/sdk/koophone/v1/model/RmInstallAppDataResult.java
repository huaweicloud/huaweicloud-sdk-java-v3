package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RmInstallAppDataResult
 */
public class RmInstallAppDataResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmd_jobs")

    private List<CmdJob> cmdJobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    public RmInstallAppDataResult withCmdJobs(List<CmdJob> cmdJobs) {
        this.cmdJobs = cmdJobs;
        return this;
    }

    public RmInstallAppDataResult addCmdJobsItem(CmdJob cmdJobsItem) {
        if (this.cmdJobs == null) {
            this.cmdJobs = new ArrayList<>();
        }
        this.cmdJobs.add(cmdJobsItem);
        return this;
    }

    public RmInstallAppDataResult withCmdJobs(Consumer<List<CmdJob>> cmdJobsSetter) {
        if (this.cmdJobs == null) {
            this.cmdJobs = new ArrayList<>();
        }
        cmdJobsSetter.accept(this.cmdJobs);
        return this;
    }

    /**
     * Get cmdJobs
     * @return cmdJobs
     */
    public List<CmdJob> getCmdJobs() {
        return cmdJobs;
    }

    public void setCmdJobs(List<CmdJob> cmdJobs) {
        this.cmdJobs = cmdJobs;
    }

    public RmInstallAppDataResult withTaskId(String taskId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RmInstallAppDataResult that = (RmInstallAppDataResult) obj;
        return Objects.equals(this.cmdJobs, that.cmdJobs) && Objects.equals(this.taskId, that.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cmdJobs, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RmInstallAppDataResult {\n");
        sb.append("    cmdJobs: ").append(toIndentedString(cmdJobs)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
