package com.huaweicloud.sdk.mrs.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateAndExecuteJobResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="templated")
    
    
    private Boolean templated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    
    private Long createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    
    private Long updatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


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
    @JsonProperty(value="input_id")
    
    
    private String inputId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="output_id")
    
    
    private String outputId;


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
    @JsonProperty(value="engine_job_id")
    
    
    private String engineJobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="return_code")
    
    
    private String returnCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_public")
    
    
    private Boolean isPublic;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_protected")
    
    
    private Boolean isProtected;


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
    @JsonProperty(value="credentials")
    
    
    private String credentials;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_configs")
    
    
    private Map<String, Object> jobConfigs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="extra")
    
    
    private Map<String, Object> extra = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_source_urls")
    
    
    private Map<String, Object> dataSourceUrls = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="info")
    
    
    private Map<String, Object> info = null;
    
    public CreateAndExecuteJobResponse withTemplated(Boolean templated) {
        this.templated = templated;
        return this;
    }

    


    /**
     * 作业执行对象是否由作业模板生成。
     * @return templated
     */
    public Boolean getTemplated() {
        return templated;
    }

    public void setTemplated(Boolean templated) {
        this.templated = templated;
    }

    

    public CreateAndExecuteJobResponse withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 作业创建时间，十位时间戳。
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    

    public CreateAndExecuteJobResponse withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 作业更新时间，十位时间戳。
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    

    public CreateAndExecuteJobResponse withId(String id) {
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

    

    public CreateAndExecuteJobResponse withTenantId(String tenantId) {
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

    

    public CreateAndExecuteJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 作业应用ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public CreateAndExecuteJobResponse withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    


    /**
     * 作业名称，只能由字母、数字、中划线和下划线组成，并且长度为1～64个字符。  说明： 不同作业的名称允许相同，但不建议设置相同。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    

    public CreateAndExecuteJobResponse withInputId(String inputId) {
        this.inputId = inputId;
        return this;
    }

    


    /**
     * 数据输入ID。
     * @return inputId
     */
    public String getInputId() {
        return inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    

    public CreateAndExecuteJobResponse withOutputId(String outputId) {
        this.outputId = outputId;
        return this;
    }

    


    /**
     * 数据输出ID。
     * @return outputId
     */
    public String getOutputId() {
        return outputId;
    }

    public void setOutputId(String outputId) {
        this.outputId = outputId;
    }

    

    public CreateAndExecuteJobResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 作业执行开始时间，十位时间戳。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    

    public CreateAndExecuteJobResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 作业执行结束时间，十位时间戳。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    

    public CreateAndExecuteJobResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * 集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    

    public CreateAndExecuteJobResponse withEngineJobId(String engineJobId) {
        this.engineJobId = engineJobId;
        return this;
    }

    


    /**
     * Oozie工作流ID。
     * @return engineJobId
     */
    public String getEngineJobId() {
        return engineJobId;
    }

    public void setEngineJobId(String engineJobId) {
        this.engineJobId = engineJobId;
    }

    

    public CreateAndExecuteJobResponse withReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }

    


    /**
     * 运行结果返回码。
     * @return returnCode
     */
    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    

    public CreateAndExecuteJobResponse withIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    


    /**
     * 是否公开。 当前版本不支持该功能。
     * @return isPublic
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    

    public CreateAndExecuteJobResponse withIsProtected(Boolean isProtected) {
        this.isProtected = isProtected;
        return this;
    }

    


    /**
     * 是否受保护。 当前版本不支持该功能。
     * @return isProtected
     */
    public Boolean getIsProtected() {
        return isProtected;
    }

    public void setIsProtected(Boolean isProtected) {
        this.isProtected = isProtected;
    }

    

    public CreateAndExecuteJobResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * 作业执行组ID。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public CreateAndExecuteJobResponse withJarPath(String jarPath) {
        this.jarPath = jarPath;
        return this;
    }

    


    /**
     * 执行程序Jar包或sql文件地址，需要满足如下要求：  - 最多为1023字符，不能包含;|&><'$特殊字符，且不可为空或全空格。  - 需要以“/”或“s3a://”开头。OBS路径不支持KMS加密的文件或程序。  - Spark Script需要以“.sql”结尾，MapReduce和Spark Jar需要以“.jar”结尾，sql和jar不区分大小写。
     * @return jarPath
     */
    public String getJarPath() {
        return jarPath;
    }

    public void setJarPath(String jarPath) {
        this.jarPath = jarPath;
    }

    

    public CreateAndExecuteJobResponse withInput(String input) {
        this.input = input;
        return this;
    }

    


    /**
     * 数据输入地址，必须以“/”或“s3a://”开头。请配置为正确的OBS路径，OBS路径不支持KMS加密的文件或程序。  最多为1023字符，不能包含;|&>'<$特殊字符，可为空。
     * @return input
     */
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    

    public CreateAndExecuteJobResponse withOutput(String output) {
        this.output = output;
        return this;
    }

    


    /**
     * 数据输出地址，必须以“/”或“s3a://”开头。请配置为正确的OBS路径，如果该路径不存在，系统会自动创建。  最多为1023字符，不能包含;|&>'<$特殊字符，可为空。
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    

    public CreateAndExecuteJobResponse withJobLog(String jobLog) {
        this.jobLog = jobLog;
        return this;
    }

    


    /**
     * 作业日志存储地址，该日志信息记录作业运行状态。必须以“/”或“s3a://”开头，请配置为正确的OBS路径。  最多为1023字符，不能包含;|&>'<$特殊字符，可为空。
     * @return jobLog
     */
    public String getJobLog() {
        return jobLog;
    }

    public void setJobLog(String jobLog) {
        this.jobLog = jobLog;
    }

    

    public CreateAndExecuteJobResponse withJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }

    


    /**
     * 作业类型码。 - 1：MapReduce - 2：Spark - 3：Hive Script - 4：HiveSQL（当前不支持） - 5：DistCp，导入、导出数据。 - 6：Spark Script - 7：Spark SQL，提交SQL语句，（该接口当前不支持）  说明： 只有包含Spark和Hive组件的集群才能新增Spark和Hive类型的作业。
     * @return jobType
     */
    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    

    public CreateAndExecuteJobResponse withFileAction(String fileAction) {
        this.fileAction = fileAction;
        return this;
    }

    


    /**
     * 文件操作类型，包括：  - export：从HDFS导出数据至OBS  - import：从OBS导入数据至HDFS
     * @return fileAction
     */
    public String getFileAction() {
        return fileAction;
    }

    public void setFileAction(String fileAction) {
        this.fileAction = fileAction;
    }

    

    public CreateAndExecuteJobResponse withArguments(String arguments) {
        this.arguments = arguments;
        return this;
    }

    


    /**
     * 程序执行的关键参数，该参数由用户程序内的函数指定，MRS只负责参数的传入。 最多为150000字符，不能包含;|&>'<$!\\\"\\特殊字符，可为空。 说明： 用户输入带有敏感信息（如登录密码）的参数时，可通过在参数名前添加“@”的方式，为该参数值加密，以防止敏感信息被明文形式持久化。在查看作业信息时，敏感信息显示为“*”。 例如：username=admin @password=admin_123
     * @return arguments
     */
    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    

    public CreateAndExecuteJobResponse withHql(String hql) {
        this.hql = hql;
        return this;
    }

    


    /**
     * Hive&Spark Sql语句
     * @return hql
     */
    public String getHql() {
        return hql;
    }

    public void setHql(String hql) {
        this.hql = hql;
    }

    

    public CreateAndExecuteJobResponse withJobState(Integer jobState) {
        this.jobState = jobState;
        return this;
    }

    


    /**
     * 作业状态码。  - 1：Terminated - 2：Starting - 3：Running - 4：Completed - 5：Abnormal - 6：Error
     * @return jobState
     */
    public Integer getJobState() {
        return jobState;
    }

    public void setJobState(Integer jobState) {
        this.jobState = jobState;
    }

    

    public CreateAndExecuteJobResponse withJobFinalStatus(Integer jobFinalStatus) {
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

    

    public CreateAndExecuteJobResponse withHiveScriptPath(String hiveScriptPath) {
        this.hiveScriptPath = hiveScriptPath;
        return this;
    }

    


    /**
     * sql程序路径，仅Spark Script和Hive Script作业需要使用此参数。需要满足如下要求：  - 最多为1023字符，不能包含;|&><'$特殊字符，且不可为空或全空格。 - 需要以“/”或“s3a://”开头，OBS路径不支持KMS加密的文件或程序。 - 需要以“.sql”结尾，sql不区分大小写。
     * @return hiveScriptPath
     */
    public String getHiveScriptPath() {
        return hiveScriptPath;
    }

    public void setHiveScriptPath(String hiveScriptPath) {
        this.hiveScriptPath = hiveScriptPath;
    }

    

    public CreateAndExecuteJobResponse withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    


    /**
     * 创建作业的用户ID。  为兼容历史版本，保留此参数。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    

    public CreateAndExecuteJobResponse withFinishedStep(Integer finishedStep) {
        this.finishedStep = finishedStep;
        return this;
    }

    


    /**
     * 当前已完成的步骤数。  为兼容历史版本，保留此参数。
     * @return finishedStep
     */
    public Integer getFinishedStep() {
        return finishedStep;
    }

    public void setFinishedStep(Integer finishedStep) {
        this.finishedStep = finishedStep;
    }

    

    public CreateAndExecuteJobResponse withJobMainId(String jobMainId) {
        this.jobMainId = jobMainId;
        return this;
    }

    


    /**
     * 作业主ID。  为兼容历史版本，保留此参数。
     * @return jobMainId
     */
    public String getJobMainId() {
        return jobMainId;
    }

    public void setJobMainId(String jobMainId) {
        this.jobMainId = jobMainId;
    }

    

    public CreateAndExecuteJobResponse withJobStepId(String jobStepId) {
        this.jobStepId = jobStepId;
        return this;
    }

    


    /**
     * 作业步骤ID。  为兼容历史版本，保留此参数。
     * @return jobStepId
     */
    public String getJobStepId() {
        return jobStepId;
    }

    public void setJobStepId(String jobStepId) {
        this.jobStepId = jobStepId;
    }

    

    public CreateAndExecuteJobResponse withPostponeAt(Long postponeAt) {
        this.postponeAt = postponeAt;
        return this;
    }

    


    /**
     * 延迟时间，十位时间戳。  为兼容历史版本，保留此参数。
     * @return postponeAt
     */
    public Long getPostponeAt() {
        return postponeAt;
    }

    public void setPostponeAt(Long postponeAt) {
        this.postponeAt = postponeAt;
    }

    

    public CreateAndExecuteJobResponse withStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }

    


    /**
     * 作业步骤名。  为兼容历史版本，保留此参数。
     * @return stepName
     */
    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    

    public CreateAndExecuteJobResponse withStepNum(Integer stepNum) {
        this.stepNum = stepNum;
        return this;
    }

    


    /**
     * 步骤数量  为兼容历史版本，保留此参数。
     * @return stepNum
     */
    public Integer getStepNum() {
        return stepNum;
    }

    public void setStepNum(Integer stepNum) {
        this.stepNum = stepNum;
    }

    

    public CreateAndExecuteJobResponse withTaskNum(Integer taskNum) {
        this.taskNum = taskNum;
        return this;
    }

    


    /**
     * 任务数量。为兼容历史版本，保留此参数。
     * @return taskNum
     */
    public Integer getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(Integer taskNum) {
        this.taskNum = taskNum;
    }

    

    public CreateAndExecuteJobResponse withUpdateBy(String updateBy) {
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

    

    public CreateAndExecuteJobResponse withCredentials(String credentials) {
        this.credentials = credentials;
        return this;
    }

    


    /**
     * 令牌，当前版本不支持。
     * @return credentials
     */
    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    

    public CreateAndExecuteJobResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 创建作业的用户ID。  历史版本兼容，不再使用。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    

    public CreateAndExecuteJobResponse withJobConfigs(Map<String, Object> jobConfigs) {
        this.jobConfigs = jobConfigs;
        return this;
    }

    

    public CreateAndExecuteJobResponse putJobConfigsItem(String key, Object jobConfigsItem) {
        if(this.jobConfigs == null) {
            this.jobConfigs = new HashMap<>();
        }
        this.jobConfigs.put(key, jobConfigsItem);
        return this;
    }

    public CreateAndExecuteJobResponse withJobConfigs(Consumer<Map<String, Object>> jobConfigsSetter) {
        if(this.jobConfigs == null) {
            this.jobConfigs = new HashMap<>();
        }
        jobConfigsSetter.accept(this.jobConfigs);
        return this;
    }
    /**
     * 键值对集合，用于保存作业运行配置。
     * @return jobConfigs
     */
    public Map<String, Object> getJobConfigs() {
        return jobConfigs;
    }

    public void setJobConfigs(Map<String, Object> jobConfigs) {
        this.jobConfigs = jobConfigs;
    }

    

    public CreateAndExecuteJobResponse withExtra(Map<String, Object> extra) {
        this.extra = extra;
        return this;
    }

    

    public CreateAndExecuteJobResponse putExtraItem(String key, Object extraItem) {
        if(this.extra == null) {
            this.extra = new HashMap<>();
        }
        this.extra.put(key, extraItem);
        return this;
    }

    public CreateAndExecuteJobResponse withExtra(Consumer<Map<String, Object>> extraSetter) {
        if(this.extra == null) {
            this.extra = new HashMap<>();
        }
        extraSetter.accept(this.extra);
        return this;
    }
    /**
     * 认证信息，当前版本不支持。
     * @return extra
     */
    public Map<String, Object> getExtra() {
        return extra;
    }

    public void setExtra(Map<String, Object> extra) {
        this.extra = extra;
    }

    

    public CreateAndExecuteJobResponse withDataSourceUrls(Map<String, Object> dataSourceUrls) {
        this.dataSourceUrls = dataSourceUrls;
        return this;
    }

    

    public CreateAndExecuteJobResponse putDataSourceUrlsItem(String key, Object dataSourceUrlsItem) {
        if(this.dataSourceUrls == null) {
            this.dataSourceUrls = new HashMap<>();
        }
        this.dataSourceUrls.put(key, dataSourceUrlsItem);
        return this;
    }

    public CreateAndExecuteJobResponse withDataSourceUrls(Consumer<Map<String, Object>> dataSourceUrlsSetter) {
        if(this.dataSourceUrls == null) {
            this.dataSourceUrls = new HashMap<>();
        }
        dataSourceUrlsSetter.accept(this.dataSourceUrls);
        return this;
    }
    /**
     * 数据源URL。
     * @return dataSourceUrls
     */
    public Map<String, Object> getDataSourceUrls() {
        return dataSourceUrls;
    }

    public void setDataSourceUrls(Map<String, Object> dataSourceUrls) {
        this.dataSourceUrls = dataSourceUrls;
    }

    

    public CreateAndExecuteJobResponse withInfo(Map<String, Object> info) {
        this.info = info;
        return this;
    }

    

    public CreateAndExecuteJobResponse putInfoItem(String key, Object infoItem) {
        if(this.info == null) {
            this.info = new HashMap<>();
        }
        this.info.put(key, infoItem);
        return this;
    }

    public CreateAndExecuteJobResponse withInfo(Consumer<Map<String, Object>> infoSetter) {
        if(this.info == null) {
            this.info = new HashMap<>();
        }
        infoSetter.accept(this.info);
        return this;
    }
    /**
     * 键值对集合，包含oozie返回的作业运行信息。
     * @return info
     */
    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAndExecuteJobResponse createAndExecuteJobResponse = (CreateAndExecuteJobResponse) o;
        return Objects.equals(this.templated, createAndExecuteJobResponse.templated) &&
            Objects.equals(this.createdAt, createAndExecuteJobResponse.createdAt) &&
            Objects.equals(this.updatedAt, createAndExecuteJobResponse.updatedAt) &&
            Objects.equals(this.id, createAndExecuteJobResponse.id) &&
            Objects.equals(this.tenantId, createAndExecuteJobResponse.tenantId) &&
            Objects.equals(this.jobId, createAndExecuteJobResponse.jobId) &&
            Objects.equals(this.jobName, createAndExecuteJobResponse.jobName) &&
            Objects.equals(this.inputId, createAndExecuteJobResponse.inputId) &&
            Objects.equals(this.outputId, createAndExecuteJobResponse.outputId) &&
            Objects.equals(this.startTime, createAndExecuteJobResponse.startTime) &&
            Objects.equals(this.endTime, createAndExecuteJobResponse.endTime) &&
            Objects.equals(this.clusterId, createAndExecuteJobResponse.clusterId) &&
            Objects.equals(this.engineJobId, createAndExecuteJobResponse.engineJobId) &&
            Objects.equals(this.returnCode, createAndExecuteJobResponse.returnCode) &&
            Objects.equals(this.isPublic, createAndExecuteJobResponse.isPublic) &&
            Objects.equals(this.isProtected, createAndExecuteJobResponse.isProtected) &&
            Objects.equals(this.groupId, createAndExecuteJobResponse.groupId) &&
            Objects.equals(this.jarPath, createAndExecuteJobResponse.jarPath) &&
            Objects.equals(this.input, createAndExecuteJobResponse.input) &&
            Objects.equals(this.output, createAndExecuteJobResponse.output) &&
            Objects.equals(this.jobLog, createAndExecuteJobResponse.jobLog) &&
            Objects.equals(this.jobType, createAndExecuteJobResponse.jobType) &&
            Objects.equals(this.fileAction, createAndExecuteJobResponse.fileAction) &&
            Objects.equals(this.arguments, createAndExecuteJobResponse.arguments) &&
            Objects.equals(this.hql, createAndExecuteJobResponse.hql) &&
            Objects.equals(this.jobState, createAndExecuteJobResponse.jobState) &&
            Objects.equals(this.jobFinalStatus, createAndExecuteJobResponse.jobFinalStatus) &&
            Objects.equals(this.hiveScriptPath, createAndExecuteJobResponse.hiveScriptPath) &&
            Objects.equals(this.createBy, createAndExecuteJobResponse.createBy) &&
            Objects.equals(this.finishedStep, createAndExecuteJobResponse.finishedStep) &&
            Objects.equals(this.jobMainId, createAndExecuteJobResponse.jobMainId) &&
            Objects.equals(this.jobStepId, createAndExecuteJobResponse.jobStepId) &&
            Objects.equals(this.postponeAt, createAndExecuteJobResponse.postponeAt) &&
            Objects.equals(this.stepName, createAndExecuteJobResponse.stepName) &&
            Objects.equals(this.stepNum, createAndExecuteJobResponse.stepNum) &&
            Objects.equals(this.taskNum, createAndExecuteJobResponse.taskNum) &&
            Objects.equals(this.updateBy, createAndExecuteJobResponse.updateBy) &&
            Objects.equals(this.credentials, createAndExecuteJobResponse.credentials) &&
            Objects.equals(this.userId, createAndExecuteJobResponse.userId) &&
            Objects.equals(this.jobConfigs, createAndExecuteJobResponse.jobConfigs) &&
            Objects.equals(this.extra, createAndExecuteJobResponse.extra) &&
            Objects.equals(this.dataSourceUrls, createAndExecuteJobResponse.dataSourceUrls) &&
            Objects.equals(this.info, createAndExecuteJobResponse.info);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templated, createdAt, updatedAt, id, tenantId, jobId, jobName, inputId, outputId, startTime, endTime, clusterId, engineJobId, returnCode, isPublic, isProtected, groupId, jarPath, input, output, jobLog, jobType, fileAction, arguments, hql, jobState, jobFinalStatus, hiveScriptPath, createBy, finishedStep, jobMainId, jobStepId, postponeAt, stepName, stepNum, taskNum, updateBy, credentials, userId, jobConfigs, extra, dataSourceUrls, info);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAndExecuteJobResponse {\n");
        sb.append("    templated: ").append(toIndentedString(templated)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    inputId: ").append(toIndentedString(inputId)).append("\n");
        sb.append("    outputId: ").append(toIndentedString(outputId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    engineJobId: ").append(toIndentedString(engineJobId)).append("\n");
        sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
        sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
        sb.append("    isProtected: ").append(toIndentedString(isProtected)).append("\n");
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
        sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    jobConfigs: ").append(toIndentedString(jobConfigs)).append("\n");
        sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
        sb.append("    dataSourceUrls: ").append(toIndentedString(dataSourceUrls)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

