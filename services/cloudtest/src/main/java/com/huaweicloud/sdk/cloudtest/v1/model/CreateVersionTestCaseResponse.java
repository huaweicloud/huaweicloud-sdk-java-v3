package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateVersionTestCaseResponse extends SdkResponse {

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
    @JsonProperty(value = "preparation")

    private String preparation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private String stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activity")

    private String activity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords")

    private String keywords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "market")

    private String market;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "designer")

    private String designer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_parameter")

    private String executeParameter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

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
    @JsonProperty(value = "case_type")

    private Integer caseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_type")

    private Integer platformType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private Integer serviceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_name")

    private String serviceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_type")

    private Integer testType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_type_name")

    private String testTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "design_note")

    private String designNote;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_step")

    private String testStep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expect_output")

    private String expectOutput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_type")

    private String envType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exe_platform")

    private String exePlatform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_project")

    private String testcaseProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "svn_script_path")

    private String svnScriptPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "map_restrict")

    private String mapRestrict;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_script_name")

    private String networkScriptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_type")

    private Integer autoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_be_auto_exec")

    private Integer toBeAutoExec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_result")

    private String lastResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_result_uri")

    private String lastResultUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_uri")

    private String featureUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_name")

    private String featureName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interface_name")

    private String interfaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snp_no")

    private String snpNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_relation_id")

    private String drRelationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_name")

    private String issueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_base_num")

    private String testBaseNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "automatically_executed")

    private Integer automaticallyExecuted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_execute_time")

    private OffsetDateTime firstExecuteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_type")

    private String detectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_param")

    private String executeParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_feature")

    private String testFeature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_contract_testcase")

    private Integer isContractTestcase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_cost")

    private Double timeCost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "be_auto_type_time")

    private OffsetDateTime beAutoTypeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_number")

    private String compareNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_flag")

    private String sceneFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_flag")

    private String baseFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "para_validator")

    private String paraValidator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knet_node_id")

    private String knetNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_exe_author")

    private String lastExeAuthor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_carrier")

    private String cloudCarrier;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "market_place")

    private String marketPlace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_mind_id")

    private String testMindId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_mind_url")

    private String testMindUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "commit_url")

    private String commitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_pattern_number")

    private String testPatternNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_factor_number")

    private String testFactorNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private String statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_code")

    private String resultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_id")

    private String releaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_id")

    private String labelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private String labels;

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
    @JsonProperty(value = "execute_latest_time")

    private OffsetDateTime executeLatestTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_duration")

    private String executeDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_times")

    private Integer executeTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_keyword")

    private Integer isKeyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_dev")

    private String releaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_created")

    private String newCreated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_version_name")

    private String creationVersionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_path")

    private String featurePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_uri")

    private String testcaseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner_name")

    private String ownerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iterator_case_uri")

    private String iteratorCaseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_link")

    private String scriptLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_1")

    private String customField1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_2")

    private String customField2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_3")

    private String customField3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_4")

    private String customField4;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_5")

    private String customField5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_6")

    private String customField6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_7")

    private String customField7;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_8")

    private String customField8;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_9")

    private String customField9;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_10")

    private String customField10;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_11")

    private String customField11;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_12")

    private String customField12;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_13")

    private String customField13;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_14")

    private String customField14;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_15")

    private String customField15;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_16")

    private String customField16;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_17")

    private String customField17;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_18")

    private String customField18;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_19")

    private String customField19;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_20")

    private String customField20;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_21")

    private String customField21;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_22")

    private String customField22;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_23")

    private String customField23;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_24")

    private String customField24;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_25")

    private String customField25;

    public CreateVersionTestCaseResponse withUri(String uri) {
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

    public CreateVersionTestCaseResponse withType(String type) {
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

    public CreateVersionTestCaseResponse withAuthor(String author) {
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

    public CreateVersionTestCaseResponse withName(String name) {
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

    public CreateVersionTestCaseResponse withRank(Integer rank) {
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

    public CreateVersionTestCaseResponse withPreparation(String preparation) {
        this.preparation = preparation;
        return this;
    }

    /**
     * 前置条件
     * @return preparation
     */
    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public CreateVersionTestCaseResponse withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 备注
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public CreateVersionTestCaseResponse withStage(String stage) {
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

    public CreateVersionTestCaseResponse withActivity(String activity) {
        this.activity = activity;
        return this;
    }

    /**
     * 测试类型
     * @return activity
     */
    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public CreateVersionTestCaseResponse withKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    /**
     * 关键词
     * @return keywords
     */
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public CreateVersionTestCaseResponse withMarket(String market) {
        this.market = market;
        return this;
    }

    /**
     * apitest标记是否代码已提交
     * @return market
     */
    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public CreateVersionTestCaseResponse withDesigner(String designer) {
        this.designer = designer;
        return this;
    }

    /**
     * 设计者
     * @return designer
     */
    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public CreateVersionTestCaseResponse withTags(String tags) {
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

    public CreateVersionTestCaseResponse withExecuteParameter(String executeParameter) {
        this.executeParameter = executeParameter;
        return this;
    }

    /**
     * 执行参数
     * @return executeParameter
     */
    public String getExecuteParameter() {
        return executeParameter;
    }

    public void setExecuteParameter(String executeParameter) {
        this.executeParameter = executeParameter;
    }

    public CreateVersionTestCaseResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 逻辑region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CreateVersionTestCaseResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 处理人id，IteratorTestCase字段
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public CreateVersionTestCaseResponse withLastModifier(String lastModifier) {
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

    public CreateVersionTestCaseResponse withLastModified(OffsetDateTime lastModified) {
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

    public CreateVersionTestCaseResponse withLastModifiedTimestamp(Long lastModifiedTimestamp) {
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

    public CreateVersionTestCaseResponse withLastChangeTime(OffsetDateTime lastChangeTime) {
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

    public CreateVersionTestCaseResponse withVersionUri(String versionUri) {
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

    public CreateVersionTestCaseResponse withOriginUri(String originUri) {
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

    public CreateVersionTestCaseResponse withParentUri(String parentUri) {
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

    public CreateVersionTestCaseResponse withParentPath(String parentPath) {
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

    public CreateVersionTestCaseResponse withCreationVersionUri(String creationVersionUri) {
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

    public CreateVersionTestCaseResponse withCreationDate(OffsetDateTime creationDate) {
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

    public CreateVersionTestCaseResponse withCreationDateTimestamp(Long creationDateTimestamp) {
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

    public CreateVersionTestCaseResponse withAuthorName(String authorName) {
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

    public CreateVersionTestCaseResponse withComment(String comment) {
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

    public CreateVersionTestCaseResponse withNumber(String number) {
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

    public CreateVersionTestCaseResponse withCaseType(Integer caseType) {
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

    public CreateVersionTestCaseResponse withPlatformType(Integer platformType) {
        this.platformType = platformType;
        return this;
    }

    /**
     * 执行平台类型
     * @return platformType
     */
    public Integer getPlatformType() {
        return platformType;
    }

    public void setPlatformType(Integer platformType) {
        this.platformType = platformType;
    }

    public CreateVersionTestCaseResponse withServiceType(Integer serviceType) {
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

    public CreateVersionTestCaseResponse withServiceTypeName(String serviceTypeName) {
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

    public CreateVersionTestCaseResponse withTestType(Integer testType) {
        this.testType = testType;
        return this;
    }

    /**
     * 测试类型
     * @return testType
     */
    public Integer getTestType() {
        return testType;
    }

    public void setTestType(Integer testType) {
        this.testType = testType;
    }

    public CreateVersionTestCaseResponse withTestTypeName(String testTypeName) {
        this.testTypeName = testTypeName;
        return this;
    }

    /**
     * 测试类型名称
     * @return testTypeName
     */
    public String getTestTypeName() {
        return testTypeName;
    }

    public void setTestTypeName(String testTypeName) {
        this.testTypeName = testTypeName;
    }

    public CreateVersionTestCaseResponse withDesignNote(String designNote) {
        this.designNote = designNote;
        return this;
    }

    /**
     * 设计描述
     * @return designNote
     */
    public String getDesignNote() {
        return designNote;
    }

    public void setDesignNote(String designNote) {
        this.designNote = designNote;
    }

    public CreateVersionTestCaseResponse withTestStep(String testStep) {
        this.testStep = testStep;
        return this;
    }

    /**
     * 测试步骤
     * @return testStep
     */
    public String getTestStep() {
        return testStep;
    }

    public void setTestStep(String testStep) {
        this.testStep = testStep;
    }

    public CreateVersionTestCaseResponse withExpectOutput(String expectOutput) {
        this.expectOutput = expectOutput;
        return this;
    }

    /**
     * 期望结果
     * @return expectOutput
     */
    public String getExpectOutput() {
        return expectOutput;
    }

    public void setExpectOutput(String expectOutput) {
        this.expectOutput = expectOutput;
    }

    public CreateVersionTestCaseResponse withEnvType(String envType) {
        this.envType = envType;
        return this;
    }

    /**
     * 测试环境类型
     * @return envType
     */
    public String getEnvType() {
        return envType;
    }

    public void setEnvType(String envType) {
        this.envType = envType;
    }

    public CreateVersionTestCaseResponse withExePlatform(String exePlatform) {
        this.exePlatform = exePlatform;
        return this;
    }

    /**
     * 执行平台
     * @return exePlatform
     */
    public String getExePlatform() {
        return exePlatform;
    }

    public void setExePlatform(String exePlatform) {
        this.exePlatform = exePlatform;
    }

    public CreateVersionTestCaseResponse withTestcaseProject(String testcaseProject) {
        this.testcaseProject = testcaseProject;
        return this;
    }

    /**
     * 测试工程
     * @return testcaseProject
     */
    public String getTestcaseProject() {
        return testcaseProject;
    }

    public void setTestcaseProject(String testcaseProject) {
        this.testcaseProject = testcaseProject;
    }

    public CreateVersionTestCaseResponse withSvnScriptPath(String svnScriptPath) {
        this.svnScriptPath = svnScriptPath;
        return this;
    }

    /**
     * 脚本路径
     * @return svnScriptPath
     */
    public String getSvnScriptPath() {
        return svnScriptPath;
    }

    public void setSvnScriptPath(String svnScriptPath) {
        this.svnScriptPath = svnScriptPath;
    }

    public CreateVersionTestCaseResponse withMapRestrict(String mapRestrict) {
        this.mapRestrict = mapRestrict;
        return this;
    }

    /**
     * 约束条件
     * @return mapRestrict
     */
    public String getMapRestrict() {
        return mapRestrict;
    }

    public void setMapRestrict(String mapRestrict) {
        this.mapRestrict = mapRestrict;
    }

    public CreateVersionTestCaseResponse withNetworkScriptName(String networkScriptName) {
        this.networkScriptName = networkScriptName;
        return this;
    }

    /**
     * 网络脚本名
     * @return networkScriptName
     */
    public String getNetworkScriptName() {
        return networkScriptName;
    }

    public void setNetworkScriptName(String networkScriptName) {
        this.networkScriptName = networkScriptName;
    }

    public CreateVersionTestCaseResponse withAutoType(Integer autoType) {
        this.autoType = autoType;
        return this;
    }

    /**
     * 自动化类型，非自动化:0, 是自动化:1
     * @return autoType
     */
    public Integer getAutoType() {
        return autoType;
    }

    public void setAutoType(Integer autoType) {
        this.autoType = autoType;
    }

    public CreateVersionTestCaseResponse withToBeAutoExec(Integer toBeAutoExec) {
        this.toBeAutoExec = toBeAutoExec;
        return this;
    }

    /**
     * 被自动化执行
     * @return toBeAutoExec
     */
    public Integer getToBeAutoExec() {
        return toBeAutoExec;
    }

    public void setToBeAutoExec(Integer toBeAutoExec) {
        this.toBeAutoExec = toBeAutoExec;
    }

    public CreateVersionTestCaseResponse withLastResult(String lastResult) {
        this.lastResult = lastResult;
        return this;
    }

    /**
     * 最后一次结果
     * @return lastResult
     */
    public String getLastResult() {
        return lastResult;
    }

    public void setLastResult(String lastResult) {
        this.lastResult = lastResult;
    }

    public CreateVersionTestCaseResponse withLastResultUri(String lastResultUri) {
        this.lastResultUri = lastResultUri;
        return this;
    }

    /**
     * 最后一次结果Uri
     * @return lastResultUri
     */
    public String getLastResultUri() {
        return lastResultUri;
    }

    public void setLastResultUri(String lastResultUri) {
        this.lastResultUri = lastResultUri;
    }

    public CreateVersionTestCaseResponse withFeatureUri(String featureUri) {
        this.featureUri = featureUri;
        return this;
    }

    /**
     * 目录Uri
     * @return featureUri
     */
    public String getFeatureUri() {
        return featureUri;
    }

    public void setFeatureUri(String featureUri) {
        this.featureUri = featureUri;
    }

    public CreateVersionTestCaseResponse withFeatureName(String featureName) {
        this.featureName = featureName;
        return this;
    }

    /**
     * 目录名称
     * @return featureName
     */
    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public CreateVersionTestCaseResponse withInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }

    /**
     * 测试接口名
     * @return interfaceName
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public CreateVersionTestCaseResponse withSnpNo(String snpNo) {
        this.snpNo = snpNo;
        return this;
    }

    /**
     * 网络问题ID
     * @return snpNo
     */
    public String getSnpNo() {
        return snpNo;
    }

    public void setSnpNo(String snpNo) {
        this.snpNo = snpNo;
    }

    public CreateVersionTestCaseResponse withDrRelationId(String drRelationId) {
        this.drRelationId = drRelationId;
        return this;
    }

    /**
     * 关联需求编号
     * @return drRelationId
     */
    public String getDrRelationId() {
        return drRelationId;
    }

    public void setDrRelationId(String drRelationId) {
        this.drRelationId = drRelationId;
    }

    public CreateVersionTestCaseResponse withIssueName(String issueName) {
        this.issueName = issueName;
        return this;
    }

    /**
     * 需求名称
     * @return issueName
     */
    public String getIssueName() {
        return issueName;
    }

    public void setIssueName(String issueName) {
        this.issueName = issueName;
    }

    public CreateVersionTestCaseResponse withTestBaseNum(String testBaseNum) {
        this.testBaseNum = testBaseNum;
        return this;
    }

    /**
     * 测试基数
     * @return testBaseNum
     */
    public String getTestBaseNum() {
        return testBaseNum;
    }

    public void setTestBaseNum(String testBaseNum) {
        this.testBaseNum = testBaseNum;
    }

    public CreateVersionTestCaseResponse withAutomaticallyExecuted(Integer automaticallyExecuted) {
        this.automaticallyExecuted = automaticallyExecuted;
        return this;
    }

    /**
     * 是否被自动化执行
     * @return automaticallyExecuted
     */
    public Integer getAutomaticallyExecuted() {
        return automaticallyExecuted;
    }

    public void setAutomaticallyExecuted(Integer automaticallyExecuted) {
        this.automaticallyExecuted = automaticallyExecuted;
    }

    public CreateVersionTestCaseResponse withFirstExecuteTime(OffsetDateTime firstExecuteTime) {
        this.firstExecuteTime = firstExecuteTime;
        return this;
    }

    /**
     * 第一次执行时间
     * @return firstExecuteTime
     */
    public OffsetDateTime getFirstExecuteTime() {
        return firstExecuteTime;
    }

    public void setFirstExecuteTime(OffsetDateTime firstExecuteTime) {
        this.firstExecuteTime = firstExecuteTime;
    }

    public CreateVersionTestCaseResponse withDetectType(String detectType) {
        this.detectType = detectType;
        return this;
    }

    /**
     * 检测类型
     * @return detectType
     */
    public String getDetectType() {
        return detectType;
    }

    public void setDetectType(String detectType) {
        this.detectType = detectType;
    }

    public CreateVersionTestCaseResponse withExecuteParam(String executeParam) {
        this.executeParam = executeParam;
        return this;
    }

    /**
     * 执行参数
     * @return executeParam
     */
    public String getExecuteParam() {
        return executeParam;
    }

    public void setExecuteParam(String executeParam) {
        this.executeParam = executeParam;
    }

    public CreateVersionTestCaseResponse withTestFeature(String testFeature) {
        this.testFeature = testFeature;
        return this;
    }

    /**
     * 分析领域
     * @return testFeature
     */
    public String getTestFeature() {
        return testFeature;
    }

    public void setTestFeature(String testFeature) {
        this.testFeature = testFeature;
    }

    public CreateVersionTestCaseResponse withIsContractTestcase(Integer isContractTestcase) {
        this.isContractTestcase = isContractTestcase;
        return this;
    }

    /**
     * 是否是契约用例，0:表示非契约用例, 1：表示契约用例
     * @return isContractTestcase
     */
    public Integer getIsContractTestcase() {
        return isContractTestcase;
    }

    public void setIsContractTestcase(Integer isContractTestcase) {
        this.isContractTestcase = isContractTestcase;
    }

    public CreateVersionTestCaseResponse withTimeCost(Double timeCost) {
        this.timeCost = timeCost;
        return this;
    }

    /**
     * 总共耗时
     * @return timeCost
     */
    public Double getTimeCost() {
        return timeCost;
    }

    public void setTimeCost(Double timeCost) {
        this.timeCost = timeCost;
    }

    public CreateVersionTestCaseResponse withBeAutoTypeTime(OffsetDateTime beAutoTypeTime) {
        this.beAutoTypeTime = beAutoTypeTime;
        return this;
    }

    /**
     * 记录用例由非自动化变为自动化类型的时间
     * @return beAutoTypeTime
     */
    public OffsetDateTime getBeAutoTypeTime() {
        return beAutoTypeTime;
    }

    public void setBeAutoTypeTime(OffsetDateTime beAutoTypeTime) {
        this.beAutoTypeTime = beAutoTypeTime;
    }

    public CreateVersionTestCaseResponse withCompareNumber(String compareNumber) {
        this.compareNumber = compareNumber;
        return this;
    }

    /**
     * 配对用例编号
     * @return compareNumber
     */
    public String getCompareNumber() {
        return compareNumber;
    }

    public void setCompareNumber(String compareNumber) {
        this.compareNumber = compareNumber;
    }

    public CreateVersionTestCaseResponse withSceneFlag(String sceneFlag) {
        this.sceneFlag = sceneFlag;
        return this;
    }

    /**
     * 场景标识
     * @return sceneFlag
     */
    public String getSceneFlag() {
        return sceneFlag;
    }

    public void setSceneFlag(String sceneFlag) {
        this.sceneFlag = sceneFlag;
    }

    public CreateVersionTestCaseResponse withBaseFlag(String baseFlag) {
        this.baseFlag = baseFlag;
        return this;
    }

    /**
     * 场景标识
     * @return baseFlag
     */
    public String getBaseFlag() {
        return baseFlag;
    }

    public void setBaseFlag(String baseFlag) {
        this.baseFlag = baseFlag;
    }

    public CreateVersionTestCaseResponse withParaValidator(String paraValidator) {
        this.paraValidator = paraValidator;
        return this;
    }

    /**
     * 区别是否从yaml中生成的用例，默认false
     * @return paraValidator
     */
    public String getParaValidator() {
        return paraValidator;
    }

    public void setParaValidator(String paraValidator) {
        this.paraValidator = paraValidator;
    }

    public CreateVersionTestCaseResponse withKnetNodeId(String knetNodeId) {
        this.knetNodeId = knetNodeId;
        return this;
    }

    /**
     * knet节点id
     * @return knetNodeId
     */
    public String getKnetNodeId() {
        return knetNodeId;
    }

    public void setKnetNodeId(String knetNodeId) {
        this.knetNodeId = knetNodeId;
    }

    public CreateVersionTestCaseResponse withLastExeAuthor(String lastExeAuthor) {
        this.lastExeAuthor = lastExeAuthor;
        return this;
    }

    /**
     * 最后一次执行用户
     * @return lastExeAuthor
     */
    public String getLastExeAuthor() {
        return lastExeAuthor;
    }

    public void setLastExeAuthor(String lastExeAuthor) {
        this.lastExeAuthor = lastExeAuthor;
    }

    public CreateVersionTestCaseResponse withCloudCarrier(String cloudCarrier) {
        this.cloudCarrier = cloudCarrier;
        return this;
    }

    /**
     * 运营商
     * @return cloudCarrier
     */
    public String getCloudCarrier() {
        return cloudCarrier;
    }

    public void setCloudCarrier(String cloudCarrier) {
        this.cloudCarrier = cloudCarrier;
    }

    public CreateVersionTestCaseResponse withMarketPlace(String marketPlace) {
        this.marketPlace = marketPlace;
        return this;
    }

    /**
     * 应用市场
     * @return marketPlace
     */
    public String getMarketPlace() {
        return marketPlace;
    }

    public void setMarketPlace(String marketPlace) {
        this.marketPlace = marketPlace;
    }

    public CreateVersionTestCaseResponse withTestMindId(String testMindId) {
        this.testMindId = testMindId;
        return this;
    }

    /**
     * 脑图id
     * @return testMindId
     */
    public String getTestMindId() {
        return testMindId;
    }

    public void setTestMindId(String testMindId) {
        this.testMindId = testMindId;
    }

    public CreateVersionTestCaseResponse withTestMindUrl(String testMindUrl) {
        this.testMindUrl = testMindUrl;
        return this;
    }

    /**
     * 脑图url
     * @return testMindUrl
     */
    public String getTestMindUrl() {
        return testMindUrl;
    }

    public void setTestMindUrl(String testMindUrl) {
        this.testMindUrl = testMindUrl;
    }

    public CreateVersionTestCaseResponse withCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
        return this;
    }

    /**
     * git提交url
     * @return commitUrl
     */
    public String getCommitUrl() {
        return commitUrl;
    }

    public void setCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
    }

    public CreateVersionTestCaseResponse withTestPatternNumber(String testPatternNumber) {
        this.testPatternNumber = testPatternNumber;
        return this;
    }

    /**
     * 测试模式编号
     * @return testPatternNumber
     */
    public String getTestPatternNumber() {
        return testPatternNumber;
    }

    public void setTestPatternNumber(String testPatternNumber) {
        this.testPatternNumber = testPatternNumber;
    }

    public CreateVersionTestCaseResponse withTestFactorNumber(String testFactorNumber) {
        this.testFactorNumber = testFactorNumber;
        return this;
    }

    /**
     * 测试因子编号
     * @return testFactorNumber
     */
    public String getTestFactorNumber() {
        return testFactorNumber;
    }

    public void setTestFactorNumber(String testFactorNumber) {
        this.testFactorNumber = testFactorNumber;
    }

    public CreateVersionTestCaseResponse withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 状态Code
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public CreateVersionTestCaseResponse withResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * 结果Code
     * @return resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public CreateVersionTestCaseResponse withReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }

    /**
     * 迭代ID
     * @return releaseId
     */
    public String getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(String releaseId) {
        this.releaseId = releaseId;
    }

    public CreateVersionTestCaseResponse withLabelId(String labelId) {
        this.labelId = labelId;
        return this;
    }

    /**
     * 标签ID
     * @return labelId
     */
    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }

    public CreateVersionTestCaseResponse withLabels(String labels) {
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

    public CreateVersionTestCaseResponse withModuleId(String moduleId) {
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

    public CreateVersionTestCaseResponse withModuleName(String moduleName) {
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

    public CreateVersionTestCaseResponse withModulePath(String modulePath) {
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

    public CreateVersionTestCaseResponse withModulePathName(String modulePathName) {
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

    public CreateVersionTestCaseResponse withExecuteLatestTime(OffsetDateTime executeLatestTime) {
        this.executeLatestTime = executeLatestTime;
        return this;
    }

    /**
     * 最后执行时间
     * @return executeLatestTime
     */
    public OffsetDateTime getExecuteLatestTime() {
        return executeLatestTime;
    }

    public void setExecuteLatestTime(OffsetDateTime executeLatestTime) {
        this.executeLatestTime = executeLatestTime;
    }

    public CreateVersionTestCaseResponse withExecuteDuration(String executeDuration) {
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

    public CreateVersionTestCaseResponse withExecuteTimes(Integer executeTimes) {
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

    public CreateVersionTestCaseResponse withIsKeyword(Integer isKeyword) {
        this.isKeyword = isKeyword;
        return this;
    }

    /**
     * 是否关键用例
     * @return isKeyword
     */
    public Integer getIsKeyword() {
        return isKeyword;
    }

    public void setIsKeyword(Integer isKeyword) {
        this.isKeyword = isKeyword;
    }

    public CreateVersionTestCaseResponse withReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
        return this;
    }

    /**
     * 测试版本号
     * @return releaseDev
     */
    public String getReleaseDev() {
        return releaseDev;
    }

    public void setReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
    }

    public CreateVersionTestCaseResponse withNewCreated(String newCreated) {
        this.newCreated = newCreated;
        return this;
    }

    /**
     * 是否用户新增用例
     * @return newCreated
     */
    public String getNewCreated() {
        return newCreated;
    }

    public void setNewCreated(String newCreated) {
        this.newCreated = newCreated;
    }

    public CreateVersionTestCaseResponse withProjectUuid(String projectUuid) {
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

    public CreateVersionTestCaseResponse withCreationVersionName(String creationVersionName) {
        this.creationVersionName = creationVersionName;
        return this;
    }

    /**
     * 创建版本名称，原逻辑marshall添加字段
     * @return creationVersionName
     */
    public String getCreationVersionName() {
        return creationVersionName;
    }

    public void setCreationVersionName(String creationVersionName) {
        this.creationVersionName = creationVersionName;
    }

    public CreateVersionTestCaseResponse withFeaturePath(String featurePath) {
        this.featurePath = featurePath;
        return this;
    }

    /**
     * 特性路径，原逻辑marshall添加字段
     * @return featurePath
     */
    public String getFeaturePath() {
        return featurePath;
    }

    public void setFeaturePath(String featurePath) {
        this.featurePath = featurePath;
    }

    public CreateVersionTestCaseResponse withTestcaseUri(String testcaseUri) {
        this.testcaseUri = testcaseUri;
        return this;
    }

    /**
     * 实体用例Uri，IteratorTestCase字段
     * @return testcaseUri
     */
    public String getTestcaseUri() {
        return testcaseUri;
    }

    public void setTestcaseUri(String testcaseUri) {
        this.testcaseUri = testcaseUri;
    }

    public CreateVersionTestCaseResponse withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
     * 处理人名称
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public CreateVersionTestCaseResponse withIteratorCaseUri(String iteratorCaseUri) {
        this.iteratorCaseUri = iteratorCaseUri;
        return this;
    }

    /**
     * 迭代用例Uri，IteratorTestCase字段
     * @return iteratorCaseUri
     */
    public String getIteratorCaseUri() {
        return iteratorCaseUri;
    }

    public void setIteratorCaseUri(String iteratorCaseUri) {
        this.iteratorCaseUri = iteratorCaseUri;
    }

    public CreateVersionTestCaseResponse withScriptLink(String scriptLink) {
        this.scriptLink = scriptLink;
        return this;
    }

    /**
     * 脚本链接scriptLink
     * @return scriptLink
     */
    public String getScriptLink() {
        return scriptLink;
    }

    public void setScriptLink(String scriptLink) {
        this.scriptLink = scriptLink;
    }

    public CreateVersionTestCaseResponse withCustomField1(String customField1) {
        this.customField1 = customField1;
        return this;
    }

    /**
     * 自定义字段1
     * @return customField1
     */
    public String getCustomField1() {
        return customField1;
    }

    public void setCustomField1(String customField1) {
        this.customField1 = customField1;
    }

    public CreateVersionTestCaseResponse withCustomField2(String customField2) {
        this.customField2 = customField2;
        return this;
    }

    /**
     * 自定义字段2
     * @return customField2
     */
    public String getCustomField2() {
        return customField2;
    }

    public void setCustomField2(String customField2) {
        this.customField2 = customField2;
    }

    public CreateVersionTestCaseResponse withCustomField3(String customField3) {
        this.customField3 = customField3;
        return this;
    }

    /**
     * 自定义字段3
     * @return customField3
     */
    public String getCustomField3() {
        return customField3;
    }

    public void setCustomField3(String customField3) {
        this.customField3 = customField3;
    }

    public CreateVersionTestCaseResponse withCustomField4(String customField4) {
        this.customField4 = customField4;
        return this;
    }

    /**
     * 自定义字段4
     * @return customField4
     */
    public String getCustomField4() {
        return customField4;
    }

    public void setCustomField4(String customField4) {
        this.customField4 = customField4;
    }

    public CreateVersionTestCaseResponse withCustomField5(String customField5) {
        this.customField5 = customField5;
        return this;
    }

    /**
     * 自定义字段5
     * @return customField5
     */
    public String getCustomField5() {
        return customField5;
    }

    public void setCustomField5(String customField5) {
        this.customField5 = customField5;
    }

    public CreateVersionTestCaseResponse withCustomField6(String customField6) {
        this.customField6 = customField6;
        return this;
    }

    /**
     * 自定义字段6
     * @return customField6
     */
    public String getCustomField6() {
        return customField6;
    }

    public void setCustomField6(String customField6) {
        this.customField6 = customField6;
    }

    public CreateVersionTestCaseResponse withCustomField7(String customField7) {
        this.customField7 = customField7;
        return this;
    }

    /**
     * 自定义字段7
     * @return customField7
     */
    public String getCustomField7() {
        return customField7;
    }

    public void setCustomField7(String customField7) {
        this.customField7 = customField7;
    }

    public CreateVersionTestCaseResponse withCustomField8(String customField8) {
        this.customField8 = customField8;
        return this;
    }

    /**
     * 自定义字段8
     * @return customField8
     */
    public String getCustomField8() {
        return customField8;
    }

    public void setCustomField8(String customField8) {
        this.customField8 = customField8;
    }

    public CreateVersionTestCaseResponse withCustomField9(String customField9) {
        this.customField9 = customField9;
        return this;
    }

    /**
     * 自定义字段9
     * @return customField9
     */
    public String getCustomField9() {
        return customField9;
    }

    public void setCustomField9(String customField9) {
        this.customField9 = customField9;
    }

    public CreateVersionTestCaseResponse withCustomField10(String customField10) {
        this.customField10 = customField10;
        return this;
    }

    /**
     * 自定义字段10
     * @return customField10
     */
    public String getCustomField10() {
        return customField10;
    }

    public void setCustomField10(String customField10) {
        this.customField10 = customField10;
    }

    public CreateVersionTestCaseResponse withCustomField11(String customField11) {
        this.customField11 = customField11;
        return this;
    }

    /**
     * 自定义字段11
     * @return customField11
     */
    public String getCustomField11() {
        return customField11;
    }

    public void setCustomField11(String customField11) {
        this.customField11 = customField11;
    }

    public CreateVersionTestCaseResponse withCustomField12(String customField12) {
        this.customField12 = customField12;
        return this;
    }

    /**
     * 自定义字段12
     * @return customField12
     */
    public String getCustomField12() {
        return customField12;
    }

    public void setCustomField12(String customField12) {
        this.customField12 = customField12;
    }

    public CreateVersionTestCaseResponse withCustomField13(String customField13) {
        this.customField13 = customField13;
        return this;
    }

    /**
     * 自定义字段13
     * @return customField13
     */
    public String getCustomField13() {
        return customField13;
    }

    public void setCustomField13(String customField13) {
        this.customField13 = customField13;
    }

    public CreateVersionTestCaseResponse withCustomField14(String customField14) {
        this.customField14 = customField14;
        return this;
    }

    /**
     * 自定义字段14
     * @return customField14
     */
    public String getCustomField14() {
        return customField14;
    }

    public void setCustomField14(String customField14) {
        this.customField14 = customField14;
    }

    public CreateVersionTestCaseResponse withCustomField15(String customField15) {
        this.customField15 = customField15;
        return this;
    }

    /**
     * 自定义字段15
     * @return customField15
     */
    public String getCustomField15() {
        return customField15;
    }

    public void setCustomField15(String customField15) {
        this.customField15 = customField15;
    }

    public CreateVersionTestCaseResponse withCustomField16(String customField16) {
        this.customField16 = customField16;
        return this;
    }

    /**
     * 自定义字段16
     * @return customField16
     */
    public String getCustomField16() {
        return customField16;
    }

    public void setCustomField16(String customField16) {
        this.customField16 = customField16;
    }

    public CreateVersionTestCaseResponse withCustomField17(String customField17) {
        this.customField17 = customField17;
        return this;
    }

    /**
     * 自定义字段17
     * @return customField17
     */
    public String getCustomField17() {
        return customField17;
    }

    public void setCustomField17(String customField17) {
        this.customField17 = customField17;
    }

    public CreateVersionTestCaseResponse withCustomField18(String customField18) {
        this.customField18 = customField18;
        return this;
    }

    /**
     * 自定义字段18
     * @return customField18
     */
    public String getCustomField18() {
        return customField18;
    }

    public void setCustomField18(String customField18) {
        this.customField18 = customField18;
    }

    public CreateVersionTestCaseResponse withCustomField19(String customField19) {
        this.customField19 = customField19;
        return this;
    }

    /**
     * 自定义字段19
     * @return customField19
     */
    public String getCustomField19() {
        return customField19;
    }

    public void setCustomField19(String customField19) {
        this.customField19 = customField19;
    }

    public CreateVersionTestCaseResponse withCustomField20(String customField20) {
        this.customField20 = customField20;
        return this;
    }

    /**
     * 自定义字段20
     * @return customField20
     */
    public String getCustomField20() {
        return customField20;
    }

    public void setCustomField20(String customField20) {
        this.customField20 = customField20;
    }

    public CreateVersionTestCaseResponse withCustomField21(String customField21) {
        this.customField21 = customField21;
        return this;
    }

    /**
     * 自定义字段21
     * @return customField21
     */
    public String getCustomField21() {
        return customField21;
    }

    public void setCustomField21(String customField21) {
        this.customField21 = customField21;
    }

    public CreateVersionTestCaseResponse withCustomField22(String customField22) {
        this.customField22 = customField22;
        return this;
    }

    /**
     * 自定义字段22
     * @return customField22
     */
    public String getCustomField22() {
        return customField22;
    }

    public void setCustomField22(String customField22) {
        this.customField22 = customField22;
    }

    public CreateVersionTestCaseResponse withCustomField23(String customField23) {
        this.customField23 = customField23;
        return this;
    }

    /**
     * 自定义字段23
     * @return customField23
     */
    public String getCustomField23() {
        return customField23;
    }

    public void setCustomField23(String customField23) {
        this.customField23 = customField23;
    }

    public CreateVersionTestCaseResponse withCustomField24(String customField24) {
        this.customField24 = customField24;
        return this;
    }

    /**
     * 自定义字段24
     * @return customField24
     */
    public String getCustomField24() {
        return customField24;
    }

    public void setCustomField24(String customField24) {
        this.customField24 = customField24;
    }

    public CreateVersionTestCaseResponse withCustomField25(String customField25) {
        this.customField25 = customField25;
        return this;
    }

    /**
     * 自定义字段25
     * @return customField25
     */
    public String getCustomField25() {
        return customField25;
    }

    public void setCustomField25(String customField25) {
        this.customField25 = customField25;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVersionTestCaseResponse that = (CreateVersionTestCaseResponse) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.type, that.type)
            && Objects.equals(this.author, that.author) && Objects.equals(this.name, that.name)
            && Objects.equals(this.rank, that.rank) && Objects.equals(this.preparation, that.preparation)
            && Objects.equals(this.remark, that.remark) && Objects.equals(this.stage, that.stage)
            && Objects.equals(this.activity, that.activity) && Objects.equals(this.keywords, that.keywords)
            && Objects.equals(this.market, that.market) && Objects.equals(this.designer, that.designer)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.executeParameter, that.executeParameter)
            && Objects.equals(this.region, that.region) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.lastModifier, that.lastModifier)
            && Objects.equals(this.lastModified, that.lastModified)
            && Objects.equals(this.lastModifiedTimestamp, that.lastModifiedTimestamp)
            && Objects.equals(this.lastChangeTime, that.lastChangeTime)
            && Objects.equals(this.versionUri, that.versionUri) && Objects.equals(this.originUri, that.originUri)
            && Objects.equals(this.parentUri, that.parentUri) && Objects.equals(this.parentPath, that.parentPath)
            && Objects.equals(this.creationVersionUri, that.creationVersionUri)
            && Objects.equals(this.creationDate, that.creationDate)
            && Objects.equals(this.creationDateTimestamp, that.creationDateTimestamp)
            && Objects.equals(this.authorName, that.authorName) && Objects.equals(this.comment, that.comment)
            && Objects.equals(this.number, that.number) && Objects.equals(this.caseType, that.caseType)
            && Objects.equals(this.platformType, that.platformType)
            && Objects.equals(this.serviceType, that.serviceType)
            && Objects.equals(this.serviceTypeName, that.serviceTypeName)
            && Objects.equals(this.testType, that.testType) && Objects.equals(this.testTypeName, that.testTypeName)
            && Objects.equals(this.designNote, that.designNote) && Objects.equals(this.testStep, that.testStep)
            && Objects.equals(this.expectOutput, that.expectOutput) && Objects.equals(this.envType, that.envType)
            && Objects.equals(this.exePlatform, that.exePlatform)
            && Objects.equals(this.testcaseProject, that.testcaseProject)
            && Objects.equals(this.svnScriptPath, that.svnScriptPath)
            && Objects.equals(this.mapRestrict, that.mapRestrict)
            && Objects.equals(this.networkScriptName, that.networkScriptName)
            && Objects.equals(this.autoType, that.autoType) && Objects.equals(this.toBeAutoExec, that.toBeAutoExec)
            && Objects.equals(this.lastResult, that.lastResult)
            && Objects.equals(this.lastResultUri, that.lastResultUri)
            && Objects.equals(this.featureUri, that.featureUri) && Objects.equals(this.featureName, that.featureName)
            && Objects.equals(this.interfaceName, that.interfaceName) && Objects.equals(this.snpNo, that.snpNo)
            && Objects.equals(this.drRelationId, that.drRelationId) && Objects.equals(this.issueName, that.issueName)
            && Objects.equals(this.testBaseNum, that.testBaseNum)
            && Objects.equals(this.automaticallyExecuted, that.automaticallyExecuted)
            && Objects.equals(this.firstExecuteTime, that.firstExecuteTime)
            && Objects.equals(this.detectType, that.detectType) && Objects.equals(this.executeParam, that.executeParam)
            && Objects.equals(this.testFeature, that.testFeature)
            && Objects.equals(this.isContractTestcase, that.isContractTestcase)
            && Objects.equals(this.timeCost, that.timeCost) && Objects.equals(this.beAutoTypeTime, that.beAutoTypeTime)
            && Objects.equals(this.compareNumber, that.compareNumber) && Objects.equals(this.sceneFlag, that.sceneFlag)
            && Objects.equals(this.baseFlag, that.baseFlag) && Objects.equals(this.paraValidator, that.paraValidator)
            && Objects.equals(this.knetNodeId, that.knetNodeId)
            && Objects.equals(this.lastExeAuthor, that.lastExeAuthor)
            && Objects.equals(this.cloudCarrier, that.cloudCarrier)
            && Objects.equals(this.marketPlace, that.marketPlace) && Objects.equals(this.testMindId, that.testMindId)
            && Objects.equals(this.testMindUrl, that.testMindUrl) && Objects.equals(this.commitUrl, that.commitUrl)
            && Objects.equals(this.testPatternNumber, that.testPatternNumber)
            && Objects.equals(this.testFactorNumber, that.testFactorNumber)
            && Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.resultCode, that.resultCode)
            && Objects.equals(this.releaseId, that.releaseId) && Objects.equals(this.labelId, that.labelId)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.moduleId, that.moduleId)
            && Objects.equals(this.moduleName, that.moduleName) && Objects.equals(this.modulePath, that.modulePath)
            && Objects.equals(this.modulePathName, that.modulePathName)
            && Objects.equals(this.executeLatestTime, that.executeLatestTime)
            && Objects.equals(this.executeDuration, that.executeDuration)
            && Objects.equals(this.executeTimes, that.executeTimes) && Objects.equals(this.isKeyword, that.isKeyword)
            && Objects.equals(this.releaseDev, that.releaseDev) && Objects.equals(this.newCreated, that.newCreated)
            && Objects.equals(this.projectUuid, that.projectUuid)
            && Objects.equals(this.creationVersionName, that.creationVersionName)
            && Objects.equals(this.featurePath, that.featurePath) && Objects.equals(this.testcaseUri, that.testcaseUri)
            && Objects.equals(this.ownerName, that.ownerName)
            && Objects.equals(this.iteratorCaseUri, that.iteratorCaseUri)
            && Objects.equals(this.scriptLink, that.scriptLink) && Objects.equals(this.customField1, that.customField1)
            && Objects.equals(this.customField2, that.customField2)
            && Objects.equals(this.customField3, that.customField3)
            && Objects.equals(this.customField4, that.customField4)
            && Objects.equals(this.customField5, that.customField5)
            && Objects.equals(this.customField6, that.customField6)
            && Objects.equals(this.customField7, that.customField7)
            && Objects.equals(this.customField8, that.customField8)
            && Objects.equals(this.customField9, that.customField9)
            && Objects.equals(this.customField10, that.customField10)
            && Objects.equals(this.customField11, that.customField11)
            && Objects.equals(this.customField12, that.customField12)
            && Objects.equals(this.customField13, that.customField13)
            && Objects.equals(this.customField14, that.customField14)
            && Objects.equals(this.customField15, that.customField15)
            && Objects.equals(this.customField16, that.customField16)
            && Objects.equals(this.customField17, that.customField17)
            && Objects.equals(this.customField18, that.customField18)
            && Objects.equals(this.customField19, that.customField19)
            && Objects.equals(this.customField20, that.customField20)
            && Objects.equals(this.customField21, that.customField21)
            && Objects.equals(this.customField22, that.customField22)
            && Objects.equals(this.customField23, that.customField23)
            && Objects.equals(this.customField24, that.customField24)
            && Objects.equals(this.customField25, that.customField25);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri,
            type,
            author,
            name,
            rank,
            preparation,
            remark,
            stage,
            activity,
            keywords,
            market,
            designer,
            tags,
            executeParameter,
            region,
            owner,
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
            caseType,
            platformType,
            serviceType,
            serviceTypeName,
            testType,
            testTypeName,
            designNote,
            testStep,
            expectOutput,
            envType,
            exePlatform,
            testcaseProject,
            svnScriptPath,
            mapRestrict,
            networkScriptName,
            autoType,
            toBeAutoExec,
            lastResult,
            lastResultUri,
            featureUri,
            featureName,
            interfaceName,
            snpNo,
            drRelationId,
            issueName,
            testBaseNum,
            automaticallyExecuted,
            firstExecuteTime,
            detectType,
            executeParam,
            testFeature,
            isContractTestcase,
            timeCost,
            beAutoTypeTime,
            compareNumber,
            sceneFlag,
            baseFlag,
            paraValidator,
            knetNodeId,
            lastExeAuthor,
            cloudCarrier,
            marketPlace,
            testMindId,
            testMindUrl,
            commitUrl,
            testPatternNumber,
            testFactorNumber,
            statusCode,
            resultCode,
            releaseId,
            labelId,
            labels,
            moduleId,
            moduleName,
            modulePath,
            modulePathName,
            executeLatestTime,
            executeDuration,
            executeTimes,
            isKeyword,
            releaseDev,
            newCreated,
            projectUuid,
            creationVersionName,
            featurePath,
            testcaseUri,
            ownerName,
            iteratorCaseUri,
            scriptLink,
            customField1,
            customField2,
            customField3,
            customField4,
            customField5,
            customField6,
            customField7,
            customField8,
            customField9,
            customField10,
            customField11,
            customField12,
            customField13,
            customField14,
            customField15,
            customField16,
            customField17,
            customField18,
            customField19,
            customField20,
            customField21,
            customField22,
            customField23,
            customField24,
            customField25);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVersionTestCaseResponse {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
        sb.append("    preparation: ").append(toIndentedString(preparation)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    market: ").append(toIndentedString(market)).append("\n");
        sb.append("    designer: ").append(toIndentedString(designer)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    executeParameter: ").append(toIndentedString(executeParameter)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
        sb.append("    caseType: ").append(toIndentedString(caseType)).append("\n");
        sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("    serviceTypeName: ").append(toIndentedString(serviceTypeName)).append("\n");
        sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
        sb.append("    testTypeName: ").append(toIndentedString(testTypeName)).append("\n");
        sb.append("    designNote: ").append(toIndentedString(designNote)).append("\n");
        sb.append("    testStep: ").append(toIndentedString(testStep)).append("\n");
        sb.append("    expectOutput: ").append(toIndentedString(expectOutput)).append("\n");
        sb.append("    envType: ").append(toIndentedString(envType)).append("\n");
        sb.append("    exePlatform: ").append(toIndentedString(exePlatform)).append("\n");
        sb.append("    testcaseProject: ").append(toIndentedString(testcaseProject)).append("\n");
        sb.append("    svnScriptPath: ").append(toIndentedString(svnScriptPath)).append("\n");
        sb.append("    mapRestrict: ").append(toIndentedString(mapRestrict)).append("\n");
        sb.append("    networkScriptName: ").append(toIndentedString(networkScriptName)).append("\n");
        sb.append("    autoType: ").append(toIndentedString(autoType)).append("\n");
        sb.append("    toBeAutoExec: ").append(toIndentedString(toBeAutoExec)).append("\n");
        sb.append("    lastResult: ").append(toIndentedString(lastResult)).append("\n");
        sb.append("    lastResultUri: ").append(toIndentedString(lastResultUri)).append("\n");
        sb.append("    featureUri: ").append(toIndentedString(featureUri)).append("\n");
        sb.append("    featureName: ").append(toIndentedString(featureName)).append("\n");
        sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
        sb.append("    snpNo: ").append(toIndentedString(snpNo)).append("\n");
        sb.append("    drRelationId: ").append(toIndentedString(drRelationId)).append("\n");
        sb.append("    issueName: ").append(toIndentedString(issueName)).append("\n");
        sb.append("    testBaseNum: ").append(toIndentedString(testBaseNum)).append("\n");
        sb.append("    automaticallyExecuted: ").append(toIndentedString(automaticallyExecuted)).append("\n");
        sb.append("    firstExecuteTime: ").append(toIndentedString(firstExecuteTime)).append("\n");
        sb.append("    detectType: ").append(toIndentedString(detectType)).append("\n");
        sb.append("    executeParam: ").append(toIndentedString(executeParam)).append("\n");
        sb.append("    testFeature: ").append(toIndentedString(testFeature)).append("\n");
        sb.append("    isContractTestcase: ").append(toIndentedString(isContractTestcase)).append("\n");
        sb.append("    timeCost: ").append(toIndentedString(timeCost)).append("\n");
        sb.append("    beAutoTypeTime: ").append(toIndentedString(beAutoTypeTime)).append("\n");
        sb.append("    compareNumber: ").append(toIndentedString(compareNumber)).append("\n");
        sb.append("    sceneFlag: ").append(toIndentedString(sceneFlag)).append("\n");
        sb.append("    baseFlag: ").append(toIndentedString(baseFlag)).append("\n");
        sb.append("    paraValidator: ").append(toIndentedString(paraValidator)).append("\n");
        sb.append("    knetNodeId: ").append(toIndentedString(knetNodeId)).append("\n");
        sb.append("    lastExeAuthor: ").append(toIndentedString(lastExeAuthor)).append("\n");
        sb.append("    cloudCarrier: ").append(toIndentedString(cloudCarrier)).append("\n");
        sb.append("    marketPlace: ").append(toIndentedString(marketPlace)).append("\n");
        sb.append("    testMindId: ").append(toIndentedString(testMindId)).append("\n");
        sb.append("    testMindUrl: ").append(toIndentedString(testMindUrl)).append("\n");
        sb.append("    commitUrl: ").append(toIndentedString(commitUrl)).append("\n");
        sb.append("    testPatternNumber: ").append(toIndentedString(testPatternNumber)).append("\n");
        sb.append("    testFactorNumber: ").append(toIndentedString(testFactorNumber)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
        sb.append("    releaseId: ").append(toIndentedString(releaseId)).append("\n");
        sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    moduleId: ").append(toIndentedString(moduleId)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    modulePath: ").append(toIndentedString(modulePath)).append("\n");
        sb.append("    modulePathName: ").append(toIndentedString(modulePathName)).append("\n");
        sb.append("    executeLatestTime: ").append(toIndentedString(executeLatestTime)).append("\n");
        sb.append("    executeDuration: ").append(toIndentedString(executeDuration)).append("\n");
        sb.append("    executeTimes: ").append(toIndentedString(executeTimes)).append("\n");
        sb.append("    isKeyword: ").append(toIndentedString(isKeyword)).append("\n");
        sb.append("    releaseDev: ").append(toIndentedString(releaseDev)).append("\n");
        sb.append("    newCreated: ").append(toIndentedString(newCreated)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    creationVersionName: ").append(toIndentedString(creationVersionName)).append("\n");
        sb.append("    featurePath: ").append(toIndentedString(featurePath)).append("\n");
        sb.append("    testcaseUri: ").append(toIndentedString(testcaseUri)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    iteratorCaseUri: ").append(toIndentedString(iteratorCaseUri)).append("\n");
        sb.append("    scriptLink: ").append(toIndentedString(scriptLink)).append("\n");
        sb.append("    customField1: ").append(toIndentedString(customField1)).append("\n");
        sb.append("    customField2: ").append(toIndentedString(customField2)).append("\n");
        sb.append("    customField3: ").append(toIndentedString(customField3)).append("\n");
        sb.append("    customField4: ").append(toIndentedString(customField4)).append("\n");
        sb.append("    customField5: ").append(toIndentedString(customField5)).append("\n");
        sb.append("    customField6: ").append(toIndentedString(customField6)).append("\n");
        sb.append("    customField7: ").append(toIndentedString(customField7)).append("\n");
        sb.append("    customField8: ").append(toIndentedString(customField8)).append("\n");
        sb.append("    customField9: ").append(toIndentedString(customField9)).append("\n");
        sb.append("    customField10: ").append(toIndentedString(customField10)).append("\n");
        sb.append("    customField11: ").append(toIndentedString(customField11)).append("\n");
        sb.append("    customField12: ").append(toIndentedString(customField12)).append("\n");
        sb.append("    customField13: ").append(toIndentedString(customField13)).append("\n");
        sb.append("    customField14: ").append(toIndentedString(customField14)).append("\n");
        sb.append("    customField15: ").append(toIndentedString(customField15)).append("\n");
        sb.append("    customField16: ").append(toIndentedString(customField16)).append("\n");
        sb.append("    customField17: ").append(toIndentedString(customField17)).append("\n");
        sb.append("    customField18: ").append(toIndentedString(customField18)).append("\n");
        sb.append("    customField19: ").append(toIndentedString(customField19)).append("\n");
        sb.append("    customField20: ").append(toIndentedString(customField20)).append("\n");
        sb.append("    customField21: ").append(toIndentedString(customField21)).append("\n");
        sb.append("    customField22: ").append(toIndentedString(customField22)).append("\n");
        sb.append("    customField23: ").append(toIndentedString(customField23)).append("\n");
        sb.append("    customField24: ").append(toIndentedString(customField24)).append("\n");
        sb.append("    customField25: ").append(toIndentedString(customField25)).append("\n");
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
