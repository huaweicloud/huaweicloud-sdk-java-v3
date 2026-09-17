package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 测试套件信息
 */
public class TaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_id")

    private String ownerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_uri")

    private String parentUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_condition")

    private String testCaseCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private String stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private Integer serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_id")

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_name")

    private String moduleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_dev")

    private String releaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private Integer statusCode;

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
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_start_timestamp")

    private Long planStartTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_timestamp")

    private Long planEndTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assign_case_uris")

    private List<String> assignCaseUris = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_operation_info")

    private CaseOperationInfo caseOperationInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "only_update_status")

    private Boolean onlyUpdateStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_async")

    private Boolean isAsync;

    public TaskInfo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 指定创建任务的uri
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public TaskInfo withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 分支/迭代uri
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    public TaskInfo withName(String name) {
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

    public TaskInfo withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * 处理人/责任人id
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public TaskInfo withParentUri(String parentUri) {
        this.parentUri = parentUri;
        return this;
    }

    /**
     * 父任务uri
     * @return parentUri
     */
    public String getParentUri() {
        return parentUri;
    }

    public void setParentUri(String parentUri) {
        this.parentUri = parentUri;
    }

    public TaskInfo withTestCaseCondition(String testCaseCondition) {
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

    public TaskInfo withStage(String stage) {
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

    public TaskInfo withServiceType(Integer serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 服务类型0:功能测试 1:接口测试 11:性能测试
     * @return serviceType
     */
    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    public TaskInfo withNumber(String number) {
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

    public TaskInfo withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public TaskInfo addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public TaskInfo withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标记id
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public TaskInfo withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * 模块id
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public TaskInfo withModuleName(String moduleName) {
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

    public TaskInfo withReleaseDev(String releaseDev) {
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

    public TaskInfo withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 状态code
     * @return statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public TaskInfo withExtParam(String extParam) {
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

    public TaskInfo withExecuteWay(Integer executeWay) {
        this.executeWay = executeWay;
        return this;
    }

    /**
     * 执行方式 1：串行，2：并行
     * @return executeWay
     */
    public Integer getExecuteWay() {
        return executeWay;
    }

    public void setExecuteWay(Integer executeWay) {
        this.executeWay = executeWay;
    }

    public TaskInfo withExecuteType(Integer executeType) {
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

    public TaskInfo withDescription(String description) {
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

    public TaskInfo withPlanStartTimestamp(Long planStartTimestamp) {
        this.planStartTimestamp = planStartTimestamp;
        return this;
    }

    /**
     * 计划开始时间戳，当传入-1时，时间置为空
     * @return planStartTimestamp
     */
    public Long getPlanStartTimestamp() {
        return planStartTimestamp;
    }

    public void setPlanStartTimestamp(Long planStartTimestamp) {
        this.planStartTimestamp = planStartTimestamp;
    }

    public TaskInfo withPlanEndTimestamp(Long planEndTimestamp) {
        this.planEndTimestamp = planEndTimestamp;
        return this;
    }

    /**
     * 计划结束时间戳，当传入-1时，时间置为空
     * @return planEndTimestamp
     */
    public Long getPlanEndTimestamp() {
        return planEndTimestamp;
    }

    public void setPlanEndTimestamp(Long planEndTimestamp) {
        this.planEndTimestamp = planEndTimestamp;
    }

    public TaskInfo withRegion(String region) {
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

    public TaskInfo withAssignCaseUris(List<String> assignCaseUris) {
        this.assignCaseUris = assignCaseUris;
        return this;
    }

    public TaskInfo addAssignCaseUrisItem(String assignCaseUrisItem) {
        if (this.assignCaseUris == null) {
            this.assignCaseUris = new ArrayList<>();
        }
        this.assignCaseUris.add(assignCaseUrisItem);
        return this;
    }

    public TaskInfo withAssignCaseUris(Consumer<List<String>> assignCaseUrisSetter) {
        if (this.assignCaseUris == null) {
            this.assignCaseUris = new ArrayList<>();
        }
        assignCaseUrisSetter.accept(this.assignCaseUris);
        return this;
    }

    /**
     * 任务关联用例uri数组，CloudDragon环境
     * @return assignCaseUris
     */
    public List<String> getAssignCaseUris() {
        return assignCaseUris;
    }

    public void setAssignCaseUris(List<String> assignCaseUris) {
        this.assignCaseUris = assignCaseUris;
    }

    public TaskInfo withCaseOperationInfo(CaseOperationInfo caseOperationInfo) {
        this.caseOperationInfo = caseOperationInfo;
        return this;
    }

    public TaskInfo withCaseOperationInfo(Consumer<CaseOperationInfo> caseOperationInfoSetter) {
        if (this.caseOperationInfo == null) {
            this.caseOperationInfo = new CaseOperationInfo();
            caseOperationInfoSetter.accept(this.caseOperationInfo);
        }

        return this;
    }

    /**
     * Get caseOperationInfo
     * @return caseOperationInfo
     */
    public CaseOperationInfo getCaseOperationInfo() {
        return caseOperationInfo;
    }

    public void setCaseOperationInfo(CaseOperationInfo caseOperationInfo) {
        this.caseOperationInfo = caseOperationInfo;
    }

    public TaskInfo withOnlyUpdateStatus(Boolean onlyUpdateStatus) {
        this.onlyUpdateStatus = onlyUpdateStatus;
        return this;
    }

    /**
     * 是否只需要修改测试套状态
     * @return onlyUpdateStatus
     */
    public Boolean getOnlyUpdateStatus() {
        return onlyUpdateStatus;
    }

    public void setOnlyUpdateStatus(Boolean onlyUpdateStatus) {
        this.onlyUpdateStatus = onlyUpdateStatus;
    }

    public TaskInfo withIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
        return this;
    }

    /**
     * 是否异步
     * @return isAsync
     */
    public Boolean getIsAsync() {
        return isAsync;
    }

    public void setIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskInfo that = (TaskInfo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.versionUri, that.versionUri)
            && Objects.equals(this.name, that.name) && Objects.equals(this.ownerId, that.ownerId)
            && Objects.equals(this.parentUri, that.parentUri)
            && Objects.equals(this.testCaseCondition, that.testCaseCondition) && Objects.equals(this.stage, that.stage)
            && Objects.equals(this.serviceType, that.serviceType) && Objects.equals(this.number, that.number)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.moduleId, that.moduleId)
            && Objects.equals(this.moduleName, that.moduleName) && Objects.equals(this.releaseDev, that.releaseDev)
            && Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.extParam, that.extParam)
            && Objects.equals(this.executeWay, that.executeWay) && Objects.equals(this.executeType, that.executeType)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.planStartTimestamp, that.planStartTimestamp)
            && Objects.equals(this.planEndTimestamp, that.planEndTimestamp) && Objects.equals(this.region, that.region)
            && Objects.equals(this.assignCaseUris, that.assignCaseUris)
            && Objects.equals(this.caseOperationInfo, that.caseOperationInfo)
            && Objects.equals(this.onlyUpdateStatus, that.onlyUpdateStatus)
            && Objects.equals(this.isAsync, that.isAsync);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri,
            versionUri,
            name,
            ownerId,
            parentUri,
            testCaseCondition,
            stage,
            serviceType,
            number,
            tags,
            moduleId,
            moduleName,
            releaseDev,
            statusCode,
            extParam,
            executeWay,
            executeType,
            description,
            planStartTimestamp,
            planEndTimestamp,
            region,
            assignCaseUris,
            caseOperationInfo,
            onlyUpdateStatus,
            isAsync);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInfo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    parentUri: ").append(toIndentedString(parentUri)).append("\n");
        sb.append("    testCaseCondition: ").append(toIndentedString(testCaseCondition)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    releaseDev: ").append(toIndentedString(releaseDev)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    extParam: ").append(toIndentedString(extParam)).append("\n");
        sb.append("    executeWay: ").append(toIndentedString(executeWay)).append("\n");
        sb.append("    executeType: ").append(toIndentedString(executeType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    planStartTimestamp: ").append(toIndentedString(planStartTimestamp)).append("\n");
        sb.append("    planEndTimestamp: ").append(toIndentedString(planEndTimestamp)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    assignCaseUris: ").append(toIndentedString(assignCaseUris)).append("\n");
        sb.append("    caseOperationInfo: ").append(toIndentedString(caseOperationInfo)).append("\n");
        sb.append("    onlyUpdateStatus: ").append(toIndentedString(onlyUpdateStatus)).append("\n");
        sb.append("    isAsync: ").append(toIndentedString(isAsync)).append("\n");
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
