package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 测试任务集合
 */
public class TaskVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private String stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_id")

    private String authorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_name")

    private String authorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_id")

    private String ownerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_name")

    private String ownerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_uri")

    private String parentUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_path")

    private String parentPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_uri")

    private String originUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_uri")

    private String branchUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_name")

    private String versionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_date")

    private OffsetDateTime creationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_date_timestamp")

    private Long createDateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_timestamp")

    private Long updateTimeTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_change_time")

    private OffsetDateTime relationChangeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_change_time_timestamp")

    private Long relationChangeTimeTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_condition")

    private String testCaseCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updator_id")

    private String updatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updator_name")

    private String updatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_changer_id")

    private String relationChangerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private Integer serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_name")

    private String serviceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_list")

    private List<String> tagList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private String moduleId;

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
    @JsonProperty(value = "release_dev")

    private String releaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_param")

    private String extParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_way")

    private Integer executeWay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_type")

    private Integer executeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private Integer statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_name")

    private String statusName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_code")

    private Integer resultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_name")

    private String resultName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_status_code")

    private Integer executeStatusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_status_name")

    private String executeStatusName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_id")

    private String executorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_name")

    private String executorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_latest_time")

    private OffsetDateTime executeLatestTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_latest_time_timestamp")

    private Long executeLatestTimeTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_duration")

    private String executeDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_times")

    private Integer executeTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_operation_info")

    private CaseOperationVo caseOperationInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assign_case_num")

    private Integer assignCaseNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_case_num")

    private Integer finishCaseNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assign_defect_num")

    private Integer assignDefectNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_assign_msg")

    private String taskAssignMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterator_version_uri")

    private String iteratorVersionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_number_list")

    private List<NameAndValueAndCodeVo> resultNumberList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_date")

    private OffsetDateTime finishDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_date_timestamp")

    private Long finishDateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_start_date")

    private OffsetDateTime planStartDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_start_timestamp")

    private Long planStartTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_date")

    private OffsetDateTime planEndDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_timestamp")

    private Long planEndTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_status")

    private Integer expirationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_status_name")

    private String expirationStatusName;

    public TaskVo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 测试任务URI
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public TaskVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 测试任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskVo withStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * 测试阶段
     * @return stage
     */
    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public TaskVo withNumber(String number) {
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

    public TaskVo withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public TaskVo withDescription(String description) {
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

    public TaskVo withRegion(String region) {
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

    public TaskVo withAuthorId(String authorId) {
        this.authorId = authorId;
        return this;
    }

    /**
     * 创建人ID
     * @return authorId
     */
    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public TaskVo withAuthorName(String authorName) {
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

    public TaskVo withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * 责任人ID
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public TaskVo withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
     * 责任人名称
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public TaskVo withParentUri(String parentUri) {
        this.parentUri = parentUri;
        return this;
    }

    /**
     * 父任务URI
     * @return parentUri
     */
    public String getParentUri() {
        return parentUri;
    }

    public void setParentUri(String parentUri) {
        this.parentUri = parentUri;
    }

    public TaskVo withParentPath(String parentPath) {
        this.parentPath = parentPath;
        return this;
    }

    /**
     * 父任务路径
     * @return parentPath
     */
    public String getParentPath() {
        return parentPath;
    }

    public void setParentPath(String parentPath) {
        this.parentPath = parentPath;
    }

    public TaskVo withOriginUri(String originUri) {
        this.originUri = originUri;
        return this;
    }

    /**
     * 源任务URI
     * @return originUri
     */
    public String getOriginUri() {
        return originUri;
    }

    public void setOriginUri(String originUri) {
        this.originUri = originUri;
    }

    public TaskVo withVersionUri(String versionUri) {
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

    public TaskVo withBranchUri(String branchUri) {
        this.branchUri = branchUri;
        return this;
    }

    /**
     * 分支URI
     * @return branchUri
     */
    public String getBranchUri() {
        return branchUri;
    }

    public void setBranchUri(String branchUri) {
        this.branchUri = branchUri;
    }

    public TaskVo withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * 版本名称
     * @return versionName
     */
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public TaskVo withCreationDate(OffsetDateTime creationDate) {
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

    public TaskVo withCreateDateTimestamp(Long createDateTimestamp) {
        this.createDateTimestamp = createDateTimestamp;
        return this;
    }

    /**
     * 创建时间时间戳
     * @return createDateTimestamp
     */
    public Long getCreateDateTimestamp() {
        return createDateTimestamp;
    }

    public void setCreateDateTimestamp(Long createDateTimestamp) {
        this.createDateTimestamp = createDateTimestamp;
    }

    public TaskVo withUpdateTime(OffsetDateTime updateTime) {
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

    public TaskVo withUpdateTimeTimestamp(Long updateTimeTimestamp) {
        this.updateTimeTimestamp = updateTimeTimestamp;
        return this;
    }

    /**
     * 更新时间时间戳
     * @return updateTimeTimestamp
     */
    public Long getUpdateTimeTimestamp() {
        return updateTimeTimestamp;
    }

    public void setUpdateTimeTimestamp(Long updateTimeTimestamp) {
        this.updateTimeTimestamp = updateTimeTimestamp;
    }

    public TaskVo withRelationChangeTime(OffsetDateTime relationChangeTime) {
        this.relationChangeTime = relationChangeTime;
        return this;
    }

    /**
     * 关联关系修改时时间
     * @return relationChangeTime
     */
    public OffsetDateTime getRelationChangeTime() {
        return relationChangeTime;
    }

    public void setRelationChangeTime(OffsetDateTime relationChangeTime) {
        this.relationChangeTime = relationChangeTime;
    }

    public TaskVo withRelationChangeTimeTimestamp(Long relationChangeTimeTimestamp) {
        this.relationChangeTimeTimestamp = relationChangeTimeTimestamp;
        return this;
    }

    /**
     * 关联关系修改时间时间戳
     * @return relationChangeTimeTimestamp
     */
    public Long getRelationChangeTimeTimestamp() {
        return relationChangeTimeTimestamp;
    }

    public void setRelationChangeTimeTimestamp(Long relationChangeTimeTimestamp) {
        this.relationChangeTimeTimestamp = relationChangeTimeTimestamp;
    }

    public TaskVo withTestCaseCondition(String testCaseCondition) {
        this.testCaseCondition = testCaseCondition;
        return this;
    }

    /**
     * 动态任务用例过滤条件
     * @return testCaseCondition
     */
    public String getTestCaseCondition() {
        return testCaseCondition;
    }

    public void setTestCaseCondition(String testCaseCondition) {
        this.testCaseCondition = testCaseCondition;
    }

    public TaskVo withUpdatorId(String updatorId) {
        this.updatorId = updatorId;
        return this;
    }

    /**
     * 修改人Id
     * @return updatorId
     */
    public String getUpdatorId() {
        return updatorId;
    }

    public void setUpdatorId(String updatorId) {
        this.updatorId = updatorId;
    }

    public TaskVo withUpdatorName(String updatorName) {
        this.updatorName = updatorName;
        return this;
    }

    /**
     * 修改人名称
     * @return updatorName
     */
    public String getUpdatorName() {
        return updatorName;
    }

    public void setUpdatorName(String updatorName) {
        this.updatorName = updatorName;
    }

    public TaskVo withRelationChangerId(String relationChangerId) {
        this.relationChangerId = relationChangerId;
        return this;
    }

    /**
     * 关联关系修改人Id
     * @return relationChangerId
     */
    public String getRelationChangerId() {
        return relationChangerId;
    }

    public void setRelationChangerId(String relationChangerId) {
        this.relationChangerId = relationChangerId;
    }

    public TaskVo withServiceType(Integer serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 服务类型ID
     * @return serviceType
     */
    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    public TaskVo withServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
        return this;
    }

    /**
     * 服务类型名称
     * @return serviceTypeName
     */
    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    public TaskVo withTagList(List<String> tagList) {
        this.tagList = tagList;
        return this;
    }

    public TaskVo addTagListItem(String tagListItem) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        this.tagList.add(tagListItem);
        return this;
    }

    public TaskVo withTagList(Consumer<List<String>> tagListSetter) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        tagListSetter.accept(this.tagList);
        return this;
    }

    /**
     * 标签名称集合
     * @return tagList
     */
    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public TaskVo withModuleId(String moduleId) {
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

    public TaskVo withModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    /**
     * 模块名称
     * @return moduleName
     */
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public TaskVo withModulePath(String modulePath) {
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

    public TaskVo withModulePathName(String modulePathName) {
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

    public TaskVo withReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
        return this;
    }

    /**
     * 发布版本号
     * @return releaseDev
     */
    public String getReleaseDev() {
        return releaseDev;
    }

    public void setReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
    }

    public TaskVo withExtParam(String extParam) {
        this.extParam = extParam;
        return this;
    }

    /**
     * 扩展参数
     * @return extParam
     */
    public String getExtParam() {
        return extParam;
    }

    public void setExtParam(String extParam) {
        this.extParam = extParam;
    }

    public TaskVo withExecuteWay(Integer executeWay) {
        this.executeWay = executeWay;
        return this;
    }

    /**
     * 执行方式（1：串行，2：并行）
     * @return executeWay
     */
    public Integer getExecuteWay() {
        return executeWay;
    }

    public void setExecuteWay(Integer executeWay) {
        this.executeWay = executeWay;
    }

    public TaskVo withExecuteType(Integer executeType) {
        this.executeType = executeType;
        return this;
    }

    /**
     * 执行类型（0：冒烟，1：定时）
     * @return executeType
     */
    public Integer getExecuteType() {
        return executeType;
    }

    public void setExecuteType(Integer executeType) {
        this.executeType = executeType;
    }

    public TaskVo withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 生命周期状态Code
     * @return statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public TaskVo withStatusName(String statusName) {
        this.statusName = statusName;
        return this;
    }

    /**
     * 生命周期状态名称
     * @return statusName
     */
    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public TaskVo withResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * 执行结果Code
     * @return resultCode
     */
    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public TaskVo withResultName(String resultName) {
        this.resultName = resultName;
        return this;
    }

    /**
     * 执行状态名称
     * @return resultName
     */
    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    public TaskVo withExecuteStatusCode(Integer executeStatusCode) {
        this.executeStatusCode = executeStatusCode;
        return this;
    }

    /**
     * Echo执行状态Code
     * @return executeStatusCode
     */
    public Integer getExecuteStatusCode() {
        return executeStatusCode;
    }

    public void setExecuteStatusCode(Integer executeStatusCode) {
        this.executeStatusCode = executeStatusCode;
    }

    public TaskVo withExecuteStatusName(String executeStatusName) {
        this.executeStatusName = executeStatusName;
        return this;
    }

    /**
     * Echo执行状态名称
     * @return executeStatusName
     */
    public String getExecuteStatusName() {
        return executeStatusName;
    }

    public void setExecuteStatusName(String executeStatusName) {
        this.executeStatusName = executeStatusName;
    }

    public TaskVo withExecutorId(String executorId) {
        this.executorId = executorId;
        return this;
    }

    /**
     * 执行人ID
     * @return executorId
     */
    public String getExecutorId() {
        return executorId;
    }

    public void setExecutorId(String executorId) {
        this.executorId = executorId;
    }

    public TaskVo withExecutorName(String executorName) {
        this.executorName = executorName;
        return this;
    }

    /**
     * 执行人名称
     * @return executorName
     */
    public String getExecutorName() {
        return executorName;
    }

    public void setExecutorName(String executorName) {
        this.executorName = executorName;
    }

    public TaskVo withExecuteLatestTime(OffsetDateTime executeLatestTime) {
        this.executeLatestTime = executeLatestTime;
        return this;
    }

    /**
     * 最近执行时间
     * @return executeLatestTime
     */
    public OffsetDateTime getExecuteLatestTime() {
        return executeLatestTime;
    }

    public void setExecuteLatestTime(OffsetDateTime executeLatestTime) {
        this.executeLatestTime = executeLatestTime;
    }

    public TaskVo withExecuteLatestTimeTimestamp(Long executeLatestTimeTimestamp) {
        this.executeLatestTimeTimestamp = executeLatestTimeTimestamp;
        return this;
    }

    /**
     * 最近执行时间时间戳
     * @return executeLatestTimeTimestamp
     */
    public Long getExecuteLatestTimeTimestamp() {
        return executeLatestTimeTimestamp;
    }

    public void setExecuteLatestTimeTimestamp(Long executeLatestTimeTimestamp) {
        this.executeLatestTimeTimestamp = executeLatestTimeTimestamp;
    }

    public TaskVo withExecuteDuration(String executeDuration) {
        this.executeDuration = executeDuration;
        return this;
    }

    /**
     * 执行时长
     * @return executeDuration
     */
    public String getExecuteDuration() {
        return executeDuration;
    }

    public void setExecuteDuration(String executeDuration) {
        this.executeDuration = executeDuration;
    }

    public TaskVo withExecuteTimes(Integer executeTimes) {
        this.executeTimes = executeTimes;
        return this;
    }

    /**
     * 执行次数
     * @return executeTimes
     */
    public Integer getExecuteTimes() {
        return executeTimes;
    }

    public void setExecuteTimes(Integer executeTimes) {
        this.executeTimes = executeTimes;
    }

    public TaskVo withProjectUuid(String projectUuid) {
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

    public TaskVo withCaseOperationInfo(CaseOperationVo caseOperationInfo) {
        this.caseOperationInfo = caseOperationInfo;
        return this;
    }

    public TaskVo withCaseOperationInfo(Consumer<CaseOperationVo> caseOperationInfoSetter) {
        if (this.caseOperationInfo == null) {
            this.caseOperationInfo = new CaseOperationVo();
            caseOperationInfoSetter.accept(this.caseOperationInfo);
        }

        return this;
    }

    /**
     * Get caseOperationInfo
     * @return caseOperationInfo
     */
    public CaseOperationVo getCaseOperationInfo() {
        return caseOperationInfo;
    }

    public void setCaseOperationInfo(CaseOperationVo caseOperationInfo) {
        this.caseOperationInfo = caseOperationInfo;
    }

    public TaskVo withAssignCaseNum(Integer assignCaseNum) {
        this.assignCaseNum = assignCaseNum;
        return this;
    }

    /**
     * 关联用例数
     * @return assignCaseNum
     */
    public Integer getAssignCaseNum() {
        return assignCaseNum;
    }

    public void setAssignCaseNum(Integer assignCaseNum) {
        this.assignCaseNum = assignCaseNum;
    }

    public TaskVo withFinishCaseNum(Integer finishCaseNum) {
        this.finishCaseNum = finishCaseNum;
        return this;
    }

    /**
     * 已完成用例数量
     * @return finishCaseNum
     */
    public Integer getFinishCaseNum() {
        return finishCaseNum;
    }

    public void setFinishCaseNum(Integer finishCaseNum) {
        this.finishCaseNum = finishCaseNum;
    }

    public TaskVo withAssignDefectNum(Integer assignDefectNum) {
        this.assignDefectNum = assignDefectNum;
        return this;
    }

    /**
     * 关联缺陷数量
     * @return assignDefectNum
     */
    public Integer getAssignDefectNum() {
        return assignDefectNum;
    }

    public void setAssignDefectNum(Integer assignDefectNum) {
        this.assignDefectNum = assignDefectNum;
    }

    public TaskVo withTaskAssignMsg(String taskAssignMsg) {
        this.taskAssignMsg = taskAssignMsg;
        return this;
    }

    /**
     * 任务关联用例变更提示信息
     * @return taskAssignMsg
     */
    public String getTaskAssignMsg() {
        return taskAssignMsg;
    }

    public void setTaskAssignMsg(String taskAssignMsg) {
        this.taskAssignMsg = taskAssignMsg;
    }

    public TaskVo withIteratorVersionUri(String iteratorVersionUri) {
        this.iteratorVersionUri = iteratorVersionUri;
        return this;
    }

    /**
     * 测试套所属迭代uri，非迭代下创建的测试套返回null
     * @return iteratorVersionUri
     */
    public String getIteratorVersionUri() {
        return iteratorVersionUri;
    }

    public void setIteratorVersionUri(String iteratorVersionUri) {
        this.iteratorVersionUri = iteratorVersionUri;
    }

    public TaskVo withResultNumberList(List<NameAndValueAndCodeVo> resultNumberList) {
        this.resultNumberList = resultNumberList;
        return this;
    }

    public TaskVo addResultNumberListItem(NameAndValueAndCodeVo resultNumberListItem) {
        if (this.resultNumberList == null) {
            this.resultNumberList = new ArrayList<>();
        }
        this.resultNumberList.add(resultNumberListItem);
        return this;
    }

    public TaskVo withResultNumberList(Consumer<List<NameAndValueAndCodeVo>> resultNumberListSetter) {
        if (this.resultNumberList == null) {
            this.resultNumberList = new ArrayList<>();
        }
        resultNumberListSetter.accept(this.resultNumberList);
        return this;
    }

    /**
     * 用户自定义结果对应的用例数目
     * @return resultNumberList
     */
    public List<NameAndValueAndCodeVo> getResultNumberList() {
        return resultNumberList;
    }

    public void setResultNumberList(List<NameAndValueAndCodeVo> resultNumberList) {
        this.resultNumberList = resultNumberList;
    }

    public TaskVo withFinishDate(OffsetDateTime finishDate) {
        this.finishDate = finishDate;
        return this;
    }

    /**
     * 测试套完成时间
     * @return finishDate
     */
    public OffsetDateTime getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(OffsetDateTime finishDate) {
        this.finishDate = finishDate;
    }

    public TaskVo withFinishDateTimestamp(Long finishDateTimestamp) {
        this.finishDateTimestamp = finishDateTimestamp;
        return this;
    }

    /**
     * 测试套完成时间戳
     * @return finishDateTimestamp
     */
    public Long getFinishDateTimestamp() {
        return finishDateTimestamp;
    }

    public void setFinishDateTimestamp(Long finishDateTimestamp) {
        this.finishDateTimestamp = finishDateTimestamp;
    }

    public TaskVo withPlanStartDate(OffsetDateTime planStartDate) {
        this.planStartDate = planStartDate;
        return this;
    }

    /**
     * 计划开始时间
     * @return planStartDate
     */
    public OffsetDateTime getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(OffsetDateTime planStartDate) {
        this.planStartDate = planStartDate;
    }

    public TaskVo withPlanStartTimestamp(Long planStartTimestamp) {
        this.planStartTimestamp = planStartTimestamp;
        return this;
    }

    /**
     * 计划开始时间戳
     * @return planStartTimestamp
     */
    public Long getPlanStartTimestamp() {
        return planStartTimestamp;
    }

    public void setPlanStartTimestamp(Long planStartTimestamp) {
        this.planStartTimestamp = planStartTimestamp;
    }

    public TaskVo withPlanEndDate(OffsetDateTime planEndDate) {
        this.planEndDate = planEndDate;
        return this;
    }

    /**
     * 计划结束时间
     * @return planEndDate
     */
    public OffsetDateTime getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(OffsetDateTime planEndDate) {
        this.planEndDate = planEndDate;
    }

    public TaskVo withPlanEndTimestamp(Long planEndTimestamp) {
        this.planEndTimestamp = planEndTimestamp;
        return this;
    }

    /**
     * 计划结束时间戳
     * @return planEndTimestamp
     */
    public Long getPlanEndTimestamp() {
        return planEndTimestamp;
    }

    public void setPlanEndTimestamp(Long planEndTimestamp) {
        this.planEndTimestamp = planEndTimestamp;
    }

    public TaskVo withExpirationStatus(Integer expirationStatus) {
        this.expirationStatus = expirationStatus;
        return this;
    }

    /**
     * 测试套超期状态值，分别为：无状态(null)、未超期(0)、即将超期(1)、已超期(2)、延期完成(3)、按期完成(4)
     * @return expirationStatus
     */
    public Integer getExpirationStatus() {
        return expirationStatus;
    }

    public void setExpirationStatus(Integer expirationStatus) {
        this.expirationStatus = expirationStatus;
    }

    public TaskVo withExpirationStatusName(String expirationStatusName) {
        this.expirationStatusName = expirationStatusName;
        return this;
    }

    /**
     * 测试套超期状态名称，分别为：无状态(不显示状态)、未超期(Unexpired)、即将超期(About to expire)、已超期(Expired)、延期完成(Delayed completion)、按期完成(On schedule completion)
     * @return expirationStatusName
     */
    public String getExpirationStatusName() {
        return expirationStatusName;
    }

    public void setExpirationStatusName(String expirationStatusName) {
        this.expirationStatusName = expirationStatusName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskVo that = (TaskVo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.name, that.name)
            && Objects.equals(this.stage, that.stage) && Objects.equals(this.number, that.number)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.description, that.description)
            && Objects.equals(this.region, that.region) && Objects.equals(this.authorId, that.authorId)
            && Objects.equals(this.authorName, that.authorName) && Objects.equals(this.ownerId, that.ownerId)
            && Objects.equals(this.ownerName, that.ownerName) && Objects.equals(this.parentUri, that.parentUri)
            && Objects.equals(this.parentPath, that.parentPath) && Objects.equals(this.originUri, that.originUri)
            && Objects.equals(this.versionUri, that.versionUri) && Objects.equals(this.branchUri, that.branchUri)
            && Objects.equals(this.versionName, that.versionName)
            && Objects.equals(this.creationDate, that.creationDate)
            && Objects.equals(this.createDateTimestamp, that.createDateTimestamp)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.updateTimeTimestamp, that.updateTimeTimestamp)
            && Objects.equals(this.relationChangeTime, that.relationChangeTime)
            && Objects.equals(this.relationChangeTimeTimestamp, that.relationChangeTimeTimestamp)
            && Objects.equals(this.testCaseCondition, that.testCaseCondition)
            && Objects.equals(this.updatorId, that.updatorId) && Objects.equals(this.updatorName, that.updatorName)
            && Objects.equals(this.relationChangerId, that.relationChangerId)
            && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.serviceTypeName, that.serviceTypeName) && Objects.equals(this.tagList, that.tagList)
            && Objects.equals(this.moduleId, that.moduleId) && Objects.equals(this.moduleName, that.moduleName)
            && Objects.equals(this.modulePath, that.modulePath)
            && Objects.equals(this.modulePathName, that.modulePathName)
            && Objects.equals(this.releaseDev, that.releaseDev) && Objects.equals(this.extParam, that.extParam)
            && Objects.equals(this.executeWay, that.executeWay) && Objects.equals(this.executeType, that.executeType)
            && Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.statusName, that.statusName)
            && Objects.equals(this.resultCode, that.resultCode) && Objects.equals(this.resultName, that.resultName)
            && Objects.equals(this.executeStatusCode, that.executeStatusCode)
            && Objects.equals(this.executeStatusName, that.executeStatusName)
            && Objects.equals(this.executorId, that.executorId) && Objects.equals(this.executorName, that.executorName)
            && Objects.equals(this.executeLatestTime, that.executeLatestTime)
            && Objects.equals(this.executeLatestTimeTimestamp, that.executeLatestTimeTimestamp)
            && Objects.equals(this.executeDuration, that.executeDuration)
            && Objects.equals(this.executeTimes, that.executeTimes)
            && Objects.equals(this.projectUuid, that.projectUuid)
            && Objects.equals(this.caseOperationInfo, that.caseOperationInfo)
            && Objects.equals(this.assignCaseNum, that.assignCaseNum)
            && Objects.equals(this.finishCaseNum, that.finishCaseNum)
            && Objects.equals(this.assignDefectNum, that.assignDefectNum)
            && Objects.equals(this.taskAssignMsg, that.taskAssignMsg)
            && Objects.equals(this.iteratorVersionUri, that.iteratorVersionUri)
            && Objects.equals(this.resultNumberList, that.resultNumberList)
            && Objects.equals(this.finishDate, that.finishDate)
            && Objects.equals(this.finishDateTimestamp, that.finishDateTimestamp)
            && Objects.equals(this.planStartDate, that.planStartDate)
            && Objects.equals(this.planStartTimestamp, that.planStartTimestamp)
            && Objects.equals(this.planEndDate, that.planEndDate)
            && Objects.equals(this.planEndTimestamp, that.planEndTimestamp)
            && Objects.equals(this.expirationStatus, that.expirationStatus)
            && Objects.equals(this.expirationStatusName, that.expirationStatusName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri,
            name,
            stage,
            number,
            tags,
            description,
            region,
            authorId,
            authorName,
            ownerId,
            ownerName,
            parentUri,
            parentPath,
            originUri,
            versionUri,
            branchUri,
            versionName,
            creationDate,
            createDateTimestamp,
            updateTime,
            updateTimeTimestamp,
            relationChangeTime,
            relationChangeTimeTimestamp,
            testCaseCondition,
            updatorId,
            updatorName,
            relationChangerId,
            serviceType,
            serviceTypeName,
            tagList,
            moduleId,
            moduleName,
            modulePath,
            modulePathName,
            releaseDev,
            extParam,
            executeWay,
            executeType,
            statusCode,
            statusName,
            resultCode,
            resultName,
            executeStatusCode,
            executeStatusName,
            executorId,
            executorName,
            executeLatestTime,
            executeLatestTimeTimestamp,
            executeDuration,
            executeTimes,
            projectUuid,
            caseOperationInfo,
            assignCaseNum,
            finishCaseNum,
            assignDefectNum,
            taskAssignMsg,
            iteratorVersionUri,
            resultNumberList,
            finishDate,
            finishDateTimestamp,
            planStartDate,
            planStartTimestamp,
            planEndDate,
            planEndTimestamp,
            expirationStatus,
            expirationStatusName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskVo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
        sb.append("    authorName: ").append(toIndentedString(authorName)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    parentUri: ").append(toIndentedString(parentUri)).append("\n");
        sb.append("    parentPath: ").append(toIndentedString(parentPath)).append("\n");
        sb.append("    originUri: ").append(toIndentedString(originUri)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    branchUri: ").append(toIndentedString(branchUri)).append("\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    createDateTimestamp: ").append(toIndentedString(createDateTimestamp)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateTimeTimestamp: ").append(toIndentedString(updateTimeTimestamp)).append("\n");
        sb.append("    relationChangeTime: ").append(toIndentedString(relationChangeTime)).append("\n");
        sb.append("    relationChangeTimeTimestamp: ")
            .append(toIndentedString(relationChangeTimeTimestamp))
            .append("\n");
        sb.append("    testCaseCondition: ").append(toIndentedString(testCaseCondition)).append("\n");
        sb.append("    updatorId: ").append(toIndentedString(updatorId)).append("\n");
        sb.append("    updatorName: ").append(toIndentedString(updatorName)).append("\n");
        sb.append("    relationChangerId: ").append(toIndentedString(relationChangerId)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    serviceTypeName: ").append(toIndentedString(serviceTypeName)).append("\n");
        sb.append("    tagList: ").append(toIndentedString(tagList)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    modulePath: ").append(toIndentedString(modulePath)).append("\n");
        sb.append("    modulePathName: ").append(toIndentedString(modulePathName)).append("\n");
        sb.append("    releaseDev: ").append(toIndentedString(releaseDev)).append("\n");
        sb.append("    extParam: ").append(toIndentedString(extParam)).append("\n");
        sb.append("    executeWay: ").append(toIndentedString(executeWay)).append("\n");
        sb.append("    executeType: ").append(toIndentedString(executeType)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    statusName: ").append(toIndentedString(statusName)).append("\n");
        sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
        sb.append("    resultName: ").append(toIndentedString(resultName)).append("\n");
        sb.append("    executeStatusCode: ").append(toIndentedString(executeStatusCode)).append("\n");
        sb.append("    executeStatusName: ").append(toIndentedString(executeStatusName)).append("\n");
        sb.append("    executorId: ").append(toIndentedString(executorId)).append("\n");
        sb.append("    executorName: ").append(toIndentedString(executorName)).append("\n");
        sb.append("    executeLatestTime: ").append(toIndentedString(executeLatestTime)).append("\n");
        sb.append("    executeLatestTimeTimestamp: ").append(toIndentedString(executeLatestTimeTimestamp)).append("\n");
        sb.append("    executeDuration: ").append(toIndentedString(executeDuration)).append("\n");
        sb.append("    executeTimes: ").append(toIndentedString(executeTimes)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    caseOperationInfo: ").append(toIndentedString(caseOperationInfo)).append("\n");
        sb.append("    assignCaseNum: ").append(toIndentedString(assignCaseNum)).append("\n");
        sb.append("    finishCaseNum: ").append(toIndentedString(finishCaseNum)).append("\n");
        sb.append("    assignDefectNum: ").append(toIndentedString(assignDefectNum)).append("\n");
        sb.append("    taskAssignMsg: ").append(toIndentedString(taskAssignMsg)).append("\n");
        sb.append("    iteratorVersionUri: ").append(toIndentedString(iteratorVersionUri)).append("\n");
        sb.append("    resultNumberList: ").append(toIndentedString(resultNumberList)).append("\n");
        sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
        sb.append("    finishDateTimestamp: ").append(toIndentedString(finishDateTimestamp)).append("\n");
        sb.append("    planStartDate: ").append(toIndentedString(planStartDate)).append("\n");
        sb.append("    planStartTimestamp: ").append(toIndentedString(planStartTimestamp)).append("\n");
        sb.append("    planEndDate: ").append(toIndentedString(planEndDate)).append("\n");
        sb.append("    planEndTimestamp: ").append(toIndentedString(planEndTimestamp)).append("\n");
        sb.append("    expirationStatus: ").append(toIndentedString(expirationStatus)).append("\n");
        sb.append("    expirationStatusName: ").append(toIndentedString(expirationStatusName)).append("\n");
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
