package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 执行记录信息。
 */
public class JobBasicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor")

    private String executor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finishTime")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobResult")

    private JobResultInfo jobResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobType")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process")

    private ProcessInfo process;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskId")

    private String taskId;

    public JobBasicInfo withExecutor(String executor) {
        this.executor = executor;
        return this;
    }

    /**
     * **参数解释：** 执行人用户名。 **取值范围：** 不涉及。
     * @return executor
     */
    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public JobBasicInfo withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * **参数解释：** 执行记录的检查完成时间，使用UTC时间，格式为yyyy-MM-ddTHH:mm:ssZ，例如\"2025-11-28T06:55:41Z\"。 **取值范围：** 不涉及。
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public JobBasicInfo withJobResult(JobResultInfo jobResult) {
        this.jobResult = jobResult;
        return this;
    }

    public JobBasicInfo withJobResult(Consumer<JobResultInfo> jobResultSetter) {
        if (this.jobResult == null) {
            this.jobResult = new JobResultInfo();
            jobResultSetter.accept(this.jobResult);
        }

        return this;
    }

    /**
     * Get jobResult
     * @return jobResult
     */
    public JobResultInfo getJobResult() {
        return jobResult;
    }

    public void setJobResult(JobResultInfo jobResult) {
        this.jobResult = jobResult;
    }

    public JobBasicInfo withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * **参数解释:** 任务类型。 **取值范围:** - FULL：版本级任务。 - INC_GIT：门禁级任务。 [- INC_COMMIT：流水线指定commitId增量检查、代码检查任务设置-检查范围-版本级检查模式的最近一次提交检查。](tag:hws,hws_hk) [- INC_COMMIT：代码检查任务设置-检查范围-版本级检查模式的最近一次提交检查。](tag:hcs,hcs_sm,hcs_site,hcs_sitesm,fcs) [- INC_LAST_SUCCESS_COMMIT：流水线指定commitId以及最后一次门禁成功的commitId间的增量检查。](tag:hws,hws_hk)
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public JobBasicInfo withProcess(ProcessInfo process) {
        this.process = process;
        return this;
    }

    public JobBasicInfo withProcess(Consumer<ProcessInfo> processSetter) {
        if (this.process == null) {
            this.process = new ProcessInfo();
            processSetter.accept(this.process);
        }

        return this;
    }

    /**
     * Get process
     * @return process
     */
    public ProcessInfo getProcess() {
        return process;
    }

    public void setProcess(ProcessInfo process) {
        this.process = process;
    }

    public JobBasicInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释：**  执行记录的检查开始时间，使用UTC时间，格式为yyyy-MM-ddTHH:mm:ssZ，例如\"2025-11-28T06:55:41Z\"。 **取值范围：** 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public JobBasicInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释:** 任务执行状态。 **取值范围:** - quering：初始状态。 - running：执行中。 - success：检查成功。 - failed：检查失败。 - aborted：任务中止。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JobBasicInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释：**  任务ID，即新建检查任务接口的返回值，每个代码检查任务及其下的分支任务、通过API创建的增量任务都有唯一的任务ID。即[[查询任务列表](https://support.huaweicloud.com/api-codecheck/ShowTasksList.html)](tag:hws)[[查询任务列表](https://support.huaweicloud.com/intl/zh-cn/api-codecheck/ShowTasksList.html)](tag:hws_hk)[查询任务列表](tag:hcs,hcs_sm)接口响应中的id字段。 **取值范围：** 长度为[1~32]个字符。
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
        JobBasicInfo that = (JobBasicInfo) obj;
        return Objects.equals(this.executor, that.executor) && Objects.equals(this.finishTime, that.finishTime)
            && Objects.equals(this.jobResult, that.jobResult) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.process, that.process) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.taskId, that.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executor, finishTime, jobResult, jobType, process, startTime, status, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobBasicInfo {\n");
        sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    jobResult: ").append(toIndentedString(jobResult)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
