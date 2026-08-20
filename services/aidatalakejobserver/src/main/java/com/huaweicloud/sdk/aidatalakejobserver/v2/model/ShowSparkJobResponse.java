package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

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
public class ShowSparkJobResponse extends SdkResponse {

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
    @JsonProperty(value = "endpoint_name")

    private String endpointName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_agency")

    private String jobAgency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state_message")

    private String stateMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_config")

    private Object jobConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_config")

    private ShowSparkResourceConfigResponse resourceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_strategy")

    private ShowSparkRestoreStrategyResponse restoreStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spark_config")

    private Map<String, String> sparkConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logging_config")

    private ShowSparkLoggingConfigResponse loggingConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private ShowSparkJobImageConfigResponse image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_times")

    private Integer retryTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<ShowSparkJobLabelResponse> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private SparkCreateUser createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_url")

    private String logUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ShowSparkJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：Spark作业ID，用于唯一标识该作业。 **取值范围**：采用UUID格式，长度为36个字符，例如：80ceaaff-3cfc-4162-a56f-70031ea4fa91。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowSparkJobResponse withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * **参数解释**：Spark作业事务ID，用于防止重复提交。 **取值范围**：采用UUID格式，长度为36个字符，例如：xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx。
     * @return clientToken
     */
    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public ShowSparkJobResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：Spark作业名称，用于标识作业。 **取值范围**：长度为1~128个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowSparkJobResponse withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * **参数解释**：端点名称，用于指定Spark作业执行环境。 **取值范围**：只能由英文小写字母、数字及中划线组成，以英文小写字母开头，以英文小写字母或数字结尾，且长度为1~63个字符。
     * @return endpointName
     */
    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public ShowSparkJobResponse withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * **参数解释**：Catalog名称，用于指定作业使用的数据目录。 **取值范围**：长度为1~128个字符。
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public ShowSparkJobResponse withJobAgency(String jobAgency) {
        this.jobAgency = jobAgency;
        return this;
    }

    /**
     * **参数解释**：自定义委托的委托名，用于作业操作OBS对象、转储日志、访问DLI元数据等。 **取值范围**：长度为1~64个字符。
     * @return jobAgency
     */
    public String getJobAgency() {
        return jobAgency;
    }

    public void setJobAgency(String jobAgency) {
        this.jobAgency = jobAgency;
    }

