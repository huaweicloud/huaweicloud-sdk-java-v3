package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CloudTestSuiteBasicInfo
 */
public class CloudTestSuiteBasicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "caseOperationInfo")

    private CloudTestCaseOperationInfo caseOperationInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user_id")

    private String createUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "doc_type")

    private Integer docType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_status")

    private Integer executeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_times")

    private Integer executeTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_type")

    private Integer executeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_way")

    private String executeWay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration_status")

    private Integer expirationStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extParam")

    private String extParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterator_version_uri")

    private String iteratorVersionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moduleId")

    private String moduleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moduleName")

    private String moduleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeId")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ownerId")

    private String ownerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "planId")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_end_timestamp")

    private Long planEndTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_start_timestamp")

    private Long planStartTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    private Long projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectUUId")

    private String projectUUId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "releaseDev")

    private String releaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Integer result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testSuiteId")

    private String testSuiteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testSuiteNumber")

    private String testSuiteNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private String updateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user_id")

    private String updateUserId;

    public CloudTestSuiteBasicInfo withCaseOperationInfo(CloudTestCaseOperationInfo caseOperationInfo) {
        this.caseOperationInfo = caseOperationInfo;
        return this;
    }

    public CloudTestSuiteBasicInfo withCaseOperationInfo(Consumer<CloudTestCaseOperationInfo> caseOperationInfoSetter) {
        if (this.caseOperationInfo == null) {
            this.caseOperationInfo = new CloudTestCaseOperationInfo();
            caseOperationInfoSetter.accept(this.caseOperationInfo);
        }

        return this;
    }

    /**
     * Get caseOperationInfo
     * @return caseOperationInfo
     */
    public CloudTestCaseOperationInfo getCaseOperationInfo() {
        return caseOperationInfo;
    }

    public void setCaseOperationInfo(CloudTestCaseOperationInfo caseOperationInfo) {
        this.caseOperationInfo = caseOperationInfo;
    }

    public CloudTestSuiteBasicInfo withCreateTime(String createTime) {
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

    public CloudTestSuiteBasicInfo withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建人
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public CloudTestSuiteBasicInfo withCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }

    /**
     * 创建人ID
     * @return createUserId
     */
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public CloudTestSuiteBasicInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CloudTestSuiteBasicInfo withDocType(Integer docType) {
        this.docType = docType;
        return this;
    }

    /**
     * 数据类型：0为测试套，1为文件夹，cloudTest前台传入
     * @return docType
     */
    public Integer getDocType() {
        return docType;
    }

    public void setDocType(Integer docType) {
        this.docType = docType;
    }

    public CloudTestSuiteBasicInfo withExecuteStatus(Integer executeStatus) {
        this.executeStatus = executeStatus;
        return this;
    }

    /**
     * 测试套状态
     * @return executeStatus
     */
    public Integer getExecuteStatus() {
        return executeStatus;
    }

    public void setExecuteStatus(Integer executeStatus) {
        this.executeStatus = executeStatus;
    }

    public CloudTestSuiteBasicInfo withExecuteTimes(Integer executeTimes) {
        this.executeTimes = executeTimes;
        return this;
    }

    /**
     * 执行总次数
     * @return executeTimes
     */
    public Integer getExecuteTimes() {
        return executeTimes;
    }

    public void setExecuteTimes(Integer executeTimes) {
        this.executeTimes = executeTimes;
    }

    public CloudTestSuiteBasicInfo withExecuteType(Integer executeType) {
        this.executeType = executeType;
        return this;
    }

    /**
     * 执行类型：0为冒烟测试，1为定时执行
     * @return executeType
     */
    public Integer getExecuteType() {
        return executeType;
    }

    public void setExecuteType(Integer executeType) {
        this.executeType = executeType;
    }

    public CloudTestSuiteBasicInfo withExecuteWay(String executeWay) {
        this.executeWay = executeWay;
        return this;
    }

    /**
     * 执行方式：1为串行，2为并行，与echo的executeModel字段相同
     * @return executeWay
     */
    public String getExecuteWay() {
        return executeWay;
    }

    public void setExecuteWay(String executeWay) {
        this.executeWay = executeWay;
    }

    public CloudTestSuiteBasicInfo withExpirationStatus(Integer expirationStatus) {
        this.expirationStatus = expirationStatus;
        return this;
    }

    /**
     * 测试套超期状态
     * @return expirationStatus
     */
    public Integer getExpirationStatus() {
        return expirationStatus;
    }

    public void setExpirationStatus(Integer expirationStatus) {
        this.expirationStatus = expirationStatus;
    }

    public CloudTestSuiteBasicInfo withExtParam(String extParam) {
        this.extParam = extParam;
        return this;
    }

    /**
     * 参数配置
     * @return extParam
     */
    public String getExtParam() {
        return extParam;
    }

    public void setExtParam(String extParam) {
        this.extParam = extParam;
    }

    public CloudTestSuiteBasicInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一ID，主键
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CloudTestSuiteBasicInfo withIteratorVersionUri(String iteratorVersionUri) {
        this.iteratorVersionUri = iteratorVersionUri;
        return this;
    }

    /**
     * 测试计划Uri，TMSS需要此值
     * @return iteratorVersionUri
     */
    public String getIteratorVersionUri() {
        return iteratorVersionUri;
    }

    public void setIteratorVersionUri(String iteratorVersionUri) {
        this.iteratorVersionUri = iteratorVersionUri;
    }

    public CloudTestSuiteBasicInfo withModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * 模块Id
     * @return moduleId
     */
    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public CloudTestSuiteBasicInfo withModuleName(String moduleName) {
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

    public CloudTestSuiteBasicInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 测试套名称，与echo的name字段相同
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CloudTestSuiteBasicInfo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 目录Id
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public CloudTestSuiteBasicInfo withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * 处理者ID
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public CloudTestSuiteBasicInfo withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 测试计划id，可为空
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public CloudTestSuiteBasicInfo withPlanEndTimestamp(Long planEndTimestamp) {
        this.planEndTimestamp = planEndTimestamp;
        return this;
    }

    /**
     * 计划结束时间
     * @return planEndTimestamp
     */
    public Long getPlanEndTimestamp() {
        return planEndTimestamp;
    }

    public void setPlanEndTimestamp(Long planEndTimestamp) {
        this.planEndTimestamp = planEndTimestamp;
    }

    public CloudTestSuiteBasicInfo withPlanStartTimestamp(Long planStartTimestamp) {
        this.planStartTimestamp = planStartTimestamp;
        return this;
    }

    /**
     * 计划开始时间
     * @return planStartTimestamp
     */
    public Long getPlanStartTimestamp() {
        return planStartTimestamp;
    }

    public void setPlanStartTimestamp(Long planStartTimestamp) {
        this.planStartTimestamp = planStartTimestamp;
    }

    public CloudTestSuiteBasicInfo withProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public CloudTestSuiteBasicInfo withProjectUUId(String projectUUId) {
        this.projectUUId = projectUUId;
        return this;
    }

    /**
     * 项目UUID，与echo的testServiceId字段相同
     * @return projectUUId
     */
    public String getProjectUUId() {
        return projectUUId;
    }

    public void setProjectUUId(String projectUUId) {
        this.projectUUId = projectUUId;
    }

    public CloudTestSuiteBasicInfo withReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
        return this;
    }

    /**
     * 版本号
     * @return releaseDev
     */
    public String getReleaseDev() {
        return releaseDev;
    }

    public void setReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
    }

    public CloudTestSuiteBasicInfo withResult(Integer result) {
        this.result = result;
        return this;
    }

    /**
     * 测试套执行结果
     * @return result
     */
    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public CloudTestSuiteBasicInfo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 测试套状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public CloudTestSuiteBasicInfo withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CloudTestSuiteBasicInfo addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CloudTestSuiteBasicInfo withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public CloudTestSuiteBasicInfo withTestSuiteId(String testSuiteId) {
        this.testSuiteId = testSuiteId;
        return this;
    }

    /**
     * 测试套id，更新时需要同时传id、testSuiteId，2个字段值相同，与echo的taskId字段相同
     * @return testSuiteId
     */
    public String getTestSuiteId() {
        return testSuiteId;
    }

    public void setTestSuiteId(String testSuiteId) {
        this.testSuiteId = testSuiteId;
    }

    public CloudTestSuiteBasicInfo withTestSuiteNumber(String testSuiteNumber) {
        this.testSuiteNumber = testSuiteNumber;
        return this;
    }

    /**
     * 编号
     * @return testSuiteNumber
     */
    public String getTestSuiteNumber() {
        return testSuiteNumber;
    }

    public void setTestSuiteNumber(String testSuiteNumber) {
        this.testSuiteNumber = testSuiteNumber;
    }

    public CloudTestSuiteBasicInfo withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 测试套类型：0为功能测试，1为接口测试，6为Pistar，cloudTest前台传入
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public CloudTestSuiteBasicInfo withUpdateTime(String updateTime) {
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

    public CloudTestSuiteBasicInfo withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 更新人
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public CloudTestSuiteBasicInfo withUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
        return this;
    }

    /**
     * 更新人ID
     * @return updateUserId
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloudTestSuiteBasicInfo that = (CloudTestSuiteBasicInfo) obj;
        return Objects.equals(this.caseOperationInfo, that.caseOperationInfo)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.createUserId, that.createUserId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.docType, that.docType)
            && Objects.equals(this.executeStatus, that.executeStatus)
            && Objects.equals(this.executeTimes, that.executeTimes)
            && Objects.equals(this.executeType, that.executeType) && Objects.equals(this.executeWay, that.executeWay)
            && Objects.equals(this.expirationStatus, that.expirationStatus)
            && Objects.equals(this.extParam, that.extParam) && Objects.equals(this.id, that.id)
            && Objects.equals(this.iteratorVersionUri, that.iteratorVersionUri)
            && Objects.equals(this.moduleId, that.moduleId) && Objects.equals(this.moduleName, that.moduleName)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.ownerId, that.ownerId) && Objects.equals(this.planId, that.planId)
            && Objects.equals(this.planEndTimestamp, that.planEndTimestamp)
            && Objects.equals(this.planStartTimestamp, that.planStartTimestamp)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.projectUUId, that.projectUUId)
            && Objects.equals(this.releaseDev, that.releaseDev) && Objects.equals(this.result, that.result)
            && Objects.equals(this.status, that.status) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.testSuiteId, that.testSuiteId)
            && Objects.equals(this.testSuiteNumber, that.testSuiteNumber) && Objects.equals(this.type, that.type)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.updateUser, that.updateUser)
            && Objects.equals(this.updateUserId, that.updateUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseOperationInfo,
            createTime,
            createUser,
            createUserId,
            description,
            docType,
            executeStatus,
            executeTimes,
            executeType,
            executeWay,
            expirationStatus,
            extParam,
            id,
            iteratorVersionUri,
            moduleId,
            moduleName,
            name,
            nodeId,
            ownerId,
            planId,
            planEndTimestamp,
            planStartTimestamp,
            projectId,
            projectUUId,
            releaseDev,
            result,
            status,
            tags,
            testSuiteId,
            testSuiteNumber,
            type,
            updateTime,
            updateUser,
            updateUserId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudTestSuiteBasicInfo {\n");
        sb.append("    caseOperationInfo: ").append(toIndentedString(caseOperationInfo)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    createUserId: ").append(toIndentedString(createUserId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    docType: ").append(toIndentedString(docType)).append("\n");
        sb.append("    executeStatus: ").append(toIndentedString(executeStatus)).append("\n");
        sb.append("    executeTimes: ").append(toIndentedString(executeTimes)).append("\n");
        sb.append("    executeType: ").append(toIndentedString(executeType)).append("\n");
        sb.append("    executeWay: ").append(toIndentedString(executeWay)).append("\n");
        sb.append("    expirationStatus: ").append(toIndentedString(expirationStatus)).append("\n");
        sb.append("    extParam: ").append(toIndentedString(extParam)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iteratorVersionUri: ").append(toIndentedString(iteratorVersionUri)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    planEndTimestamp: ").append(toIndentedString(planEndTimestamp)).append("\n");
        sb.append("    planStartTimestamp: ").append(toIndentedString(planStartTimestamp)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectUUId: ").append(toIndentedString(projectUUId)).append("\n");
        sb.append("    releaseDev: ").append(toIndentedString(releaseDev)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    testSuiteId: ").append(toIndentedString(testSuiteId)).append("\n");
        sb.append("    testSuiteNumber: ").append(toIndentedString(testSuiteNumber)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
        sb.append("    updateUserId: ").append(toIndentedString(updateUserId)).append("\n");
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
