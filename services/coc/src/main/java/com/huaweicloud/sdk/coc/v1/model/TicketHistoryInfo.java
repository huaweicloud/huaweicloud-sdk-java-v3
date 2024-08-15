package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TicketHistoryInfo
 */
public class TicketHistoryInfo {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_id")

    private String ticketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stop_time")

    private Long stopTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_value")

    private String targetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_deteted")

    private Boolean isDeteted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_name_zh")

    private String actionNameZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_name_en")

    private String actionNameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_template_zh")

    private String actionTemplateZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_template_en")

    private String actionTemplateEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "final_sub_action")

    private String finalSubAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enum_data_list")

    private List<EnumDataInfo> enumDataList = null;

    public TicketHistoryInfo withCurrentCloudServiceId(String currentCloudServiceId) {
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

    public TicketHistoryInfo withDescription(String description) {
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

    public TicketHistoryInfo withLevelId(String levelId) {
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

    public TicketHistoryInfo withMtmRegion(String mtmRegion) {
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

    public TicketHistoryInfo withMtmType(String mtmType) {
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

    public TicketHistoryInfo withSourceId(String sourceId) {
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

    public TicketHistoryInfo withTitle(String title) {
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

    public TicketHistoryInfo withIsChangeEvent(Boolean isChangeEvent) {
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

    public TicketHistoryInfo withIsServiceInterrupt(Boolean isServiceInterrupt) {
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

    public TicketHistoryInfo withActionId(String actionId) {
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

    public TicketHistoryInfo withAction(String action) {
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

    public TicketHistoryInfo withSubAction(String subAction) {
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

    public TicketHistoryInfo withOperator(String operator) {
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

    public TicketHistoryInfo withComment(String comment) {
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

    public TicketHistoryInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主键
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TicketHistoryInfo withTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    /**
     * 单号
     * @return ticketId
     */
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public TicketHistoryInfo withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 起始时间
     * minimum: 0
     * maximum: 9999999999999
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public TicketHistoryInfo withStopTime(Long stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    /**
     * 结束时间
     * minimum: 0
     * maximum: 9999999999999
     * @return stopTime
     */
    public Long getStopTime() {
        return stopTime;
    }

    public void setStopTime(Long stopTime) {
        this.stopTime = stopTime;
    }

    public TicketHistoryInfo withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 对象类型
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public TicketHistoryInfo withTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    /**
     * 对象值
     * @return targetValue
     */
    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    public TicketHistoryInfo withIsDeteted(Boolean isDeteted) {
        this.isDeteted = isDeteted;
        return this;
    }

    /**
     * 待修改
     * @return isDeteted
     */
    public Boolean getIsDeteted() {
        return isDeteted;
    }

    public void setIsDeteted(Boolean isDeteted) {
        this.isDeteted = isDeteted;
    }

    public TicketHistoryInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * minimum: 0
     * maximum: 9999999999999
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public TicketHistoryInfo withActionNameZh(String actionNameZh) {
        this.actionNameZh = actionNameZh;
        return this;
    }

    /**
     * action中文名
     * @return actionNameZh
     */
    public String getActionNameZh() {
        return actionNameZh;
    }

    public void setActionNameZh(String actionNameZh) {
        this.actionNameZh = actionNameZh;
    }

    public TicketHistoryInfo withActionNameEn(String actionNameEn) {
        this.actionNameEn = actionNameEn;
        return this;
    }

    /**
     * action英文名
     * @return actionNameEn
     */
    public String getActionNameEn() {
        return actionNameEn;
    }

    public void setActionNameEn(String actionNameEn) {
        this.actionNameEn = actionNameEn;
    }

    public TicketHistoryInfo withActionTemplateZh(String actionTemplateZh) {
        this.actionTemplateZh = actionTemplateZh;
        return this;
    }

    /**
     * action中文模板
     * @return actionTemplateZh
     */
    public String getActionTemplateZh() {
        return actionTemplateZh;
    }

    public void setActionTemplateZh(String actionTemplateZh) {
        this.actionTemplateZh = actionTemplateZh;
    }

    public TicketHistoryInfo withActionTemplateEn(String actionTemplateEn) {
        this.actionTemplateEn = actionTemplateEn;
        return this;
    }

    /**
     * action中文模板
     * @return actionTemplateEn
     */
    public String getActionTemplateEn() {
        return actionTemplateEn;
    }

    public void setActionTemplateEn(String actionTemplateEn) {
        this.actionTemplateEn = actionTemplateEn;
    }

    public TicketHistoryInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 工单状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TicketHistoryInfo withFinalSubAction(String finalSubAction) {
        this.finalSubAction = finalSubAction;
        return this;
    }

    /**
     * 最终子动作
     * @return finalSubAction
     */
    public String getFinalSubAction() {
        return finalSubAction;
    }

    public void setFinalSubAction(String finalSubAction) {
        this.finalSubAction = finalSubAction;
    }

    public TicketHistoryInfo withEnumDataList(List<EnumDataInfo> enumDataList) {
        this.enumDataList = enumDataList;
        return this;
    }

    public TicketHistoryInfo addEnumDataListItem(EnumDataInfo enumDataListItem) {
        if (this.enumDataList == null) {
            this.enumDataList = new ArrayList<>();
        }
        this.enumDataList.add(enumDataListItem);
        return this;
    }

    public TicketHistoryInfo withEnumDataList(Consumer<List<EnumDataInfo>> enumDataListSetter) {
        if (this.enumDataList == null) {
            this.enumDataList = new ArrayList<>();
        }
        enumDataListSetter.accept(this.enumDataList);
        return this;
    }

    /**
     * 枚举数据
     * @return enumDataList
     */
    public List<EnumDataInfo> getEnumDataList() {
        return enumDataList;
    }

    public void setEnumDataList(List<EnumDataInfo> enumDataList) {
        this.enumDataList = enumDataList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TicketHistoryInfo that = (TicketHistoryInfo) obj;
        return Objects.equals(this.currentCloudServiceId, that.currentCloudServiceId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.levelId, that.levelId)
            && Objects.equals(this.mtmRegion, that.mtmRegion) && Objects.equals(this.mtmType, that.mtmType)
            && Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.title, that.title)
            && Objects.equals(this.isChangeEvent, that.isChangeEvent)
            && Objects.equals(this.isServiceInterrupt, that.isServiceInterrupt)
            && Objects.equals(this.actionId, that.actionId) && Objects.equals(this.action, that.action)
            && Objects.equals(this.subAction, that.subAction) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.comment, that.comment) && Objects.equals(this.id, that.id)
            && Objects.equals(this.ticketId, that.ticketId) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.stopTime, that.stopTime) && Objects.equals(this.targetType, that.targetType)
            && Objects.equals(this.targetValue, that.targetValue) && Objects.equals(this.isDeteted, that.isDeteted)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.actionNameZh, that.actionNameZh)
            && Objects.equals(this.actionNameEn, that.actionNameEn)
            && Objects.equals(this.actionTemplateZh, that.actionTemplateZh)
            && Objects.equals(this.actionTemplateEn, that.actionTemplateEn) && Objects.equals(this.status, that.status)
            && Objects.equals(this.finalSubAction, that.finalSubAction)
            && Objects.equals(this.enumDataList, that.enumDataList);
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
            comment,
            id,
            ticketId,
            startTime,
            stopTime,
            targetType,
            targetValue,
            isDeteted,
            updateTime,
            actionNameZh,
            actionNameEn,
            actionTemplateZh,
            actionTemplateEn,
            status,
            finalSubAction,
            enumDataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TicketHistoryInfo {\n");
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
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
        sb.append("    isDeteted: ").append(toIndentedString(isDeteted)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    actionNameZh: ").append(toIndentedString(actionNameZh)).append("\n");
        sb.append("    actionNameEn: ").append(toIndentedString(actionNameEn)).append("\n");
        sb.append("    actionTemplateZh: ").append(toIndentedString(actionTemplateZh)).append("\n");
        sb.append("    actionTemplateEn: ").append(toIndentedString(actionTemplateEn)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    finalSubAction: ").append(toIndentedString(finalSubAction)).append("\n");
        sb.append("    enumDataList: ").append(toIndentedString(enumDataList)).append("\n");
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
