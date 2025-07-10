package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlarmToIncidentRequestBody
 */
public class AlarmToIncidentRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_ids")

    private String alarmIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee")

    private String assignee;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee_role")

    private String assigneeRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee_scene")

    private String assigneeScene;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment")

    private String attachment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_cloud_service_id")

    private String currentCloudServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_change_event")

    private Boolean isChangeEvent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_service_interrupt")

    private Boolean isServiceInterrupt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level_id")

    private String levelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mtm_region")

    private String mtmRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mtm_type")

    private String mtmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    public AlarmToIncidentRequestBody withAlarmIds(String alarmIds) {
        this.alarmIds = alarmIds;
        return this;
    }

    /**
     * 告警id，多个以”，分隔“
     * @return alarmIds
     */
    public String getAlarmIds() {
        return alarmIds;
    }

    public void setAlarmIds(String alarmIds) {
        this.alarmIds = alarmIds;
    }

    public AlarmToIncidentRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public AlarmToIncidentRequestBody withAssignee(String assignee) {
        this.assignee = assignee;
        return this;
    }

    /**
     * 责任人（个人）
     * @return assignee
     */
    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public AlarmToIncidentRequestBody withAssigneeRole(String assigneeRole) {
        this.assigneeRole = assigneeRole;
        return this;
    }

    /**
     * 责任人（排班角色）
     * @return assigneeRole
     */
    public String getAssigneeRole() {
        return assigneeRole;
    }

    public void setAssigneeRole(String assigneeRole) {
        this.assigneeRole = assigneeRole;
    }

    public AlarmToIncidentRequestBody withAssigneeScene(String assigneeScene) {
        this.assigneeScene = assigneeScene;
        return this;
    }

    /**
     * 责任人（排版场景）
     * @return assigneeScene
     */
    public String getAssigneeScene() {
        return assigneeScene;
    }

    public void setAssigneeScene(String assigneeScene) {
        this.assigneeScene = assigneeScene;
    }

    public AlarmToIncidentRequestBody withAttachment(String attachment) {
        this.attachment = attachment;
        return this;
    }

    /**
     * 附件
     * @return attachment
     */
    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public AlarmToIncidentRequestBody withCurrentCloudServiceId(String currentCloudServiceId) {
        this.currentCloudServiceId = currentCloudServiceId;
        return this;
    }

    /**
     * 归属应用
     * @return currentCloudServiceId
     */
    public String getCurrentCloudServiceId() {
        return currentCloudServiceId;
    }

    public void setCurrentCloudServiceId(String currentCloudServiceId) {
        this.currentCloudServiceId = currentCloudServiceId;
    }

    public AlarmToIncidentRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 事件描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AlarmToIncidentRequestBody withIsChangeEvent(Boolean isChangeEvent) {
        this.isChangeEvent = isChangeEvent;
        return this;
    }

    /**
     * 是否变更事件
     * @return isChangeEvent
     */
    public Boolean getIsChangeEvent() {
        return isChangeEvent;
    }

    public void setIsChangeEvent(Boolean isChangeEvent) {
        this.isChangeEvent = isChangeEvent;
    }

    public AlarmToIncidentRequestBody withIsServiceInterrupt(Boolean isServiceInterrupt) {
        this.isServiceInterrupt = isServiceInterrupt;
        return this;
    }

    /**
     * 业务是否中断
     * @return isServiceInterrupt
     */
    public Boolean getIsServiceInterrupt() {
        return isServiceInterrupt;
    }

    public void setIsServiceInterrupt(Boolean isServiceInterrupt) {
        this.isServiceInterrupt = isServiceInterrupt;
    }

    public AlarmToIncidentRequestBody withLevelId(String levelId) {
        this.levelId = levelId;
        return this;
    }

    /**
     * 事件等级
     * @return levelId
     */
    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public AlarmToIncidentRequestBody withMtmRegion(String mtmRegion) {
        this.mtmRegion = mtmRegion;
        return this;
    }

    /**
     * region
     * @return mtmRegion
     */
    public String getMtmRegion() {
        return mtmRegion;
    }

    public void setMtmRegion(String mtmRegion) {
        this.mtmRegion = mtmRegion;
    }

    public AlarmToIncidentRequestBody withMtmType(String mtmType) {
        this.mtmType = mtmType;
        return this;
    }

    /**
     * 事件类别
     * @return mtmType
     */
    public String getMtmType() {
        return mtmType;
    }

    public void setMtmType(String mtmType) {
        this.mtmType = mtmType;
    }

    public AlarmToIncidentRequestBody withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 资源id
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public AlarmToIncidentRequestBody withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 事件名称
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmToIncidentRequestBody that = (AlarmToIncidentRequestBody) obj;
        return Objects.equals(this.alarmIds, that.alarmIds)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.assignee, that.assignee) && Objects.equals(this.assigneeRole, that.assigneeRole)
            && Objects.equals(this.assigneeScene, that.assigneeScene)
            && Objects.equals(this.attachment, that.attachment)
            && Objects.equals(this.currentCloudServiceId, that.currentCloudServiceId)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.isChangeEvent, that.isChangeEvent)
            && Objects.equals(this.isServiceInterrupt, that.isServiceInterrupt)
            && Objects.equals(this.levelId, that.levelId) && Objects.equals(this.mtmRegion, that.mtmRegion)
            && Objects.equals(this.mtmType, that.mtmType) && Objects.equals(this.sourceId, that.sourceId)
            && Objects.equals(this.title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alarmIds,
            enterpriseProjectId,
            assignee,
            assigneeRole,
            assigneeScene,
            attachment,
            currentCloudServiceId,
            description,
            isChangeEvent,
            isServiceInterrupt,
            levelId,
            mtmRegion,
            mtmType,
            sourceId,
            title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmToIncidentRequestBody {\n");
        sb.append("    alarmIds: ").append(toIndentedString(alarmIds)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    assigneeRole: ").append(toIndentedString(assigneeRole)).append("\n");
        sb.append("    assigneeScene: ").append(toIndentedString(assigneeScene)).append("\n");
        sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
        sb.append("    currentCloudServiceId: ").append(toIndentedString(currentCloudServiceId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isChangeEvent: ").append(toIndentedString(isChangeEvent)).append("\n");
        sb.append("    isServiceInterrupt: ").append(toIndentedString(isServiceInterrupt)).append("\n");
        sb.append("    levelId: ").append(toIndentedString(levelId)).append("\n");
        sb.append("    mtmRegion: ").append(toIndentedString(mtmRegion)).append("\n");
        sb.append("    mtmType: ").append(toIndentedString(mtmType)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
