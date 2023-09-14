package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 事件通知记录。
 */
public class Record {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private String eventName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_event_type")

    private String triggerEventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_name")

    private String secretName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_type")

    private String secretType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_target_name")

    private String notificationTargetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_target_id")

    private String notificationTargetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_content")

    private String notificationContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_status")

    private String notificationStatus;

    public Record withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * 凭据名称。
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Record withTriggerEventType(String triggerEventType) {
        this.triggerEventType = triggerEventType;
        return this;
    }

    /**
     * 凭据类型  取值 ： COMMON ：通用凭据 RDS ：RDS凭据 
     * @return triggerEventType
     */
    public String getTriggerEventType() {
        return triggerEventType;
    }

    public void setTriggerEventType(String triggerEventType) {
        this.triggerEventType = triggerEventType;
    }

    public Record withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 事件通知记录的创建时间，时间戳，即从1970年1月1日至该时间的总秒数。 
     * minimum: 0
     * maximum: 13
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Record withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * 凭据名称。
     * @return secretName
     */
    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(String secretName) {
        this.secretName = secretName;
    }

    public Record withSecretType(String secretType) {
        this.secretType = secretType;
        return this;
    }

    /**
     * 凭据类型  取值 ： COMMON ：通用凭据(默认)。用于应用系统中的各种敏感信息储存。         RDS ：RDS凭据 。专门针对RDS的凭据，用于存储RDS的账号信息。 
     * @return secretType
     */
    public String getSecretType() {
        return secretType;
    }

    public void setSecretType(String secretType) {
        this.secretType = secretType;
    }

    public Record withNotificationTargetName(String notificationTargetName) {
        this.notificationTargetName = notificationTargetName;
        return this;
    }

    /**
     * 事件通知的对象名称。
     * @return notificationTargetName
     */
    public String getNotificationTargetName() {
        return notificationTargetName;
    }

    public void setNotificationTargetName(String notificationTargetName) {
        this.notificationTargetName = notificationTargetName;
    }

    public Record withNotificationTargetId(String notificationTargetId) {
        this.notificationTargetId = notificationTargetId;
        return this;
    }

    /**
     * 事件通知的对象ID。
     * @return notificationTargetId
     */
    public String getNotificationTargetId() {
        return notificationTargetId;
    }

    public void setNotificationTargetId(String notificationTargetId) {
        this.notificationTargetId = notificationTargetId;
    }

    public Record withNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
        return this;
    }

    /**
     * 凭据的描述信息。
     * @return notificationContent
     */
    public String getNotificationContent() {
        return notificationContent;
    }

    public void setNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
    }

    public Record withNotificationStatus(String notificationStatus) {
        this.notificationStatus = notificationStatus;
        return this;
    }

    /**
     * 凭据类型  取值 ： SUCCESS ：事件通知成功。         FAIL ：事件通知失败。         INVALID ：事件通知配置主题信息无效或不正确，无法触发通知。 
     * @return notificationStatus
     */
    public String getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(String notificationStatus) {
        this.notificationStatus = notificationStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Record that = (Record) obj;
        return Objects.equals(this.eventName, that.eventName)
            && Objects.equals(this.triggerEventType, that.triggerEventType)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.secretName, that.secretName)
            && Objects.equals(this.secretType, that.secretType)
            && Objects.equals(this.notificationTargetName, that.notificationTargetName)
            && Objects.equals(this.notificationTargetId, that.notificationTargetId)
            && Objects.equals(this.notificationContent, that.notificationContent)
            && Objects.equals(this.notificationStatus, that.notificationStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName,
            triggerEventType,
            createTime,
            secretName,
            secretType,
            notificationTargetName,
            notificationTargetId,
            notificationContent,
            notificationStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Record {\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    triggerEventType: ").append(toIndentedString(triggerEventType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
        sb.append("    secretType: ").append(toIndentedString(secretType)).append("\n");
        sb.append("    notificationTargetName: ").append(toIndentedString(notificationTargetName)).append("\n");
        sb.append("    notificationTargetId: ").append(toIndentedString(notificationTargetId)).append("\n");
        sb.append("    notificationContent: ").append(toIndentedString(notificationContent)).append("\n");
        sb.append("    notificationStatus: ").append(toIndentedString(notificationStatus)).append("\n");
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
