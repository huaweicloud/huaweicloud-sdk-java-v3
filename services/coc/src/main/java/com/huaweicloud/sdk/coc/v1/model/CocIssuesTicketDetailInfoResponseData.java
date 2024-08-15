package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CocIssuesTicketDetailInfoResponseData
 */
public class CocIssuesTicketDetailInfoResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_type")

    private String ticketType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "impacted_cloud_services")

    private String impactedCloudServices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_cause_cloud_service")

    private String rootCauseCloudService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_cause_type")

    private String rootCauseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_cause_comment")

    private String rootCauseComment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solution")

    private String solution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_contact_person")

    private String issueContactPerson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reproduce_probability")

    private String reproduceProbability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_version")

    private String issueVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_schedule_type")

    private String virtualScheduleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private String regions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fount_time")

    private Long fountTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_common_issue")

    private Boolean isCommonIssue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_need_change")

    private Boolean isNeedChange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_id")

    private String ticketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee")

    private String assignee;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_flow_status")

    private String workFlowStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_deleted")

    private Boolean isDeleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enum_data_list")

    private List<TicketInfoEnumData> enumDataList = null;

    public CocIssuesTicketDetailInfoResponseData withTicketType(String ticketType) {
        this.ticketType = ticketType;
        return this;
    }

    /**
     * 问题类型
     * @return ticketType
     */
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public CocIssuesTicketDetailInfoResponseData withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 问题等级
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public CocIssuesTicketDetailInfoResponseData withImpactedCloudServices(String impactedCloudServices) {
        this.impactedCloudServices = impactedCloudServices;
        return this;
    }

    /**
     * 影响服务
     * @return impactedCloudServices
     */
    public String getImpactedCloudServices() {
        return impactedCloudServices;
    }

    public void setImpactedCloudServices(String impactedCloudServices) {
        this.impactedCloudServices = impactedCloudServices;
    }

    public CocIssuesTicketDetailInfoResponseData withRootCauseCloudService(String rootCauseCloudService) {
        this.rootCauseCloudService = rootCauseCloudService;
        return this;
    }

    /**
     * 责任服务
     * @return rootCauseCloudService
     */
    public String getRootCauseCloudService() {
        return rootCauseCloudService;
    }

    public void setRootCauseCloudService(String rootCauseCloudService) {
        this.rootCauseCloudService = rootCauseCloudService;
    }

    public CocIssuesTicketDetailInfoResponseData withRootCauseType(String rootCauseType) {
        this.rootCauseType = rootCauseType;
        return this;
    }

    /**
     * 根因类型
     * @return rootCauseType
     */
    public String getRootCauseType() {
        return rootCauseType;
    }

    public void setRootCauseType(String rootCauseType) {
        this.rootCauseType = rootCauseType;
    }

    public CocIssuesTicketDetailInfoResponseData withRootCauseComment(String rootCauseComment) {
        this.rootCauseComment = rootCauseComment;
        return this;
    }

    /**
     * 根因分析
     * @return rootCauseComment
     */
    public String getRootCauseComment() {
        return rootCauseComment;
    }

    public void setRootCauseComment(String rootCauseComment) {
        this.rootCauseComment = rootCauseComment;
    }

    public CocIssuesTicketDetailInfoResponseData withSolution(String solution) {
        this.solution = solution;
        return this;
    }

    /**
     * 解决方案
     * @return solution
     */
    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public CocIssuesTicketDetailInfoResponseData withIssueContactPerson(String issueContactPerson) {
        this.issueContactPerson = issueContactPerson;
        return this;
    }

    /**
     * 问题接口人id
     * @return issueContactPerson
     */
    public String getIssueContactPerson() {
        return issueContactPerson;
    }

    public void setIssueContactPerson(String issueContactPerson) {
        this.issueContactPerson = issueContactPerson;
    }

    public CocIssuesTicketDetailInfoResponseData withReproduceProbability(String reproduceProbability) {
        this.reproduceProbability = reproduceProbability;
        return this;
    }

    /**
     * 重现概率
     * @return reproduceProbability
     */
    public String getReproduceProbability() {
        return reproduceProbability;
    }

    public void setReproduceProbability(String reproduceProbability) {
        this.reproduceProbability = reproduceProbability;
    }

    public CocIssuesTicketDetailInfoResponseData withIssueVersion(String issueVersion) {
        this.issueVersion = issueVersion;
        return this;
    }

    /**
     * 发现问题的版本号
     * @return issueVersion
     */
    public String getIssueVersion() {
        return issueVersion;
    }

    public void setIssueVersion(String issueVersion) {
        this.issueVersion = issueVersion;
    }

    public CocIssuesTicketDetailInfoResponseData withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 问题标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CocIssuesTicketDetailInfoResponseData withVirtualScheduleType(String virtualScheduleType) {
        this.virtualScheduleType = virtualScheduleType;
        return this;
    }

    /**
     * 排班类型
     * @return virtualScheduleType
     */
    public String getVirtualScheduleType() {
        return virtualScheduleType;
    }

    public void setVirtualScheduleType(String virtualScheduleType) {
        this.virtualScheduleType = virtualScheduleType;
    }

    public CocIssuesTicketDetailInfoResponseData withRegions(String regions) {
        this.regions = regions;
        return this;
    }

    /**
     * 区域
     * @return regions
     */
    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions;
    }

    public CocIssuesTicketDetailInfoResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CocIssuesTicketDetailInfoResponseData withFountTime(Long fountTime) {
        this.fountTime = fountTime;
        return this;
    }

    /**
     * 发现时间
     * minimum: 1
     * maximum: 9999999999
     * @return fountTime
     */
    public Long getFountTime() {
        return fountTime;
    }

    public void setFountTime(Long fountTime) {
        this.fountTime = fountTime;
    }

    public CocIssuesTicketDetailInfoResponseData withIsCommonIssue(Boolean isCommonIssue) {
        this.isCommonIssue = isCommonIssue;
        return this;
    }

    /**
     * 是否共性问题
     * @return isCommonIssue
     */
    public Boolean getIsCommonIssue() {
        return isCommonIssue;
    }

    public void setIsCommonIssue(Boolean isCommonIssue) {
        this.isCommonIssue = isCommonIssue;
    }

    public CocIssuesTicketDetailInfoResponseData withIsNeedChange(Boolean isNeedChange) {
        this.isNeedChange = isNeedChange;
        return this;
    }

    /**
     * 是否需要变更
     * @return isNeedChange
     */
    public Boolean getIsNeedChange() {
        return isNeedChange;
    }

    public void setIsNeedChange(Boolean isNeedChange) {
        this.isNeedChange = isNeedChange;
    }

    public CocIssuesTicketDetailInfoResponseData withCreator(String creator) {
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

    public CocIssuesTicketDetailInfoResponseData withOperator(String operator) {
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

    public CocIssuesTicketDetailInfoResponseData withTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    /**
     * 问题单id
     * @return ticketId
     */
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public CocIssuesTicketDetailInfoResponseData withAssignee(String assignee) {
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

    public CocIssuesTicketDetailInfoResponseData withWorkFlowStatus(String workFlowStatus) {
        this.workFlowStatus = workFlowStatus;
        return this;
    }

    /**
     * 问题单状态
     * @return workFlowStatus
     */
    public String getWorkFlowStatus() {
        return workFlowStatus;
    }

    public void setWorkFlowStatus(String workFlowStatus) {
        this.workFlowStatus = workFlowStatus;
    }

    public CocIssuesTicketDetailInfoResponseData withPhase(String phase) {
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

    public CocIssuesTicketDetailInfoResponseData withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * minimum: 1
     * maximum: 9999999999
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public CocIssuesTicketDetailInfoResponseData withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 1
     * maximum: 9999999999
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CocIssuesTicketDetailInfoResponseData withIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
     * 是否删除
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public CocIssuesTicketDetailInfoResponseData withEnumDataList(List<TicketInfoEnumData> enumDataList) {
        this.enumDataList = enumDataList;
        return this;
    }

    public CocIssuesTicketDetailInfoResponseData addEnumDataListItem(TicketInfoEnumData enumDataListItem) {
        if (this.enumDataList == null) {
            this.enumDataList = new ArrayList<>();
        }
        this.enumDataList.add(enumDataListItem);
        return this;
    }

    public CocIssuesTicketDetailInfoResponseData withEnumDataList(
        Consumer<List<TicketInfoEnumData>> enumDataListSetter) {
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
    public List<TicketInfoEnumData> getEnumDataList() {
        return enumDataList;
    }

    public void setEnumDataList(List<TicketInfoEnumData> enumDataList) {
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
        CocIssuesTicketDetailInfoResponseData that = (CocIssuesTicketDetailInfoResponseData) obj;
        return Objects.equals(this.ticketType, that.ticketType) && Objects.equals(this.level, that.level)
            && Objects.equals(this.impactedCloudServices, that.impactedCloudServices)
            && Objects.equals(this.rootCauseCloudService, that.rootCauseCloudService)
            && Objects.equals(this.rootCauseType, that.rootCauseType)
            && Objects.equals(this.rootCauseComment, that.rootCauseComment)
            && Objects.equals(this.solution, that.solution)
            && Objects.equals(this.issueContactPerson, that.issueContactPerson)
            && Objects.equals(this.reproduceProbability, that.reproduceProbability)
            && Objects.equals(this.issueVersion, that.issueVersion) && Objects.equals(this.title, that.title)
            && Objects.equals(this.virtualScheduleType, that.virtualScheduleType)
            && Objects.equals(this.regions, that.regions) && Objects.equals(this.description, that.description)
            && Objects.equals(this.fountTime, that.fountTime) && Objects.equals(this.isCommonIssue, that.isCommonIssue)
            && Objects.equals(this.isNeedChange, that.isNeedChange) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.operator, that.operator) && Objects.equals(this.ticketId, that.ticketId)
            && Objects.equals(this.assignee, that.assignee) && Objects.equals(this.workFlowStatus, that.workFlowStatus)
            && Objects.equals(this.phase, that.phase) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.isDeleted, that.isDeleted)
            && Objects.equals(this.enumDataList, that.enumDataList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketType,
            level,
            impactedCloudServices,
            rootCauseCloudService,
            rootCauseType,
            rootCauseComment,
            solution,
            issueContactPerson,
            reproduceProbability,
            issueVersion,
            title,
            virtualScheduleType,
            regions,
            description,
            fountTime,
            isCommonIssue,
            isNeedChange,
            creator,
            operator,
            ticketId,
            assignee,
            workFlowStatus,
            phase,
            updateTime,
            createTime,
            isDeleted,
            enumDataList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CocIssuesTicketDetailInfoResponseData {\n");
        sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    impactedCloudServices: ").append(toIndentedString(impactedCloudServices)).append("\n");
        sb.append("    rootCauseCloudService: ").append(toIndentedString(rootCauseCloudService)).append("\n");
        sb.append("    rootCauseType: ").append(toIndentedString(rootCauseType)).append("\n");
        sb.append("    rootCauseComment: ").append(toIndentedString(rootCauseComment)).append("\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    issueContactPerson: ").append(toIndentedString(issueContactPerson)).append("\n");
        sb.append("    reproduceProbability: ").append(toIndentedString(reproduceProbability)).append("\n");
        sb.append("    issueVersion: ").append(toIndentedString(issueVersion)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    virtualScheduleType: ").append(toIndentedString(virtualScheduleType)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    fountTime: ").append(toIndentedString(fountTime)).append("\n");
        sb.append("    isCommonIssue: ").append(toIndentedString(isCommonIssue)).append("\n");
        sb.append("    isNeedChange: ").append(toIndentedString(isNeedChange)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    workFlowStatus: ").append(toIndentedString(workFlowStatus)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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
