package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * TestCase
 */
public class TestCase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_type")

    private String autoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_design_desc")

    private String caseDesignDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_name")

    private String caseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_num")

    private String caseNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_num")

    private String creatorNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private String deleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_results")

    private String expectedResults;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_param")

    private String extraParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "factor_combination_json")

    private String factorCombinationJson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_and_expected_result")

    private String operationAndExpectedResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_archive")

    private Boolean isArchive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mindmap_id")

    private String mindmapId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_id")

    private String batchId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_id")

    private String branchId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prerequisite")

    private String prerequisite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_level")

    private String testCaseLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_procedure")

    private String testProcedure;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_name")

    private String updateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_num")

    private String updateNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    public TestCase withAutoType(String autoType) {
        this.autoType = autoType;
        return this;
    }

    /**
     * 自动化类型
     * @return autoType
     */
    public String getAutoType() {
        return autoType;
    }

    public void setAutoType(String autoType) {
        this.autoType = autoType;
    }

    public TestCase withCaseDesignDesc(String caseDesignDesc) {
        this.caseDesignDesc = caseDesignDesc;
        return this;
    }

    /**
     * 用例设计描述
     * @return caseDesignDesc
     */
    public String getCaseDesignDesc() {
        return caseDesignDesc;
    }

    public void setCaseDesignDesc(String caseDesignDesc) {
        this.caseDesignDesc = caseDesignDesc;
    }

    public TestCase withCaseName(String caseName) {
        this.caseName = caseName;
        return this;
    }

    /**
     * 用例名称
     * @return caseName
     */
    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public TestCase withCaseNum(String caseNum) {
        this.caseNum = caseNum;
        return this;
    }

    /**
     * 用例编号
     * @return caseNum
     */
    public String getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(String caseNum) {
        this.caseNum = caseNum;
    }

    public TestCase withCreateTime(OffsetDateTime createTime) {
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

    public TestCase withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建人名字
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public TestCase withCreatorNum(String creatorNum) {
        this.creatorNum = creatorNum;
        return this;
    }

    /**
     * 创建人工号
     * @return creatorNum
     */
    public String getCreatorNum() {
        return creatorNum;
    }

    public void setCreatorNum(String creatorNum) {
        this.creatorNum = creatorNum;
    }

    public TestCase withDeleted(String deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * 删除状态
     * @return deleted
     */
    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public TestCase withExpectedResults(String expectedResults) {
        this.expectedResults = expectedResults;
        return this;
    }

    /**
     * 预期结果
     * @return expectedResults
     */
    public String getExpectedResults() {
        return expectedResults;
    }

    public void setExpectedResults(String expectedResults) {
        this.expectedResults = expectedResults;
    }

    public TestCase withExtraParam(String extraParam) {
        this.extraParam = extraParam;
        return this;
    }

    /**
     * 额外模板字段：以json形式存储，前台解析
     * @return extraParam
     */
    public String getExtraParam() {
        return extraParam;
    }

    public void setExtraParam(String extraParam) {
        this.extraParam = extraParam;
    }

    public TestCase withFactorCombinationJson(String factorCombinationJson) {
        this.factorCombinationJson = factorCombinationJson;
        return this;
    }

    /**
     * 因子组合json
     * @return factorCombinationJson
     */
    public String getFactorCombinationJson() {
        return factorCombinationJson;
    }

    public void setFactorCombinationJson(String factorCombinationJson) {
        this.factorCombinationJson = factorCombinationJson;
    }

    public TestCase withOperationAndExpectedResult(String operationAndExpectedResult) {
        this.operationAndExpectedResult = operationAndExpectedResult;
        return this;
    }

    /**
     * 操作及预期结果
     * @return operationAndExpectedResult
     */
    public String getOperationAndExpectedResult() {
        return operationAndExpectedResult;
    }

    public void setOperationAndExpectedResult(String operationAndExpectedResult) {
        this.operationAndExpectedResult = operationAndExpectedResult;
    }

    public TestCase withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id 主键
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TestCase withIsArchive(Boolean isArchive) {
        this.isArchive = isArchive;
        return this;
    }

    /**
     * 状态
     * @return isArchive
     */
    public Boolean getIsArchive() {
        return isArchive;
    }

    public void setIsArchive(Boolean isArchive) {
        this.isArchive = isArchive;
    }

    public TestCase withMindmapId(String mindmapId) {
        this.mindmapId = mindmapId;
        return this;
    }

    /**
     * 脑图id
     * @return mindmapId
     */
    public String getMindmapId() {
        return mindmapId;
    }

    public void setMindmapId(String mindmapId) {
        this.mindmapId = mindmapId;
    }

    public TestCase withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点id
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public TestCase withBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }

    /**
     * 批次id
     * @return batchId
     */
    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public TestCase withBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }

    /**
     * 分支ID
     * @return branchId
     */
    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public TestCase withPlanId(String planId) {
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

    public TestCase withPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
        return this;
    }

    /**
     * 用例前置步骤
     * @return prerequisite
     */
    public String getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    public TestCase withTestCaseLevel(String testCaseLevel) {
        this.testCaseLevel = testCaseLevel;
        return this;
    }

    /**
     * 测试用例级别
     * @return testCaseLevel
     */
    public String getTestCaseLevel() {
        return testCaseLevel;
    }

    public void setTestCaseLevel(String testCaseLevel) {
        this.testCaseLevel = testCaseLevel;
    }

    public TestCase withTestProcedure(String testProcedure) {
        this.testProcedure = testProcedure;
        return this;
    }

    /**
     * 测试步骤
     * @return testProcedure
     */
    public String getTestProcedure() {
        return testProcedure;
    }

    public void setTestProcedure(String testProcedure) {
        this.testProcedure = testProcedure;
    }

    public TestCase withUpdateName(String updateName) {
        this.updateName = updateName;
        return this;
    }

    /**
     * 更新人名字
     * @return updateName
     */
    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public TestCase withUpdateNum(String updateNum) {
        this.updateNum = updateNum;
        return this;
    }

    /**
     * 更新人工号
     * @return updateNum
     */
    public String getUpdateNum() {
        return updateNum;
    }

    public void setUpdateNum(String updateNum) {
        this.updateNum = updateNum;
    }

    public TestCase withUpdateTime(OffsetDateTime updateTime) {
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

    public TestCase withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public TestCase withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * uri
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public TestCase withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TestCase withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 服务id
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestCase that = (TestCase) obj;
        return Objects.equals(this.autoType, that.autoType) && Objects.equals(this.caseDesignDesc, that.caseDesignDesc)
            && Objects.equals(this.caseName, that.caseName) && Objects.equals(this.caseNum, that.caseNum)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.creatorNum, that.creatorNum) && Objects.equals(this.deleted, that.deleted)
            && Objects.equals(this.expectedResults, that.expectedResults)
            && Objects.equals(this.extraParam, that.extraParam)
            && Objects.equals(this.factorCombinationJson, that.factorCombinationJson)
            && Objects.equals(this.operationAndExpectedResult, that.operationAndExpectedResult)
            && Objects.equals(this.id, that.id) && Objects.equals(this.isArchive, that.isArchive)
            && Objects.equals(this.mindmapId, that.mindmapId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.batchId, that.batchId) && Objects.equals(this.branchId, that.branchId)
            && Objects.equals(this.planId, that.planId) && Objects.equals(this.prerequisite, that.prerequisite)
            && Objects.equals(this.testCaseLevel, that.testCaseLevel)
            && Objects.equals(this.testProcedure, that.testProcedure)
            && Objects.equals(this.updateName, that.updateName) && Objects.equals(this.updateNum, that.updateNum)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.url, that.url)
            && Objects.equals(this.uri, that.uri) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.serviceId, that.serviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoType,
            caseDesignDesc,
            caseName,
            caseNum,
            createTime,
            creatorName,
            creatorNum,
            deleted,
            expectedResults,
            extraParam,
            factorCombinationJson,
            operationAndExpectedResult,
            id,
            isArchive,
            mindmapId,
            nodeId,
            batchId,
            branchId,
            planId,
            prerequisite,
            testCaseLevel,
            testProcedure,
            updateName,
            updateNum,
            updateTime,
            url,
            uri,
            projectId,
            serviceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCase {\n");
        sb.append("    autoType: ").append(toIndentedString(autoType)).append("\n");
        sb.append("    caseDesignDesc: ").append(toIndentedString(caseDesignDesc)).append("\n");
        sb.append("    caseName: ").append(toIndentedString(caseName)).append("\n");
        sb.append("    caseNum: ").append(toIndentedString(caseNum)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    creatorNum: ").append(toIndentedString(creatorNum)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    expectedResults: ").append(toIndentedString(expectedResults)).append("\n");
        sb.append("    extraParam: ").append(toIndentedString(extraParam)).append("\n");
        sb.append("    factorCombinationJson: ").append(toIndentedString(factorCombinationJson)).append("\n");
        sb.append("    operationAndExpectedResult: ").append(toIndentedString(operationAndExpectedResult)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isArchive: ").append(toIndentedString(isArchive)).append("\n");
        sb.append("    mindmapId: ").append(toIndentedString(mindmapId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
        sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    prerequisite: ").append(toIndentedString(prerequisite)).append("\n");
        sb.append("    testCaseLevel: ").append(toIndentedString(testCaseLevel)).append("\n");
        sb.append("    testProcedure: ").append(toIndentedString(testProcedure)).append("\n");
        sb.append("    updateName: ").append(toIndentedString(updateName)).append("\n");
        sb.append("    updateNum: ").append(toIndentedString(updateNum)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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
