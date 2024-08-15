package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateTicketHistoryInfo
 */
public class UpdateTicketHistoryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_cloud_service_id")

    private String currentCloudServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_change_event")

    private Boolean isChangeEvent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_service_interrupt")

    private Boolean isServiceInterrupt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_id")

    private String actionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_action")

    private String subAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    public UpdateTicketHistoryInfo withCurrentCloudServiceId(String currentCloudServiceId) {
        this.currentCloudServiceId = currentCloudServiceId;
        return this;
    }

    /**
     * 扩展字段
     * @return currentCloudServiceId
     */
    public String getCurrentCloudServiceId() {
        return currentCloudServiceId;
    }

    public void setCurrentCloudServiceId(String currentCloudServiceId) {
        this.currentCloudServiceId = currentCloudServiceId;
    }

    public UpdateTicketHistoryInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 扩展字段
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateTicketHistoryInfo withLevelId(String levelId) {
        this.levelId = levelId;
        return this;
    }

    /**
     * 扩展字段
     * @return levelId
     */
    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public UpdateTicketHistoryInfo withMtmRegion(String mtmRegion) {
        this.mtmRegion = mtmRegion;
        return this;
    }

    /**
     * 扩展字段
     * @return mtmRegion
     */
    public String getMtmRegion() {
        return mtmRegion;
    }

    public void setMtmRegion(String mtmRegion) {
        this.mtmRegion = mtmRegion;
    }

    public UpdateTicketHistoryInfo withMtmType(String mtmType) {
        this.mtmType = mtmType;
        return this;
    }

    /**
     * 扩展字段
     * @return mtmType
     */
    public String getMtmType() {
        return mtmType;
    }

    public void setMtmType(String mtmType) {
        this.mtmType = mtmType;
    }

    public UpdateTicketHistoryInfo withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 扩展字段
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public UpdateTicketHistoryInfo withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 扩展字段
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UpdateTicketHistoryInfo withIsChangeEvent(Boolean isChangeEvent) {
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

    public UpdateTicketHistoryInfo withIsServiceInterrupt(Boolean isServiceInterrupt) {
        this.isServiceInterrupt = isServiceInterrupt;
        return this;
    }

    /**
     * 是否变更事件
     * @return isServiceInterrupt
     */
    public Boolean getIsServiceInterrupt() {
        return isServiceInterrupt;
    }

    public void setIsServiceInterrupt(Boolean isServiceInterrupt) {
        this.isServiceInterrupt = isServiceInterrupt;
    }

    public UpdateTicketHistoryInfo withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * 操作标识
     * @return actionId
     */
    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public UpdateTicketHistoryInfo withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 动作
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public UpdateTicketHistoryInfo withSubAction(String subAction) {
        this.subAction = subAction;
        return this;
    }

    /**
     * 子动作
     * @return subAction
     */
    public String getSubAction() {
        return subAction;
    }

    public void setSubAction(String subAction) {
        this.subAction = subAction;
    }

    public UpdateTicketHistoryInfo withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作人
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public UpdateTicketHistoryInfo withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 评论
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTicketHistoryInfo that = (UpdateTicketHistoryInfo) obj;
        return Objects.equals(this.currentCloudServiceId, that.currentCloudServiceId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.levelId, that.levelId)
            && Objects.equals(this.mtmRegion, that.mtmRegion) && Objects.equals(this.mtmType, that.mtmType)
            && Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.title, that.title)
            && Objects.equals(this.isChangeEvent, that.isChangeEvent)
            && Objects.equals(this.isServiceInterrupt, that.isServiceInterrupt)
            && Objects.equals(this.actionId, that.actionId) && Objects.equals(this.action, that.action)
            && Objects.equals(this.subAction, that.subAction) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentCloudServiceId,
            description,
            levelId,
            mtmRegion,
            mtmType,
            sourceId,
            title,
            isChangeEvent,
            isServiceInterrupt,
            actionId,
            action,
            subAction,
            operator,
            comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTicketHistoryInfo {\n");
        sb.append("    currentCloudServiceId: ").append(toIndentedString(currentCloudServiceId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    levelId: ").append(toIndentedString(levelId)).append("\n");
        sb.append("    mtmRegion: ").append(toIndentedString(mtmRegion)).append("\n");
        sb.append("    mtmType: ").append(toIndentedString(mtmType)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    isChangeEvent: ").append(toIndentedString(isChangeEvent)).append("\n");
        sb.append("    isServiceInterrupt: ").append(toIndentedString(isServiceInterrupt)).append("\n");
        sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    subAction: ").append(toIndentedString(subAction)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
