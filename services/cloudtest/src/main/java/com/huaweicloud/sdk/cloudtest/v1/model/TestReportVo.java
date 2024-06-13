package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TestReportVo
 */
public class TestReportVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updator")

    private String updator;

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
    @JsonProperty(value = "branch_name")

    private String branchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_conclusion")

    private String testConclusion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_conclusion_details")

    private String testConclusionDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_resolution_rate")

    private String defectResolutionRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_resolution_score")

    private String defectResolutionScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_execution_rate")

    private String caseExecutionRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_execution_score")

    private String caseExecutionScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_pass_rate")

    private String casePassRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_pass_score")

    private String casePassScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_pass_rate")

    private String issuePassRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_pass_score")

    private String issuePassScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_coverage_rate")

    private String issueCoverageRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_coverage_score")

    private String issueCoverageScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_residual_defect_index")

    private String projectResidualDefectIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterator_residual_defect_index")

    private String iteratorResidualDefectIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_automation_details")

    private CaseAutomationDetailsVo caseAutomationDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_validity_ratio")

    private String caseValidityRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_details")

    private IssuePassDetailsVo issueDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_details")

    private List<NameAndValueVo> caseDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_details_by_severity")

    private List<IdAndNameAndValueVo> defectDetailsBySeverity = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defect_details_by_module")

    private List<IdAndNameAndValueVo> defectDetailsByModule = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_pass_rate_by_test_type")

    private List<DetailTestTypeCasePassRateVo> casePassRateByTestType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_report_custom_report_detail")

    private List<CustomReportListVo> testReportCustomReportDetail = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_timestamp")

    private Long createTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_timestamp")

    private Long updateTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updator_name")

    private String updatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_analysis")

    private String riskAnalysis;

    public TestReportVo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 测试报告Uri
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public TestReportVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 测试报告名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestReportVo withCreator(String creator) {
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

    public TestReportVo withUpdator(String updator) {
        this.updator = updator;
        return this;
    }

    /**
     * 修改人ID
     * @return updator
     */
    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public TestReportVo withVersionUri(String versionUri) {
        this.versionUri = versionUri;
        return this;
    }

    /**
     * 测试计划Uri
     * @return versionUri
     */
    public String getVersionUri() {
        return versionUri;
    }

    public void setVersionUri(String versionUri) {
        this.versionUri = versionUri;
    }

    public TestReportVo withBranchUri(String branchUri) {
        this.branchUri = branchUri;
        return this;
    }

    /**
     * 分支Uri
     * @return branchUri
     */
    public String getBranchUri() {
        return branchUri;
    }

    public void setBranchUri(String branchUri) {
        this.branchUri = branchUri;
    }

    public TestReportVo withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    /**
     * 测试计划名称
     * @return versionName
     */
    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public TestReportVo withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * 分支名称
     * @return branchName
     */
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public TestReportVo withTestConclusion(String testConclusion) {
        this.testConclusion = testConclusion;
        return this;
    }

    /**
     * 测试结论
     * @return testConclusion
     */
    public String getTestConclusion() {
        return testConclusion;
    }

    public void setTestConclusion(String testConclusion) {
        this.testConclusion = testConclusion;
    }

    public TestReportVo withTestConclusionDetails(String testConclusionDetails) {
        this.testConclusionDetails = testConclusionDetails;
        return this;
    }

    /**
     * 测试结论描述
     * @return testConclusionDetails
     */
    public String getTestConclusionDetails() {
        return testConclusionDetails;
    }

    public void setTestConclusionDetails(String testConclusionDetails) {
        this.testConclusionDetails = testConclusionDetails;
    }

    public TestReportVo withDefectResolutionRate(String defectResolutionRate) {
        this.defectResolutionRate = defectResolutionRate;
        return this;
    }

    /**
     * 缺陷解决率
     * @return defectResolutionRate
     */
    public String getDefectResolutionRate() {
        return defectResolutionRate;
    }

    public void setDefectResolutionRate(String defectResolutionRate) {
        this.defectResolutionRate = defectResolutionRate;
    }

    public TestReportVo withDefectResolutionScore(String defectResolutionScore) {
        this.defectResolutionScore = defectResolutionScore;
        return this;
    }

    /**
     * 缺陷解决分数
     * @return defectResolutionScore
     */
    public String getDefectResolutionScore() {
        return defectResolutionScore;
    }

    public void setDefectResolutionScore(String defectResolutionScore) {
        this.defectResolutionScore = defectResolutionScore;
    }

    public TestReportVo withCaseExecutionRate(String caseExecutionRate) {
        this.caseExecutionRate = caseExecutionRate;
        return this;
    }

    /**
     * 用例执行率
     * @return caseExecutionRate
     */
    public String getCaseExecutionRate() {
        return caseExecutionRate;
    }

    public void setCaseExecutionRate(String caseExecutionRate) {
        this.caseExecutionRate = caseExecutionRate;
    }

    public TestReportVo withCaseExecutionScore(String caseExecutionScore) {
        this.caseExecutionScore = caseExecutionScore;
        return this;
    }

    /**
     * 用例执行分数
     * @return caseExecutionScore
     */
    public String getCaseExecutionScore() {
        return caseExecutionScore;
    }

    public void setCaseExecutionScore(String caseExecutionScore) {
        this.caseExecutionScore = caseExecutionScore;
    }

    public TestReportVo withCasePassRate(String casePassRate) {
        this.casePassRate = casePassRate;
        return this;
    }

    /**
     * 用例通过率
     * @return casePassRate
     */
    public String getCasePassRate() {
        return casePassRate;
    }

    public void setCasePassRate(String casePassRate) {
        this.casePassRate = casePassRate;
    }

    public TestReportVo withCasePassScore(String casePassScore) {
        this.casePassScore = casePassScore;
        return this;
    }

    /**
     * 用例通过分数
     * @return casePassScore
     */
    public String getCasePassScore() {
        return casePassScore;
    }

    public void setCasePassScore(String casePassScore) {
        this.casePassScore = casePassScore;
    }

    public TestReportVo withIssuePassRate(String issuePassRate) {
        this.issuePassRate = issuePassRate;
        return this;
    }

    /**
     * 需求通过率
     * @return issuePassRate
     */
    public String getIssuePassRate() {
        return issuePassRate;
    }

    public void setIssuePassRate(String issuePassRate) {
        this.issuePassRate = issuePassRate;
    }

    public TestReportVo withIssuePassScore(String issuePassScore) {
        this.issuePassScore = issuePassScore;
        return this;
    }

    /**
     * 需求通过分数
     * @return issuePassScore
     */
    public String getIssuePassScore() {
        return issuePassScore;
    }

    public void setIssuePassScore(String issuePassScore) {
        this.issuePassScore = issuePassScore;
    }

    public TestReportVo withIssueCoverageRate(String issueCoverageRate) {
        this.issueCoverageRate = issueCoverageRate;
        return this;
    }

    /**
     * 需求覆盖率
     * @return issueCoverageRate
     */
    public String getIssueCoverageRate() {
        return issueCoverageRate;
    }

    public void setIssueCoverageRate(String issueCoverageRate) {
        this.issueCoverageRate = issueCoverageRate;
    }

    public TestReportVo withIssueCoverageScore(String issueCoverageScore) {
        this.issueCoverageScore = issueCoverageScore;
        return this;
    }

    /**
     * 需求覆盖分数
     * @return issueCoverageScore
     */
    public String getIssueCoverageScore() {
        return issueCoverageScore;
    }

    public void setIssueCoverageScore(String issueCoverageScore) {
        this.issueCoverageScore = issueCoverageScore;
    }

    public TestReportVo withProjectResidualDefectIndex(String projectResidualDefectIndex) {
        this.projectResidualDefectIndex = projectResidualDefectIndex;
        return this;
    }

    /**
     * 项目总遗留DI
     * @return projectResidualDefectIndex
     */
    public String getProjectResidualDefectIndex() {
        return projectResidualDefectIndex;
    }

    public void setProjectResidualDefectIndex(String projectResidualDefectIndex) {
        this.projectResidualDefectIndex = projectResidualDefectIndex;
    }

    public TestReportVo withIteratorResidualDefectIndex(String iteratorResidualDefectIndex) {
        this.iteratorResidualDefectIndex = iteratorResidualDefectIndex;
        return this;
    }

    /**
     * 计划新增DI
     * @return iteratorResidualDefectIndex
     */
    public String getIteratorResidualDefectIndex() {
        return iteratorResidualDefectIndex;
    }

    public void setIteratorResidualDefectIndex(String iteratorResidualDefectIndex) {
        this.iteratorResidualDefectIndex = iteratorResidualDefectIndex;
    }

    public TestReportVo withCaseAutomationDetails(CaseAutomationDetailsVo caseAutomationDetails) {
        this.caseAutomationDetails = caseAutomationDetails;
        return this;
    }

    public TestReportVo withCaseAutomationDetails(Consumer<CaseAutomationDetailsVo> caseAutomationDetailsSetter) {
        if (this.caseAutomationDetails == null) {
            this.caseAutomationDetails = new CaseAutomationDetailsVo();
            caseAutomationDetailsSetter.accept(this.caseAutomationDetails);
        }

        return this;
    }

    /**
     * Get caseAutomationDetails
     * @return caseAutomationDetails
     */
    public CaseAutomationDetailsVo getCaseAutomationDetails() {
        return caseAutomationDetails;
    }

    public void setCaseAutomationDetails(CaseAutomationDetailsVo caseAutomationDetails) {
        this.caseAutomationDetails = caseAutomationDetails;
    }

    public TestReportVo withCaseValidityRatio(String caseValidityRatio) {
        this.caseValidityRatio = caseValidityRatio;
        return this;
    }

    /**
     * 用例有效性比例
     * @return caseValidityRatio
     */
    public String getCaseValidityRatio() {
        return caseValidityRatio;
    }

    public void setCaseValidityRatio(String caseValidityRatio) {
        this.caseValidityRatio = caseValidityRatio;
    }

    public TestReportVo withIssueDetails(IssuePassDetailsVo issueDetails) {
        this.issueDetails = issueDetails;
        return this;
    }

    public TestReportVo withIssueDetails(Consumer<IssuePassDetailsVo> issueDetailsSetter) {
        if (this.issueDetails == null) {
            this.issueDetails = new IssuePassDetailsVo();
            issueDetailsSetter.accept(this.issueDetails);
        }

        return this;
    }

    /**
     * Get issueDetails
     * @return issueDetails
     */
    public IssuePassDetailsVo getIssueDetails() {
        return issueDetails;
    }

    public void setIssueDetails(IssuePassDetailsVo issueDetails) {
        this.issueDetails = issueDetails;
    }

    public TestReportVo withCaseDetails(List<NameAndValueVo> caseDetails) {
        this.caseDetails = caseDetails;
        return this;
    }

    public TestReportVo addCaseDetailsItem(NameAndValueVo caseDetailsItem) {
        if (this.caseDetails == null) {
            this.caseDetails = new ArrayList<>();
        }
        this.caseDetails.add(caseDetailsItem);
        return this;
    }

    public TestReportVo withCaseDetails(Consumer<List<NameAndValueVo>> caseDetailsSetter) {
        if (this.caseDetails == null) {
            this.caseDetails = new ArrayList<>();
        }
        caseDetailsSetter.accept(this.caseDetails);
        return this;
    }

    /**
     * 用例通过情况
     * @return caseDetails
     */
    public List<NameAndValueVo> getCaseDetails() {
        return caseDetails;
    }

    public void setCaseDetails(List<NameAndValueVo> caseDetails) {
        this.caseDetails = caseDetails;
    }

    public TestReportVo withDefectDetailsBySeverity(List<IdAndNameAndValueVo> defectDetailsBySeverity) {
        this.defectDetailsBySeverity = defectDetailsBySeverity;
        return this;
    }

    public TestReportVo addDefectDetailsBySeverityItem(IdAndNameAndValueVo defectDetailsBySeverityItem) {
        if (this.defectDetailsBySeverity == null) {
            this.defectDetailsBySeverity = new ArrayList<>();
        }
        this.defectDetailsBySeverity.add(defectDetailsBySeverityItem);
        return this;
    }

    public TestReportVo withDefectDetailsBySeverity(Consumer<List<IdAndNameAndValueVo>> defectDetailsBySeveritySetter) {
        if (this.defectDetailsBySeverity == null) {
            this.defectDetailsBySeverity = new ArrayList<>();
        }
        defectDetailsBySeveritySetter.accept(this.defectDetailsBySeverity);
        return this;
    }

    /**
     * 缺陷严重程度
     * @return defectDetailsBySeverity
     */
    public List<IdAndNameAndValueVo> getDefectDetailsBySeverity() {
        return defectDetailsBySeverity;
    }

    public void setDefectDetailsBySeverity(List<IdAndNameAndValueVo> defectDetailsBySeverity) {
        this.defectDetailsBySeverity = defectDetailsBySeverity;
    }

    public TestReportVo withDefectDetailsByModule(List<IdAndNameAndValueVo> defectDetailsByModule) {
        this.defectDetailsByModule = defectDetailsByModule;
        return this;
    }

    public TestReportVo addDefectDetailsByModuleItem(IdAndNameAndValueVo defectDetailsByModuleItem) {
        if (this.defectDetailsByModule == null) {
            this.defectDetailsByModule = new ArrayList<>();
        }
        this.defectDetailsByModule.add(defectDetailsByModuleItem);
        return this;
    }

    public TestReportVo withDefectDetailsByModule(Consumer<List<IdAndNameAndValueVo>> defectDetailsByModuleSetter) {
        if (this.defectDetailsByModule == null) {
            this.defectDetailsByModule = new ArrayList<>();
        }
        defectDetailsByModuleSetter.accept(this.defectDetailsByModule);
        return this;
    }

    /**
     * 缺陷按照模块分布情况
     * @return defectDetailsByModule
     */
    public List<IdAndNameAndValueVo> getDefectDetailsByModule() {
        return defectDetailsByModule;
    }

    public void setDefectDetailsByModule(List<IdAndNameAndValueVo> defectDetailsByModule) {
        this.defectDetailsByModule = defectDetailsByModule;
    }

    public TestReportVo withCasePassRateByTestType(List<DetailTestTypeCasePassRateVo> casePassRateByTestType) {
        this.casePassRateByTestType = casePassRateByTestType;
        return this;
    }

    public TestReportVo addCasePassRateByTestTypeItem(DetailTestTypeCasePassRateVo casePassRateByTestTypeItem) {
        if (this.casePassRateByTestType == null) {
            this.casePassRateByTestType = new ArrayList<>();
        }
        this.casePassRateByTestType.add(casePassRateByTestTypeItem);
        return this;
    }

    public TestReportVo withCasePassRateByTestType(
        Consumer<List<DetailTestTypeCasePassRateVo>> casePassRateByTestTypeSetter) {
        if (this.casePassRateByTestType == null) {
            this.casePassRateByTestType = new ArrayList<>();
        }
        casePassRateByTestTypeSetter.accept(this.casePassRateByTestType);
        return this;
    }

    /**
     * 每个测试类型的用例通过率
     * @return casePassRateByTestType
     */
    public List<DetailTestTypeCasePassRateVo> getCasePassRateByTestType() {
        return casePassRateByTestType;
    }

    public void setCasePassRateByTestType(List<DetailTestTypeCasePassRateVo> casePassRateByTestType) {
        this.casePassRateByTestType = casePassRateByTestType;
    }

    public TestReportVo withTestReportCustomReportDetail(List<CustomReportListVo> testReportCustomReportDetail) {
        this.testReportCustomReportDetail = testReportCustomReportDetail;
        return this;
    }

    public TestReportVo addTestReportCustomReportDetailItem(CustomReportListVo testReportCustomReportDetailItem) {
        if (this.testReportCustomReportDetail == null) {
            this.testReportCustomReportDetail = new ArrayList<>();
        }
        this.testReportCustomReportDetail.add(testReportCustomReportDetailItem);
        return this;
    }

    public TestReportVo withTestReportCustomReportDetail(
        Consumer<List<CustomReportListVo>> testReportCustomReportDetailSetter) {
        if (this.testReportCustomReportDetail == null) {
            this.testReportCustomReportDetail = new ArrayList<>();
        }
        testReportCustomReportDetailSetter.accept(this.testReportCustomReportDetail);
        return this;
    }

    /**
     * 测试报告自定义报告详情
     * @return testReportCustomReportDetail
     */
    public List<CustomReportListVo> getTestReportCustomReportDetail() {
        return testReportCustomReportDetail;
    }

    public void setTestReportCustomReportDetail(List<CustomReportListVo> testReportCustomReportDetail) {
        this.testReportCustomReportDetail = testReportCustomReportDetail;
    }

    public TestReportVo withCreateTime(OffsetDateTime createTime) {
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

    public TestReportVo withCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }

    /**
     * 创建时间戳
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public TestReportVo withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建人名
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public TestReportVo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public TestReportVo withUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }

    /**
     * 修改时间戳
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public TestReportVo withUpdatorName(String updatorName) {
        this.updatorName = updatorName;
        return this;
    }

    /**
     * 修改人名
     * @return updatorName
     */
    public String getUpdatorName() {
        return updatorName;
    }

    public void setUpdatorName(String updatorName) {
        this.updatorName = updatorName;
    }

    public TestReportVo withProjectUuid(String projectUuid) {
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

    public TestReportVo withRiskAnalysis(String riskAnalysis) {
        this.riskAnalysis = riskAnalysis;
        return this;
    }

    /**
     * 风险分析
     * @return riskAnalysis
     */
    public String getRiskAnalysis() {
        return riskAnalysis;
    }

    public void setRiskAnalysis(String riskAnalysis) {
        this.riskAnalysis = riskAnalysis;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestReportVo that = (TestReportVo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.name, that.name)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.updator, that.updator)
            && Objects.equals(this.versionUri, that.versionUri) && Objects.equals(this.branchUri, that.branchUri)
            && Objects.equals(this.versionName, that.versionName) && Objects.equals(this.branchName, that.branchName)
            && Objects.equals(this.testConclusion, that.testConclusion)
            && Objects.equals(this.testConclusionDetails, that.testConclusionDetails)
            && Objects.equals(this.defectResolutionRate, that.defectResolutionRate)
            && Objects.equals(this.defectResolutionScore, that.defectResolutionScore)
            && Objects.equals(this.caseExecutionRate, that.caseExecutionRate)
            && Objects.equals(this.caseExecutionScore, that.caseExecutionScore)
            && Objects.equals(this.casePassRate, that.casePassRate)
            && Objects.equals(this.casePassScore, that.casePassScore)
            && Objects.equals(this.issuePassRate, that.issuePassRate)
            && Objects.equals(this.issuePassScore, that.issuePassScore)
            && Objects.equals(this.issueCoverageRate, that.issueCoverageRate)
            && Objects.equals(this.issueCoverageScore, that.issueCoverageScore)
            && Objects.equals(this.projectResidualDefectIndex, that.projectResidualDefectIndex)
            && Objects.equals(this.iteratorResidualDefectIndex, that.iteratorResidualDefectIndex)
            && Objects.equals(this.caseAutomationDetails, that.caseAutomationDetails)
            && Objects.equals(this.caseValidityRatio, that.caseValidityRatio)
            && Objects.equals(this.issueDetails, that.issueDetails)
            && Objects.equals(this.caseDetails, that.caseDetails)
            && Objects.equals(this.defectDetailsBySeverity, that.defectDetailsBySeverity)
            && Objects.equals(this.defectDetailsByModule, that.defectDetailsByModule)
            && Objects.equals(this.casePassRateByTestType, that.casePassRateByTestType)
            && Objects.equals(this.testReportCustomReportDetail, that.testReportCustomReportDetail)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.createTimestamp, that.createTimestamp)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.updateTimestamp, that.updateTimestamp)
            && Objects.equals(this.updatorName, that.updatorName) && Objects.equals(this.projectUuid, that.projectUuid)
            && Objects.equals(this.riskAnalysis, that.riskAnalysis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri,
            name,
            creator,
            updator,
            versionUri,
            branchUri,
            versionName,
            branchName,
            testConclusion,
            testConclusionDetails,
            defectResolutionRate,
            defectResolutionScore,
            caseExecutionRate,
            caseExecutionScore,
            casePassRate,
            casePassScore,
            issuePassRate,
            issuePassScore,
            issueCoverageRate,
            issueCoverageScore,
            projectResidualDefectIndex,
            iteratorResidualDefectIndex,
            caseAutomationDetails,
            caseValidityRatio,
            issueDetails,
            caseDetails,
            defectDetailsBySeverity,
            defectDetailsByModule,
            casePassRateByTestType,
            testReportCustomReportDetail,
            createTime,
            createTimestamp,
            creatorName,
            updateTime,
            updateTimestamp,
            updatorName,
            projectUuid,
            riskAnalysis);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestReportVo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    updator: ").append(toIndentedString(updator)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    branchUri: ").append(toIndentedString(branchUri)).append("\n");
        sb.append("    versionName: ").append(toIndentedString(versionName)).append("\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
        sb.append("    testConclusion: ").append(toIndentedString(testConclusion)).append("\n");
        sb.append("    testConclusionDetails: ").append(toIndentedString(testConclusionDetails)).append("\n");
        sb.append("    defectResolutionRate: ").append(toIndentedString(defectResolutionRate)).append("\n");
        sb.append("    defectResolutionScore: ").append(toIndentedString(defectResolutionScore)).append("\n");
        sb.append("    caseExecutionRate: ").append(toIndentedString(caseExecutionRate)).append("\n");
        sb.append("    caseExecutionScore: ").append(toIndentedString(caseExecutionScore)).append("\n");
        sb.append("    casePassRate: ").append(toIndentedString(casePassRate)).append("\n");
        sb.append("    casePassScore: ").append(toIndentedString(casePassScore)).append("\n");
        sb.append("    issuePassRate: ").append(toIndentedString(issuePassRate)).append("\n");
        sb.append("    issuePassScore: ").append(toIndentedString(issuePassScore)).append("\n");
        sb.append("    issueCoverageRate: ").append(toIndentedString(issueCoverageRate)).append("\n");
        sb.append("    issueCoverageScore: ").append(toIndentedString(issueCoverageScore)).append("\n");
        sb.append("    projectResidualDefectIndex: ").append(toIndentedString(projectResidualDefectIndex)).append("\n");
        sb.append("    iteratorResidualDefectIndex: ")
            .append(toIndentedString(iteratorResidualDefectIndex))
            .append("\n");
        sb.append("    caseAutomationDetails: ").append(toIndentedString(caseAutomationDetails)).append("\n");
        sb.append("    caseValidityRatio: ").append(toIndentedString(caseValidityRatio)).append("\n");
        sb.append("    issueDetails: ").append(toIndentedString(issueDetails)).append("\n");
        sb.append("    caseDetails: ").append(toIndentedString(caseDetails)).append("\n");
        sb.append("    defectDetailsBySeverity: ").append(toIndentedString(defectDetailsBySeverity)).append("\n");
        sb.append("    defectDetailsByModule: ").append(toIndentedString(defectDetailsByModule)).append("\n");
        sb.append("    casePassRateByTestType: ").append(toIndentedString(casePassRateByTestType)).append("\n");
        sb.append("    testReportCustomReportDetail: ")
            .append(toIndentedString(testReportCustomReportDetail))
            .append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createTimestamp: ").append(toIndentedString(createTimestamp)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
        sb.append("    updatorName: ").append(toIndentedString(updatorName)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    riskAnalysis: ").append(toIndentedString(riskAnalysis)).append("\n");
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
