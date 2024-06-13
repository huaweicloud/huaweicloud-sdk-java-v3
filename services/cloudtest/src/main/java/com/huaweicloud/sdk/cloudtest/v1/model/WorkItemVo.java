package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * WorkItemVo
 */
public class WorkItemVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private String startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "due_date")

    private String dueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updator")

    private String updator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_item_id")

    private String workItemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_id")

    private String statusId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_name")

    private String statusName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_id")

    private String trackerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_name")

    private String trackerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration_id")

    private String iterationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_id")

    private String severityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_name")

    private String severityName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_workitem_id")

    private String parentWorkitemId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "board_id")

    private String boardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "board_name")

    private String boardName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration_name")

    private String iterationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_name")

    private String moduleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_path")

    private String modulePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_path_name")

    private String modulePathName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_name")

    private String ownerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "have_child_dynamic")

    private Boolean haveChildDynamic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_child")

    private Boolean hasChild;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_dynamic_count")

    private Integer issueDynamicCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_count")

    private Integer caseCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence_id")

    private String sequenceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pi_id")

    private String piId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pi_name")

    private String piName;

    public WorkItemVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 工作项名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkItemVo withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 处理人
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public WorkItemVo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 工作项路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public WorkItemVo withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 预计开始日期
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public WorkItemVo withDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * 预计结束日期
     * @return dueDate
     */
    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public WorkItemVo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 逻辑region，外部使用公有云实际区域，内部使用默认值
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public WorkItemVo withCreator(String creator) {
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

    public WorkItemVo withUpdator(String updator) {
        this.updator = updator;
        return this;
    }

    /**
     * 更新人
     * @return updator
     */
    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public WorkItemVo withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目ID，外部使用项目ID，内部使用默认值
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public WorkItemVo withWorkItemId(String workItemId) {
        this.workItemId = workItemId;
        return this;
    }

    /**
     * 工作项编号
     * @return workItemId
     */
    public String getWorkItemId() {
        return workItemId;
    }

    public void setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
    }

    public WorkItemVo withStatusId(String statusId) {
        this.statusId = statusId;
        return this;
    }

    /**
     * 状态ID
     * @return statusId
     */
    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public WorkItemVo withStatusName(String statusName) {
        this.statusName = statusName;
        return this;
    }

    /**
     * 状态
     * @return statusName
     */
    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public WorkItemVo withTrackerId(String trackerId) {
        this.trackerId = trackerId;
        return this;
    }

    /**
     * 类型ID
     * @return trackerId
     */
    public String getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(String trackerId) {
        this.trackerId = trackerId;
    }

    public WorkItemVo withTrackerName(String trackerName) {
        this.trackerName = trackerName;
        return this;
    }

    /**
     * 类型
     * @return trackerName
     */
    public String getTrackerName() {
        return trackerName;
    }

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    public WorkItemVo withIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }

    /**
     * 迭代ID
     * @return iterationId
     */
    public String getIterationId() {
        return iterationId;
    }

    public void setIterationId(String iterationId) {
        this.iterationId = iterationId;
    }

    public WorkItemVo withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * 模块ID
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public WorkItemVo withSeverityId(String severityId) {
        this.severityId = severityId;
        return this;
    }

    /**
     * 重要程度ID
     * @return severityId
     */
    public String getSeverityId() {
        return severityId;
    }

    public void setSeverityId(String severityId) {
        this.severityId = severityId;
    }

    public WorkItemVo withSeverityName(String severityName) {
        this.severityName = severityName;
        return this;
    }

    /**
     * 重要程度
     * @return severityName
     */
    public String getSeverityName() {
        return severityName;
    }

    public void setSeverityName(String severityName) {
        this.severityName = severityName;
    }

    public WorkItemVo withParentWorkitemId(String parentWorkitemId) {
        this.parentWorkitemId = parentWorkitemId;
        return this;
    }

    /**
     * 父工作项编号
     * @return parentWorkitemId
     */
    public String getParentWorkitemId() {
        return parentWorkitemId;
    }

    public void setParentWorkitemId(String parentWorkitemId) {
        this.parentWorkitemId = parentWorkitemId;
    }

    public WorkItemVo withBoardId(String boardId) {
        this.boardId = boardId;
        return this;
    }

    /**
     * 看板ID
     * @return boardId
     */
    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public WorkItemVo withBoardName(String boardName) {
        this.boardName = boardName;
        return this;
    }

    /**
     * 看板
     * @return boardName
     */
    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public WorkItemVo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public WorkItemVo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public WorkItemVo withIterationName(String iterationName) {
        this.iterationName = iterationName;
        return this;
    }

    /**
     * 迭代名
     * @return iterationName
     */
    public String getIterationName() {
        return iterationName;
    }

    public void setIterationName(String iterationName) {
        this.iterationName = iterationName;
    }

    public WorkItemVo withModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    /**
     * 模块名
     * @return moduleName
     */
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public WorkItemVo withModulePath(String modulePath) {
        this.modulePath = modulePath;
        return this;
    }

    /**
     * 模块path
     * @return modulePath
     */
    public String getModulePath() {
        return modulePath;
    }

    public void setModulePath(String modulePath) {
        this.modulePath = modulePath;
    }

    public WorkItemVo withModulePathName(String modulePathName) {
        this.modulePathName = modulePathName;
        return this;
    }

    /**
     * 模块路径名称
     * @return modulePathName
     */
    public String getModulePathName() {
        return modulePathName;
    }

    public void setModulePathName(String modulePathName) {
        this.modulePathName = modulePathName;
    }

    public WorkItemVo withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
     * 处理人
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public WorkItemVo withHaveChildDynamic(Boolean haveChildDynamic) {
        this.haveChildDynamic = haveChildDynamic;
        return this;
    }

    /**
     * 父工作项下是否有子工作项包含动态
     * @return haveChildDynamic
     */
    public Boolean getHaveChildDynamic() {
        return haveChildDynamic;
    }

    public void setHaveChildDynamic(Boolean haveChildDynamic) {
        this.haveChildDynamic = haveChildDynamic;
    }

    public WorkItemVo withHasChild(Boolean hasChild) {
        this.hasChild = hasChild;
        return this;
    }

    /**
     * 父工作项下是否有子工作项
     * @return hasChild
     */
    public Boolean getHasChild() {
        return hasChild;
    }

    public void setHasChild(Boolean hasChild) {
        this.hasChild = hasChild;
    }

    public WorkItemVo withIssueDynamicCount(Integer issueDynamicCount) {
        this.issueDynamicCount = issueDynamicCount;
        return this;
    }

    /**
     * 需求动态数量
     * @return issueDynamicCount
     */
    public Integer getIssueDynamicCount() {
        return issueDynamicCount;
    }

    public void setIssueDynamicCount(Integer issueDynamicCount) {
        this.issueDynamicCount = issueDynamicCount;
    }

    public WorkItemVo withCaseCount(Integer caseCount) {
        this.caseCount = caseCount;
        return this;
    }

    /**
     * 用例数量
     * @return caseCount
     */
    public Integer getCaseCount() {
        return caseCount;
    }

    public void setCaseCount(Integer caseCount) {
        this.caseCount = caseCount;
    }

    public WorkItemVo withSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
        return this;
    }

    /**
     * xBoard项目工作项序列号
     * @return sequenceId
     */
    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    public WorkItemVo withPiId(String piId) {
        this.piId = piId;
        return this;
    }

    /**
     * pi的id，层级关系：pi -> 迭代 -> 需求
     * @return piId
     */
    public String getPiId() {
        return piId;
    }

    public void setPiId(String piId) {
        this.piId = piId;
    }

    public WorkItemVo withPiName(String piName) {
        this.piName = piName;
        return this;
    }

    /**
     * 迭代ID
     * @return piName
     */
    public String getPiName() {
        return piName;
    }

    public void setPiName(String piName) {
        this.piName = piName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkItemVo that = (WorkItemVo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.path, that.path) && Objects.equals(this.startDate, that.startDate)
            && Objects.equals(this.dueDate, that.dueDate) && Objects.equals(this.region, that.region)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.updator, that.updator)
            && Objects.equals(this.projectUuid, that.projectUuid) && Objects.equals(this.workItemId, that.workItemId)
            && Objects.equals(this.statusId, that.statusId) && Objects.equals(this.statusName, that.statusName)
            && Objects.equals(this.trackerId, that.trackerId) && Objects.equals(this.trackerName, that.trackerName)
            && Objects.equals(this.iterationId, that.iterationId) && Objects.equals(this.moduleId, that.moduleId)
            && Objects.equals(this.severityId, that.severityId) && Objects.equals(this.severityName, that.severityName)
            && Objects.equals(this.parentWorkitemId, that.parentWorkitemId)
            && Objects.equals(this.boardId, that.boardId) && Objects.equals(this.boardName, that.boardName)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.iterationName, that.iterationName)
            && Objects.equals(this.moduleName, that.moduleName) && Objects.equals(this.modulePath, that.modulePath)
            && Objects.equals(this.modulePathName, that.modulePathName)
            && Objects.equals(this.ownerName, that.ownerName)
            && Objects.equals(this.haveChildDynamic, that.haveChildDynamic)
            && Objects.equals(this.hasChild, that.hasChild)
            && Objects.equals(this.issueDynamicCount, that.issueDynamicCount)
            && Objects.equals(this.caseCount, that.caseCount) && Objects.equals(this.sequenceId, that.sequenceId)
            && Objects.equals(this.piId, that.piId) && Objects.equals(this.piName, that.piName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            owner,
            path,
            startDate,
            dueDate,
            region,
            creator,
            updator,
            projectUuid,
            workItemId,
            statusId,
            statusName,
            trackerId,
            trackerName,
            iterationId,
            moduleId,
            severityId,
            severityName,
            parentWorkitemId,
            boardId,
            boardName,
            createTime,
            updateTime,
            iterationName,
            moduleName,
            modulePath,
            modulePathName,
            ownerName,
            haveChildDynamic,
            hasChild,
            issueDynamicCount,
            caseCount,
            sequenceId,
            piId,
            piName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkItemVo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    updator: ").append(toIndentedString(updator)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    workItemId: ").append(toIndentedString(workItemId)).append("\n");
        sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
        sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
        sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
        sb.append("    trackerName: ").append(toIndentedString(trackerName)).append("\n");
        sb.append("    iterationId: ").append(toIndentedString(iterationId)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    severityId: ").append(toIndentedString(severityId)).append("\n");
        sb.append("    severityName: ").append(toIndentedString(severityName)).append("\n");
        sb.append("    parentWorkitemId: ").append(toIndentedString(parentWorkitemId)).append("\n");
        sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
        sb.append("    boardName: ").append(toIndentedString(boardName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    iterationName: ").append(toIndentedString(iterationName)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    modulePath: ").append(toIndentedString(modulePath)).append("\n");
        sb.append("    modulePathName: ").append(toIndentedString(modulePathName)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    haveChildDynamic: ").append(toIndentedString(haveChildDynamic)).append("\n");
        sb.append("    hasChild: ").append(toIndentedString(hasChild)).append("\n");
        sb.append("    issueDynamicCount: ").append(toIndentedString(issueDynamicCount)).append("\n");
        sb.append("    caseCount: ").append(toIndentedString(caseCount)).append("\n");
        sb.append("    sequenceId: ").append(toIndentedString(sequenceId)).append("\n");
        sb.append("    piId: ").append(toIndentedString(piId)).append("\n");
        sb.append("    piName: ").append(toIndentedString(piName)).append("\n");
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
