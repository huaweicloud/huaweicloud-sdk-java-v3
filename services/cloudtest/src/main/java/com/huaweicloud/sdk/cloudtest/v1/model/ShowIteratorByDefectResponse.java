package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowIteratorByDefectResponse extends SdkResponse {

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

    public ShowIteratorByDefectResponse withUri(String uri) {
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

    public ShowIteratorByDefectResponse withType(String type) {
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

    public ShowIteratorByDefectResponse withAuthor(String author) {
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

    public ShowIteratorByDefectResponse withName(String name) {
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

    public ShowIteratorByDefectResponse withRank(Integer rank) {
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

    public ShowIteratorByDefectResponse withVersion(String version) {
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

    public ShowIteratorByDefectResponse withOwner(String owner) {
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

    public ShowIteratorByDefectResponse withCreator(String creator) {
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

    public ShowIteratorByDefectResponse withIterations(String iterations) {
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

    public ShowIteratorByDefectResponse withDescription(String description) {
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

    public ShowIteratorByDefectResponse withRegion(String region) {
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

    public ShowIteratorByDefectResponse withLastModifier(String lastModifier) {
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

    public ShowIteratorByDefectResponse withLastModified(OffsetDateTime lastModified) {
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

    public ShowIteratorByDefectResponse withLastModifiedTimestamp(Long lastModifiedTimestamp) {
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

    public ShowIteratorByDefectResponse withLastChangeTime(OffsetDateTime lastChangeTime) {
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

    public ShowIteratorByDefectResponse withVersionUri(String versionUri) {
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

    public ShowIteratorByDefectResponse withOriginUri(String originUri) {
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

    public ShowIteratorByDefectResponse withParentUri(String parentUri) {
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

    public ShowIteratorByDefectResponse withParentPath(String parentPath) {
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

    public ShowIteratorByDefectResponse withCreationVersionUri(String creationVersionUri) {
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

    public ShowIteratorByDefectResponse withCreationDate(OffsetDateTime creationDate) {
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

    public ShowIteratorByDefectResponse withCreationDateTimestamp(Long creationDateTimestamp) {
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

    public ShowIteratorByDefectResponse withAuthorName(String authorName) {
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

    public ShowIteratorByDefectResponse withComment(String comment) {
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

    public ShowIteratorByDefectResponse withNumber(String number) {
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

    public ShowIteratorByDefectResponse withIsMaster(Integer isMaster) {
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

    public ShowIteratorByDefectResponse withIsIterator(Integer isIterator) {
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

    public ShowIteratorByDefectResponse withPlanStartDate(OffsetDateTime planStartDate) {
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

    public ShowIteratorByDefectResponse withPlanEndDate(OffsetDateTime planEndDate) {
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

    public ShowIteratorByDefectResponse withServiceId(String serviceId) {
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

    public ShowIteratorByDefectResponse withServiceName(String serviceName) {
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

    public ShowIteratorByDefectResponse withPbiId(String pbiId) {
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

    public ShowIteratorByDefectResponse withPbiName(String pbiName) {
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

    public ShowIteratorByDefectResponse withPlanId(String planId) {
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

    public ShowIteratorByDefectResponse withMetricPbiIds(String metricPbiIds) {
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

    public ShowIteratorByDefectResponse withMetricPbiIdNames(String metricPbiIdNames) {
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

    public ShowIteratorByDefectResponse withLastSynDate(OffsetDateTime lastSynDate) {
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

    public ShowIteratorByDefectResponse withIsClosed(String isClosed) {
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

    public ShowIteratorByDefectResponse withAsynGit(String asynGit) {
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

    public ShowIteratorByDefectResponse withSchemaNo(Integer schemaNo) {
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

    public ShowIteratorByDefectResponse withFinishDate(OffsetDateTime finishDate) {
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

    public ShowIteratorByDefectResponse withOwnerName(String ownerName) {
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

    public ShowIteratorByDefectResponse withCreatorName(String creatorName) {
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

    public ShowIteratorByDefectResponse withCurrentStage(String currentStage) {
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

    public ShowIteratorByDefectResponse withServiceTypes(String serviceTypes) {
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

    public ShowIteratorByDefectResponse withRiskRating(Integer riskRating) {
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

    public ShowIteratorByDefectResponse withRiskDes(String riskDes) {
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

    public ShowIteratorByDefectResponse withProjectUuid(String projectUuid) {
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

    public ShowIteratorByDefectResponse withDomainId(String domainId) {
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

    public ShowIteratorByDefectResponse withPiId(String piId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowIteratorByDefectResponse that = (ShowIteratorByDefectResponse) obj;
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
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.piId, that.piId);
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
            piId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowIteratorByDefectResponse {\n");
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
