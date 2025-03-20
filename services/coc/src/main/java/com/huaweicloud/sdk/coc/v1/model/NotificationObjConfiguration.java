package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 通知对象配置
 */
public class NotificationObjConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_endpoint_type")

    private String notificationEndpointType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_scene")

    private String scheduleScene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_role")

    private String scheduleRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_role_name")

    private String scheduleRoleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recipients")

    private String recipients;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_type")

    private String groupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    public NotificationObjConfiguration withNotificationEndpointType(String notificationEndpointType) {
        this.notificationEndpointType = notificationEndpointType;
        return this;
    }

    /**
     * 通知对象类型（排班/个人/工单责任人/群组）
     * @return notificationEndpointType
     */
    public String getNotificationEndpointType() {
        return notificationEndpointType;
    }

    public void setNotificationEndpointType(String notificationEndpointType) {
        this.notificationEndpointType = notificationEndpointType;
    }

    public NotificationObjConfiguration withScheduleScene(String scheduleScene) {
        this.scheduleScene = scheduleScene;
        return this;
    }

    /**
     * 排班场景ID
     * @return scheduleScene
     */
    public String getScheduleScene() {
        return scheduleScene;
    }

    public void setScheduleScene(String scheduleScene) {
        this.scheduleScene = scheduleScene;
    }

    public NotificationObjConfiguration withScheduleRole(String scheduleRole) {
        this.scheduleRole = scheduleRole;
        return this;
    }

    /**
     * 排班角色ID
     * @return scheduleRole
     */
    public String getScheduleRole() {
        return scheduleRole;
    }

    public void setScheduleRole(String scheduleRole) {
        this.scheduleRole = scheduleRole;
    }

    public NotificationObjConfiguration withScheduleRoleName(String scheduleRoleName) {
        this.scheduleRoleName = scheduleRoleName;
        return this;
    }

    /**
     * 排班角色名称
     * @return scheduleRoleName
     */
    public String getScheduleRoleName() {
        return scheduleRoleName;
    }

    public void setScheduleRoleName(String scheduleRoleName) {
        this.scheduleRoleName = scheduleRoleName;
    }

    public NotificationObjConfiguration withRecipients(String recipients) {
        this.recipients = recipients;
        return this;
    }

    /**
     * 消息通知接收人，对于群组通知而言其对应的是被@的群成员
     * @return recipients
     */
    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    public NotificationObjConfiguration withGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * 群组类型（企业微信/钉钉/飞书）
     * @return groupType
     */
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public NotificationObjConfiguration withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 群组ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public NotificationObjConfiguration withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 群组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NotificationObjConfiguration that = (NotificationObjConfiguration) obj;
        return Objects.equals(this.notificationEndpointType, that.notificationEndpointType)
            && Objects.equals(this.scheduleScene, that.scheduleScene)
            && Objects.equals(this.scheduleRole, that.scheduleRole)
            && Objects.equals(this.scheduleRoleName, that.scheduleRoleName)
            && Objects.equals(this.recipients, that.recipients) && Objects.equals(this.groupType, that.groupType)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.groupName, that.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationEndpointType,
            scheduleScene,
            scheduleRole,
            scheduleRoleName,
            recipients,
            groupType,
            groupId,
            groupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationObjConfiguration {\n");
        sb.append("    notificationEndpointType: ").append(toIndentedString(notificationEndpointType)).append("\n");
        sb.append("    scheduleScene: ").append(toIndentedString(scheduleScene)).append("\n");
        sb.append("    scheduleRole: ").append(toIndentedString(scheduleRole)).append("\n");
        sb.append("    scheduleRoleName: ").append(toIndentedString(scheduleRoleName)).append("\n");
        sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
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
