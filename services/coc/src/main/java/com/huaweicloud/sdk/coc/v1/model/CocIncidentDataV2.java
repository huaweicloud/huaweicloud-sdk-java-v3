package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IncidentData
 */
public class CocIncidentDataV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_cloud_service_id")

    private String currentCloudServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level_id")

    private String levelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mtm_region")

    private String mtmRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forward_rule_id")

    private String forwardRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mtm_type")

    private String mtmType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_id")

    private String ticketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_service_interrupt")

    private String isServiceInterrupt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_flow_status")

    private String workFlowStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee")

    private String assignee;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_time")

    private String handleTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_ownership")

    private String incidentOwnership;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enum_data_list")

    private List<CocTicketInfoEnumDataV2> enumDataList = null;

    public CocIncidentDataV2 withCurrentCloudServiceId(String currentCloudServiceId) {
        this.currentCloudServiceId = currentCloudServiceId;
        return this;
    }

    /**
     * 云服务
     * @return currentCloudServiceId
     */
    public String getCurrentCloudServiceId() {
        return currentCloudServiceId;
    }

    public void setCurrentCloudServiceId(String currentCloudServiceId) {
        this.currentCloudServiceId = currentCloudServiceId;
    }

    public CocIncidentDataV2 withLevelId(String levelId) {
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

    public CocIncidentDataV2 withMtmRegion(String mtmRegion) {
        this.mtmRegion = mtmRegion;
        return this;
    }

    /**
     * 区域Region
     * @return mtmRegion
     */
    public String getMtmRegion() {
        return mtmRegion;
    }

    public void setMtmRegion(String mtmRegion) {
        this.mtmRegion = mtmRegion;
    }

    public CocIncidentDataV2 withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 事件来源
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public CocIncidentDataV2 withForwardRuleId(String forwardRuleId) {
        this.forwardRuleId = forwardRuleId;
        return this;
    }

    /**
     * 转发规则
     * @return forwardRuleId
     */
    public String getForwardRuleId() {
        return forwardRuleId;
    }

    public void setForwardRuleId(String forwardRuleId) {
        this.forwardRuleId = forwardRuleId;
    }

    public CocIncidentDataV2 withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业应用
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CocIncidentDataV2 withMtmType(String mtmType) {
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

    public CocIncidentDataV2 withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 事件标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CocIncidentDataV2 withDescription(String description) {
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

    public CocIncidentDataV2 withTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    /**
     * 事件单号
     * @return ticketId
     */
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public CocIncidentDataV2 withIsServiceInterrupt(String isServiceInterrupt) {
        this.isServiceInterrupt = isServiceInterrupt;
        return this;
    }

    /**
     * 服务是否中断
     * @return isServiceInterrupt
     */
    public String getIsServiceInterrupt() {
        return isServiceInterrupt;
    }

    public void setIsServiceInterrupt(String isServiceInterrupt) {
        this.isServiceInterrupt = isServiceInterrupt;
    }

    public CocIncidentDataV2 withWorkFlowStatus(String workFlowStatus) {
        this.workFlowStatus = workFlowStatus;
        return this;
    }

    /**
     * 流程状态
     * @return workFlowStatus
     */
    public String getWorkFlowStatus() {
        return workFlowStatus;
    }

    public void setWorkFlowStatus(String workFlowStatus) {
        this.workFlowStatus = workFlowStatus;
    }

    public CocIncidentDataV2 withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 阶段
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public CocIncidentDataV2 withAssignee(String assignee) {
        this.assignee = assignee;
        return this;
    }

    /**
     * 责任人
     * @return assignee
     */
    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public CocIncidentDataV2 withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public CocIncidentDataV2 withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 创建人
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public CocIncidentDataV2 withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public CocIncidentDataV2 withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public CocIncidentDataV2 withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 故障开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CocIncidentDataV2 withHandleTime(String handleTime) {
        this.handleTime = handleTime;
        return this;
    }

    /**
     * 最近一次处理时间
     * @return handleTime
     */
    public String getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(String handleTime) {
        this.handleTime = handleTime;
    }

    public CocIncidentDataV2 withIncidentOwnership(String incidentOwnership) {
        this.incidentOwnership = incidentOwnership;
        return this;
    }

    /**
     * 事件归属
     * @return incidentOwnership
     */
    public String getIncidentOwnership() {
        return incidentOwnership;
    }

    public void setIncidentOwnership(String incidentOwnership) {
        this.incidentOwnership = incidentOwnership;
    }

    public CocIncidentDataV2 withEnumDataList(List<CocTicketInfoEnumDataV2> enumDataList) {
        this.enumDataList = enumDataList;
        return this;
    }

    public CocIncidentDataV2 addEnumDataListItem(CocTicketInfoEnumDataV2 enumDataListItem) {
        if (this.enumDataList == null) {
            this.enumDataList = new ArrayList<>();
        }
        this.enumDataList.add(enumDataListItem);
        return this;
    }

    public CocIncidentDataV2 withEnumDataList(Consumer<List<CocTicketInfoEnumDataV2>> enumDataListSetter) {
        if (this.enumDataList == null) {
            this.enumDataList = new ArrayList<>();
        }
        enumDataListSetter.accept(this.enumDataList);
        return this;
    }

    /**
     * 枚举列表
     * @return enumDataList
     */
    public List<CocTicketInfoEnumDataV2> getEnumDataList() {
        return enumDataList;
    }

    public void setEnumDataList(List<CocTicketInfoEnumDataV2> enumDataList) {
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
        CocIncidentDataV2 that = (CocIncidentDataV2) obj;
        return Objects.equals(this.currentCloudServiceId, that.currentCloudServiceId)
            && Objects.equals(this.levelId, that.levelId) && Objects.equals(this.mtmRegion, that.mtmRegion)
            && Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.forwardRuleId, that.forwardRuleId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.mtmType, that.mtmType) && Objects.equals(this.title, that.title)
            && Objects.equals(this.description, that.description) && Objects.equals(this.ticketId, that.ticketId)
            && Objects.equals(this.isServiceInterrupt, that.isServiceInterrupt)
            && Objects.equals(this.workFlowStatus, that.workFlowStatus) && Objects.equals(this.phase, that.phase)
            && Objects.equals(this.assignee, that.assignee) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.operator, that.operator) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.handleTime, that.handleTime)
            && Objects.equals(this.incidentOwnership, that.incidentOwnership)
            && Objects.equals(this.enumDataList, that.enumDataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentCloudServiceId,
            levelId,
            mtmRegion,
            sourceId,
            forwardRuleId,
            enterpriseProjectId,
            mtmType,
            title,
            description,
            ticketId,
            isServiceInterrupt,
            workFlowStatus,
            phase,
            assignee,
            creator,
            operator,
            updateTime,
            createTime,
            startTime,
            handleTime,
            incidentOwnership,
            enumDataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CocIncidentDataV2 {\n");
        sb.append("    currentCloudServiceId: ").append(toIndentedString(currentCloudServiceId)).append("\n");
        sb.append("    levelId: ").append(toIndentedString(levelId)).append("\n");
        sb.append("    mtmRegion: ").append(toIndentedString(mtmRegion)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    forwardRuleId: ").append(toIndentedString(forwardRuleId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    mtmType: ").append(toIndentedString(mtmType)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
        sb.append("    isServiceInterrupt: ").append(toIndentedString(isServiceInterrupt)).append("\n");
        sb.append("    workFlowStatus: ").append(toIndentedString(workFlowStatus)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    handleTime: ").append(toIndentedString(handleTime)).append("\n");
        sb.append("    incidentOwnership: ").append(toIndentedString(incidentOwnership)).append("\n");
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
