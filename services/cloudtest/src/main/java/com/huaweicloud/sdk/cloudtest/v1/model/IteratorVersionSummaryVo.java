package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class IteratorVersionSummaryVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private String author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank")

    private Integer rank;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterations")

    private String iterations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modifier")

    private String lastModifier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    private OffsetDateTime lastModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified_timestamp")

    private Long lastModifiedTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_change_time")

    private OffsetDateTime lastChangeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_uri")

    private String originUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_uri")

    private String parentUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_path")

    private String parentPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_version_uri")

    private String creationVersionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_date")

    private OffsetDateTime creationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_date_timestamp")

    private Long creationDateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_name")

    private String authorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_master")

    private Integer isMaster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_iterator")

    private Integer isIterator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_start_date")

    private OffsetDateTime planStartDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_date")

    private OffsetDateTime planEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pbi_id")

    private String pbiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pbi_name")

    private String pbiName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_pbi_ids")

    private String metricPbiIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_pbi_id_names")

    private String metricPbiIdNames;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_syn_date")

    private OffsetDateTime lastSynDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_closed")

    private String isClosed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asyn_git")

    private String asynGit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_no")

    private Integer schemaNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_date")

    private OffsetDateTime finishDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_name")

    private String ownerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_stage")

    private String currentStage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_types")

    private String serviceTypes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_rating")

    private Integer riskRating;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_des")

    private String riskDes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pi_id")

    private String piId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private String startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date_timestamp")

    private Long startDateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    private String endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date_timestamp")

    private Long endDateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_start_date")

    private String actualStartDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_start_date_timestamp")

    private Long actualStartDateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_end_date")

    private String actualEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_end_date_timestamp")

    private Long actualEndDateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_expired")

    private String isExpired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_info")

    private String expiredInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stages")

    private List<String> stages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "design")

    private DesignSummaryVo design;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute")

    private ExecuteSummaryVo execute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report")

    private ReportSummaryVo report;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_uri")

    private String branchUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_name")

    private String branchName;

    public IteratorVersionSummaryVo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 资源URI
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public IteratorVersionSummaryVo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public IteratorVersionSummaryVo withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * 创建人
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public IteratorVersionSummaryVo withName(String name) {
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

    public IteratorVersionSummaryVo withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * 级别
     * @return rank
     */
    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public IteratorVersionSummaryVo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 待测版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public IteratorVersionSummaryVo withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 处理者ID
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public IteratorVersionSummaryVo withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人ID
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public IteratorVersionSummaryVo withIterations(String iterations) {
        this.iterations = iterations;
        return this;
    }

    /**
     * 关联迭代
     * @return iterations
     */
    public String getIterations() {
        return iterations;
    }

    public void setIterations(String iterations) {
        this.iterations = iterations;
    }

    public IteratorVersionSummaryVo withDescription(String description) {
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

    public IteratorVersionSummaryVo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public IteratorVersionSummaryVo withLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
        return this;
    }

    /**
     * 最后修改人
     * @return lastModifier
     */
    public String getLastModifier() {
        return lastModifier;
    }

    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
    }

    public IteratorVersionSummaryVo withLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * 最后修改时间
     * @return lastModified
     */
    public OffsetDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(OffsetDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public IteratorVersionSummaryVo withLastModifiedTimestamp(Long lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
        return this;
    }

    /**
     * 修改时间时间戳
     * @return lastModifiedTimestamp
     */
    public Long getLastModifiedTimestamp() {
        return lastModifiedTimestamp;
    }

    public void setLastModifiedTimestamp(Long lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    public IteratorVersionSummaryVo withLastChangeTime(OffsetDateTime lastChangeTime) {
        this.lastChangeTime = lastChangeTime;
        return this;
    }

    /**
     * 最后变更时间
     * @return lastChangeTime
     */
    public OffsetDateTime getLastChangeTime() {
        return lastChangeTime;
    }

    public void setLastChangeTime(OffsetDateTime lastChangeTime) {
        this.lastChangeTime = lastChangeTime;
    }

    public IteratorVersionSummaryVo withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 版本URI
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    public IteratorVersionSummaryVo withOriginUri(String originUri) {
        this.originUri = originUri;
        return this;
    }

    /**
     * 源资源URI
     * @return originUri
     */
    public String getOriginUri() {
        return originUri;
    }

    public void setOriginUri(String originUri) {
        this.originUri = originUri;
    }

    public IteratorVersionSummaryVo withParentUri(String parentUri) {
        this.parentUri = parentUri;
        return this;
    }

    /**
     * 父资源URI
     * @return parentUri
     */
    public String getParentUri() {
        return parentUri;
    }

    public void setParentUri(String parentUri) {
        this.parentUri = parentUri;
    }

    public IteratorVersionSummaryVo withParentPath(String parentPath) {
        this.parentPath = parentPath;
        return this;
    }

    /**
     * 父资源路径
     * @return parentPath
     */
    public String getParentPath() {
        return parentPath;
    }

    public void setParentPath(String parentPath) {
        this.parentPath = parentPath;
    }

    public IteratorVersionSummaryVo withCreationVersionUri(String creationVersionUri) {
        this.creationVersionUri = creationVersionUri;
        return this;
    }

    /**
     * 创建版本URI
     * @return creationVersionUri
     */
    public String getCreationVersionUri() {
        return creationVersionUri;
    }

    public void setCreationVersionUri(String creationVersionUri) {
        this.creationVersionUri = creationVersionUri;
    }

    public IteratorVersionSummaryVo withCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * 创建时间
     * @return creationDate
     */
    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public IteratorVersionSummaryVo withCreationDateTimestamp(Long creationDateTimestamp) {
        this.creationDateTimestamp = creationDateTimestamp;
        return this;
    }

    /**
     * 创建时间时间戳
     * @return creationDateTimestamp
     */
    public Long getCreationDateTimestamp() {
        return creationDateTimestamp;
    }

    public void setCreationDateTimestamp(Long creationDateTimestamp) {
        this.creationDateTimestamp = creationDateTimestamp;
    }

    public IteratorVersionSummaryVo withAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     * 创建人名称
     * @return authorName
     */
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public IteratorVersionSummaryVo withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 备注
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public IteratorVersionSummaryVo withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 编号
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public IteratorVersionSummaryVo withIsMaster(Integer isMaster) {
        this.isMaster = isMaster;
        return this;
    }

    /**
     * 是否为Master分支
     * @return isMaster
     */
    public Integer getIsMaster() {
        return isMaster;
    }

    public void setIsMaster(Integer isMaster) {
        this.isMaster = isMaster;
    }

    public IteratorVersionSummaryVo withIsIterator(Integer isIterator) {
        this.isIterator = isIterator;
        return this;
    }

    /**
     * 是否为迭代
     * @return isIterator
     */
    public Integer getIsIterator() {
        return isIterator;
    }

    public void setIsIterator(Integer isIterator) {
        this.isIterator = isIterator;
    }

    public IteratorVersionSummaryVo withPlanStartDate(OffsetDateTime planStartDate) {
        this.planStartDate = planStartDate;
        return this;
    }

    /**
     * 开始时间
     * @return planStartDate
     */
    public OffsetDateTime getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(OffsetDateTime planStartDate) {
        this.planStartDate = planStartDate;
    }

    public IteratorVersionSummaryVo withPlanEndDate(OffsetDateTime planEndDate) {
        this.planEndDate = planEndDate;
        return this;
    }

    /**
     * 结束时间
     * @return planEndDate
     */
    public OffsetDateTime getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(OffsetDateTime planEndDate) {
        this.planEndDate = planEndDate;
    }

    public IteratorVersionSummaryVo withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 微服务ID
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public IteratorVersionSummaryVo withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 微服务名
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public IteratorVersionSummaryVo withPbiId(String pbiId) {
        this.pbiId = pbiId;
        return this;
    }

    /**
     * PBI ID
     * @return pbiId
     */
    public String getPbiId() {
        return pbiId;
    }

    public void setPbiId(String pbiId) {
        this.pbiId = pbiId;
    }

    public IteratorVersionSummaryVo withPbiName(String pbiName) {
        this.pbiName = pbiName;
        return this;
    }

    /**
     * PBI信息
     * @return pbiName
     */
    public String getPbiName() {
        return pbiName;
    }

    public void setPbiName(String pbiName) {
        this.pbiName = pbiName;
    }

    public IteratorVersionSummaryVo withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 计划ID
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public IteratorVersionSummaryVo withMetricPbiIds(String metricPbiIds) {
        this.metricPbiIds = metricPbiIds;
        return this;
    }

    /**
     * 度量PBI ID
     * @return metricPbiIds
     */
    public String getMetricPbiIds() {
        return metricPbiIds;
    }

    public void setMetricPbiIds(String metricPbiIds) {
        this.metricPbiIds = metricPbiIds;
    }

    public IteratorVersionSummaryVo withMetricPbiIdNames(String metricPbiIdNames) {
        this.metricPbiIdNames = metricPbiIdNames;
        return this;
    }

    /**
     * 度量PBI名称
     * @return metricPbiIdNames
     */
    public String getMetricPbiIdNames() {
        return metricPbiIdNames;
    }

    public void setMetricPbiIdNames(String metricPbiIdNames) {
        this.metricPbiIdNames = metricPbiIdNames;
    }

    public IteratorVersionSummaryVo withLastSynDate(OffsetDateTime lastSynDate) {
        this.lastSynDate = lastSynDate;
        return this;
    }

    /**
     * 最后同步时间
     * @return lastSynDate
     */
    public OffsetDateTime getLastSynDate() {
        return lastSynDate;
    }

    public void setLastSynDate(OffsetDateTime lastSynDate) {
        this.lastSynDate = lastSynDate;
    }

    public IteratorVersionSummaryVo withIsClosed(String isClosed) {
        this.isClosed = isClosed;
        return this;
    }

    /**
     * 版本是否关闭
     * @return isClosed
     */
    public String getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(String isClosed) {
        this.isClosed = isClosed;
    }

    public IteratorVersionSummaryVo withAsynGit(String asynGit) {
        this.asynGit = asynGit;
        return this;
    }

    /**
     * 是否同步git库
     * @return asynGit
     */
    public String getAsynGit() {
        return asynGit;
    }

    public void setAsynGit(String asynGit) {
        this.asynGit = asynGit;
    }

    public IteratorVersionSummaryVo withSchemaNo(Integer schemaNo) {
        this.schemaNo = schemaNo;
        return this;
    }

    /**
     * schema编号
     * @return schemaNo
     */
    public Integer getSchemaNo() {
        return schemaNo;
    }

    public void setSchemaNo(Integer schemaNo) {
        this.schemaNo = schemaNo;
    }

    public IteratorVersionSummaryVo withFinishDate(OffsetDateTime finishDate) {
        this.finishDate = finishDate;
        return this;
    }

    /**
     * 迭代实际完成时间
     * @return finishDate
     */
    public OffsetDateTime getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(OffsetDateTime finishDate) {
        this.finishDate = finishDate;
    }

    public IteratorVersionSummaryVo withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
     * 处理者名称
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public IteratorVersionSummaryVo withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建人名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public IteratorVersionSummaryVo withCurrentStage(String currentStage) {
        this.currentStage = currentStage;
        return this;
    }

    /**
     * 当前所处阶段
     * @return currentStage
     */
    public String getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
    }

    public IteratorVersionSummaryVo withServiceTypes(String serviceTypes) {
        this.serviceTypes = serviceTypes;
        return this;
    }

    /**
     * 服务类型
     * @return serviceTypes
     */
    public String getServiceTypes() {
        return serviceTypes;
    }

    public void setServiceTypes(String serviceTypes) {
        this.serviceTypes = serviceTypes;
    }

    public IteratorVersionSummaryVo withRiskRating(Integer riskRating) {
        this.riskRating = riskRating;
        return this;
    }

    /**
     * 风险等级
     * @return riskRating
     */
    public Integer getRiskRating() {
        return riskRating;
    }

    public void setRiskRating(Integer riskRating) {
        this.riskRating = riskRating;
    }

    public IteratorVersionSummaryVo withRiskDes(String riskDes) {
        this.riskDes = riskDes;
        return this;
    }

    /**
     * 风险描述
     * @return riskDes
     */
    public String getRiskDes() {
        return riskDes;
    }

    public void setRiskDes(String riskDes) {
        this.riskDes = riskDes;
    }

    public IteratorVersionSummaryVo withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目ID
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public IteratorVersionSummaryVo withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public IteratorVersionSummaryVo withPiId(String piId) {
        this.piId = piId;
        return this;
    }

    /**
     * pi的id
     * @return piId
     */
    public String getPiId() {
        return piId;
    }

    public void setPiId(String piId) {
        this.piId = piId;
    }

    public IteratorVersionSummaryVo withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 计划开始时间
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public IteratorVersionSummaryVo withStartDateTimestamp(Long startDateTimestamp) {
        this.startDateTimestamp = startDateTimestamp;
        return this;
    }

    /**
     * 计划开始时间时间戳
     * @return startDateTimestamp
     */
    public Long getStartDateTimestamp() {
        return startDateTimestamp;
    }

    public void setStartDateTimestamp(Long startDateTimestamp) {
        this.startDateTimestamp = startDateTimestamp;
    }

    public IteratorVersionSummaryVo withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 计划结束时间
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public IteratorVersionSummaryVo withEndDateTimestamp(Long endDateTimestamp) {
        this.endDateTimestamp = endDateTimestamp;
        return this;
    }

    /**
     * 计划结束时间时间戳
     * @return endDateTimestamp
     */
    public Long getEndDateTimestamp() {
        return endDateTimestamp;
    }

    public void setEndDateTimestamp(Long endDateTimestamp) {
        this.endDateTimestamp = endDateTimestamp;
    }

    public IteratorVersionSummaryVo withActualStartDate(String actualStartDate) {
        this.actualStartDate = actualStartDate;
        return this;
    }

    /**
     * 实际开始时间
     * @return actualStartDate
     */
    public String getActualStartDate() {
        return actualStartDate;
    }

    public void setActualStartDate(String actualStartDate) {
        this.actualStartDate = actualStartDate;
    }

    public IteratorVersionSummaryVo withActualStartDateTimestamp(Long actualStartDateTimestamp) {
        this.actualStartDateTimestamp = actualStartDateTimestamp;
        return this;
    }

    /**
     * 实际开始时间时间戳
     * @return actualStartDateTimestamp
     */
    public Long getActualStartDateTimestamp() {
        return actualStartDateTimestamp;
    }

    public void setActualStartDateTimestamp(Long actualStartDateTimestamp) {
        this.actualStartDateTimestamp = actualStartDateTimestamp;
    }

    public IteratorVersionSummaryVo withActualEndDate(String actualEndDate) {
        this.actualEndDate = actualEndDate;
        return this;
    }

    /**
     * 实际完成时间
     * @return actualEndDate
     */
    public String getActualEndDate() {
        return actualEndDate;
    }

    public void setActualEndDate(String actualEndDate) {
        this.actualEndDate = actualEndDate;
    }

    public IteratorVersionSummaryVo withActualEndDateTimestamp(Long actualEndDateTimestamp) {
        this.actualEndDateTimestamp = actualEndDateTimestamp;
        return this;
    }

    /**
     * 实际开始时间时间戳
     * @return actualEndDateTimestamp
     */
    public Long getActualEndDateTimestamp() {
        return actualEndDateTimestamp;
    }

    public void setActualEndDateTimestamp(Long actualEndDateTimestamp) {
        this.actualEndDateTimestamp = actualEndDateTimestamp;
    }

    public IteratorVersionSummaryVo withIsExpired(String isExpired) {
        this.isExpired = isExpired;
        return this;
    }

    /**
     * 是否超期
     * @return isExpired
     */
    public String getIsExpired() {
        return isExpired;
    }

    public void setIsExpired(String isExpired) {
        this.isExpired = isExpired;
    }

    public IteratorVersionSummaryVo withExpiredInfo(String expiredInfo) {
        this.expiredInfo = expiredInfo;
        return this;
    }

    /**
     * 计划过期信息,空代表不超期，否则给出具体超期信息
     * @return expiredInfo
     */
    public String getExpiredInfo() {
        return expiredInfo;
    }

    public void setExpiredInfo(String expiredInfo) {
        this.expiredInfo = expiredInfo;
    }

    public IteratorVersionSummaryVo withStages(List<String> stages) {
        this.stages = stages;
        return this;
    }

    public IteratorVersionSummaryVo addStagesItem(String stagesItem) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        this.stages.add(stagesItem);
        return this;
    }

    public IteratorVersionSummaryVo withStages(Consumer<List<String>> stagesSetter) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        stagesSetter.accept(this.stages);
        return this;
    }

    /**
     * 迭代计划，默认包含design,execute,report
     * @return stages
     */
    public List<String> getStages() {
        return stages;
    }

    public void setStages(List<String> stages) {
        this.stages = stages;
    }

    public IteratorVersionSummaryVo withDesign(DesignSummaryVo design) {
        this.design = design;
        return this;
    }

    public IteratorVersionSummaryVo withDesign(Consumer<DesignSummaryVo> designSetter) {
        if (this.design == null) {
            this.design = new DesignSummaryVo();
            designSetter.accept(this.design);
        }

        return this;
    }

    /**
     * Get design
     * @return design
     */
    public DesignSummaryVo getDesign() {
        return design;
    }

    public void setDesign(DesignSummaryVo design) {
        this.design = design;
    }

    public IteratorVersionSummaryVo withExecute(ExecuteSummaryVo execute) {
        this.execute = execute;
        return this;
    }

    public IteratorVersionSummaryVo withExecute(Consumer<ExecuteSummaryVo> executeSetter) {
        if (this.execute == null) {
            this.execute = new ExecuteSummaryVo();
            executeSetter.accept(this.execute);
        }

        return this;
    }

    /**
     * Get execute
     * @return execute
     */
    public ExecuteSummaryVo getExecute() {
        return execute;
    }

    public void setExecute(ExecuteSummaryVo execute) {
        this.execute = execute;
    }

    public IteratorVersionSummaryVo withReport(ReportSummaryVo report) {
        this.report = report;
        return this;
    }

    public IteratorVersionSummaryVo withReport(Consumer<ReportSummaryVo> reportSetter) {
        if (this.report == null) {
            this.report = new ReportSummaryVo();
            reportSetter.accept(this.report);
        }

        return this;
    }

    /**
     * Get report
     * @return report
     */
    public ReportSummaryVo getReport() {
        return report;
    }

    public void setReport(ReportSummaryVo report) {
        this.report = report;
    }

    public IteratorVersionSummaryVo withBranchUri(String branchUri) {
        this.branchUri = branchUri;
        return this;
    }

    /**
     * 所属分支URI
     * @return branchUri
     */
    public String getBranchUri() {
        return branchUri;
    }

    public void setBranchUri(String branchUri) {
        this.branchUri = branchUri;
    }

    public IteratorVersionSummaryVo withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * 所属分支名称
     * @return branchName
     */
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IteratorVersionSummaryVo that = (IteratorVersionSummaryVo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.type, that.type)
            && Objects.equals(this.author, that.author) && Objects.equals(this.name, that.name)
            && Objects.equals(this.rank, that.rank) && Objects.equals(this.version, that.version)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.iterations, that.iterations) && Objects.equals(this.description, that.description)
            && Objects.equals(this.region, that.region) && Objects.equals(this.lastModifier, that.lastModifier)
            && Objects.equals(this.lastModified, that.lastModified)
            && Objects.equals(this.lastModifiedTimestamp, that.lastModifiedTimestamp)
            && Objects.equals(this.lastChangeTime, that.lastChangeTime)
            && Objects.equals(this.versionUri, that.versionUri) && Objects.equals(this.originUri, that.originUri)
            && Objects.equals(this.parentUri, that.parentUri) && Objects.equals(this.parentPath, that.parentPath)
            && Objects.equals(this.creationVersionUri, that.creationVersionUri)
            && Objects.equals(this.creationDate, that.creationDate)
            && Objects.equals(this.creationDateTimestamp, that.creationDateTimestamp)
            && Objects.equals(this.authorName, that.authorName) && Objects.equals(this.comment, that.comment)
            && Objects.equals(this.number, that.number) && Objects.equals(this.isMaster, that.isMaster)
            && Objects.equals(this.isIterator, that.isIterator)
            && Objects.equals(this.planStartDate, that.planStartDate)
            && Objects.equals(this.planEndDate, that.planEndDate) && Objects.equals(this.serviceId, that.serviceId)
            && Objects.equals(this.serviceName, that.serviceName) && Objects.equals(this.pbiId, that.pbiId)
            && Objects.equals(this.pbiName, that.pbiName) && Objects.equals(this.planId, that.planId)
            && Objects.equals(this.metricPbiIds, that.metricPbiIds)
            && Objects.equals(this.metricPbiIdNames, that.metricPbiIdNames)
            && Objects.equals(this.lastSynDate, that.lastSynDate) && Objects.equals(this.isClosed, that.isClosed)
            && Objects.equals(this.asynGit, that.asynGit) && Objects.equals(this.schemaNo, that.schemaNo)
            && Objects.equals(this.finishDate, that.finishDate) && Objects.equals(this.ownerName, that.ownerName)
            && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.currentStage, that.currentStage)
            && Objects.equals(this.serviceTypes, that.serviceTypes) && Objects.equals(this.riskRating, that.riskRating)
            && Objects.equals(this.riskDes, that.riskDes) && Objects.equals(this.projectUuid, that.projectUuid)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.piId, that.piId)
            && Objects.equals(this.startDate, that.startDate)
            && Objects.equals(this.startDateTimestamp, that.startDateTimestamp)
            && Objects.equals(this.endDate, that.endDate)
            && Objects.equals(this.endDateTimestamp, that.endDateTimestamp)
            && Objects.equals(this.actualStartDate, that.actualStartDate)
            && Objects.equals(this.actualStartDateTimestamp, that.actualStartDateTimestamp)
            && Objects.equals(this.actualEndDate, that.actualEndDate)
            && Objects.equals(this.actualEndDateTimestamp, that.actualEndDateTimestamp)
            && Objects.equals(this.isExpired, that.isExpired) && Objects.equals(this.expiredInfo, that.expiredInfo)
            && Objects.equals(this.stages, that.stages) && Objects.equals(this.design, that.design)
            && Objects.equals(this.execute, that.execute) && Objects.equals(this.report, that.report)
            && Objects.equals(this.branchUri, that.branchUri) && Objects.equals(this.branchName, that.branchName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri,
            type,
            author,
            name,
            rank,
            version,
            owner,
            creator,
            iterations,
            description,
            region,
            lastModifier,
            lastModified,
            lastModifiedTimestamp,
            lastChangeTime,
            versionUri,
            originUri,
            parentUri,
            parentPath,
            creationVersionUri,
            creationDate,
            creationDateTimestamp,
            authorName,
            comment,
            number,
            isMaster,
            isIterator,
            planStartDate,
            planEndDate,
            serviceId,
            serviceName,
            pbiId,
            pbiName,
            planId,
            metricPbiIds,
            metricPbiIdNames,
            lastSynDate,
            isClosed,
            asynGit,
            schemaNo,
            finishDate,
            ownerName,
            creatorName,
            currentStage,
            serviceTypes,
            riskRating,
            riskDes,
            projectUuid,
            domainId,
            piId,
            startDate,
            startDateTimestamp,
            endDate,
            endDateTimestamp,
            actualStartDate,
            actualStartDateTimestamp,
            actualEndDate,
            actualEndDateTimestamp,
            isExpired,
            expiredInfo,
            stages,
            design,
            execute,
            report,
            branchUri,
            branchName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IteratorVersionSummaryVo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    iterations: ").append(toIndentedString(iterations)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    lastModifier: ").append(toIndentedString(lastModifier)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    lastModifiedTimestamp: ").append(toIndentedString(lastModifiedTimestamp)).append("\n");
        sb.append("    lastChangeTime: ").append(toIndentedString(lastChangeTime)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    originUri: ").append(toIndentedString(originUri)).append("\n");
        sb.append("    parentUri: ").append(toIndentedString(parentUri)).append("\n");
        sb.append("    parentPath: ").append(toIndentedString(parentPath)).append("\n");
        sb.append("    creationVersionUri: ").append(toIndentedString(creationVersionUri)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    creationDateTimestamp: ").append(toIndentedString(creationDateTimestamp)).append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    isMaster: ").append(toIndentedString(isMaster)).append("\n");
        sb.append("    isIterator: ").append(toIndentedString(isIterator)).append("\n");
        sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
        sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    pbiId: ").append(toIndentedString(pbiId)).append("\n");
        sb.append("    pbiName: ").append(toIndentedString(pbiName)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    metricPbiIds: ").append(toIndentedString(metricPbiIds)).append("\n");
        sb.append("    metricPbiIdNames: ").append(toIndentedString(metricPbiIdNames)).append("\n");
        sb.append("    lastSynDate: ").append(toIndentedString(lastSynDate)).append("\n");
        sb.append("    isClosed: ").append(toIndentedString(isClosed)).append("\n");
        sb.append("    asynGit: ").append(toIndentedString(asynGit)).append("\n");
        sb.append("    schemaNo: ").append(toIndentedString(schemaNo)).append("\n");
        sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    currentStage: ").append(toIndentedString(currentStage)).append("\n");
        sb.append("    serviceTypes: ").append(toIndentedString(serviceTypes)).append("\n");
        sb.append("    riskRating: ").append(toIndentedString(riskRating)).append("\n");
        sb.append("    riskDes: ").append(toIndentedString(riskDes)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    piId: ").append(toIndentedString(piId)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    startDateTimestamp: ").append(toIndentedString(startDateTimestamp)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    endDateTimestamp: ").append(toIndentedString(endDateTimestamp)).append("\n");
        sb.append("    actualStartDate: ").append(toIndentedString(actualStartDate)).append("\n");
        sb.append("    actualStartDateTimestamp: ").append(toIndentedString(actualStartDateTimestamp)).append("\n");
        sb.append("    actualEndDate: ").append(toIndentedString(actualEndDate)).append("\n");
        sb.append("    actualEndDateTimestamp: ").append(toIndentedString(actualEndDateTimestamp)).append("\n");
        sb.append("    isExpired: ").append(toIndentedString(isExpired)).append("\n");
        sb.append("    expiredInfo: ").append(toIndentedString(expiredInfo)).append("\n");
        sb.append("    stages: ").append(toIndentedString(stages)).append("\n");
        sb.append("    design: ").append(toIndentedString(design)).append("\n");
        sb.append("    execute: ").append(toIndentedString(execute)).append("\n");
        sb.append("    report: ").append(toIndentedString(report)).append("\n");
        sb.append("    branchUri: ").append(toIndentedString(branchUri)).append("\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
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
