package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：作业详情信息。 **约束限制**：不涉及。
 */
public class RayJobInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_name")

    private String endpointName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private RayJobConfig config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submission_id")

    private String submissionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_type")

    private String endpointType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "federation_id")

    private String federationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "federation_name")

    private String federationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private User createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private ErrorMessage error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "history_server_enabled")

    private Boolean historyServerEnabled;

    public RayJobInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：Job名称。 **约束限制**：不涉及。 **取值范围**：长度为1~47的英文字母、数字、中划线的组合。 **默认取值**：不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RayJobInfo withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * **参数解释**：端点名称。 **约束限制**：不涉及。 **取值范围**：长度为1~63个字符。包含小写字母、数字、中划线的组合。字母开头、字母或数字结尾。 **默认取值**：不涉及。
     * @return endpointName
     */
    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public RayJobInfo withConfig(RayJobConfig config) {
        this.config = config;
        return this;
    }

    public RayJobInfo withConfig(Consumer<RayJobConfig> configSetter) {
        if (this.config == null) {
            this.config = new RayJobConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public RayJobConfig getConfig() {
        return config;
    }

    public void setConfig(RayJobConfig config) {
        this.config = config;
    }

    public RayJobInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：描述信息。 **约束限制**：不涉及。 **取值范围**：0~1024。 **默认取值**：不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RayJobInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：作业ID。 **取值范围**：长度为1~36的英文字符、数字和中划线的组合。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RayJobInfo withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数解释**：运行时长，单位：秒。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public RayJobInfo withSubmissionId(String submissionId) {
        this.submissionId = submissionId;
        return this;
    }

    /**
     * **参数解释**：Ray Job的唯一ID标识。 **约束限制**：不涉及。 **取值范围**：长度为0~64个字符。 **默认取值**：不涉及。
     * @return submissionId
     */
    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public RayJobInfo withEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }

    /**
     * **参数解释**：作业对应的端点类型。 **约束限制**：不涉及。 **取值范围**：   - RAY_JOB: RayJob类型的端点作业；   - RAY_CLUSTER: RayCluster类型的端点作业；   - RAY_FEDERATION: Ray联邦端点作业。 **默认取值**：不涉及。 
     * @return endpointType
     */
    public String getEndpointType() {
        return endpointType;
    }

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    public RayJobInfo withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * **参数解释**：端点ID。 **取值范围**：长度为1~64个字符，支持大小写英文字母、数字、连字符。
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public RayJobInfo withFederationId(String federationId) {
        this.federationId = federationId;
        return this;
    }

    /**
     * **参数解释**：联邦ID。 **约束限制**：如果作业未提交到联邦端点，该字段为空字符串。 **取值范围**：长度为32~36的英文字符、数字和中划线的组合。 **默认取值**：不涉及。 
     * @return federationId
     */
    public String getFederationId() {
        return federationId;
    }

    public void setFederationId(String federationId) {
        this.federationId = federationId;
    }

    public RayJobInfo withFederationName(String federationName) {
        this.federationName = federationName;
        return this;
    }

    /**
     * **参数解释**：联邦名称。 **约束限制**：不涉及。 **取值范围**：长度为1~63个字符。 **默认取值**：不涉及。
     * @return federationName
     */
    public String getFederationName() {
        return federationName;
    }

    public void setFederationName(String federationName) {
        this.federationName = federationName;
    }

    public RayJobInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：创建时间。使用UTC时间格式，格式为yyyy-MM-ddTHH:mm:ssZ，例如2023-05-30T12:24:30.401Z。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public RayJobInfo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**：更新时间。使用UTC时间格式，格式为yyyy-MM-ddTHH:mm:ssZ，例如2023-05-30T12:24:30.401Z。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public RayJobInfo withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：作业开始执行的时间。使用UTC时间格式，格式为yyyy-MM-ddTHH:mm:ssZ，例如2023-05-30T12:24:30.401Z。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public RayJobInfo withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：结束时间。使用UTC时间格式，格式为yyyy-MM-ddTHH:mm:ssZ，例如2023-05-30T12:24:30.401Z。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public RayJobInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public RayJobInfo withCreateUser(User createUser) {
        this.createUser = createUser;
        return this;
    }

    public RayJobInfo withCreateUser(Consumer<User> createUserSetter) {
        if (this.createUser == null) {
            this.createUser = new User();
            createUserSetter.accept(this.createUser);
        }

        return this;
    }

    /**
     * Get createUser
     * @return createUser
     */
    public User getCreateUser() {
        return createUser;
    }

    public void setCreateUser(User createUser) {
        this.createUser = createUser;
    }

    public RayJobInfo withError(ErrorMessage error) {
        this.error = error;
        return this;
    }

    public RayJobInfo withError(Consumer<ErrorMessage> errorSetter) {
        if (this.error == null) {
            this.error = new ErrorMessage();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /**
     * Get error
     * @return error
     */
    public ErrorMessage getError() {
        return error;
    }

    public void setError(ErrorMessage error) {
        this.error = error;
    }

    public RayJobInfo withHistoryServerEnabled(Boolean historyServerEnabled) {
        this.historyServerEnabled = historyServerEnabled;
        return this;
    }

    /**
     * **参数解释**：指示该作业是否启用了历史服务器（History Server）功能。 **约束限制**：不涉及。 **取值范围**：   - true：启用History Server。   - false：禁用History Server。 **默认取值**：false。
     * @return historyServerEnabled
     */
    public Boolean getHistoryServerEnabled() {
        return historyServerEnabled;
    }

    public void setHistoryServerEnabled(Boolean historyServerEnabled) {
        this.historyServerEnabled = historyServerEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RayJobInfo that = (RayJobInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.endpointName, that.endpointName)
            && Objects.equals(this.config, that.config) && Objects.equals(this.description, that.description)
            && Objects.equals(this.id, that.id) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.submissionId, that.submissionId)
            && Objects.equals(this.endpointType, that.endpointType) && Objects.equals(this.endpointId, that.endpointId)
            && Objects.equals(this.federationId, that.federationId)
            && Objects.equals(this.federationName, that.federationName)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.error, that.error)
            && Objects.equals(this.historyServerEnabled, that.historyServerEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            endpointName,
            config,
            description,
            id,
            duration,
            submissionId,
            endpointType,
            endpointId,
            federationId,
            federationName,
            createTime,
            updateTime,
            startTime,
            endTime,
            status,
            createUser,
            error,
            historyServerEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RayJobInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
        sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    federationId: ").append(toIndentedString(federationId)).append("\n");
        sb.append("    federationName: ").append(toIndentedString(federationName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    historyServerEnabled: ").append(toIndentedString(historyServerEnabled)).append("\n");
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
