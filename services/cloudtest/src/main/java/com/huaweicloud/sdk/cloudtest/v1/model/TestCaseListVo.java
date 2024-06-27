package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class TestCaseListVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private NameAndIdVo owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private NameAndIdVo status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private NameAndIdVo result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module")

    private NameAndIdVo module;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration")

    private NameAndIdVo iteration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exeplatform")

    private String exeplatform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank_id")

    private String rankId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_uri")

    private String featureUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_dev")

    private String releaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_keyword")

    private Boolean isKeyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_url")

    private String scriptUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_url")

    private String reportUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private NameAndIdVo serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_type")

    private IntegerIdAndNameVo testType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_info")

    private CreateInfoVo createInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_info")

    private ExecuteInfoVo executeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_issue_info")

    private AssociateIssueInfoVo associateIssueInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_defect_info")

    private AssociateDefectInfoVo associateDefectInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_type")

    private Integer caseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private String labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_info")

    private List<CustomFieldVo> customFieldInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_test_design")

    private Boolean isTestDesign;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_modified")

    private Long lastModified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_status")

    private Integer reviewStatus;

    public TestCaseListVo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 用例URI
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public TestCaseListVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestCaseListVo withOwner(NameAndIdVo owner) {
        this.owner = owner;
        return this;
    }

    public TestCaseListVo withOwner(Consumer<NameAndIdVo> ownerSetter) {
        if (this.owner == null) {
            this.owner = new NameAndIdVo();
            ownerSetter.accept(this.owner);
        }

        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    public NameAndIdVo getOwner() {
        return owner;
    }

    public void setOwner(NameAndIdVo owner) {
        this.owner = owner;
    }

    public TestCaseListVo withStatus(NameAndIdVo status) {
        this.status = status;
        return this;
    }

    public TestCaseListVo withStatus(Consumer<NameAndIdVo> statusSetter) {
        if (this.status == null) {
            this.status = new NameAndIdVo();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public NameAndIdVo getStatus() {
        return status;
    }

    public void setStatus(NameAndIdVo status) {
        this.status = status;
    }

    public TestCaseListVo withResult(NameAndIdVo result) {
        this.result = result;
        return this;
    }

    public TestCaseListVo withResult(Consumer<NameAndIdVo> resultSetter) {
        if (this.result == null) {
            this.result = new NameAndIdVo();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public NameAndIdVo getResult() {
        return result;
    }

    public void setResult(NameAndIdVo result) {
        this.result = result;
    }

    public TestCaseListVo withModule(NameAndIdVo module) {
        this.module = module;
        return this;
    }

    public TestCaseListVo withModule(Consumer<NameAndIdVo> moduleSetter) {
        if (this.module == null) {
            this.module = new NameAndIdVo();
            moduleSetter.accept(this.module);
        }

        return this;
    }

    /**
     * Get module
     * @return module
     */
    public NameAndIdVo getModule() {
        return module;
    }

    public void setModule(NameAndIdVo module) {
        this.module = module;
    }

    public TestCaseListVo withIteration(NameAndIdVo iteration) {
        this.iteration = iteration;
        return this;
    }

    public TestCaseListVo withIteration(Consumer<NameAndIdVo> iterationSetter) {
        if (this.iteration == null) {
            this.iteration = new NameAndIdVo();
            iterationSetter.accept(this.iteration);
        }

        return this;
    }

    /**
     * Get iteration
     * @return iteration
     */
    public NameAndIdVo getIteration() {
        return iteration;
    }

    public void setIteration(NameAndIdVo iteration) {
        this.iteration = iteration;
    }

    public TestCaseListVo withExeplatform(String exeplatform) {
        this.exeplatform = exeplatform;
        return this;
    }

    /**
     * 执行平台，如：apittest,其他三方执行平台
     * @return exeplatform
     */
    public String getExeplatform() {
        return exeplatform;
    }

    public void setExeplatform(String exeplatform) {
        this.exeplatform = exeplatform;
    }

    public TestCaseListVo withNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * 用例编号
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public TestCaseListVo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用例描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TestCaseListVo withRankId(String rankId) {
        this.rankId = rankId;
        return this;
    }

    /**
     * 用例等级
     * @return rankId
     */
    public String getRankId() {
        return rankId;
    }

    public void setRankId(String rankId) {
        this.rankId = rankId;
    }

    public TestCaseListVo withFeatureUri(String featureUri) {
        this.featureUri = featureUri;
        return this;
    }

    /**
     * 目录URI
     * @return featureUri
     */
    public String getFeatureUri() {
        return featureUri;
    }

    public void setFeatureUri(String featureUri) {
        this.featureUri = featureUri;
    }

    public TestCaseListVo withReleaseDev(String releaseDev) {
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

    public TestCaseListVo withIsKeyword(Boolean isKeyword) {
        this.isKeyword = isKeyword;
        return this;
    }

    /**
     * 是否组合关键字
     * @return isKeyword
     */
    public Boolean getIsKeyword() {
        return isKeyword;
    }

    public void setIsKeyword(Boolean isKeyword) {
        this.isKeyword = isKeyword;
    }

    public TestCaseListVo withScriptUrl(String scriptUrl) {
        this.scriptUrl = scriptUrl;
        return this;
    }

    /**
     * 脚本路径
     * @return scriptUrl
     */
    public String getScriptUrl() {
        return scriptUrl;
    }

    public void setScriptUrl(String scriptUrl) {
        this.scriptUrl = scriptUrl;
    }

    public TestCaseListVo withReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
        return this;
    }

    /**
     * 实时报告地址
     * @return reportUrl
     */
    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public TestCaseListVo withProjectUuid(String projectUuid) {
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

    public TestCaseListVo withServiceType(NameAndIdVo serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public TestCaseListVo withServiceType(Consumer<NameAndIdVo> serviceTypeSetter) {
        if (this.serviceType == null) {
            this.serviceType = new NameAndIdVo();
            serviceTypeSetter.accept(this.serviceType);
        }

        return this;
    }

    /**
     * Get serviceType
     * @return serviceType
     */
    public NameAndIdVo getServiceType() {
        return serviceType;
    }

    public void setServiceType(NameAndIdVo serviceType) {
        this.serviceType = serviceType;
    }

    public TestCaseListVo withTestType(IntegerIdAndNameVo testType) {
        this.testType = testType;
        return this;
    }

    public TestCaseListVo withTestType(Consumer<IntegerIdAndNameVo> testTypeSetter) {
        if (this.testType == null) {
            this.testType = new IntegerIdAndNameVo();
            testTypeSetter.accept(this.testType);
        }

        return this;
    }

    /**
     * Get testType
     * @return testType
     */
    public IntegerIdAndNameVo getTestType() {
        return testType;
    }

    public void setTestType(IntegerIdAndNameVo testType) {
        this.testType = testType;
    }

    public TestCaseListVo withCreateInfo(CreateInfoVo createInfo) {
        this.createInfo = createInfo;
        return this;
    }

    public TestCaseListVo withCreateInfo(Consumer<CreateInfoVo> createInfoSetter) {
        if (this.createInfo == null) {
            this.createInfo = new CreateInfoVo();
            createInfoSetter.accept(this.createInfo);
        }

        return this;
    }

    /**
     * Get createInfo
     * @return createInfo
     */
    public CreateInfoVo getCreateInfo() {
        return createInfo;
    }

    public void setCreateInfo(CreateInfoVo createInfo) {
        this.createInfo = createInfo;
    }

    public TestCaseListVo withExecuteInfo(ExecuteInfoVo executeInfo) {
        this.executeInfo = executeInfo;
        return this;
    }

    public TestCaseListVo withExecuteInfo(Consumer<ExecuteInfoVo> executeInfoSetter) {
        if (this.executeInfo == null) {
            this.executeInfo = new ExecuteInfoVo();
            executeInfoSetter.accept(this.executeInfo);
        }

        return this;
    }

    /**
     * Get executeInfo
     * @return executeInfo
     */
    public ExecuteInfoVo getExecuteInfo() {
        return executeInfo;
    }

    public void setExecuteInfo(ExecuteInfoVo executeInfo) {
        this.executeInfo = executeInfo;
    }

    public TestCaseListVo withAssociateIssueInfo(AssociateIssueInfoVo associateIssueInfo) {
        this.associateIssueInfo = associateIssueInfo;
        return this;
    }

    public TestCaseListVo withAssociateIssueInfo(Consumer<AssociateIssueInfoVo> associateIssueInfoSetter) {
        if (this.associateIssueInfo == null) {
            this.associateIssueInfo = new AssociateIssueInfoVo();
            associateIssueInfoSetter.accept(this.associateIssueInfo);
        }

        return this;
    }

    /**
     * Get associateIssueInfo
     * @return associateIssueInfo
     */
    public AssociateIssueInfoVo getAssociateIssueInfo() {
        return associateIssueInfo;
    }

    public void setAssociateIssueInfo(AssociateIssueInfoVo associateIssueInfo) {
        this.associateIssueInfo = associateIssueInfo;
    }

    public TestCaseListVo withAssociateDefectInfo(AssociateDefectInfoVo associateDefectInfo) {
        this.associateDefectInfo = associateDefectInfo;
        return this;
    }

    public TestCaseListVo withAssociateDefectInfo(Consumer<AssociateDefectInfoVo> associateDefectInfoSetter) {
        if (this.associateDefectInfo == null) {
            this.associateDefectInfo = new AssociateDefectInfoVo();
            associateDefectInfoSetter.accept(this.associateDefectInfo);
        }

        return this;
    }

    /**
     * Get associateDefectInfo
     * @return associateDefectInfo
     */
    public AssociateDefectInfoVo getAssociateDefectInfo() {
        return associateDefectInfo;
    }

    public void setAssociateDefectInfo(AssociateDefectInfoVo associateDefectInfo) {
        this.associateDefectInfo = associateDefectInfo;
    }

    public TestCaseListVo withCaseType(Integer caseType) {
        this.caseType = caseType;
        return this;
    }

    /**
     * 用例类型
     * @return caseType
     */
    public Integer getCaseType() {
        return caseType;
    }

    public void setCaseType(Integer caseType) {
        this.caseType = caseType;
    }

    public TestCaseListVo withLabels(String labels) {
        this.labels = labels;
        return this;
    }

    /**
     * 用例标签名称列表
     * @return labels
     */
    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public TestCaseListVo withCustomFieldInfo(List<CustomFieldVo> customFieldInfo) {
        this.customFieldInfo = customFieldInfo;
        return this;
    }

    public TestCaseListVo addCustomFieldInfoItem(CustomFieldVo customFieldInfoItem) {
        if (this.customFieldInfo == null) {
            this.customFieldInfo = new ArrayList<>();
        }
        this.customFieldInfo.add(customFieldInfoItem);
        return this;
    }

    public TestCaseListVo withCustomFieldInfo(Consumer<List<CustomFieldVo>> customFieldInfoSetter) {
        if (this.customFieldInfo == null) {
            this.customFieldInfo = new ArrayList<>();
        }
        customFieldInfoSetter.accept(this.customFieldInfo);
        return this;
    }

    /**
     * 自定义字段信息
     * @return customFieldInfo
     */
    public List<CustomFieldVo> getCustomFieldInfo() {
        return customFieldInfo;
    }

    public void setCustomFieldInfo(List<CustomFieldVo> customFieldInfo) {
        this.customFieldInfo = customFieldInfo;
    }

    public TestCaseListVo withIsTestDesign(Boolean isTestDesign) {
        this.isTestDesign = isTestDesign;
        return this;
    }

    /**
     * 是否来自测试设计（null：不限，false：否来自测试设计，true：来自测试设计）
     * @return isTestDesign
     */
    public Boolean getIsTestDesign() {
        return isTestDesign;
    }

    public void setIsTestDesign(Boolean isTestDesign) {
        this.isTestDesign = isTestDesign;
    }

    public TestCaseListVo withLastModified(Long lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * 最后修改时间（null：不限）
     * @return lastModified
     */
    public Long getLastModified() {
        return lastModified;
    }

    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }

    public TestCaseListVo withReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
        return this;
    }

    /**
     * 用例评审状态（null：0至127）
     * @return reviewStatus
     */
    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestCaseListVo that = (TestCaseListVo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.name, that.name)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.status, that.status)
            && Objects.equals(this.result, that.result) && Objects.equals(this.module, that.module)
            && Objects.equals(this.iteration, that.iteration) && Objects.equals(this.exeplatform, that.exeplatform)
            && Objects.equals(this.number, that.number) && Objects.equals(this.description, that.description)
            && Objects.equals(this.rankId, that.rankId) && Objects.equals(this.featureUri, that.featureUri)
            && Objects.equals(this.releaseDev, that.releaseDev) && Objects.equals(this.isKeyword, that.isKeyword)
            && Objects.equals(this.scriptUrl, that.scriptUrl) && Objects.equals(this.reportUrl, that.reportUrl)
            && Objects.equals(this.projectUuid, that.projectUuid) && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.testType, that.testType) && Objects.equals(this.createInfo, that.createInfo)
            && Objects.equals(this.executeInfo, that.executeInfo)
            && Objects.equals(this.associateIssueInfo, that.associateIssueInfo)
            && Objects.equals(this.associateDefectInfo, that.associateDefectInfo)
            && Objects.equals(this.caseType, that.caseType) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.customFieldInfo, that.customFieldInfo)
            && Objects.equals(this.isTestDesign, that.isTestDesign)
            && Objects.equals(this.lastModified, that.lastModified)
            && Objects.equals(this.reviewStatus, that.reviewStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri,
            name,
            owner,
            status,
            result,
            module,
            iteration,
            exeplatform,
            number,
            description,
            rankId,
            featureUri,
            releaseDev,
            isKeyword,
            scriptUrl,
            reportUrl,
            projectUuid,
            serviceType,
            testType,
            createInfo,
            executeInfo,
            associateIssueInfo,
            associateDefectInfo,
            caseType,
            labels,
            customFieldInfo,
            isTestDesign,
            lastModified,
            reviewStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCaseListVo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    iteration: ").append(toIndentedString(iteration)).append("\n");
        sb.append("    exeplatform: ").append(toIndentedString(exeplatform)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    rankId: ").append(toIndentedString(rankId)).append("\n");
        sb.append("    featureUri: ").append(toIndentedString(featureUri)).append("\n");
        sb.append("    releaseDev: ").append(toIndentedString(releaseDev)).append("\n");
        sb.append("    isKeyword: ").append(toIndentedString(isKeyword)).append("\n");
        sb.append("    scriptUrl: ").append(toIndentedString(scriptUrl)).append("\n");
        sb.append("    reportUrl: ").append(toIndentedString(reportUrl)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
        sb.append("    createInfo: ").append(toIndentedString(createInfo)).append("\n");
        sb.append("    executeInfo: ").append(toIndentedString(executeInfo)).append("\n");
        sb.append("    associateIssueInfo: ").append(toIndentedString(associateIssueInfo)).append("\n");
        sb.append("    associateDefectInfo: ").append(toIndentedString(associateDefectInfo)).append("\n");
        sb.append("    caseType: ").append(toIndentedString(caseType)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    customFieldInfo: ").append(toIndentedString(customFieldInfo)).append("\n");
        sb.append("    isTestDesign: ").append(toIndentedString(isTestDesign)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
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
