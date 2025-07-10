package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * This is a alarm
 */
public class AlarmInfoDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "importance")

    private String importance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "come_from")

    private String comeFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "come_from_en")

    private String comeFromEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer_rule")

    private String transferRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transfer_rule_name")

    private String transferRuleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_name")

    private String ownerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_alias")

    private String ownerAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "converge_count")

    private Integer convergeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_event_id")

    private String associateEventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    private String remarks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_type")

    private String associatedTaskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_id")

    private String associatedTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_task_name")

    private String associatedTaskName;

    public AlarmInfoDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AlarmInfoDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlarmInfoDTO withImportance(String importance) {
        this.importance = importance;
        return this;
    }

    /**
     * 严重类型，urgent（紧急）、major（重要）、minor（次要）、warn（提示）
     * @return importance
     */
    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public AlarmInfoDTO withComeFrom(String comeFrom) {
        this.comeFrom = comeFrom;
        return this;
    }

    /**
     * 数据源
     * @return comeFrom
     */
    public String getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(String comeFrom) {
        this.comeFrom = comeFrom;
    }

    public AlarmInfoDTO withComeFromEn(String comeFromEn) {
        this.comeFromEn = comeFromEn;
        return this;
    }

    /**
     * 数据源英文名
     * @return comeFromEn
     */
    public String getComeFromEn() {
        return comeFromEn;
    }

    public void setComeFromEn(String comeFromEn) {
        this.comeFromEn = comeFromEn;
    }

    public AlarmInfoDTO withTransferRule(String transferRule) {
        this.transferRule = transferRule;
        return this;
    }

    /**
     * 流转规则id
     * @return transferRule
     */
    public String getTransferRule() {
        return transferRule;
    }

    public void setTransferRule(String transferRule) {
        this.transferRule = transferRule;
    }

    public AlarmInfoDTO withTransferRuleName(String transferRuleName) {
        this.transferRuleName = transferRuleName;
        return this;
    }

    /**
     * 流转规则名
     * @return transferRuleName
     */
    public String getTransferRuleName() {
        return transferRuleName;
    }

    public void setTransferRuleName(String transferRuleName) {
        this.transferRuleName = transferRuleName;
    }

    public AlarmInfoDTO withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 应用
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public AlarmInfoDTO withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态，告警中alarming，已解决resolved
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AlarmInfoDTO withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 责任人id
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public AlarmInfoDTO withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
     * 责任人姓名
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public AlarmInfoDTO withOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
        return this;
    }

    /**
     * 责任人别名
     * @return ownerAlias
     */
    public String getOwnerAlias() {
        return ownerAlias;
    }

    public void setOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
    }

    public AlarmInfoDTO withConvergeCount(Integer convergeCount) {
        this.convergeCount = convergeCount;
        return this;
    }

    /**
     * 收敛量
     * minimum: 0
     * maximum: 100000
     * @return convergeCount
     */
    public Integer getConvergeCount() {
        return convergeCount;
    }

    public void setConvergeCount(Integer convergeCount) {
        this.convergeCount = convergeCount;
    }

    public AlarmInfoDTO withAssociateEventId(String associateEventId) {
        this.associateEventId = associateEventId;
        return this;
    }

    /**
     * 关联事件id
     * @return associateEventId
     */
    public String getAssociateEventId() {
        return associateEventId;
    }

    public void setAssociateEventId(String associateEventId) {
        this.associateEventId = associateEventId;
    }

    public AlarmInfoDTO withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户账号
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public AlarmInfoDTO withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人id
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public AlarmInfoDTO withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建人姓名
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public AlarmInfoDTO withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 100000000000000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public AlarmInfoDTO withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * minimum: 0
     * maximum: 100000000000000
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public AlarmInfoDTO withRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * 备注
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public AlarmInfoDTO withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域regionId
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public AlarmInfoDTO withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型 ：SCRIPT脚本，RUNBOOK作业
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public AlarmInfoDTO withAssociatedTaskType(String associatedTaskType) {
        this.associatedTaskType = associatedTaskType;
        return this;
    }

    /**
     * 任务类型分类 CUSTOMIZATION自定义，COMMUNAL公共
     * @return associatedTaskType
     */
    public String getAssociatedTaskType() {
        return associatedTaskType;
    }

    public void setAssociatedTaskType(String associatedTaskType) {
        this.associatedTaskType = associatedTaskType;
    }

    public AlarmInfoDTO withAssociatedTaskId(String associatedTaskId) {
        this.associatedTaskId = associatedTaskId;
        return this;
    }

    /**
     * 脚本或作业id
     * @return associatedTaskId
     */
    public String getAssociatedTaskId() {
        return associatedTaskId;
    }

    public void setAssociatedTaskId(String associatedTaskId) {
        this.associatedTaskId = associatedTaskId;
    }

    public AlarmInfoDTO withAssociatedTaskName(String associatedTaskName) {
        this.associatedTaskName = associatedTaskName;
        return this;
    }

    /**
     * 脚本或作业名称
     * @return associatedTaskName
     */
    public String getAssociatedTaskName() {
        return associatedTaskName;
    }

    public void setAssociatedTaskName(String associatedTaskName) {
        this.associatedTaskName = associatedTaskName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmInfoDTO that = (AlarmInfoDTO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.importance, that.importance) && Objects.equals(this.comeFrom, that.comeFrom)
            && Objects.equals(this.comeFromEn, that.comeFromEn) && Objects.equals(this.transferRule, that.transferRule)
            && Objects.equals(this.transferRuleName, that.transferRuleName) && Objects.equals(this.app, that.app)
            && Objects.equals(this.status, that.status) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.ownerName, that.ownerName) && Objects.equals(this.ownerAlias, that.ownerAlias)
            && Objects.equals(this.convergeCount, that.convergeCount)
            && Objects.equals(this.associateEventId, that.associateEventId)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.remarks, that.remarks)
            && Objects.equals(this.region, that.region) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.associatedTaskType, that.associatedTaskType)
            && Objects.equals(this.associatedTaskId, that.associatedTaskId)
            && Objects.equals(this.associatedTaskName, that.associatedTaskName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            importance,
            comeFrom,
            comeFromEn,
            transferRule,
            transferRuleName,
            app,
            status,
            owner,
            ownerName,
            ownerAlias,
            convergeCount,
            associateEventId,
            domainId,
            creator,
            creatorName,
            createTime,
            updateTime,
            remarks,
            region,
            taskType,
            associatedTaskType,
            associatedTaskId,
            associatedTaskName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmInfoDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
        sb.append("    comeFrom: ").append(toIndentedString(comeFrom)).append("\n");
        sb.append("    comeFromEn: ").append(toIndentedString(comeFromEn)).append("\n");
        sb.append("    transferRule: ").append(toIndentedString(transferRule)).append("\n");
        sb.append("    transferRuleName: ").append(toIndentedString(transferRuleName)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    ownerAlias: ").append(toIndentedString(ownerAlias)).append("\n");
        sb.append("    convergeCount: ").append(toIndentedString(convergeCount)).append("\n");
        sb.append("    associateEventId: ").append(toIndentedString(associateEventId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    associatedTaskType: ").append(toIndentedString(associatedTaskType)).append("\n");
        sb.append("    associatedTaskId: ").append(toIndentedString(associatedTaskId)).append("\n");
        sb.append("    associatedTaskName: ").append(toIndentedString(associatedTaskName)).append("\n");
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
