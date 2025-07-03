package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateCocTicketRequestBody
 */
public class CreateCocTicketRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_notes")

    private String changeNotes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project")

    private String enterpriseProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_type")

    private String changeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_type")

    private String ticketType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_scheme")

    private String changeScheme;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_guides")

    private String changeGuides;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_upload_attachment")

    private String commitUploadAttachment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private String regions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_scene_id")

    private String changeSceneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_cloud_service_id")

    private String currentCloudServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_cause_cloud_service")

    private String rootCauseCloudService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fount_time")

    private Long fountTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_schedule_type")

    private String virtualScheduleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_contact_person")

    private String issueContactPerson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_scenes")

    private String scheduleScenes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_schedule_role")

    private String virtualScheduleRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location_id")

    private String locationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_task_sub_type")

    private String planTaskSubType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_task_id")

    private String planTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_task_name")

    private String planTaskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_task_params")

    private String planTaskParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_start_process")

    private Boolean isStartProcess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_tickets")

    private List<TicketCreateSubTicketInfo> subTickets = null;

    public CreateCocTicketRequestBody withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * **参数解释：** 工单标题。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CreateCocTicketRequestBody withChangeNotes(String changeNotes) {
        this.changeNotes = changeNotes;
        return this;
    }

    /**
     * **参数解释：** 变更单描述。 **约束限制：** 当ticket_type为change创建变更单时，该字段必填。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return changeNotes
     */
    public String getChangeNotes() {
        return changeNotes;
    }

    public void setChangeNotes(String changeNotes) {
        this.changeNotes = changeNotes;
    }

    public CreateCocTicketRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 问题单描述信息。 **约束限制：** 当ticket_type为issues_mgmt创建问题单时，该字段必填。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateCocTicketRequestBody withEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
        return this;
    }

    /**
     * **参数解释：** 企业项目ID **约束限制：** 当ticket_type为issues_mgmt创建问题单时，该字段必填。 **取值范围：** 不涉及 **默认取值：** 0
     * @return enterpriseProject
     */
    public String getEnterpriseProject() {
        return enterpriseProject;
    }

    public void setEnterpriseProject(String enterpriseProject) {
        this.enterpriseProject = enterpriseProject;
    }

    public CreateCocTicketRequestBody withChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * **参数解释：** 变更类型。 **约束限制：** 当ticket_type为change创建变更单时，该字段必填。 **取值范围：** 枚举值 change_type_conventional：常规变更 change_type_urgentu：紧急变更 **默认取值：** 不涉及
     * @return changeType
     */
    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public CreateCocTicketRequestBody withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * **参数解释：** 工单级别。 **约束限制：** 不涉及 **取值范围：** 当ticket_type为change创建变更单时，枚举值 change_level_010 -- A级变更 change_level_020 -- B级变更 change_level_030 -- C级变更 change_level_040 -- D级变更 当ticket_type为issues_mgmt创建问题单时，枚举值 issues_level_1000 -- 致命 issues_level_2000 -- 严重 issues_level_3000 -- 一般 issues_level_4000 -- 提示 **默认取值：** 不涉及
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public CreateCocTicketRequestBody withTicketType(String ticketType) {
        this.ticketType = ticketType;
        return this;
    }

    /**
     * **参数解释：** 问题单类型，通过访问 云运维中心-->基础配置-->流程管理页签下问题流程-->问题类别可查询所有可传递的问题类型，此处传递问题类型ID。 **约束限制：** 当ticket_type为issues_mgmt创建问题单时，必填。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return ticketType
     */
    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public CreateCocTicketRequestBody withChangeScheme(String changeScheme) {
        this.changeScheme = changeScheme;
        return this;
    }

    /**
     * **参数解释：** 任务类型，可选作业或者变更指导书两种。 **约束限制：** 当ticket_type为change创建变更单时，该字段必填。当取值为change_scheme_guides时，请求参数change_guides必填。当取值为change_scheme_runbook时，参数plan_task_sub_type、plan_task_id、plan_task_name和plan_task_params必填。 **取值范围：** 枚举值 change_scheme_runbook：作业 change_scheme_guides：变更指导书 **默认取值：** 不涉及
     * @return changeScheme
     */
    public String getChangeScheme() {
        return changeScheme;
    }

    public void setChangeScheme(String changeScheme) {
        this.changeScheme = changeScheme;
    }

    public CreateCocTicketRequestBody withChangeGuides(String changeGuides) {
        this.changeGuides = changeGuides;
        return this;
    }

    /**
     * **参数解释：** 变更指导书ID。 **约束限制：** 当ticket_type为change创建变更单，且任务选择变更指导书时，该字段必填。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return changeGuides
     */
    public String getChangeGuides() {
        return changeGuides;
    }

    public void setChangeGuides(String changeGuides) {
        this.changeGuides = changeGuides;
    }

    public CreateCocTicketRequestBody withCommitUploadAttachment(String commitUploadAttachment) {
        this.commitUploadAttachment = commitUploadAttachment;
        return this;
    }

    /**
     * **参数解释：** 问题单附件，上传附件ID。 **约束限制：** 当ticket_type为issues_mgmt创建问题单时，该字段选填。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return commitUploadAttachment
     */
    public String getCommitUploadAttachment() {
        return commitUploadAttachment;
    }

    public void setCommitUploadAttachment(String commitUploadAttachment) {
        this.commitUploadAttachment = commitUploadAttachment;
    }

    public CreateCocTicketRequestBody withRegions(String regions) {
        this.regions = regions;
        return this;
    }

    /**
     * **参数解释：** 问题单所属Region，此处传RegionID，多个Region用英文逗号隔开。 **约束限制：** 当ticket_type为issues_mgmt创建问题单时，该字段选填。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return regions
     */
    public String getRegions() {
        return regions;
    }

    public void setRegions(String regions) {
        this.regions = regions;
    }

    public CreateCocTicketRequestBody withChangeSceneId(String changeSceneId) {
        this.changeSceneId = changeSceneId;
        return this;
    }

    /**
     * **参数解释：** 变更场景。 **约束限制：** 当ticket_type为change创建变更单时，该字段必填。 **取值范围：** 取配置页面【流程管理】下“变更场景”TAB页中列表属性ID列的值，示例：GOCMLL06 **默认取值：** 不涉及
     * @return changeSceneId
     */
    public String getChangeSceneId() {
        return changeSceneId;
    }

    public void setChangeSceneId(String changeSceneId) {
        this.changeSceneId = changeSceneId;
    }

    public CreateCocTicketRequestBody withCurrentCloudServiceId(String currentCloudServiceId) {
        this.currentCloudServiceId = currentCloudServiceId;
        return this;
    }

    /**
     * **参数解释：** 归属应用。 **约束限制：** 当ticket_type为change创建变更单时，该字段必填。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return currentCloudServiceId
     */
    public String getCurrentCloudServiceId() {
        return currentCloudServiceId;
    }

    public void setCurrentCloudServiceId(String currentCloudServiceId) {
        this.currentCloudServiceId = currentCloudServiceId;
    }

    public CreateCocTicketRequestBody withRootCauseCloudService(String rootCauseCloudService) {
        this.rootCauseCloudService = rootCauseCloudService;
        return this;
    }

    /**
     * **参数解释：** 归属应用。 **约束限制：** 当ticket_type为issues_mgmt创建问题单时，该字段选填。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return rootCauseCloudService
     */
    public String getRootCauseCloudService() {
        return rootCauseCloudService;
    }

    public void setRootCauseCloudService(String rootCauseCloudService) {
        this.rootCauseCloudService = rootCauseCloudService;
    }

    public CreateCocTicketRequestBody withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释：** 问题单来源。 **约束限制：** 当ticket_type为issues_mgmt创建问题单时，该字段选填。 **取值范围：** 当ticket_type为issues_mgmt创建问题单时，枚举值 issues_mgmt_associated_type_1000 -- 事件 issues_mgmt_associated_type_4000 -- 运维主动发现 issues_mgmt_associated_type_2000 -- 告警 issues_mgmt_associated_type_3000 -- WarRoom **默认取值：** 不涉及
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public CreateCocTicketRequestBody withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * **参数解释：** 问题单来源工单单号。 **约束限制：** 当ticket_type为issues_mgmt创建问题单时，该字段选填。当source的值为issues_mgmt_associated_type_1000、issues_mgmt_associated_type_2000或issues_mgmt_associated_type_3000时，必填。需要填写关联的工单单号。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public CreateCocTicketRequestBody withFountTime(Long fountTime) {
        this.fountTime = fountTime;
        return this;
    }

    /**
     * **参数解释：** 发现时间，时间戳。 **约束限制：** 当ticket_type为issues_mgmt创建问题单时，该字段选填。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * minimum: 1
     * maximum: 9999999999999
     * @return fountTime
     */
    public Long getFountTime() {
        return fountTime;
    }

    public void setFountTime(Long fountTime) {
        this.fountTime = fountTime;
    }

    public CreateCocTicketRequestBody withVirtualScheduleType(String virtualScheduleType) {
        this.virtualScheduleType = virtualScheduleType;
        return this;
    }

    /**
     * **参数解释：** 问题单处理人类型。 **约束限制：** 当ticket_type为issues_mgmt创建问题单时，该字段必填。 **取值范围：** 当ticket_type为issues_mgmt创建问题单时，枚举值 issues_mgmt_virtual_schedule_type_1000 -- 排班 issues_mgmt_virtual_schedule_type_2000 -- 个人 **默认取值：** 不涉及
     * @return virtualScheduleType
     */
    public String getVirtualScheduleType() {
        return virtualScheduleType;
    }

    public void setVirtualScheduleType(String virtualScheduleType) {
        this.virtualScheduleType = virtualScheduleType;
    }

    public CreateCocTicketRequestBody withIssueContactPerson(String issueContactPerson) {
        this.issueContactPerson = issueContactPerson;
        return this;
    }

    /**
     * **参数解释：** 问题单责任人工号ID。 **约束限制：** 当ticket_type为issues_mgmt创建问题单时，该字段选填。如需指定问题单责任人，则该字段必填。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return issueContactPerson
     */
    public String getIssueContactPerson() {
        return issueContactPerson;
    }

    public void setIssueContactPerson(String issueContactPerson) {
        this.issueContactPerson = issueContactPerson;
    }

    public CreateCocTicketRequestBody withScheduleScenes(String scheduleScenes) {
        this.scheduleScenes = scheduleScenes;
        return this;
    }

    /**
     * **参数解释：** 问题单责任人从排班中获取，该值为排班场景ID。 **约束限制：** 当ticket_type为issues_mgmt创建问题单时，该字段选填。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return scheduleScenes
     */
    public String getScheduleScenes() {
        return scheduleScenes;
    }

    public void setScheduleScenes(String scheduleScenes) {
        this.scheduleScenes = scheduleScenes;
    }

    public CreateCocTicketRequestBody withVirtualScheduleRole(String virtualScheduleRole) {
        this.virtualScheduleRole = virtualScheduleRole;
        return this;
    }

    /**
     * **参数解释：** 问题单责任人从排班中获取，该值为排班角色ID。 **约束限制：** 当ticket_type为issues_mgmt创建问题单时，该字段选填。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return virtualScheduleRole
     */
    public String getVirtualScheduleRole() {
        return virtualScheduleRole;
    }

    public void setVirtualScheduleRole(String virtualScheduleRole) {
        this.virtualScheduleRole = virtualScheduleRole;
    }

    public CreateCocTicketRequestBody withLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }

    /**
     * **参数解释：** 变更区域ID。 **约束限制：** 当ticket_type为change创建变更单时，该字段必填。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return locationId
     */
    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public CreateCocTicketRequestBody withPlanTaskSubType(String planTaskSubType) {
        this.planTaskSubType = planTaskSubType;
        return this;
    }

    /**
     * **参数解释：** 预案子类型。 **约束限制：** 当ticket_type为change创建变更单时，该字段必填。当任务类型change_scheme取值为change_scheme_runbook时，该值必填。 **取值范围：** 枚举值 CUSTOMIZATION：自定义作业 COMMUNAL：公共作业 **默认取值：** 不涉及
     * @return planTaskSubType
     */
    public String getPlanTaskSubType() {
        return planTaskSubType;
    }

    public void setPlanTaskSubType(String planTaskSubType) {
        this.planTaskSubType = planTaskSubType;
    }

    public CreateCocTicketRequestBody withPlanTaskId(String planTaskId) {
        this.planTaskId = planTaskId;
        return this;
    }

    /**
     * **参数解释：** 需要执行的作业ID。 **约束限制：** 当ticket_type为change创建变更单时，该字段必填。当任务类型change_scheme取值为change_scheme_runbook时，该值必填。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return planTaskId
     */
    public String getPlanTaskId() {
        return planTaskId;
    }

    public void setPlanTaskId(String planTaskId) {
        this.planTaskId = planTaskId;
    }

    public CreateCocTicketRequestBody withPlanTaskName(String planTaskName) {
        this.planTaskName = planTaskName;
        return this;
    }

    /**
     * **参数解释：** 需要执行的作业名称。 **约束限制：** 当ticket_type为change创建变更单时，该字段必填。当任务类型change_scheme取值为change_scheme_runbook时，该值必填。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return planTaskName
     */
    public String getPlanTaskName() {
        return planTaskName;
    }

    public void setPlanTaskName(String planTaskName) {
        this.planTaskName = planTaskName;
    }

    public CreateCocTicketRequestBody withPlanTaskParams(String planTaskParams) {
        this.planTaskParams = planTaskParams;
        return this;
    }

    /**
     * **参数解释：** 执行作业时所需的参数信息。 **约束限制：** 当ticket_type为change创建变更单时，该字段必填。当任务类型change_scheme取值为change_scheme_runbook时，该值必填。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return planTaskParams
     */
    public String getPlanTaskParams() {
        return planTaskParams;
    }

    public void setPlanTaskParams(String planTaskParams) {
        this.planTaskParams = planTaskParams;
    }

    public CreateCocTicketRequestBody withIsStartProcess(Boolean isStartProcess) {
        this.isStartProcess = isStartProcess;
        return this;
    }

    /**
     * **参数解释：** 是否启动流程，当此值为false时，创建出来的工单为草稿状态。此值默认为true，创建出来的工单状态为未受理状态。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return isStartProcess
     */
    public Boolean getIsStartProcess() {
        return isStartProcess;
    }

    public void setIsStartProcess(Boolean isStartProcess) {
        this.isStartProcess = isStartProcess;
    }

    public CreateCocTicketRequestBody withSubTickets(List<TicketCreateSubTicketInfo> subTickets) {
        this.subTickets = subTickets;
        return this;
    }

    public CreateCocTicketRequestBody addSubTicketsItem(TicketCreateSubTicketInfo subTicketsItem) {
        if (this.subTickets == null) {
            this.subTickets = new ArrayList<>();
        }
        this.subTickets.add(subTicketsItem);
        return this;
    }

    public CreateCocTicketRequestBody withSubTickets(Consumer<List<TicketCreateSubTicketInfo>> subTicketsSetter) {
        if (this.subTickets == null) {
            this.subTickets = new ArrayList<>();
        }
        subTicketsSetter.accept(this.subTickets);
        return this;
    }

    /**
     * **参数解释：** 变更子单的信息，包含变更单涉及的服务和Region信息。 **约束限制：** 当ticket_type为change创建变更单时，该字段必填且有效，当ticket_type非change时，该字段可置空。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return subTickets
     */
    public List<TicketCreateSubTicketInfo> getSubTickets() {
        return subTickets;
    }

    public void setSubTickets(List<TicketCreateSubTicketInfo> subTickets) {
        this.subTickets = subTickets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCocTicketRequestBody that = (CreateCocTicketRequestBody) obj;
        return Objects.equals(this.title, that.title) && Objects.equals(this.changeNotes, that.changeNotes)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.enterpriseProject, that.enterpriseProject)
            && Objects.equals(this.changeType, that.changeType) && Objects.equals(this.level, that.level)
            && Objects.equals(this.ticketType, that.ticketType) && Objects.equals(this.changeScheme, that.changeScheme)
            && Objects.equals(this.changeGuides, that.changeGuides)
            && Objects.equals(this.commitUploadAttachment, that.commitUploadAttachment)
            && Objects.equals(this.regions, that.regions) && Objects.equals(this.changeSceneId, that.changeSceneId)
            && Objects.equals(this.currentCloudServiceId, that.currentCloudServiceId)
            && Objects.equals(this.rootCauseCloudService, that.rootCauseCloudService)
            && Objects.equals(this.source, that.source) && Objects.equals(this.sourceId, that.sourceId)
            && Objects.equals(this.fountTime, that.fountTime)
            && Objects.equals(this.virtualScheduleType, that.virtualScheduleType)
            && Objects.equals(this.issueContactPerson, that.issueContactPerson)
            && Objects.equals(this.scheduleScenes, that.scheduleScenes)
            && Objects.equals(this.virtualScheduleRole, that.virtualScheduleRole)
            && Objects.equals(this.locationId, that.locationId)
            && Objects.equals(this.planTaskSubType, that.planTaskSubType)
            && Objects.equals(this.planTaskId, that.planTaskId) && Objects.equals(this.planTaskName, that.planTaskName)
            && Objects.equals(this.planTaskParams, that.planTaskParams)
            && Objects.equals(this.isStartProcess, that.isStartProcess)
            && Objects.equals(this.subTickets, that.subTickets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,
            changeNotes,
            description,
            enterpriseProject,
            changeType,
            level,
            ticketType,
            changeScheme,
            changeGuides,
            commitUploadAttachment,
            regions,
            changeSceneId,
            currentCloudServiceId,
            rootCauseCloudService,
            source,
            sourceId,
            fountTime,
            virtualScheduleType,
            issueContactPerson,
            scheduleScenes,
            virtualScheduleRole,
            locationId,
            planTaskSubType,
            planTaskId,
            planTaskName,
            planTaskParams,
            isStartProcess,
            subTickets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCocTicketRequestBody {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    changeNotes: ").append(toIndentedString(changeNotes)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProject: ").append(toIndentedString(enterpriseProject)).append("\n");
        sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
        sb.append("    changeScheme: ").append(toIndentedString(changeScheme)).append("\n");
        sb.append("    changeGuides: ").append(toIndentedString(changeGuides)).append("\n");
        sb.append("    commitUploadAttachment: ").append(toIndentedString(commitUploadAttachment)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    changeSceneId: ").append(toIndentedString(changeSceneId)).append("\n");
        sb.append("    currentCloudServiceId: ").append(toIndentedString(currentCloudServiceId)).append("\n");
        sb.append("    rootCauseCloudService: ").append(toIndentedString(rootCauseCloudService)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    fountTime: ").append(toIndentedString(fountTime)).append("\n");
        sb.append("    virtualScheduleType: ").append(toIndentedString(virtualScheduleType)).append("\n");
        sb.append("    issueContactPerson: ").append(toIndentedString(issueContactPerson)).append("\n");
        sb.append("    scheduleScenes: ").append(toIndentedString(scheduleScenes)).append("\n");
        sb.append("    virtualScheduleRole: ").append(toIndentedString(virtualScheduleRole)).append("\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    planTaskSubType: ").append(toIndentedString(planTaskSubType)).append("\n");
        sb.append("    planTaskId: ").append(toIndentedString(planTaskId)).append("\n");
        sb.append("    planTaskName: ").append(toIndentedString(planTaskName)).append("\n");
        sb.append("    planTaskParams: ").append(toIndentedString(planTaskParams)).append("\n");
        sb.append("    isStartProcess: ").append(toIndentedString(isStartProcess)).append("\n");
        sb.append("    subTickets: ").append(toIndentedString(subTickets)).append("\n");
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
