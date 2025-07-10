package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CocTicketDetailInfoResponseData。
 */
public class CocTicketDetailInfoResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_correlation_sla")

    private String issueCorrelationSla;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_cause_cloud_service")

    private String rootCauseCloudService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_cause_type")

    private String rootCauseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_cloud_service_id")

    private String currentCloudServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_contact_person")

    private String issueContactPerson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_version")

    private String issueVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_upload_attachment")

    private String commitUploadAttachment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project")

    private String enterpriseProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_schedule_type")

    private String virtualScheduleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private String regions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_cause_comment")

    private String rootCauseComment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solution")

    private String solution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions_serch")

    private String regionsSerch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level_approve_config")

    private String levelApproveConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suspension_approve_config")

    private String suspensionApproveConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_time")

    private Long handleTime;

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
    @JsonProperty(value = "is_enable_suspension")

    private Boolean isEnableSuspension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_start_process_async")

    private Boolean isStartProcessAsync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_update_null")

    private Boolean isUpdateNull;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_return_full_info")

    private Boolean isReturnFullInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_start_process")

    private Boolean isStartProcess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_id")

    private String ticketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_ticket_id")

    private String realTicketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignee")

    private String assignee;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "participator")

    private String participator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_flow_status")

    private String workFlowStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_error_msg")

    private String engineErrorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_status")

    private String baselineStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_type")

    private String ticketType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_tickets")

    private List<CocTicketDetailInfoResponseDataSubTickets> subTickets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enum_data_list")

    private List<IssuesTicketInfoEnumData> enumDataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data_version")

    private Integer metaDataVersion;

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
    @JsonProperty(value = "ticket_type_id")

    private String ticketTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "_form_info")

    private Object formInfo;

    public CocTicketDetailInfoResponseData withIssueCorrelationSla(String issueCorrelationSla) {
        this.issueCorrelationSla = issueCorrelationSla;
        return this;
    }

    /**
     * 问题关联SLA。
     * @return issueCorrelationSla
     */
    public String getIssueCorrelationSla() {
        return issueCorrelationSla;
    }

    public void setIssueCorrelationSla(String issueCorrelationSla) {
        this.issueCorrelationSla = issueCorrelationSla;
    }

    public CocTicketDetailInfoResponseData withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 问题单级别。
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public CocTicketDetailInfoResponseData withRootCauseCloudService(String rootCauseCloudService) {
        this.rootCauseCloudService = rootCauseCloudService;
        return this;
    }

    /**
     * 问题单责任服务。
     * @return rootCauseCloudService
     */
    public String getRootCauseCloudService() {
        return rootCauseCloudService;
    }

    public void setRootCauseCloudService(String rootCauseCloudService) {
        this.rootCauseCloudService = rootCauseCloudService;
    }

    public CocTicketDetailInfoResponseData withRootCauseType(String rootCauseType) {
        this.rootCauseType = rootCauseType;
        return this;
    }

    /**
     * 问题单根因分类。
     * @return rootCauseType
     */
    public String getRootCauseType() {
        return rootCauseType;
    }

    public void setRootCauseType(String rootCauseType) {
        this.rootCauseType = rootCauseType;
    }

    public CocTicketDetailInfoResponseData withCurrentCloudServiceId(String currentCloudServiceId) {
        this.currentCloudServiceId = currentCloudServiceId;
        return this;
    }

    /**
     * 问题单服务。
     * @return currentCloudServiceId
     */
    public String getCurrentCloudServiceId() {
        return currentCloudServiceId;
    }

    public void setCurrentCloudServiceId(String currentCloudServiceId) {
        this.currentCloudServiceId = currentCloudServiceId;
    }

    public CocTicketDetailInfoResponseData withIssueContactPerson(String issueContactPerson) {
        this.issueContactPerson = issueContactPerson;
        return this;
    }

    /**
     * 问题单接口人。
     * @return issueContactPerson
     */
    public String getIssueContactPerson() {
        return issueContactPerson;
    }

    public void setIssueContactPerson(String issueContactPerson) {
        this.issueContactPerson = issueContactPerson;
    }

    public CocTicketDetailInfoResponseData withIssueVersion(String issueVersion) {
        this.issueVersion = issueVersion;
        return this;
    }

    /**
     * 发现问题版本号。
     * @return issueVersion
     */
    public String getIssueVersion() {
        return issueVersion;
    }

    public void setIssueVersion(String issueVersion) {
        this.issueVersion = issueVersion;
    }

    public CocTicketDetailInfoResponseData withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 问题单来源。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public CocTicketDetailInfoResponseData withCommitUploadAttachment(String commitUploadAttachment) {
        this.commitUploadAttachment = commitUploadAttachment;
        return this;
    }

    /**
     * 上传附件。
     * @return commitUploadAttachment
     */
    public String getCommitUploadAttachment() {
        return commitUploadAttachment;
    }

    public void setCommitUploadAttachment(String commitUploadAttachment) {
        this.commitUploadAttachment = commitUploadAttachment;
    }

    public CocTicketDetailInfoResponseData withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 问题单来源id。
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public CocTicketDetailInfoResponseData withEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
        return this;
    }

    /**
     * 问题单企业项目。
     * @return enterpriseProject
     */
    public String getEnterpriseProject() {
        return enterpriseProject;
    }

    public void setEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
    }

    public CocTicketDetailInfoResponseData withVirtualScheduleType(String virtualScheduleType) {
        this.virtualScheduleType = virtualScheduleType;
        return this;
    }

    /**
     * 问题单排班类型。
     * @return virtualScheduleType
     */
    public String getVirtualScheduleType() {
        return virtualScheduleType;
    }

    public void setVirtualScheduleType(String virtualScheduleType) {
        this.virtualScheduleType = virtualScheduleType;
    }

    public CocTicketDetailInfoResponseData withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 问题单标题。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CocTicketDetailInfoResponseData withRegions(String regions) {
        this.regions = regions;
        return this;
    }

    /**
     * 问题单region信息。
     * @return regions
     */
    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions;
    }

    public CocTicketDetailInfoResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 问题单描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CocTicketDetailInfoResponseData withRootCauseComment(String rootCauseComment) {
        this.rootCauseComment = rootCauseComment;
        return this;
    }

    /**
     * 问题单根因分析。
     * @return rootCauseComment
     */
    public String getRootCauseComment() {
        return rootCauseComment;
    }

    public void setRootCauseComment(String rootCauseComment) {
        this.rootCauseComment = rootCauseComment;
    }

    public CocTicketDetailInfoResponseData withSolution(String solution) {
        this.solution = solution;
        return this;
    }

    /**
     * 问题单解决方案。
     * @return solution
     */
    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public CocTicketDetailInfoResponseData withRegionsSerch(String regionsSerch) {
        this.regionsSerch = regionsSerch;
        return this;
    }

    /**
     * 问题单区域搜索。
     * @return regionsSerch
     */
    public String getRegionsSerch() {
        return regionsSerch;
    }

    public void setRegionsSerch(String regionsSerch) {
        this.regionsSerch = regionsSerch;
    }

    public CocTicketDetailInfoResponseData withLevelApproveConfig(String levelApproveConfig) {
        this.levelApproveConfig = levelApproveConfig;
        return this;
    }

    /**
     * 问题单级别审批配置。
     * @return levelApproveConfig
     */
    public String getLevelApproveConfig() {
        return levelApproveConfig;
    }

    public void setLevelApproveConfig(String levelApproveConfig) {
        this.levelApproveConfig = levelApproveConfig;
    }

    public CocTicketDetailInfoResponseData withSuspensionApproveConfig(String suspensionApproveConfig) {
        this.suspensionApproveConfig = suspensionApproveConfig;
        return this;
    }

    /**
     * 问题单挂起审批配置。
     * @return suspensionApproveConfig
     */
    public String getSuspensionApproveConfig() {
        return suspensionApproveConfig;
    }

    public void setSuspensionApproveConfig(String suspensionApproveConfig) {
        this.suspensionApproveConfig = suspensionApproveConfig;
    }

    public CocTicketDetailInfoResponseData withHandleTime(Long handleTime) {
        this.handleTime = handleTime;
        return this;
    }

    /**
     * 处理时长。
     * minimum: 1
     * maximum: 9999999999
     * @return handleTime
     */
    public Long getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Long handleTime) {
        this.handleTime = handleTime;
    }

    public CocTicketDetailInfoResponseData withFountTime(Long fountTime) {
        this.fountTime = fountTime;
        return this;
    }

    /**
     * 发现时间。
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

    public CocTicketDetailInfoResponseData withIsCommonIssue(Boolean isCommonIssue) {
        this.isCommonIssue = isCommonIssue;
        return this;
    }

    /**
     * 是否共性问题。
     * @return isCommonIssue
     */
    public Boolean getIsCommonIssue() {
        return isCommonIssue;
    }

    public void setIsCommonIssue(Boolean isCommonIssue) {
        this.isCommonIssue = isCommonIssue;
    }

    public CocTicketDetailInfoResponseData withIsNeedChange(Boolean isNeedChange) {
        this.isNeedChange = isNeedChange;
        return this;
    }

    /**
     * 问题单是否需要变更。
     * @return isNeedChange
     */
    public Boolean getIsNeedChange() {
        return isNeedChange;
    }

    public void setIsNeedChange(Boolean isNeedChange) {
        this.isNeedChange = isNeedChange;
    }

    public CocTicketDetailInfoResponseData withIsEnableSuspension(Boolean isEnableSuspension) {
        this.isEnableSuspension = isEnableSuspension;
        return this;
    }

    /**
     * 问题单是否开启挂起。
     * @return isEnableSuspension
     */
    public Boolean getIsEnableSuspension() {
        return isEnableSuspension;
    }

    public void setIsEnableSuspension(Boolean isEnableSuspension) {
        this.isEnableSuspension = isEnableSuspension;
    }

    public CocTicketDetailInfoResponseData withIsStartProcessAsync(Boolean isStartProcessAsync) {
        this.isStartProcessAsync = isStartProcessAsync;
        return this;
    }

    /**
     * 是否启动异步流程。
     * @return isStartProcessAsync
     */
    public Boolean getIsStartProcessAsync() {
        return isStartProcessAsync;
    }

    public void setIsStartProcessAsync(Boolean isStartProcessAsync) {
        this.isStartProcessAsync = isStartProcessAsync;
    }

    public CocTicketDetailInfoResponseData withIsUpdateNull(Boolean isUpdateNull) {
        this.isUpdateNull = isUpdateNull;
        return this;
    }

    /**
     * 是否重新提交空字段。
     * @return isUpdateNull
     */
    public Boolean getIsUpdateNull() {
        return isUpdateNull;
    }

    public void setIsUpdateNull(Boolean isUpdateNull) {
        this.isUpdateNull = isUpdateNull;
    }

    public CocTicketDetailInfoResponseData withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 问题单创建人。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public CocTicketDetailInfoResponseData withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 问题单操作人。
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public CocTicketDetailInfoResponseData withIsReturnFullInfo(Boolean isReturnFullInfo) {
        this.isReturnFullInfo = isReturnFullInfo;
        return this;
    }

    /**
     * 是否返回所有字段信息。
     * @return isReturnFullInfo
     */
    public Boolean getIsReturnFullInfo() {
        return isReturnFullInfo;
    }

    public void setIsReturnFullInfo(Boolean isReturnFullInfo) {
        this.isReturnFullInfo = isReturnFullInfo;
    }

    public CocTicketDetailInfoResponseData withIsStartProcess(Boolean isStartProcess) {
        this.isStartProcess = isStartProcess;
        return this;
    }

    /**
     * 是否启动流程。
     * @return isStartProcess
     */
    public Boolean getIsStartProcess() {
        return isStartProcess;
    }

    public void setIsStartProcess(Boolean isStartProcess) {
        this.isStartProcess = isStartProcess;
    }

    public CocTicketDetailInfoResponseData withTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    /**
     * 问题单工单ID。
     * @return ticketId
     */
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public CocTicketDetailInfoResponseData withRealTicketId(String realTicketId) {
        this.realTicketId = realTicketId;
        return this;
    }

    /**
     * 问题单工单单号。
     * @return realTicketId
     */
    public String getRealTicketId() {
        return realTicketId;
    }

    public void setRealTicketId(String realTicketId) {
        this.realTicketId = realTicketId;
    }

    public CocTicketDetailInfoResponseData withAssignee(String assignee) {
        this.assignee = assignee;
        return this;
    }

    /**
     * 问题单当前责任人。
     * @return assignee
     */
    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public CocTicketDetailInfoResponseData withParticipator(String participator) {
        this.participator = participator;
        return this;
    }

    /**
     * 问题单参与人。
     * @return participator
     */
    public String getParticipator() {
        return participator;
    }

    public void setParticipator(String participator) {
        this.participator = participator;
    }

    public CocTicketDetailInfoResponseData withWorkFlowStatus(String workFlowStatus) {
        this.workFlowStatus = workFlowStatus;
        return this;
    }

    /**
     * 问题单状态。
     * @return workFlowStatus
     */
    public String getWorkFlowStatus() {
        return workFlowStatus;
    }

    public void setWorkFlowStatus(String workFlowStatus) {
        this.workFlowStatus = workFlowStatus;
    }

    public CocTicketDetailInfoResponseData withEngineErrorMsg(String engineErrorMsg) {
        this.engineErrorMsg = engineErrorMsg;
        return this;
    }

    /**
     * 流程状态。
     * @return engineErrorMsg
     */
    public String getEngineErrorMsg() {
        return engineErrorMsg;
    }

    public void setEngineErrorMsg(String engineErrorMsg) {
        this.engineErrorMsg = engineErrorMsg;
    }

    public CocTicketDetailInfoResponseData withBaselineStatus(String baselineStatus) {
        this.baselineStatus = baselineStatus;
        return this;
    }

    /**
     * 基线状态。
     * @return baselineStatus
     */
    public String getBaselineStatus() {
        return baselineStatus;
    }

    public void setBaselineStatus(String baselineStatus) {
        this.baselineStatus = baselineStatus;
    }

    public CocTicketDetailInfoResponseData withTicketType(String ticketType) {
        this.ticketType = ticketType;
        return this;
    }

    /**
     * 工单类型。
     * @return ticketType
     */
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public CocTicketDetailInfoResponseData withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 问题单当前阶段信息。
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public CocTicketDetailInfoResponseData withSubTickets(List<CocTicketDetailInfoResponseDataSubTickets> subTickets) {
        this.subTickets = subTickets;
        return this;
    }

    public CocTicketDetailInfoResponseData addSubTicketsItem(CocTicketDetailInfoResponseDataSubTickets subTicketsItem) {
        if (this.subTickets == null) {
            this.subTickets = new ArrayList<>();
        }
        this.subTickets.add(subTicketsItem);
        return this;
    }

    public CocTicketDetailInfoResponseData withSubTickets(
        Consumer<List<CocTicketDetailInfoResponseDataSubTickets>> subTicketsSetter) {
        if (this.subTickets == null) {
            this.subTickets = new ArrayList<>();
        }
        subTicketsSetter.accept(this.subTickets);
        return this;
    }

    /**
     * 变更子单信息。
     * @return subTickets
     */
    public List<CocTicketDetailInfoResponseDataSubTickets> getSubTickets() {
        return subTickets;
    }

    public void setSubTickets(List<CocTicketDetailInfoResponseDataSubTickets> subTickets) {
        this.subTickets = subTickets;
    }

    public CocTicketDetailInfoResponseData withEnumDataList(List<IssuesTicketInfoEnumData> enumDataList) {
        this.enumDataList = enumDataList;
        return this;
    }

    public CocTicketDetailInfoResponseData addEnumDataListItem(IssuesTicketInfoEnumData enumDataListItem) {
        if (this.enumDataList == null) {
            this.enumDataList = new ArrayList<>();
        }
        this.enumDataList.add(enumDataListItem);
        return this;
    }

    public CocTicketDetailInfoResponseData withEnumDataList(
        Consumer<List<IssuesTicketInfoEnumData>> enumDataListSetter) {
        if (this.enumDataList == null) {
            this.enumDataList = new ArrayList<>();
        }
        enumDataListSetter.accept(this.enumDataList);
        return this;
    }

    /**
     * 枚举列表。
     * @return enumDataList
     */
    public List<IssuesTicketInfoEnumData> getEnumDataList() {
        return enumDataList;
    }

    public void setEnumDataList(List<IssuesTicketInfoEnumData> enumDataList) {
        this.enumDataList = enumDataList;
    }

    public CocTicketDetailInfoResponseData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主键uuid
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CocTicketDetailInfoResponseData withMetaDataVersion(Integer metaDataVersion) {
        this.metaDataVersion = metaDataVersion;
        return this;
    }

    /**
     * 应用版本
     * minimum: 0
     * maximum: 2147483647
     * @return metaDataVersion
     */
    public Integer getMetaDataVersion() {
        return metaDataVersion;
    }

    public void setMetaDataVersion(Integer metaDataVersion) {
        this.metaDataVersion = metaDataVersion;
    }

    public CocTicketDetailInfoResponseData withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
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

    public CocTicketDetailInfoResponseData withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创单时间戳。
     * minimum: 0
     * maximum: 999999999
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CocTicketDetailInfoResponseData withIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
     * 工单是否被删除。
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public CocTicketDetailInfoResponseData withTicketTypeId(String ticketTypeId) {
        this.ticketTypeId = ticketTypeId;
        return this;
    }

    /**
     * 工单类型。
     * @return ticketTypeId
     */
    public String getTicketTypeId() {
        return ticketTypeId;
    }

    public void setTicketTypeId(String ticketTypeId) {
        this.ticketTypeId = ticketTypeId;
    }

    public CocTicketDetailInfoResponseData withFormInfo(Object formInfo) {
        this.formInfo = formInfo;
        return this;
    }

    /**
     * 动作信息。
     * @return formInfo
     */
    public Object getFormInfo() {
        return formInfo;
    }

    public void setFormInfo(Object formInfo) {
        this.formInfo = formInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CocTicketDetailInfoResponseData that = (CocTicketDetailInfoResponseData) obj;
        return Objects.equals(this.issueCorrelationSla, that.issueCorrelationSla)
            && Objects.equals(this.level, that.level)
            && Objects.equals(this.rootCauseCloudService, that.rootCauseCloudService)
            && Objects.equals(this.rootCauseType, that.rootCauseType)
            && Objects.equals(this.currentCloudServiceId, that.currentCloudServiceId)
            && Objects.equals(this.issueContactPerson, that.issueContactPerson)
            && Objects.equals(this.issueVersion, that.issueVersion) && Objects.equals(this.source, that.source)
            && Objects.equals(this.commitUploadAttachment, that.commitUploadAttachment)
            && Objects.equals(this.sourceId, that.sourceId)
            && Objects.equals(this.enterpriseProject, that.enterpriseProject)
            && Objects.equals(this.virtualScheduleType, that.virtualScheduleType)
            && Objects.equals(this.title, that.title) && Objects.equals(this.regions, that.regions)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.rootCauseComment, that.rootCauseComment)
            && Objects.equals(this.solution, that.solution) && Objects.equals(this.regionsSerch, that.regionsSerch)
            && Objects.equals(this.levelApproveConfig, that.levelApproveConfig)
            && Objects.equals(this.suspensionApproveConfig, that.suspensionApproveConfig)
            && Objects.equals(this.handleTime, that.handleTime) && Objects.equals(this.fountTime, that.fountTime)
            && Objects.equals(this.isCommonIssue, that.isCommonIssue)
            && Objects.equals(this.isNeedChange, that.isNeedChange)
            && Objects.equals(this.isEnableSuspension, that.isEnableSuspension)
            && Objects.equals(this.isStartProcessAsync, that.isStartProcessAsync)
            && Objects.equals(this.isUpdateNull, that.isUpdateNull) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.isReturnFullInfo, that.isReturnFullInfo)
            && Objects.equals(this.isStartProcess, that.isStartProcess) && Objects.equals(this.ticketId, that.ticketId)
            && Objects.equals(this.realTicketId, that.realTicketId) && Objects.equals(this.assignee, that.assignee)
            && Objects.equals(this.participator, that.participator)
            && Objects.equals(this.workFlowStatus, that.workFlowStatus)
            && Objects.equals(this.engineErrorMsg, that.engineErrorMsg)
            && Objects.equals(this.baselineStatus, that.baselineStatus)
            && Objects.equals(this.ticketType, that.ticketType) && Objects.equals(this.phase, that.phase)
            && Objects.equals(this.subTickets, that.subTickets) && Objects.equals(this.enumDataList, that.enumDataList)
            && Objects.equals(this.id, that.id) && Objects.equals(this.metaDataVersion, that.metaDataVersion)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.isDeleted, that.isDeleted) && Objects.equals(this.ticketTypeId, that.ticketTypeId)
            && Objects.equals(this.formInfo, that.formInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueCorrelationSla,
            level,
            rootCauseCloudService,
            rootCauseType,
            currentCloudServiceId,
            issueContactPerson,
            issueVersion,
            source,
            commitUploadAttachment,
            sourceId,
            enterpriseProject,
            virtualScheduleType,
            title,
            regions,
            description,
            rootCauseComment,
            solution,
            regionsSerch,
            levelApproveConfig,
            suspensionApproveConfig,
            handleTime,
            fountTime,
            isCommonIssue,
            isNeedChange,
            isEnableSuspension,
            isStartProcessAsync,
            isUpdateNull,
            creator,
            operator,
            isReturnFullInfo,
            isStartProcess,
            ticketId,
            realTicketId,
            assignee,
            participator,
            workFlowStatus,
            engineErrorMsg,
            baselineStatus,
            ticketType,
            phase,
            subTickets,
            enumDataList,
            id,
            metaDataVersion,
            updateTime,
            createTime,
            isDeleted,
            ticketTypeId,
            formInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CocTicketDetailInfoResponseData {\n");
        sb.append("    issueCorrelationSla: ").append(toIndentedString(issueCorrelationSla)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    rootCauseCloudService: ").append(toIndentedString(rootCauseCloudService)).append("\n");
        sb.append("    rootCauseType: ").append(toIndentedString(rootCauseType)).append("\n");
        sb.append("    currentCloudServiceId: ").append(toIndentedString(currentCloudServiceId)).append("\n");
        sb.append("    issueContactPerson: ").append(toIndentedString(issueContactPerson)).append("\n");
        sb.append("    issueVersion: ").append(toIndentedString(issueVersion)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    commitUploadAttachment: ").append(toIndentedString(commitUploadAttachment)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    enterpriseProject: ").append(toIndentedString(enterpriseProject)).append("\n");
        sb.append("    virtualScheduleType: ").append(toIndentedString(virtualScheduleType)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    rootCauseComment: ").append(toIndentedString(rootCauseComment)).append("\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    regionsSerch: ").append(toIndentedString(regionsSerch)).append("\n");
        sb.append("    levelApproveConfig: ").append(toIndentedString(levelApproveConfig)).append("\n");
        sb.append("    suspensionApproveConfig: ").append(toIndentedString(suspensionApproveConfig)).append("\n");
        sb.append("    handleTime: ").append(toIndentedString(handleTime)).append("\n");
        sb.append("    fountTime: ").append(toIndentedString(fountTime)).append("\n");
        sb.append("    isCommonIssue: ").append(toIndentedString(isCommonIssue)).append("\n");
        sb.append("    isNeedChange: ").append(toIndentedString(isNeedChange)).append("\n");
        sb.append("    isEnableSuspension: ").append(toIndentedString(isEnableSuspension)).append("\n");
        sb.append("    isStartProcessAsync: ").append(toIndentedString(isStartProcessAsync)).append("\n");
        sb.append("    isUpdateNull: ").append(toIndentedString(isUpdateNull)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    isReturnFullInfo: ").append(toIndentedString(isReturnFullInfo)).append("\n");
        sb.append("    isStartProcess: ").append(toIndentedString(isStartProcess)).append("\n");
        sb.append("    ticketId: ").append(toIndentedString(ticketId)).append("\n");
        sb.append("    realTicketId: ").append(toIndentedString(realTicketId)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    participator: ").append(toIndentedString(participator)).append("\n");
        sb.append("    workFlowStatus: ").append(toIndentedString(workFlowStatus)).append("\n");
        sb.append("    engineErrorMsg: ").append(toIndentedString(engineErrorMsg)).append("\n");
        sb.append("    baselineStatus: ").append(toIndentedString(baselineStatus)).append("\n");
        sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    subTickets: ").append(toIndentedString(subTickets)).append("\n");
        sb.append("    enumDataList: ").append(toIndentedString(enumDataList)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    metaDataVersion: ").append(toIndentedString(metaDataVersion)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
        sb.append("    ticketTypeId: ").append(toIndentedString(ticketTypeId)).append("\n");
        sb.append("    formInfo: ").append(toIndentedString(formInfo)).append("\n");
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
