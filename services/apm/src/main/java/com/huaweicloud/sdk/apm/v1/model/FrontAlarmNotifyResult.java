package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 告警通知内容。
 */
public class FrontAlarmNotifyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gmt_create")

    private String gmtCreate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_type")

    private String notifyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_rule_id")

    private Long alarmRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private Long templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_data_event_id")

    private Long alarmDataEventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_status")

    private Boolean notifyStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_content")

    private String alarmContent;

    public FrontAlarmNotifyResult withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 告警通知id。
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FrontAlarmNotifyResult withGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }

    /**
     * 创建时间。
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public FrontAlarmNotifyResult withNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }

    /**
     * 通知类型。
     * @return notifyType
     */
    public String getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }

    public FrontAlarmNotifyResult withAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
        return this;
    }

    /**
     * 告警规则id。
     * @return alarmRuleId
     */
    public Long getAlarmRuleId() {
        return alarmRuleId;
    }

    public void setAlarmRuleId(Long alarmRuleId) {
        this.alarmRuleId = alarmRuleId;
    }

    public FrontAlarmNotifyResult withTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板id。
     * @return templateId
     */
    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public FrontAlarmNotifyResult withAlarmDataEventId(Long alarmDataEventId) {
        this.alarmDataEventId = alarmDataEventId;
        return this;
    }

    /**
     * 关联事件id。
     * @return alarmDataEventId
     */
    public Long getAlarmDataEventId() {
        return alarmDataEventId;
    }

    public void setAlarmDataEventId(Long alarmDataEventId) {
        this.alarmDataEventId = alarmDataEventId;
    }

    public FrontAlarmNotifyResult withNotifyStatus(Boolean notifyStatus) {
        this.notifyStatus = notifyStatus;
        return this;
    }

    /**
     * 通知结果。
     * @return notifyStatus
     */
    public Boolean getNotifyStatus() {
        return notifyStatus;
    }

    public void setNotifyStatus(Boolean notifyStatus) {
        this.notifyStatus = notifyStatus;
    }

    public FrontAlarmNotifyResult withAlarmContent(String alarmContent) {
        this.alarmContent = alarmContent;
        return this;
    }

    /**
     * 通知内容。
     * @return alarmContent
     */
    public String getAlarmContent() {
        return alarmContent;
    }

    public void setAlarmContent(String alarmContent) {
        this.alarmContent = alarmContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FrontAlarmNotifyResult that = (FrontAlarmNotifyResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.gmtCreate, that.gmtCreate)
            && Objects.equals(this.notifyType, that.notifyType) && Objects.equals(this.alarmRuleId, that.alarmRuleId)
            && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.alarmDataEventId, that.alarmDataEventId)
            && Objects.equals(this.notifyStatus, that.notifyStatus)
            && Objects.equals(this.alarmContent, that.alarmContent);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, gmtCreate, notifyType, alarmRuleId, templateId, alarmDataEventId, notifyStatus, alarmContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FrontAlarmNotifyResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
        sb.append("    notifyType: ").append(toIndentedString(notifyType)).append("\n");
        sb.append("    alarmRuleId: ").append(toIndentedString(alarmRuleId)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    alarmDataEventId: ").append(toIndentedString(alarmDataEventId)).append("\n");
        sb.append("    notifyStatus: ").append(toIndentedString(notifyStatus)).append("\n");
        sb.append("    alarmContent: ").append(toIndentedString(alarmContent)).append("\n");
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