    public ShowSparkJobResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**：Spark作业状态，用于标识作业当前执行状态。 **取值范围**： - PENDING：启动中。 - QUEUED：排队中。 - RUNNING：运行中。 - CANCELING：取消中。 - CANCELED：已取消。 - FAILED：运行失败。 - QUEUED_TIMEOUT：排队超时。 - RUNNING_TIMEOUT：运行超时。 - SUCCEED：运行成功。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ShowSparkJobResponse withStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
        return this;
    }

    /**
     * **参数解释**：作业状态消息，当作业异常结束时显示相关信息。 **取值范围**：长度为0~512个字符。
     * @return stateMessage
     */
    public String getStateMessage() {
        return stateMessage;
    }

    public void setStateMessage(String stateMessage) {
        this.stateMessage = stateMessage;
    }

    public ShowSparkJobResponse withJobConfig(Object jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }

    public ShowSparkJobResponse withJobConfig(Consumer<Object> jobConfigSetter) {
        if (this.jobConfig == null) {
            this.jobConfig = new Object();
            jobConfigSetter.accept(this.jobConfig);
        }

        return this;
    }

    /**
     * **参数解释**：作业配置信息，包含作业类型、入口参数、依赖包等信息。
     * @return jobConfig
     */
    public Object getJobConfig() {
        return jobConfig;
    }

    public void setJobConfig(Object jobConfig) {
        this.jobConfig = jobConfig;
    }

    public ShowSparkJobResponse withResourceConfig(ShowSparkResourceConfigResponse resourceConfig) {
        this.resourceConfig = resourceConfig;
        return this;
    }

    public ShowSparkJobResponse withResourceConfig(Consumer<ShowSparkResourceConfigResponse> resourceConfigSetter) {
        if (this.resourceConfig == null) {
            this.resourceConfig = new ShowSparkResourceConfigResponse();
            resourceConfigSetter.accept(this.resourceConfig);
        }

        return this;
    }

    /**
     * Get resourceConfig
     * @return resourceConfig
     */
    public ShowSparkResourceConfigResponse getResourceConfig() {
        return resourceConfig;
    }

    public void setResourceConfig(ShowSparkResourceConfigResponse resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    public ShowSparkJobResponse withRestoreStrategy(ShowSparkRestoreStrategyResponse restoreStrategy) {
        this.restoreStrategy = restoreStrategy;
        return this;
    }

    public ShowSparkJobResponse withRestoreStrategy(Consumer<ShowSparkRestoreStrategyResponse> restoreStrategySetter) {
        if (this.restoreStrategy == null) {
            this.restoreStrategy = new ShowSparkRestoreStrategyResponse();
            restoreStrategySetter.accept(this.restoreStrategy);
        }

        return this;
    }

    /**
     * Get restoreStrategy
     * @return restoreStrategy
     */
    public ShowSparkRestoreStrategyResponse getRestoreStrategy() {
        return restoreStrategy;
    }

    public void setRestoreStrategy(ShowSparkRestoreStrategyResponse restoreStrategy) {
        this.restoreStrategy = restoreStrategy;
    }

    public ShowSparkJobResponse withSparkConfig(Map<String, String> sparkConfig) {
        this.sparkConfig = sparkConfig;
        return this;
    }

    public ShowSparkJobResponse putSparkConfigItem(String key, String sparkConfigItem) {
        if (this.sparkConfig == null) {
            this.sparkConfig = new HashMap<>();
        }
        this.sparkConfig.put(key, sparkConfigItem);
        return this;
    }

    public ShowSparkJobResponse withSparkConfig(Consumer<Map<String, String>> sparkConfigSetter) {
        if (this.sparkConfig == null) {
            this.sparkConfig = new HashMap<>();
        }
        sparkConfigSetter.accept(this.sparkConfig);
        return this;
    }

    /**
     * **参数解释**：用户自定义Spark参数配置。 **取值范围**：长度为0~1024个字符。
     * @return sparkConfig
     */
    public Map<String, String> getSparkConfig() {
        return sparkConfig;
    }

    public void setSparkConfig(Map<String, String> sparkConfig) {
        this.sparkConfig = sparkConfig;
    }

    public ShowSparkJobResponse withLoggingConfig(ShowSparkLoggingConfigResponse loggingConfig) {
        this.loggingConfig = loggingConfig;
        return this;
    }

    public ShowSparkJobResponse withLoggingConfig(Consumer<ShowSparkLoggingConfigResponse> loggingConfigSetter) {
        if (this.loggingConfig == null) {
            this.loggingConfig = new ShowSparkLoggingConfigResponse();
            loggingConfigSetter.accept(this.loggingConfig);
        }

        return this;
    }

    /**
     * Get loggingConfig
     * @return loggingConfig
     */
    public ShowSparkLoggingConfigResponse getLoggingConfig() {
        return loggingConfig;
    }

    public void setLoggingConfig(ShowSparkLoggingConfigResponse loggingConfig) {
        this.loggingConfig = loggingConfig;
    }

    public ShowSparkJobResponse withImage(ShowSparkJobImageConfigResponse image) {
        this.image = image;
        return this;
    }

    public ShowSparkJobResponse withImage(Consumer<ShowSparkJobImageConfigResponse> imageSetter) {
        if (this.image == null) {
            this.image = new ShowSparkJobImageConfigResponse();
            imageSetter.accept(this.image);
        }

        return this;
    }

    /**
     * Get image
     * @return image
     */
    public ShowSparkJobImageConfigResponse getImage() {
        return image;
    }

    public void setImage(ShowSparkJobImageConfigResponse image) {
        this.image = image;
    }

    public ShowSparkJobResponse withRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }

    /**
     * **参数解释**：作业重试次数，用于记录作业失败后的重试次数。 **取值范围**：最小值为0。
     * @return retryTimes
     */
    public Integer getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    public ShowSparkJobResponse withLabels(List<ShowSparkJobLabelResponse> labels) {
        this.labels = labels;
        return this;
    }

    public ShowSparkJobResponse addLabelsItem(ShowSparkJobLabelResponse labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ShowSparkJobResponse withLabels(Consumer<List<ShowSparkJobLabelResponse>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释**：作业标签列表，用于标识和分类作业。
     * @return labels
     */
    public List<ShowSparkJobLabelResponse> getLabels() {
        return labels;
    }

    public void setLabels(List<ShowSparkJobLabelResponse> labels) {
        this.labels = labels;
    }

    public ShowSparkJobResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：作业创建时间，用于记录作业提交时间。 **取值范围**：unix时间戳，单位为毫秒。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowSparkJobResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：作业开始运行时间，用于记录作业实际开始执行的时间。 **取值范围**：unix时间戳，单位为毫秒。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowSparkJobResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：作业结束时间，用于记录作业执行完成的时间。 **取值范围**：unix时间戳，单位为毫秒。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowSparkJobResponse withCreateUser(SparkCreateUser createUser) {
        this.createUser = createUser;
        return this;
    }

    public ShowSparkJobResponse withCreateUser(Consumer<SparkCreateUser> createUserSetter) {
        if (this.createUser == null) {
            this.createUser = new SparkCreateUser();
            createUserSetter.accept(this.createUser);
        }

        return this;
    }

    /**
     * Get createUser
     * @return createUser
     */
    public SparkCreateUser getCreateUser() {
        return createUser;
    }

    public void setCreateUser(SparkCreateUser createUser) {
        this.createUser = createUser;
    }

    public ShowSparkJobResponse withLogUrl(String logUrl) {
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

    public ShowSparkJobResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：Spark作业描述信息，用于说明作业用途。 **取值范围**：长度为0~512个字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSparkJobResponse that = (ShowSparkJobResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.clientToken, that.clientToken)
            && Objects.equals(this.name, that.name) && Objects.equals(this.endpointName, that.endpointName)
            && Objects.equals(this.catalogName, that.catalogName) && Objects.equals(this.jobAgency, that.jobAgency)
            && Objects.equals(this.state, that.state) && Objects.equals(this.stateMessage, that.stateMessage)
            && Objects.equals(this.jobConfig, that.jobConfig)
            && Objects.equals(this.resourceConfig, that.resourceConfig)
            && Objects.equals(this.restoreStrategy, that.restoreStrategy)
            && Objects.equals(this.sparkConfig, that.sparkConfig)
            && Objects.equals(this.loggingConfig, that.loggingConfig) && Objects.equals(this.image, that.image)
            && Objects.equals(this.retryTimes, that.retryTimes) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.logUrl, that.logUrl) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            clientToken,
            name,
            endpointName,
            catalogName,
            jobAgency,
            state,
            stateMessage,
            jobConfig,
            resourceConfig,
            restoreStrategy,
            sparkConfig,
            loggingConfig,
            image,
            retryTimes,
            labels,
            createTime,
            startTime,
            endTime,
            createUser,
            logUrl,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSparkJobResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    clientToken: ").append(toIndentedString(clientToken)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    jobAgency: ").append(toIndentedString(jobAgency)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateMessage: ").append(toIndentedString(stateMessage)).append("\n");
        sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
        sb.append("    resourceConfig: ").append(toIndentedString(resourceConfig)).append("\n");
        sb.append("    restoreStrategy: ").append(toIndentedString(restoreStrategy)).append("\n");
        sb.append("    sparkConfig: ").append(toIndentedString(sparkConfig)).append("\n");
        sb.append("    loggingConfig: ").append(toIndentedString(loggingConfig)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    retryTimes: ").append(toIndentedString(retryTimes)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    logUrl: ").append(toIndentedString(logUrl)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
