package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TestCasesQueryInfo
 */
public class TestCasesQueryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exeplatforms")

    private List<String> exeplatforms = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "own")

    private Boolean own;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "useOffset")

    private Boolean useOffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_uri")

    private String versionUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_uris")

    private List<String> caseUris = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_ids")

    private List<String> ownerIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_codes")

    private List<String> statusCodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank_ids")

    private List<String> rankIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module_ids")

    private List<String> moduleIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_id")

    private String issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_ids")

    private List<String> creatorIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_codes")

    private List<String> resultCodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration_ids")

    private List<String> iterationIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_start_time")

    private String createStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_end_time")

    private String createEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_issue")

    private Boolean associatedIssue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_defects")

    private Boolean associatedDefects;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_sub_issue")

    private Boolean includeSubIssue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_sub_feature")

    private Boolean includeSubFeature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_ids")

    private List<String> labelIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_start_time")

    private String executeStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_end_time")

    private String executeEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_ids")

    private List<String> executorIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_types")

    private List<String> testTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_keyword")

    private Boolean isKeyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_tree_search")

    private Boolean issueTreeSearch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private Integer serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_types")

    private List<Integer> serviceTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_type")

    private Integer stageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_uri")

    private String featureUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private String sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_type")

    private String sortType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_type")

    private Integer caseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_info")

    private List<QueryCustomFieldsInfo> customFieldInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_uri")

    private String taskUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_issue_detail")

    private Boolean associateIssueDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_assign_task")

    private Boolean notAssignTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_designs")

    private List<Boolean> testDesigns = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_status")

    private Integer reviewStatus;

    public TestCasesQueryInfo withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 关键字查询，用例名或编号
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public TestCasesQueryInfo withExeplatforms(List<String> exeplatforms) {
        this.exeplatforms = exeplatforms;
        return this;
    }

    public TestCasesQueryInfo addExeplatformsItem(String exeplatformsItem) {
        if (this.exeplatforms == null) {
            this.exeplatforms = new ArrayList<>();
        }
        this.exeplatforms.add(exeplatformsItem);
        return this;
    }

    public TestCasesQueryInfo withExeplatforms(Consumer<List<String>> exeplatformsSetter) {
        if (this.exeplatforms == null) {
            this.exeplatforms = new ArrayList<>();
        }
        exeplatformsSetter.accept(this.exeplatforms);
        return this;
    }

    /**
     * 执行平台
     * @return exeplatforms
     */
    public List<String> getExeplatforms() {
        return exeplatforms;
    }

    public void setExeplatforms(List<String> exeplatforms) {
        this.exeplatforms = exeplatforms;
    }

    public TestCasesQueryInfo withOwn(Boolean own) {
        this.own = own;
        return this;
    }

    /**
     * 是否是我的
     * @return own
     */
    public Boolean getOwn() {
        return own;
    }

    public void setOwn(Boolean own) {
        this.own = own;
    }

    public TestCasesQueryInfo withUseOffset(Boolean useOffset) {
        this.useOffset = useOffset;
        return this;
    }

    /**
     * Get useOffset
     * @return useOffset
     */
    public Boolean getUseOffset() {
        return useOffset;
    }

    public void setUseOffset(Boolean useOffset) {
        this.useOffset = useOffset;
    }

    public TestCasesQueryInfo withVersionUri(String versionUri) {
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

    public TestCasesQueryInfo withCaseUris(List<String> caseUris) {
        this.caseUris = caseUris;
        return this;
    }

    public TestCasesQueryInfo addCaseUrisItem(String caseUrisItem) {
        if (this.caseUris == null) {
            this.caseUris = new ArrayList<>();
        }
        this.caseUris.add(caseUrisItem);
        return this;
    }

    public TestCasesQueryInfo withCaseUris(Consumer<List<String>> caseUrisSetter) {
        if (this.caseUris == null) {
            this.caseUris = new ArrayList<>();
        }
        caseUrisSetter.accept(this.caseUris);
        return this;
    }

    /**
     * 用例URI集合
     * @return caseUris
     */
    public List<String> getCaseUris() {
        return caseUris;
    }

    public void setCaseUris(List<String> caseUris) {
        this.caseUris = caseUris;
    }

    public TestCasesQueryInfo withOwnerIds(List<String> ownerIds) {
        this.ownerIds = ownerIds;
        return this;
    }

    public TestCasesQueryInfo addOwnerIdsItem(String ownerIdsItem) {
        if (this.ownerIds == null) {
            this.ownerIds = new ArrayList<>();
        }
        this.ownerIds.add(ownerIdsItem);
        return this;
    }

    public TestCasesQueryInfo withOwnerIds(Consumer<List<String>> ownerIdsSetter) {
        if (this.ownerIds == null) {
            this.ownerIds = new ArrayList<>();
        }
        ownerIdsSetter.accept(this.ownerIds);
        return this;
    }

    /**
     * 处理者ID集合
     * @return ownerIds
     */
    public List<String> getOwnerIds() {
        return ownerIds;
    }

    public void setOwnerIds(List<String> ownerIds) {
        this.ownerIds = ownerIds;
    }

    public TestCasesQueryInfo withStatusCodes(List<String> statusCodes) {
        this.statusCodes = statusCodes;
        return this;
    }

    public TestCasesQueryInfo addStatusCodesItem(String statusCodesItem) {
        if (this.statusCodes == null) {
            this.statusCodes = new ArrayList<>();
        }
        this.statusCodes.add(statusCodesItem);
        return this;
    }

    public TestCasesQueryInfo withStatusCodes(Consumer<List<String>> statusCodesSetter) {
        if (this.statusCodes == null) {
            this.statusCodes = new ArrayList<>();
        }
        statusCodesSetter.accept(this.statusCodes);
        return this;
    }

    /**
     * 状态Code集合
     * @return statusCodes
     */
    public List<String> getStatusCodes() {
        return statusCodes;
    }

    public void setStatusCodes(List<String> statusCodes) {
        this.statusCodes = statusCodes;
    }

    public TestCasesQueryInfo withRankIds(List<String> rankIds) {
        this.rankIds = rankIds;
        return this;
    }

    public TestCasesQueryInfo addRankIdsItem(String rankIdsItem) {
        if (this.rankIds == null) {
            this.rankIds = new ArrayList<>();
        }
        this.rankIds.add(rankIdsItem);
        return this;
    }

    public TestCasesQueryInfo withRankIds(Consumer<List<String>> rankIdsSetter) {
        if (this.rankIds == null) {
            this.rankIds = new ArrayList<>();
        }
        rankIdsSetter.accept(this.rankIds);
        return this;
    }

    /**
     * 用例等级ID集合
     * @return rankIds
     */
    public List<String> getRankIds() {
        return rankIds;
    }

    public void setRankIds(List<String> rankIds) {
        this.rankIds = rankIds;
    }

    public TestCasesQueryInfo withModuleIds(List<String> moduleIds) {
        this.moduleIds = moduleIds;
        return this;
    }

    public TestCasesQueryInfo addModuleIdsItem(String moduleIdsItem) {
        if (this.moduleIds == null) {
            this.moduleIds = new ArrayList<>();
        }
        this.moduleIds.add(moduleIdsItem);
        return this;
    }

    public TestCasesQueryInfo withModuleIds(Consumer<List<String>> moduleIdsSetter) {
        if (this.moduleIds == null) {
            this.moduleIds = new ArrayList<>();
        }
        moduleIdsSetter.accept(this.moduleIds);
        return this;
    }

    /**
     * 模块ID集合
     * @return moduleIds
     */
    public List<String> getModuleIds() {
        return moduleIds;
    }

    public void setModuleIds(List<String> moduleIds) {
        this.moduleIds = moduleIds;
    }

    public TestCasesQueryInfo withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 需求编号
     * @return issueId
     */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public TestCasesQueryInfo withCreatorIds(List<String> creatorIds) {
        this.creatorIds = creatorIds;
        return this;
    }

    public TestCasesQueryInfo addCreatorIdsItem(String creatorIdsItem) {
        if (this.creatorIds == null) {
            this.creatorIds = new ArrayList<>();
        }
        this.creatorIds.add(creatorIdsItem);
        return this;
    }

    public TestCasesQueryInfo withCreatorIds(Consumer<List<String>> creatorIdsSetter) {
        if (this.creatorIds == null) {
            this.creatorIds = new ArrayList<>();
        }
        creatorIdsSetter.accept(this.creatorIds);
        return this;
    }

    /**
     * 创建者ID集合
     * @return creatorIds
     */
    public List<String> getCreatorIds() {
        return creatorIds;
    }

    public void setCreatorIds(List<String> creatorIds) {
        this.creatorIds = creatorIds;
    }

    public TestCasesQueryInfo withResultCodes(List<String> resultCodes) {
        this.resultCodes = resultCodes;
        return this;
    }

    public TestCasesQueryInfo addResultCodesItem(String resultCodesItem) {
        if (this.resultCodes == null) {
            this.resultCodes = new ArrayList<>();
        }
        this.resultCodes.add(resultCodesItem);
        return this;
    }

    public TestCasesQueryInfo withResultCodes(Consumer<List<String>> resultCodesSetter) {
        if (this.resultCodes == null) {
            this.resultCodes = new ArrayList<>();
        }
        resultCodesSetter.accept(this.resultCodes);
        return this;
    }

    /**
     * 结果Code集合
     * @return resultCodes
     */
    public List<String> getResultCodes() {
        return resultCodes;
    }

    public void setResultCodes(List<String> resultCodes) {
        this.resultCodes = resultCodes;
    }

    public TestCasesQueryInfo withIterationIds(List<String> iterationIds) {
        this.iterationIds = iterationIds;
        return this;
    }

    public TestCasesQueryInfo addIterationIdsItem(String iterationIdsItem) {
        if (this.iterationIds == null) {
            this.iterationIds = new ArrayList<>();
        }
        this.iterationIds.add(iterationIdsItem);
        return this;
    }

    public TestCasesQueryInfo withIterationIds(Consumer<List<String>> iterationIdsSetter) {
        if (this.iterationIds == null) {
            this.iterationIds = new ArrayList<>();
        }
        iterationIdsSetter.accept(this.iterationIds);
        return this;
    }

    /**
     * 归属迭代ID集合
     * @return iterationIds
     */
    public List<String> getIterationIds() {
        return iterationIds;
    }

    public void setIterationIds(List<String> iterationIds) {
        this.iterationIds = iterationIds;
    }

    public TestCasesQueryInfo withCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }

    /**
     * 创建开始时间
     * @return createStartTime
     */
    public String getCreateStartTime() {
        return createStartTime;
    }

    public void setCreateStartTime(String createStartTime) {
        this.createStartTime = createStartTime;
    }

    public TestCasesQueryInfo withCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }

    /**
     * 创建结束时间
     * @return createEndTime
     */
    public String getCreateEndTime() {
        return createEndTime;
    }

    public void setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
    }

    public TestCasesQueryInfo withAssociatedIssue(Boolean associatedIssue) {
        this.associatedIssue = associatedIssue;
        return this;
    }

    /**
     * 是否关联需求（null：不限，false：未关联，true：已关联）
     * @return associatedIssue
     */
    public Boolean getAssociatedIssue() {
        return associatedIssue;
    }

    public void setAssociatedIssue(Boolean associatedIssue) {
        this.associatedIssue = associatedIssue;
    }

    public TestCasesQueryInfo withAssociatedDefects(Boolean associatedDefects) {
        this.associatedDefects = associatedDefects;
        return this;
    }

    /**
     * 是否关联缺陷（null：不限，false：未关联，true：已关联）
     * @return associatedDefects
     */
    public Boolean getAssociatedDefects() {
        return associatedDefects;
    }

    public void setAssociatedDefects(Boolean associatedDefects) {
        this.associatedDefects = associatedDefects;
    }

    public TestCasesQueryInfo withIncludeSubIssue(Boolean includeSubIssue) {
        this.includeSubIssue = includeSubIssue;
        return this;
    }

    /**
     * 是否查询子需求关联的用例，默认true
     * @return includeSubIssue
     */
    public Boolean getIncludeSubIssue() {
        return includeSubIssue;
    }

    public void setIncludeSubIssue(Boolean includeSubIssue) {
        this.includeSubIssue = includeSubIssue;
    }

    public TestCasesQueryInfo withIncludeSubFeature(Boolean includeSubFeature) {
        this.includeSubFeature = includeSubFeature;
        return this;
    }

    /**
     * 是否查询子目录的用例，默认true
     * @return includeSubFeature
     */
    public Boolean getIncludeSubFeature() {
        return includeSubFeature;
    }

    public void setIncludeSubFeature(Boolean includeSubFeature) {
        this.includeSubFeature = includeSubFeature;
    }

    public TestCasesQueryInfo withLabelIds(List<String> labelIds) {
        this.labelIds = labelIds;
        return this;
    }

    public TestCasesQueryInfo addLabelIdsItem(String labelIdsItem) {
        if (this.labelIds == null) {
            this.labelIds = new ArrayList<>();
        }
        this.labelIds.add(labelIdsItem);
        return this;
    }

    public TestCasesQueryInfo withLabelIds(Consumer<List<String>> labelIdsSetter) {
        if (this.labelIds == null) {
            this.labelIds = new ArrayList<>();
        }
        labelIdsSetter.accept(this.labelIds);
        return this;
    }

    /**
     * 标签ID集合
     * @return labelIds
     */
    public List<String> getLabelIds() {
        return labelIds;
    }

    public void setLabelIds(List<String> labelIds) {
        this.labelIds = labelIds;
    }

    public TestCasesQueryInfo withExecuteStartTime(String executeStartTime) {
        this.executeStartTime = executeStartTime;
        return this;
    }

    /**
     * 执行开始时间
     * @return executeStartTime
     */
    public String getExecuteStartTime() {
        return executeStartTime;
    }

    public void setExecuteStartTime(String executeStartTime) {
        this.executeStartTime = executeStartTime;
    }

    public TestCasesQueryInfo withExecuteEndTime(String executeEndTime) {
        this.executeEndTime = executeEndTime;
        return this;
    }

    /**
     * 执行结束时间
     * @return executeEndTime
     */
    public String getExecuteEndTime() {
        return executeEndTime;
    }

    public void setExecuteEndTime(String executeEndTime) {
        this.executeEndTime = executeEndTime;
    }

    public TestCasesQueryInfo withExecutorIds(List<String> executorIds) {
        this.executorIds = executorIds;
        return this;
    }

    public TestCasesQueryInfo addExecutorIdsItem(String executorIdsItem) {
        if (this.executorIds == null) {
            this.executorIds = new ArrayList<>();
        }
        this.executorIds.add(executorIdsItem);
        return this;
    }

    public TestCasesQueryInfo withExecutorIds(Consumer<List<String>> executorIdsSetter) {
        if (this.executorIds == null) {
            this.executorIds = new ArrayList<>();
        }
        executorIdsSetter.accept(this.executorIds);
        return this;
    }

    /**
     * 执行者ID集合
     * @return executorIds
     */
    public List<String> getExecutorIds() {
        return executorIds;
    }

    public void setExecutorIds(List<String> executorIds) {
        this.executorIds = executorIds;
    }

    public TestCasesQueryInfo withTestTypes(List<String> testTypes) {
        this.testTypes = testTypes;
        return this;
    }

    public TestCasesQueryInfo addTestTypesItem(String testTypesItem) {
        if (this.testTypes == null) {
            this.testTypes = new ArrayList<>();
        }
        this.testTypes.add(testTypesItem);
        return this;
    }

    public TestCasesQueryInfo withTestTypes(Consumer<List<String>> testTypesSetter) {
        if (this.testTypes == null) {
            this.testTypes = new ArrayList<>();
        }
        testTypesSetter.accept(this.testTypes);
        return this;
    }

    /**
     * 类型
     * @return testTypes
     */
    public List<String> getTestTypes() {
        return testTypes;
    }

    public void setTestTypes(List<String> testTypes) {
        this.testTypes = testTypes;
    }

    public TestCasesQueryInfo withIsKeyword(Boolean isKeyword) {
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

    public TestCasesQueryInfo withIssueTreeSearch(Boolean issueTreeSearch) {
        this.issueTreeSearch = issueTreeSearch;
        return this;
    }

    /**
     * 是否是需求树点击的查询关联用例
     * @return issueTreeSearch
     */
    public Boolean getIssueTreeSearch() {
        return issueTreeSearch;
    }

    public void setIssueTreeSearch(Boolean issueTreeSearch) {
        this.issueTreeSearch = issueTreeSearch;
    }

    public TestCasesQueryInfo withServiceType(Integer serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * 服务类型
     * @return serviceType
     */
    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    public TestCasesQueryInfo withServiceTypes(List<Integer> serviceTypes) {
        this.serviceTypes = serviceTypes;
        return this;
    }

    public TestCasesQueryInfo addServiceTypesItem(Integer serviceTypesItem) {
        if (this.serviceTypes == null) {
            this.serviceTypes = new ArrayList<>();
        }
        this.serviceTypes.add(serviceTypesItem);
        return this;
    }

    public TestCasesQueryInfo withServiceTypes(Consumer<List<Integer>> serviceTypesSetter) {
        if (this.serviceTypes == null) {
            this.serviceTypes = new ArrayList<>();
        }
        serviceTypesSetter.accept(this.serviceTypes);
        return this;
    }

    /**
     * 服务类型集合
     * @return serviceTypes
     */
    public List<Integer> getServiceTypes() {
        return serviceTypes;
    }

    public void setServiceTypes(List<Integer> serviceTypes) {
        this.serviceTypes = serviceTypes;
    }

    public TestCasesQueryInfo withStageType(Integer stageType) {
        this.stageType = stageType;
        return this;
    }

    /**
     * 阶段过程（2：测试设计，3：测试执行，4：质量报告）
     * @return stageType
     */
    public Integer getStageType() {
        return stageType;
    }

    public void setStageType(Integer stageType) {
        this.stageType = stageType;
    }

    public TestCasesQueryInfo withFeatureUri(String featureUri) {
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

    public TestCasesQueryInfo withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序字段
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public TestCasesQueryInfo withSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }

    /**
     * 排序方式
     * @return sortType
     */
    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public TestCasesQueryInfo withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 当前页数
     * minimum: 1
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public TestCasesQueryInfo withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页条数
     * minimum: 1
     * maximum: 100
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public TestCasesQueryInfo withCaseType(Integer caseType) {
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

    public TestCasesQueryInfo withCustomFieldInfo(List<QueryCustomFieldsInfo> customFieldInfo) {
        this.customFieldInfo = customFieldInfo;
        return this;
    }

    public TestCasesQueryInfo addCustomFieldInfoItem(QueryCustomFieldsInfo customFieldInfoItem) {
        if (this.customFieldInfo == null) {
            this.customFieldInfo = new ArrayList<>();
        }
        this.customFieldInfo.add(customFieldInfoItem);
        return this;
    }

    public TestCasesQueryInfo withCustomFieldInfo(Consumer<List<QueryCustomFieldsInfo>> customFieldInfoSetter) {
        if (this.customFieldInfo == null) {
            this.customFieldInfo = new ArrayList<>();
        }
        customFieldInfoSetter.accept(this.customFieldInfo);
        return this;
    }

    /**
     * 用例自定义字段信息
     * @return customFieldInfo
     */
    public List<QueryCustomFieldsInfo> getCustomFieldInfo() {
        return customFieldInfo;
    }

    public void setCustomFieldInfo(List<QueryCustomFieldsInfo> customFieldInfo) {
        this.customFieldInfo = customFieldInfo;
    }

    public TestCasesQueryInfo withTaskUri(String taskUri) {
        this.taskUri = taskUri;
        return this;
    }

    /**
     * 测试套uri
     * @return taskUri
     */
    public String getTaskUri() {
        return taskUri;
    }

    public void setTaskUri(String taskUri) {
        this.taskUri = taskUri;
    }

    public TestCasesQueryInfo withAssociateIssueDetail(Boolean associateIssueDetail) {
        this.associateIssueDetail = associateIssueDetail;
        return this;
    }

    /**
     * 是否返回需求具体信息（返回需求名称，需求id）
     * @return associateIssueDetail
     */
    public Boolean getAssociateIssueDetail() {
        return associateIssueDetail;
    }

    public void setAssociateIssueDetail(Boolean associateIssueDetail) {
        this.associateIssueDetail = associateIssueDetail;
    }

    public TestCasesQueryInfo withNotAssignTask(Boolean notAssignTask) {
        this.notAssignTask = notAssignTask;
        return this;
    }

    /**
     * 该字段为false,则查询全量用例，为true表示查询未分配测试套的用例
     * @return notAssignTask
     */
    public Boolean getNotAssignTask() {
        return notAssignTask;
    }

    public void setNotAssignTask(Boolean notAssignTask) {
        this.notAssignTask = notAssignTask;
    }

    public TestCasesQueryInfo withTestDesigns(List<Boolean> testDesigns) {
        this.testDesigns = testDesigns;
        return this;
    }

    public TestCasesQueryInfo addTestDesignsItem(Boolean testDesignsItem) {
        if (this.testDesigns == null) {
            this.testDesigns = new ArrayList<>();
        }
        this.testDesigns.add(testDesignsItem);
        return this;
    }

    public TestCasesQueryInfo withTestDesigns(Consumer<List<Boolean>> testDesignsSetter) {
        if (this.testDesigns == null) {
            this.testDesigns = new ArrayList<>();
        }
        testDesignsSetter.accept(this.testDesigns);
        return this;
    }

    /**
     * 是否来自测试设计（null或者[true, false]：不限，[true]：来自测试设计，[false]：否来自测试设计）
     * @return testDesigns
     */
    public List<Boolean> getTestDesigns() {
        return testDesigns;
    }

    public void setTestDesigns(List<Boolean> testDesigns) {
        this.testDesigns = testDesigns;
    }

    public TestCasesQueryInfo withReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
        return this;
    }

    /**
     * 用例评审状态
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
        TestCasesQueryInfo that = (TestCasesQueryInfo) obj;
        return Objects.equals(this.keyword, that.keyword) && Objects.equals(this.exeplatforms, that.exeplatforms)
            && Objects.equals(this.own, that.own) && Objects.equals(this.useOffset, that.useOffset)
            && Objects.equals(this.versionUri, that.versionUri) && Objects.equals(this.caseUris, that.caseUris)
            && Objects.equals(this.ownerIds, that.ownerIds) && Objects.equals(this.statusCodes, that.statusCodes)
            && Objects.equals(this.rankIds, that.rankIds) && Objects.equals(this.moduleIds, that.moduleIds)
            && Objects.equals(this.issueId, that.issueId) && Objects.equals(this.creatorIds, that.creatorIds)
            && Objects.equals(this.resultCodes, that.resultCodes)
            && Objects.equals(this.iterationIds, that.iterationIds)
            && Objects.equals(this.createStartTime, that.createStartTime)
            && Objects.equals(this.createEndTime, that.createEndTime)
            && Objects.equals(this.associatedIssue, that.associatedIssue)
            && Objects.equals(this.associatedDefects, that.associatedDefects)
            && Objects.equals(this.includeSubIssue, that.includeSubIssue)
            && Objects.equals(this.includeSubFeature, that.includeSubFeature)
            && Objects.equals(this.labelIds, that.labelIds)
            && Objects.equals(this.executeStartTime, that.executeStartTime)
            && Objects.equals(this.executeEndTime, that.executeEndTime)
            && Objects.equals(this.executorIds, that.executorIds) && Objects.equals(this.testTypes, that.testTypes)
            && Objects.equals(this.isKeyword, that.isKeyword)
            && Objects.equals(this.issueTreeSearch, that.issueTreeSearch)
            && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.serviceTypes, that.serviceTypes) && Objects.equals(this.stageType, that.stageType)
            && Objects.equals(this.featureUri, that.featureUri) && Objects.equals(this.sortField, that.sortField)
            && Objects.equals(this.sortType, that.sortType) && Objects.equals(this.pageNo, that.pageNo)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.caseType, that.caseType)
            && Objects.equals(this.customFieldInfo, that.customFieldInfo) && Objects.equals(this.taskUri, that.taskUri)
            && Objects.equals(this.associateIssueDetail, that.associateIssueDetail)
            && Objects.equals(this.notAssignTask, that.notAssignTask)
            && Objects.equals(this.testDesigns, that.testDesigns)
            && Objects.equals(this.reviewStatus, that.reviewStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyword,
            exeplatforms,
            own,
            useOffset,
            versionUri,
            caseUris,
            ownerIds,
            statusCodes,
            rankIds,
            moduleIds,
            issueId,
            creatorIds,
            resultCodes,
            iterationIds,
            createStartTime,
            createEndTime,
            associatedIssue,
            associatedDefects,
            includeSubIssue,
            includeSubFeature,
            labelIds,
            executeStartTime,
            executeEndTime,
            executorIds,
            testTypes,
            isKeyword,
            issueTreeSearch,
            serviceType,
            serviceTypes,
            stageType,
            featureUri,
            sortField,
            sortType,
            pageNo,
            pageSize,
            caseType,
            customFieldInfo,
            taskUri,
            associateIssueDetail,
            notAssignTask,
            testDesigns,
            reviewStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCasesQueryInfo {\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    exeplatforms: ").append(toIndentedString(exeplatforms)).append("\n");
        sb.append("    own: ").append(toIndentedString(own)).append("\n");
        sb.append("    useOffset: ").append(toIndentedString(useOffset)).append("\n");
        sb.append("    versionUri: ").append(toIndentedString(versionUri)).append("\n");
        sb.append("    caseUris: ").append(toIndentedString(caseUris)).append("\n");
        sb.append("    ownerIds: ").append(toIndentedString(ownerIds)).append("\n");
        sb.append("    statusCodes: ").append(toIndentedString(statusCodes)).append("\n");
        sb.append("    rankIds: ").append(toIndentedString(rankIds)).append("\n");
        sb.append("    moduleIds: ").append(toIndentedString(moduleIds)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    creatorIds: ").append(toIndentedString(creatorIds)).append("\n");
        sb.append("    resultCodes: ").append(toIndentedString(resultCodes)).append("\n");
        sb.append("    iterationIds: ").append(toIndentedString(iterationIds)).append("\n");
        sb.append("    createStartTime: ").append(toIndentedString(createStartTime)).append("\n");
        sb.append("    createEndTime: ").append(toIndentedString(createEndTime)).append("\n");
        sb.append("    associatedIssue: ").append(toIndentedString(associatedIssue)).append("\n");
        sb.append("    associatedDefects: ").append(toIndentedString(associatedDefects)).append("\n");
        sb.append("    includeSubIssue: ").append(toIndentedString(includeSubIssue)).append("\n");
        sb.append("    includeSubFeature: ").append(toIndentedString(includeSubFeature)).append("\n");
        sb.append("    labelIds: ").append(toIndentedString(labelIds)).append("\n");
        sb.append("    executeStartTime: ").append(toIndentedString(executeStartTime)).append("\n");
        sb.append("    executeEndTime: ").append(toIndentedString(executeEndTime)).append("\n");
        sb.append("    executorIds: ").append(toIndentedString(executorIds)).append("\n");
        sb.append("    testTypes: ").append(toIndentedString(testTypes)).append("\n");
        sb.append("    isKeyword: ").append(toIndentedString(isKeyword)).append("\n");
        sb.append("    issueTreeSearch: ").append(toIndentedString(issueTreeSearch)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    serviceTypes: ").append(toIndentedString(serviceTypes)).append("\n");
        sb.append("    stageType: ").append(toIndentedString(stageType)).append("\n");
        sb.append("    featureUri: ").append(toIndentedString(featureUri)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    caseType: ").append(toIndentedString(caseType)).append("\n");
        sb.append("    customFieldInfo: ").append(toIndentedString(customFieldInfo)).append("\n");
        sb.append("    taskUri: ").append(toIndentedString(taskUri)).append("\n");
        sb.append("    associateIssueDetail: ").append(toIndentedString(associateIssueDetail)).append("\n");
        sb.append("    notAssignTask: ").append(toIndentedString(notAssignTask)).append("\n");
        sb.append("    testDesigns: ").append(toIndentedString(testDesigns)).append("\n");
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
