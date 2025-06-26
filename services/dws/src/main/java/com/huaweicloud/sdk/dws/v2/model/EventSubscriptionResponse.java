package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 事件订阅详情。 **取值范围**： 不涉及。
 */
public class EventSubscriptionResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Integer enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_space")

    private String nameSpace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_target")

    private String notificationTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_target_name")

    private String notificationTargetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_target_type")

    private String notificationTargetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_zone")

    private String timeZone;

    public EventSubscriptionResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 订阅ID。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EventSubscriptionResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 订阅名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventSubscriptionResponse withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * **参数解释**： 事件源类型。 **取值范围**： 不涉及。
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public EventSubscriptionResponse withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * **参数解释**： 事件源ID。 **取值范围**： 不涉及。
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public EventSubscriptionResponse withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 事件类别。 **取值范围**： 不涉及。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public EventSubscriptionResponse withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**： 事件级别。 **取值范围**： 不涉及。
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public EventSubscriptionResponse withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * **参数解释**： 事件标签。 **取值范围**： 不涉及。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public EventSubscriptionResponse withEnable(Integer enable) {
        this.enable = enable;
        return this;
    }

    /**
     * **参数解释**： 是否开启订阅。 **取值范围**： 1为开启，0为关闭。
     * @return enable
     */
    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public EventSubscriptionResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： 项目ID。 **取值范围**： 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public EventSubscriptionResponse withNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }

    /**
     * **参数解释**： 所属服务。 **取值范围**： 不涉及。
     * @return nameSpace
     */
    public String getNameSpace() {
        return nameSpace;
    }

    public void setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
    }

    public EventSubscriptionResponse withNotificationTarget(String notificationTarget) {
        this.notificationTarget = notificationTarget;
        return this;
    }

    /**
     * **参数解释**： 消息通知主题地址。 **取值范围**： 不涉及。
     * @return notificationTarget
     */
    public String getNotificationTarget() {
        return notificationTarget;
    }

    public void setNotificationTarget(String notificationTarget) {
        this.notificationTarget = notificationTarget;
    }

    public EventSubscriptionResponse withNotificationTargetName(String notificationTargetName) {
        this.notificationTargetName = notificationTargetName;
        return this;
    }

    /**
     * **参数解释**： 消息通知主题名称。 **取值范围**： 不涉及。
     * @return notificationTargetName
     */
    public String getNotificationTargetName() {
        return notificationTargetName;
    }

    public void setNotificationTargetName(String notificationTargetName) {
        this.notificationTargetName = notificationTargetName;
    }

    public EventSubscriptionResponse withNotificationTargetType(String notificationTargetType) {
        this.notificationTargetType = notificationTargetType;
        return this;
    }

    /**
     * **参数解释**： 消息通知类型。 **取值范围**： 不涉及。
     * @return notificationTargetType
     */
    public String getNotificationTargetType() {
        return notificationTargetType;
    }

    public void setNotificationTargetType(String notificationTargetType) {
        this.notificationTargetType = notificationTargetType;
    }

    public EventSubscriptionResponse withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * **参数解释**： 语言。 **取值范围**： 不涉及。
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public EventSubscriptionResponse withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * **参数解释**： 时区。 **取值范围**： 不涉及。
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventSubscriptionResponse that = (EventSubscriptionResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.sourceType, that.sourceType) && Objects.equals(this.sourceId, that.sourceId)
            && Objects.equals(this.category, that.category) && Objects.equals(this.severity, that.severity)
            && Objects.equals(this.tag, that.tag) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.nameSpace, that.nameSpace)
            && Objects.equals(this.notificationTarget, that.notificationTarget)
            && Objects.equals(this.notificationTargetName, that.notificationTargetName)
            && Objects.equals(this.notificationTargetType, that.notificationTargetType)
            && Objects.equals(this.language, that.language) && Objects.equals(this.timeZone, that.timeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            sourceType,
            sourceId,
            category,
            severity,
            tag,
            enable,
            projectId,
            nameSpace,
            notificationTarget,
            notificationTargetName,
            notificationTargetType,
            language,
            timeZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventSubscriptionResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    nameSpace: ").append(toIndentedString(nameSpace)).append("\n");
        sb.append("    notificationTarget: ").append(toIndentedString(notificationTarget)).append("\n");
        sb.append("    notificationTargetName: ").append(toIndentedString(notificationTargetName)).append("\n");
        sb.append("    notificationTargetType: ").append(toIndentedString(notificationTargetType)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
