package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 更新订阅事件请求体。 **取值范围**： 不涉及。
 */
public class EventSubUpdateRequest {

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
    @JsonProperty(value = "notification_target")

    private String notificationTarget;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_target_name")

    private String notificationTargetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_target_type")

    private String notificationTargetType;

    public EventSubUpdateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 事件订阅名称。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventSubUpdateRequest withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * **参数解释**： 事件源类型。 **取值范围**： 支持cluster，backup，disaster-recovery。
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public EventSubUpdateRequest withSourceId(String sourceId) {
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

    public EventSubUpdateRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 事件类别。 **取值范围**： 支持management、monitor、security、system alarm。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public EventSubUpdateRequest withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * **参数解释**： 事件级别。 **取值范围**： 支持normal、warning。
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public EventSubUpdateRequest withTag(String tag) {
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

    public EventSubUpdateRequest withEnable(Integer enable) {
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

    public EventSubUpdateRequest withNotificationTarget(String notificationTarget) {
        this.notificationTarget = notificationTarget;
        return this;
    }

    /**
     * **参数解释**： 消息通知地址。 **取值范围**： 不涉及。
     * @return notificationTarget
     */
    public String getNotificationTarget() {
        return notificationTarget;
    }

    public void setNotificationTarget(String notificationTarget) {
        this.notificationTarget = notificationTarget;
    }

    public EventSubUpdateRequest withNotificationTargetName(String notificationTargetName) {
        this.notificationTargetName = notificationTargetName;
        return this;
    }

    /**
     * **参数解释**： 消息主题名称。 **取值范围**： 不涉及。
     * @return notificationTargetName
     */
    public String getNotificationTargetName() {
        return notificationTargetName;
    }

    public void setNotificationTargetName(String notificationTargetName) {
        this.notificationTargetName = notificationTargetName;
    }

    public EventSubUpdateRequest withNotificationTargetType(String notificationTargetType) {
        this.notificationTargetType = notificationTargetType;
        return this;
    }

    /**
     * **参数解释**： 消息通知类型。只支持SMN。 **取值范围**： SMN。
     * @return notificationTargetType
     */
    public String getNotificationTargetType() {
        return notificationTargetType;
    }

    public void setNotificationTargetType(String notificationTargetType) {
        this.notificationTargetType = notificationTargetType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventSubUpdateRequest that = (EventSubUpdateRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.sourceType, that.sourceType)
            && Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.category, that.category)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.tag, that.tag)
            && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.notificationTarget, that.notificationTarget)
            && Objects.equals(this.notificationTargetName, that.notificationTargetName)
            && Objects.equals(this.notificationTargetType, that.notificationTargetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            sourceType,
            sourceId,
            category,
            severity,
            tag,
            enable,
            notificationTarget,
            notificationTargetName,
            notificationTargetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventSubUpdateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    notificationTarget: ").append(toIndentedString(notificationTarget)).append("\n");
        sb.append("    notificationTargetName: ").append(toIndentedString(notificationTargetName)).append("\n");
        sb.append("    notificationTargetType: ").append(toIndentedString(notificationTargetType)).append("\n");
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
