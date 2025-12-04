package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AutoCesAlarmInfo
 */
public class AutoCesAlarmInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_instance_default")

    private Boolean newInstanceDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_status")

    private String switchStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private String alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private Long updatedAt;

    public AutoCesAlarmInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：  告警记录唯一标识符。  **约束限制**：  不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AutoCesAlarmInfo withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**：  租户ID。  **约束限制**：  不涉及。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public AutoCesAlarmInfo withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * **参数解释**：  租户名称。  **约束限制**：  不涉及。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public AutoCesAlarmInfo withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释**：  用户ID。  **约束限制**：  不涉及。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public AutoCesAlarmInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**：  用户名称。  **约束限制**：  不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AutoCesAlarmInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**：  项目ID。  **约束限制**：  不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AutoCesAlarmInfo withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释**：  项目名称。  **约束限制**：  不涉及。
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public AutoCesAlarmInfo withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * **参数解释**：  数据库引擎名称。  **约束限制**：  不涉及。
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public AutoCesAlarmInfo withNewInstanceDefault(Boolean newInstanceDefault) {
        this.newInstanceDefault = newInstanceDefault;
        return this;
    }

    /**
     * **参数解释**：  新实例是否默认开启自动告警。  **约束限制**：  不涉及。
     * @return newInstanceDefault
     */
    public Boolean getNewInstanceDefault() {
        return newInstanceDefault;
    }

    public void setNewInstanceDefault(Boolean newInstanceDefault) {
        this.newInstanceDefault = newInstanceDefault;
    }

    public AutoCesAlarmInfo withSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }

    /**
     * **参数解释**：  自动告警状态转换。  **约束限制**：  不涉及。
     * @return switchStatus
     */
    public String getSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
    }

    public AutoCesAlarmInfo withAlarmId(String alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * **参数解释**：  告警规则唯一标识符。  **约束限制**：  不涉及。
     * @return alarmId
     */
    public String getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(String alarmId) {
        this.alarmId = alarmId;
    }

    public AutoCesAlarmInfo withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * **参数解释**：  主题URN。  **约束限制**：  不涉及。
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public AutoCesAlarmInfo withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**：  记录被创建的时间戳。  **约束限制**：  不涉及。
     * minimum: 0
     * maximum: 9999999999999
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public AutoCesAlarmInfo withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释**：  记录最后一次被更新的时间戳。  **约束限制**：  不涉及。
     * minimum: 0
     * maximum: 9999999999999
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoCesAlarmInfo that = (AutoCesAlarmInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.projectName, that.projectName) && Objects.equals(this.engineName, that.engineName)
            && Objects.equals(this.newInstanceDefault, that.newInstanceDefault)
            && Objects.equals(this.switchStatus, that.switchStatus) && Objects.equals(this.alarmId, that.alarmId)
            && Objects.equals(this.topicUrn, that.topicUrn) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            domainId,
            domainName,
            userId,
            userName,
            projectId,
            projectName,
            engineName,
            newInstanceDefault,
            switchStatus,
            alarmId,
            topicUrn,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoCesAlarmInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    newInstanceDefault: ").append(toIndentedString(newInstanceDefault)).append("\n");
        sb.append("    switchStatus: ").append(toIndentedString(switchStatus)).append("\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
