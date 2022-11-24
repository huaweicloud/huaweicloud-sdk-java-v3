package com.huaweicloud.sdk.mrs.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * JobExeResult
 */
public class JobExeResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_at")
    
    
    private Long createAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_at")
    
    
    private Long updateAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_name")
    
    
    private String jobName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    
    private Long startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    
    private Long endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    
    
    private String clusterId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="jar_path")
    
    
    private String jarPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="input")
    
    
    private String input;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output")
    
    
    private String output;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_log")
    
    
    private String jobLog;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_type")
    
    
    private Integer jobType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="file_action")
    
    
    private String fileAction;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arguments")
    
    
    private String arguments;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hql")
    
    
    private String hql;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_state")
    
    
    private Integer jobState;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_final_status")
    
    
    private Integer jobFinalStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hive_script_path")
    
    
    private String hiveScriptPath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_by")
    
    
    private String createBy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="finished_step")
    
    
    private Integer finishedStep;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_main_id")
    
    
    private String jobMainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_step_id")
    
    
    private String jobStepId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="postpone_at")
    
    
    private Long postponeAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="step_name")
    
    
    private String stepName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="step_num")
    
    
    private Integer stepNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="task_num")
    
    
    private Integer taskNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_by")
    
    
    private String updateBy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spend_time")
    
    
    private Float spendTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="step_seq")
    
    
    private Integer stepSeq;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="progress")
    
    
    private String progress;

    public JobExeResult withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 作业ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public JobExeResult withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    


    /**
     * 作业创建时间，十三位时间戳。
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    

    public JobExeResult withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    


    /**
     * 作业更新时间，十三位时间戳。  
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    

    public JobExeResult withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 项目编号。获取方法，请参见[获取项目ID](https://support.huaweicloud.com/api-mrs/mrs_02_0011.html)。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    

    public JobExeResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 作业ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public JobExeResult withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    


    /**
     * 作业名称。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    

    public JobExeResult withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 作业执行开始时间，十三位时间戳。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    

    public JobExeResult withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 作业执行结束时间，十三位时间戳。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    

    public JobExeResult withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * 作业所属集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    

    public JobExeResult withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * 作业执行组ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public JobExeResult withJarPath(String jarPath) {
        this.jarPath = jarPath;
        return this;
    }

    


    /**
     * 执行程序jar包或sql文件地址。
     * @return jarPath
     */
    public String getJarPath() {
        return jarPath;
    }

    public void setJarPath(String jarPath) {
        this.jarPath = jarPath;
    }

    

    public JobExeResult withInput(String input) {
        this.input = input;
        return this;
    }

    


    /**
     * 数据输入地址。
     * @return input
     */
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    

    public JobExeResult withOutput(String output) {
        this.output = output;
        return this;
    }

    


    /**
     * 数据输出地址。
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    

    public JobExeResult withJobLog(String jobLog) {
        this.jobLog = jobLog;
        return this;
    }

    


    /**
     * 作业日志存储地址
     * @return jobLog
     */
    public String getJobLog() {
        return jobLog;
    }

    public void setJobLog(String jobLog) {
        this.jobLog = jobLog;
    }

    

    public JobExeResult withJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }

    


    /**
     * 作业类型码。  - 1：MapReduce - 2：Spark - 3：Hive Script - 4：HiveSQL（当前不支持） - 5：DistCp - 6：Spark Script - 7：Spark SQL（该接口当前不支持）
     * @return jobType
     */
    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    

    public JobExeResult withFileAction(String fileAction) {
        this.fileAction = fileAction;
        return this;
    }

    


    /**
     * 导入导出数据。
     * @return fileAction
     */
    public String getFileAction() {
        return fileAction;
    }

    public void setFileAction(String fileAction) {
        this.fileAction = fileAction;
    }

    

    public JobExeResult withArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }

    


    /**
     * 程序执行的关键参数，该参数由用户程序内的函数指定，MRS只负责参数的传入。该参数可为空。
     * @return arguments
     */
    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    

    public JobExeResult withHql(String hql) {
        this.hql = hql;
        return this;
    }

    


    /**
     * HQL脚本语句。
     * @return hql
     */
    public String getHql() {
        return hql;
    }

    public void setHql(String hql) {
        this.hql = hql;
    }

    

    public JobExeResult withJobState(Integer jobState) {
        this.jobState = jobState;
        return this;
    }

    


    /**
     * 作业状态编码：  - 1：Terminated表示已终止的作业状态 - 2：Running表示运行中的作业状态 - 3：Completed表示已完成的作业状态 - 4：Abnormal表示异常的作业状态
     * @return jobState
     */
    public Integer getJobState() {
        return jobState;
    }

    public void setJobState(Integer jobState) {
        this.jobState = jobState;
    }

    

    public JobExeResult withJobFinalStatus(Integer jobFinalStatus) {
        this.jobFinalStatus = jobFinalStatus;
        return this;
    }

    


    /**
     * 作业最终状态码。  - 0：未完成 - 1：执行错误，终止执行 - 2：执行完成并且成功 - 3：已取消
     * @return jobFinalStatus
     */
    public Integer getJobFinalStatus() {
        return jobFinalStatus;
    }

    public void setJobFinalStatus(Integer jobFinalStatus) {
        this.jobFinalStatus = jobFinalStatus;
    }

    

    public JobExeResult withHiveScriptPath(String hiveScriptPath) {
        this.hiveScriptPath = hiveScriptPath;
        return this;
    }

    


    /**
     * Hive脚本地址。
     * @return hiveScriptPath
     */
    public String getHiveScriptPath() {
        return hiveScriptPath;
    }

    public void setHiveScriptPath(String hiveScriptPath) {
        this.hiveScriptPath = hiveScriptPath;
    }

    

    public JobExeResult withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    


    /**
     * 创建作业的用户ID。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    

    public JobExeResult withFinishedStep(Integer finishedStep) {
        this.finishedStep = finishedStep;
        return this;
    }

    


    /**
     * 当前已完成的步骤数。
     * @return finishedStep
     */
    public Integer getFinishedStep() {
        return finishedStep;
    }

    public void setFinishedStep(Integer finishedStep) {
        this.finishedStep = finishedStep;
    }

    

    public JobExeResult withJobMainId(String jobMainId) {
        this.jobMainId = jobMainId;
        return this;
    }

    


    /**
     * 作业主ID。
     * @return jobMainId
     */
    public String getJobMainId() {
        return jobMainId;
    }

    public void setJobMainId(String jobMainId) {
        this.jobMainId = jobMainId;
    }

    

    public JobExeResult withJobStepId(String jobStepId) {
        this.jobStepId = jobStepId;
        return this;
    }

    


    /**
     * 作业步骤ID。
     * @return jobStepId
     */
    public String getJobStepId() {
        return jobStepId;
    }

    public void setJobStepId(String jobStepId) {
        this.jobStepId = jobStepId;
    }

    

    public JobExeResult withPostponeAt(Long postponeAt) {
        this.postponeAt = postponeAt;
        return this;
    }

    


    /**
     * 延迟时间，十三位时间戳。
     * @return postponeAt
     */
    public Long getPostponeAt() {
        return postponeAt;
    }

    public void setPostponeAt(Long postponeAt) {
        this.postponeAt = postponeAt;
    }

    

    public JobExeResult withStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }

    


    /**
     * 作业步骤名。
     * @return stepName
     */
    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    

    public JobExeResult withStepNum(Integer stepNum) {
        this.stepNum = stepNum;
        return this;
    }

    


    /**
     * 步骤数量。
     * @return stepNum
     */
    public Integer getStepNum() {
        return stepNum;
    }

    public void setStepNum(Integer stepNum) {
        this.stepNum = stepNum;
    }

    

    public JobExeResult withTaskNum(Integer taskNum) {
        this.taskNum = taskNum;
        return this;
    }

    


    /**
     * 任务数量。
     * @return taskNum
     */
    public Integer getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(Integer taskNum) {
        this.taskNum = taskNum;
    }

    

    public JobExeResult withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    


    /**
     * 更新作业的用户ID。
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    

    public JobExeResult withSpendTime(Float spendTime) {
        this.spendTime = spendTime;
        return this;
    }

    


    /**
     * 作业执行持续时间，单位：秒。
     * @return spendTime
     */
    public Float getSpendTime() {
        return spendTime;
    }

    public void setSpendTime(Float spendTime) {
        this.spendTime = spendTime;
    }

    

    public JobExeResult withStepSeq(Integer stepSeq) {
        this.stepSeq = stepSeq;
        return this;
    }

    


    /**
     * 步骤序列号。
     * @return stepSeq
     */
    public Integer getStepSeq() {
        return stepSeq;
    }

    public void setStepSeq(Integer stepSeq) {
        this.stepSeq = stepSeq;
    }

    

    public JobExeResult withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    


    /**
     * 作业执行进度。
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobExeResult jobExeResult = (JobExeResult) o;
        return Objects.equals(this.id, jobExeResult.id) &&
            Objects.equals(this.createAt, jobExeResult.createAt) &&
            Objects.equals(this.updateAt, jobExeResult.updateAt) &&
            Objects.equals(this.tenantId, jobExeResult.tenantId) &&
            Objects.equals(this.jobId, jobExeResult.jobId) &&
            Objects.equals(this.jobName, jobExeResult.jobName) &&
            Objects.equals(this.startTime, jobExeResult.startTime) &&
            Objects.equals(this.endTime, jobExeResult.endTime) &&
            Objects.equals(this.clusterId, jobExeResult.clusterId) &&
            Objects.equals(this.groupId, jobExeResult.groupId) &&
            Objects.equals(this.jarPath, jobExeResult.jarPath) &&
            Objects.equals(this.input, jobExeResult.input) &&
            Objects.equals(this.output, jobExeResult.output) &&
            Objects.equals(this.jobLog, jobExeResult.jobLog) &&
            Objects.equals(this.jobType, jobExeResult.jobType) &&
            Objects.equals(this.fileAction, jobExeResult.fileAction) &&
            Objects.equals(this.arguments, jobExeResult.arguments) &&
            Objects.equals(this.hql, jobExeResult.hql) &&
            Objects.equals(this.jobState, jobExeResult.jobState) &&
            Objects.equals(this.jobFinalStatus, jobExeResult.jobFinalStatus) &&
            Objects.equals(this.hiveScriptPath, jobExeResult.hiveScriptPath) &&
            Objects.equals(this.createBy, jobExeResult.createBy) &&
            Objects.equals(this.finishedStep, jobExeResult.finishedStep) &&
            Objects.equals(this.jobMainId, jobExeResult.jobMainId) &&
            Objects.equals(this.jobStepId, jobExeResult.jobStepId) &&
            Objects.equals(this.postponeAt, jobExeResult.postponeAt) &&
            Objects.equals(this.stepName, jobExeResult.stepName) &&
            Objects.equals(this.stepNum, jobExeResult.stepNum) &&
            Objects.equals(this.taskNum, jobExeResult.taskNum) &&
            Objects.equals(this.updateBy, jobExeResult.updateBy) &&
            Objects.equals(this.spendTime, jobExeResult.spendTime) &&
            Objects.equals(this.stepSeq, jobExeResult.stepSeq) &&
            Objects.equals(this.progress, jobExeResult.progress);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, createAt, updateAt, tenantId, jobId, jobName, startTime, endTime, clusterId, groupId, jarPath, input, output, jobLog, jobType, fileAction, arguments, hql, jobState, jobFinalStatus, hiveScriptPath, createBy, finishedStep, jobMainId, jobStepId, postponeAt, stepName, stepNum, taskNum, updateBy, spendTime, stepSeq, progress);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobExeResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    jarPath: ").append(toIndentedString(jarPath)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    jobLog: ").append(toIndentedString(jobLog)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    fileAction: ").append(toIndentedString(fileAction)).append("\n");
        sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
        sb.append("    hql: ").append(toIndentedString(hql)).append("\n");
        sb.append("    jobState: ").append(toIndentedString(jobState)).append("\n");
        sb.append("    jobFinalStatus: ").append(toIndentedString(jobFinalStatus)).append("\n");
        sb.append("    hiveScriptPath: ").append(toIndentedString(hiveScriptPath)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    finishedStep: ").append(toIndentedString(finishedStep)).append("\n");
        sb.append("    jobMainId: ").append(toIndentedString(jobMainId)).append("\n");
        sb.append("    jobStepId: ").append(toIndentedString(jobStepId)).append("\n");
        sb.append("    postponeAt: ").append(toIndentedString(postponeAt)).append("\n");
        sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
        sb.append("    stepNum: ").append(toIndentedString(stepNum)).append("\n");
        sb.append("    taskNum: ").append(toIndentedString(taskNum)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    spendTime: ").append(toIndentedString(spendTime)).append("\n");
        sb.append("    stepSeq: ").append(toIndentedString(stepSeq)).append("\n");
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

