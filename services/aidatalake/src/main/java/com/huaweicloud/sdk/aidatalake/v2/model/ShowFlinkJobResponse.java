package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowFlinkJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_token")

    private String clientToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_id")

    private String deploymentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_name")

    private String endpointName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private FlinkJobStatus status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_agency")

    private String jobAgency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_config")

    private ShowFlinkJobArtifactResponse jobConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_config")

    private ShowFlinkResourceConfigResponseBody resourceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_config")

    private ShowFlinkJobImageConfigResponseBody imageConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flink_config")

    private Map<String, String> flinkConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_mode")

    private FlinkJobExecutionMode executionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_strategy")

    private ShowRestoreStrategyResponseBody restoreStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logging_config")

    private ShowFlinkLoggingConfigResponseBody loggingConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private FlinkResourceMetric metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private FlinkCreateUser createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private FlinkUpdateUser updateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_url")

    private String logUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<FlinkLabel> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    public ShowFlinkJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：Flink作业ID。 **取值范围**：UUIDv7格式，固定36位，由英文小写字母、数字及中划线组成。 
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowFlinkJobResponse withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * **参数解释**：客户端Token，用于接口调用幂等校验。 **取值范围**：长度为1~64个字符，只能由英文字母、数字、下划线和中划线组成。 
     * @return clientToken
     */
    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public ShowFlinkJobResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：作业名称。 **取值范围**：1~128个字符，以字母或数字开头和结尾，中间可包含字母、数字、下划线和中划线。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowFlinkJobResponse withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * **参数解释**：已部署作业ID。 **取值范围**：1~64个字符，支持字母、数字、下划线和中划线。 
     * @return deploymentId
     */
    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public ShowFlinkJobResponse withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * **参数解释**：作业运行的端点ID。 **取值范围**：采用UUID格式，固定36个字符。 
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public ShowFlinkJobResponse withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * **参数解释**：作业运行的端点名称。 **取值范围**：只能由英文小写字母、数字及中划线组成，以英文小写字母开头，以英文小写字母或数字结尾，且长度为1~63个字符。 
     * @return endpointName
     */
    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public ShowFlinkJobResponse withStatus(FlinkJobStatus status) {
        this.status = status;
        return this;
    }

    public ShowFlinkJobResponse withStatus(Consumer<FlinkJobStatus> statusSetter) {
        if (this.status == null) {
            this.status = new FlinkJobStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public FlinkJobStatus getStatus() {
        return status;
    }

    public void setStatus(FlinkJobStatus status) {
        this.status = status;
    }

    public ShowFlinkJobResponse withJobAgency(String jobAgency) {
        this.jobAgency = jobAgency;
        return this;
    }

    /**
     * **参数解释**：用户自定义委托名称，用于授权作业访问OBS等外部资源，不指定时默认使用端点委托。 **取值范围**：1~64个字符。 
     * @return jobAgency
     */
    public String getJobAgency() {
        return jobAgency;
    }

    public void setJobAgency(String jobAgency) {
        this.jobAgency = jobAgency;
    }

    public ShowFlinkJobResponse withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * **参数解释**：OBS桶名称，用于存储作业的Checkpoint、日志等数据。 **取值范围**：1~512个字符。 
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public ShowFlinkJobResponse withJobConfig(ShowFlinkJobArtifactResponse jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }

    public ShowFlinkJobResponse withJobConfig(Consumer<ShowFlinkJobArtifactResponse> jobConfigSetter) {
        if (this.jobConfig == null) {
            this.jobConfig = new ShowFlinkJobArtifactResponse();
            jobConfigSetter.accept(this.jobConfig);
        }

        return this;
    }

    /**
     * Get jobConfig
     * @return jobConfig
     */
    public ShowFlinkJobArtifactResponse getJobConfig() {
        return jobConfig;
    }

    public void setJobConfig(ShowFlinkJobArtifactResponse jobConfig) {
        this.jobConfig = jobConfig;
    }

    public ShowFlinkJobResponse withResourceConfig(ShowFlinkResourceConfigResponseBody resourceConfig) {
        this.resourceConfig = resourceConfig;
        return this;
    }

    public ShowFlinkJobResponse withResourceConfig(Consumer<ShowFlinkResourceConfigResponseBody> resourceConfigSetter) {
        if (this.resourceConfig == null) {
            this.resourceConfig = new ShowFlinkResourceConfigResponseBody();
            resourceConfigSetter.accept(this.resourceConfig);
        }

        return this;
    }

    /**
     * Get resourceConfig
     * @return resourceConfig
     */
    public ShowFlinkResourceConfigResponseBody getResourceConfig() {
        return resourceConfig;
    }

    public void setResourceConfig(ShowFlinkResourceConfigResponseBody resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    public ShowFlinkJobResponse withImageConfig(ShowFlinkJobImageConfigResponseBody imageConfig) {
        this.imageConfig = imageConfig;
        return this;
    }

    public ShowFlinkJobResponse withImageConfig(Consumer<ShowFlinkJobImageConfigResponseBody> imageConfigSetter) {
        if (this.imageConfig == null) {
            this.imageConfig = new ShowFlinkJobImageConfigResponseBody();
            imageConfigSetter.accept(this.imageConfig);
        }

        return this;
    }

    /**
     * Get imageConfig
     * @return imageConfig
     */
    public ShowFlinkJobImageConfigResponseBody getImageConfig() {
        return imageConfig;
    }

    public void setImageConfig(ShowFlinkJobImageConfigResponseBody imageConfig) {
        this.imageConfig = imageConfig;
    }

    public ShowFlinkJobResponse withFlinkConfig(Map<String, String> flinkConfig) {
        this.flinkConfig = flinkConfig;
        return this;
    }

    public ShowFlinkJobResponse putFlinkConfigItem(String key, String flinkConfigItem) {
        if (this.flinkConfig == null) {
            this.flinkConfig = new HashMap<>();
        }
        this.flinkConfig.put(key, flinkConfigItem);
        return this;
    }

    public ShowFlinkJobResponse withFlinkConfig(Consumer<Map<String, String>> flinkConfigSetter) {
        if (this.flinkConfig == null) {
            this.flinkConfig = new HashMap<>();
        }
        flinkConfigSetter.accept(this.flinkConfig);
        return this;
    }

    /**
     * **参数解释**：Flink配置参数，为键值对形式。key为Flink配置项名称（如taskmanager.numberOfTaskSlots）；value为对应配置值，长度1~1024个字符。除用户配置项外，还包含系统自动补充的保留参数（如execution.checkpointing.dir、execution.checkpointing.savepoint-dir、high-availability.storageDir，由系统根据作业配置自动生成）。 
     * @return flinkConfig
     */
    public Map<String, String> getFlinkConfig() {
        return flinkConfig;
    }

    public void setFlinkConfig(Map<String, String> flinkConfig) {
        this.flinkConfig = flinkConfig;
    }

    public ShowFlinkJobResponse withExecutionMode(FlinkJobExecutionMode executionMode) {
        this.executionMode = executionMode;
        return this;
    }

    /**
     * Get executionMode
     * @return executionMode
     */
    public FlinkJobExecutionMode getExecutionMode() {
        return executionMode;
    }

    public void setExecutionMode(FlinkJobExecutionMode executionMode) {
        this.executionMode = executionMode;
    }

    public ShowFlinkJobResponse withRestoreStrategy(ShowRestoreStrategyResponseBody restoreStrategy) {
        this.restoreStrategy = restoreStrategy;
        return this;
    }

    public ShowFlinkJobResponse withRestoreStrategy(Consumer<ShowRestoreStrategyResponseBody> restoreStrategySetter) {
        if (this.restoreStrategy == null) {
            this.restoreStrategy = new ShowRestoreStrategyResponseBody();
            restoreStrategySetter.accept(this.restoreStrategy);
        }

        return this;
    }

    /**
     * Get restoreStrategy
     * @return restoreStrategy
     */
    public ShowRestoreStrategyResponseBody getRestoreStrategy() {
        return restoreStrategy;
    }

    public void setRestoreStrategy(ShowRestoreStrategyResponseBody restoreStrategy) {
        this.restoreStrategy = restoreStrategy;
    }

    public ShowFlinkJobResponse withLoggingConfig(ShowFlinkLoggingConfigResponseBody loggingConfig) {
        this.loggingConfig = loggingConfig;
        return this;
    }

    public ShowFlinkJobResponse withLoggingConfig(Consumer<ShowFlinkLoggingConfigResponseBody> loggingConfigSetter) {
        if (this.loggingConfig == null) {
            this.loggingConfig = new ShowFlinkLoggingConfigResponseBody();
            loggingConfigSetter.accept(this.loggingConfig);
        }

        return this;
    }

    /**
     * Get loggingConfig
     * @return loggingConfig
     */
    public ShowFlinkLoggingConfigResponseBody getLoggingConfig() {
        return loggingConfig;
    }

    public void setLoggingConfig(ShowFlinkLoggingConfigResponseBody loggingConfig) {
        this.loggingConfig = loggingConfig;
    }

    public ShowFlinkJobResponse withMetric(FlinkResourceMetric metric) {
        this.metric = metric;
        return this;
    }

    public ShowFlinkJobResponse withMetric(Consumer<FlinkResourceMetric> metricSetter) {
        if (this.metric == null) {
            this.metric = new FlinkResourceMetric();
            metricSetter.accept(this.metric);
        }

        return this;
    }

    /**
     * Get metric
     * @return metric
     */
    public FlinkResourceMetric getMetric() {
        return metric;
    }

    public void setMetric(FlinkResourceMetric metric) {
        this.metric = metric;
    }

    public ShowFlinkJobResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：创建时间戳。 **取值范围**：0~4102416000000，13位毫秒时间戳。 
     * minimum: 0
     * maximum: 4102416000000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowFlinkJobResponse withCreateUser(FlinkCreateUser createUser) {
        this.createUser = createUser;
        return this;
    }

    public ShowFlinkJobResponse withCreateUser(Consumer<FlinkCreateUser> createUserSetter) {
        if (this.createUser == null) {
            this.createUser = new FlinkCreateUser();
            createUserSetter.accept(this.createUser);
        }

        return this;
    }

    /**
     * Get createUser
     * @return createUser
     */
    public FlinkCreateUser getCreateUser() {
        return createUser;
    }

    public void setCreateUser(FlinkCreateUser createUser) {
        this.createUser = createUser;
    }

    public ShowFlinkJobResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**：更新时间戳。 **取值范围**：0~4102416000000，13位毫秒时间戳。 
     * minimum: 0
     * maximum: 4102416000000
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowFlinkJobResponse withUpdateUser(FlinkUpdateUser updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public ShowFlinkJobResponse withUpdateUser(Consumer<FlinkUpdateUser> updateUserSetter) {
        if (this.updateUser == null) {
            this.updateUser = new FlinkUpdateUser();
            updateUserSetter.accept(this.updateUser);
        }

        return this;
    }

    /**
     * Get updateUser
     * @return updateUser
     */
    public FlinkUpdateUser getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(FlinkUpdateUser updateUser) {
        this.updateUser = updateUser;
    }

    public ShowFlinkJobResponse withLogUrl(String logUrl) {
        this.logUrl = logUrl;
        return this;
    }

    /**
     * **参数解释**：日志归档路径OBS URL，用于查看作业执行日志。 **取值范围**：OBS URL格式，长度为1~1024个字符。 
     * @return logUrl
     */
    public String getLogUrl() {
        return logUrl;
    }

    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }

    public ShowFlinkJobResponse withLabels(List<FlinkLabel> labels) {
        this.labels = labels;
        return this;
    }

    public ShowFlinkJobResponse addLabelsItem(FlinkLabel labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ShowFlinkJobResponse withLabels(Consumer<List<FlinkLabel>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释**：标签，用于作业分类和筛选。 
     * @return labels
     */
    public List<FlinkLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<FlinkLabel> labels) {
        this.labels = labels;
    }

    public ShowFlinkJobResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：描述信息。 **取值范围**：1~512个字符。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowFlinkJobResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：作业开始运行的时间戳（进入RUNNING状态的时间）。 **取值范围**：0 ~ 4102416000000，13位毫秒时间戳。 
     * minimum: 0
     * maximum: 4102416000000
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowFlinkJobResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：作业结束时间戳（进入终态 FINISHED/CANCELLED/FAILED的时间）。 **取值范围**：0 ~ 4102416000000，13位毫秒时间戳。 
     * minimum: 0
     * maximum: 4102416000000
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFlinkJobResponse that = (ShowFlinkJobResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.clientToken, that.clientToken)
            && Objects.equals(this.name, that.name) && Objects.equals(this.deploymentId, that.deploymentId)
            && Objects.equals(this.endpointId, that.endpointId) && Objects.equals(this.endpointName, that.endpointName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.jobAgency, that.jobAgency)
            && Objects.equals(this.obsBucketName, that.obsBucketName) && Objects.equals(this.jobConfig, that.jobConfig)
            && Objects.equals(this.resourceConfig, that.resourceConfig)
            && Objects.equals(this.imageConfig, that.imageConfig) && Objects.equals(this.flinkConfig, that.flinkConfig)
            && Objects.equals(this.executionMode, that.executionMode)
            && Objects.equals(this.restoreStrategy, that.restoreStrategy)
            && Objects.equals(this.loggingConfig, that.loggingConfig) && Objects.equals(this.metric, that.metric)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.updateUser, that.updateUser)
            && Objects.equals(this.logUrl, that.logUrl) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.description, that.description) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            clientToken,
            name,
            deploymentId,
            endpointId,
            endpointName,
            status,
            jobAgency,
            obsBucketName,
            jobConfig,
            resourceConfig,
            imageConfig,
            flinkConfig,
            executionMode,
            restoreStrategy,
            loggingConfig,
            metric,
            createTime,
            createUser,
            updateTime,
            updateUser,
            logUrl,
            labels,
            description,
            startTime,
            endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFlinkJobResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    jobAgency: ").append(toIndentedString(jobAgency)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
        sb.append("    resourceConfig: ").append(toIndentedString(resourceConfig)).append("\n");
        sb.append("    imageConfig: ").append(toIndentedString(imageConfig)).append("\n");
        sb.append("    flinkConfig: ").append(toIndentedString(flinkConfig)).append("\n");
        sb.append("    executionMode: ").append(toIndentedString(executionMode)).append("\n");
        sb.append("    restoreStrategy: ").append(toIndentedString(restoreStrategy)).append("\n");
        sb.append("    loggingConfig: ").append(toIndentedString(loggingConfig)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
        sb.append("    logUrl: ").append(toIndentedString(logUrl)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
