package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AwInstanceRes
 */
public class AwInstanceRes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias_runaw")

    private String aliasRunaw;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication_info")

    private AuthInfo authenticationInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication_type")

    private String authenticationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_description")

    private String awDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_id")

    private String awId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_type")

    private Integer awType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basic_aw")

    private BasicAwRes basicAw;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body_param_type")

    private String bodyParamType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "by_order")

    private Integer byOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "changeSign")

    private Integer changeSign;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_point_list")

    private List<CheckPoint> checkPointList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<AwInstanceRes> children = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_statement")

    private String conditionStatement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition_type")

    private Integer conditionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_stamp")

    private Long createTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_string")

    private String createTimeString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_header")

    private List<AwParam> customHeader = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_info")

    private ErrorInfo errorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    private ExtraInfo extraInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_outside")

    private Integer fromOutside;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hasLevel")

    private Integer hasLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header_array")

    private List<ArrayNode> headerArray = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "his_script")

    private String hisScript;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_basic")

    private Integer isBasic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_contract_aw")

    private Integer isContractAw;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_disabled")

    private Integer isDisabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_sectest_aw")

    private Integer isSectestAw;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_dependent")

    private String paramDependent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_dependent_enabled")

    private Integer paramDependentEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param_type_and_value")

    private List<AwParam> paramTypeAndValue = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation")

    private String relation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_id")

    private String relationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_type")

    private Integer relationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_interval")

    private String retryInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_times")

    private String retryTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scriptName")

    private String scriptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_and_stage")

    private String serviceAndStage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "special_type")

    private Integer specialType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_stamp")

    private Long updateTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_string")

    private String updateTimeString;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private String updateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_list")

    private List<AwVariable> variableList = null;

    public AwInstanceRes withAliasRunaw(String aliasRunaw) {
        this.aliasRunaw = aliasRunaw;
        return this;
    }

    /**
     * AW内容描述字段
     * @return aliasRunaw
     */
    public String getAliasRunaw() {
        return aliasRunaw;
    }

    public void setAliasRunaw(String aliasRunaw) {
        this.aliasRunaw = aliasRunaw;
    }

    public AwInstanceRes withAuthenticationInfo(AuthInfo authenticationInfo) {
        this.authenticationInfo = authenticationInfo;
        return this;
    }

    public AwInstanceRes withAuthenticationInfo(Consumer<AuthInfo> authenticationInfoSetter) {
        if (this.authenticationInfo == null) {
            this.authenticationInfo = new AuthInfo();
            authenticationInfoSetter.accept(this.authenticationInfo);
        }

        return this;
    }

    /**
     * Get authenticationInfo
     * @return authenticationInfo
     */
    public AuthInfo getAuthenticationInfo() {
        return authenticationInfo;
    }

    public void setAuthenticationInfo(AuthInfo authenticationInfo) {
        this.authenticationInfo = authenticationInfo;
    }

    public AwInstanceRes withAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * 认证类型,0-无认证;1-aksk认证
     * @return authenticationType
     */
    public String getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    public AwInstanceRes withAwDescription(String awDescription) {
        this.awDescription = awDescription;
        return this;
    }

    /**
     * 脚本模板描述信息，在用例更新时添加
     * @return awDescription
     */
    public String getAwDescription() {
        return awDescription;
    }

    public void setAwDescription(String awDescription) {
        this.awDescription = awDescription;
    }

    public AwInstanceRes withAwId(String awId) {
        this.awId = awId;
        return this;
    }

    /**
     * aw id
     * @return awId
     */
    public String getAwId() {
        return awId;
    }

    public void setAwId(String awId) {
        this.awId = awId;
    }

    public AwInstanceRes withAwType(Integer awType) {
        this.awType = awType;
        return this;
    }

    /**
     * aw类型 0-setup;1-test;2-teardown
     * @return awType
     */
    public Integer getAwType() {
        return awType;
    }

    public void setAwType(Integer awType) {
        this.awType = awType;
    }

    public AwInstanceRes withBasicAw(BasicAwRes basicAw) {
        this.basicAw = basicAw;
        return this;
    }

    public AwInstanceRes withBasicAw(Consumer<BasicAwRes> basicAwSetter) {
        if (this.basicAw == null) {
            this.basicAw = new BasicAwRes();
            basicAwSetter.accept(this.basicAw);
        }

        return this;
    }

    /**
     * Get basicAw
     * @return basicAw
     */
    public BasicAwRes getBasicAw() {
        return basicAw;
    }

    public void setBasicAw(BasicAwRes basicAw) {
        this.basicAw = basicAw;
    }

    public AwInstanceRes withBodyParamType(String bodyParamType) {
        this.bodyParamType = bodyParamType;
        return this;
    }

    /**
     * instance的参数body体类型：form/text
     * @return bodyParamType
     */
    public String getBodyParamType() {
        return bodyParamType;
    }

    public void setBodyParamType(String bodyParamType) {
        this.bodyParamType = bodyParamType;
    }

    public AwInstanceRes withByOrder(Integer byOrder) {
        this.byOrder = byOrder;
        return this;
    }

    /**
     * 顺序
     * @return byOrder
     */
    public Integer getByOrder() {
        return byOrder;
    }

    public void setByOrder(Integer byOrder) {
        this.byOrder = byOrder;
    }

    public AwInstanceRes withChangeSign(Integer changeSign) {
        this.changeSign = changeSign;
        return this;
    }

    /**
     * change sign
     * @return changeSign
     */
    public Integer getChangeSign() {
        return changeSign;
    }

    public void setChangeSign(Integer changeSign) {
        this.changeSign = changeSign;
    }

    public AwInstanceRes withCheckPointList(List<CheckPoint> checkPointList) {
        this.checkPointList = checkPointList;
        return this;
    }

    public AwInstanceRes addCheckPointListItem(CheckPoint checkPointListItem) {
        if (this.checkPointList == null) {
            this.checkPointList = new ArrayList<>();
        }
        this.checkPointList.add(checkPointListItem);
        return this;
    }

    public AwInstanceRes withCheckPointList(Consumer<List<CheckPoint>> checkPointListSetter) {
        if (this.checkPointList == null) {
            this.checkPointList = new ArrayList<>();
        }
        checkPointListSetter.accept(this.checkPointList);
        return this;
    }

    /**
     * 检查点List
     * @return checkPointList
     */
    public List<CheckPoint> getCheckPointList() {
        return checkPointList;
    }

    public void setCheckPointList(List<CheckPoint> checkPointList) {
        this.checkPointList = checkPointList;
    }

    public AwInstanceRes withChildren(List<AwInstanceRes> children) {
        this.children = children;
        return this;
    }

    public AwInstanceRes addChildrenItem(AwInstanceRes childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public AwInstanceRes withChildren(Consumer<List<AwInstanceRes>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * aw实例
     * @return children
     */
    public List<AwInstanceRes> getChildren() {
        return children;
    }

    public void setChildren(List<AwInstanceRes> children) {
        this.children = children;
    }

    public AwInstanceRes withConditionStatement(String conditionStatement) {
        this.conditionStatement = conditionStatement;
        return this;
    }

    /**
     * 条件语句
     * @return conditionStatement
     */
    public String getConditionStatement() {
        return conditionStatement;
    }

    public void setConditionStatement(String conditionStatement) {
        this.conditionStatement = conditionStatement;
    }

    public AwInstanceRes withConditionType(Integer conditionType) {
        this.conditionType = conditionType;
        return this;
    }

    /**
     * 条件类型 0-not condition;1-if begin;2-if
     * @return conditionType
     */
    public Integer getConditionType() {
        return conditionType;
    }

    public void setConditionType(Integer conditionType) {
        this.conditionType = conditionType;
    }

    public AwInstanceRes withCreateTime(String createTime) {
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

    public AwInstanceRes withCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }

    /**
     * 创建时间戳
     * @return createTimeStamp
     */
    public Long getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }

    public AwInstanceRes withCreateTimeString(String createTimeString) {
        this.createTimeString = createTimeString;
        return this;
    }

    /**
     * 创建时间字符串
     * @return createTimeString
     */
    public String getCreateTimeString() {
        return createTimeString;
    }

    public void setCreateTimeString(String createTimeString) {
        this.createTimeString = createTimeString;
    }

    public AwInstanceRes withCreateUser(String createUser) {
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

    public AwInstanceRes withCustomHeader(List<AwParam> customHeader) {
        this.customHeader = customHeader;
        return this;
    }

    public AwInstanceRes addCustomHeaderItem(AwParam customHeaderItem) {
        if (this.customHeader == null) {
            this.customHeader = new ArrayList<>();
        }
        this.customHeader.add(customHeaderItem);
        return this;
    }

    public AwInstanceRes withCustomHeader(Consumer<List<AwParam>> customHeaderSetter) {
        if (this.customHeader == null) {
            this.customHeader = new ArrayList<>();
        }
        customHeaderSetter.accept(this.customHeader);
        return this;
    }

    /**
     * 测试步骤自定义请求头List；后续自定义URL请求头不再使用该字段
     * @return customHeader
     */
    public List<AwParam> getCustomHeader() {
        return customHeader;
    }

    public void setCustomHeader(List<AwParam> customHeader) {
        this.customHeader = customHeader;
    }

    public AwInstanceRes withDescription(String description) {
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

    public AwInstanceRes withErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    public AwInstanceRes withErrorInfo(Consumer<ErrorInfo> errorInfoSetter) {
        if (this.errorInfo == null) {
            this.errorInfo = new ErrorInfo();
            errorInfoSetter.accept(this.errorInfo);
        }

        return this;
    }

    /**
     * Get errorInfo
     * @return errorInfo
     */
    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    public AwInstanceRes withExtraInfo(ExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    public AwInstanceRes withExtraInfo(Consumer<ExtraInfo> extraInfoSetter) {
        if (this.extraInfo == null) {
            this.extraInfo = new ExtraInfo();
            extraInfoSetter.accept(this.extraInfo);
        }

        return this;
    }

    /**
     * Get extraInfo
     * @return extraInfo
     */
    public ExtraInfo getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(ExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }

    public AwInstanceRes withFromOutside(Integer fromOutside) {
        this.fromOutside = fromOutside;
        return this;
    }

    /**
     * 该aw是否来自外部工程 0-no;1-yes
     * @return fromOutside
     */
    public Integer getFromOutside() {
        return fromOutside;
    }

    public void setFromOutside(Integer fromOutside) {
        this.fromOutside = fromOutside;
    }

    public AwInstanceRes withHasLevel(Integer hasLevel) {
        this.hasLevel = hasLevel;
        return this;
    }

    /**
     * level
     * @return hasLevel
     */
    public Integer getHasLevel() {
        return hasLevel;
    }

    public void setHasLevel(Integer hasLevel) {
        this.hasLevel = hasLevel;
    }

    public AwInstanceRes withHeaderArray(List<ArrayNode> headerArray) {
        this.headerArray = headerArray;
        return this;
    }

    public AwInstanceRes addHeaderArrayItem(ArrayNode headerArrayItem) {
        if (this.headerArray == null) {
            this.headerArray = new ArrayList<>();
        }
        this.headerArray.add(headerArrayItem);
        return this;
    }

    public AwInstanceRes withHeaderArray(Consumer<List<ArrayNode>> headerArraySetter) {
        if (this.headerArray == null) {
            this.headerArray = new ArrayList<>();
        }
        headerArraySetter.accept(this.headerArray);
        return this;
    }

    /**
     * Get headerArray
     * @return headerArray
     */
    public List<ArrayNode> getHeaderArray() {
        return headerArray;
    }

    public void setHeaderArray(List<ArrayNode> headerArray) {
        this.headerArray = headerArray;
    }

    public AwInstanceRes withHisScript(String hisScript) {
        this.hisScript = hisScript;
        return this;
    }

    /**
     * 值不为null表示老的IF判断语句；值为null表示新的IF判断语句
     * @return hisScript
     */
    public String getHisScript() {
        return hisScript;
    }

    public void setHisScript(String hisScript) {
        this.hisScript = hisScript;
    }

    public AwInstanceRes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AwInstanceRes withIsBasic(Integer isBasic) {
        this.isBasic = isBasic;
        return this;
    }

    /**
     * 是否模板类型测试步骤 0：自定义URL配置类型；1：模板类型测试步骤
     * @return isBasic
     */
    public Integer getIsBasic() {
        return isBasic;
    }

    public void setIsBasic(Integer isBasic) {
        this.isBasic = isBasic;
    }

    public AwInstanceRes withIsContractAw(Integer isContractAw) {
        this.isContractAw = isContractAw;
        return this;
    }

    /**
     * 是否是契约AW 0-否；1-yes
     * @return isContractAw
     */
    public Integer getIsContractAw() {
        return isContractAw;
    }

    public void setIsContractAw(Integer isContractAw) {
        this.isContractAw = isContractAw;
    }

    public AwInstanceRes withIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
        return this;
    }

    /**
     * 是否被禁用 0-否；1-yes
     * @return isDisabled
     */
    public Integer getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Integer isDisabled) {
        this.isDisabled = isDisabled;
    }

    public AwInstanceRes withIsSectestAw(Integer isSectestAw) {
        this.isSectestAw = isSectestAw;
        return this;
    }

    /**
     * 是否是安全测试aw
     * @return isSectestAw
     */
    public Integer getIsSectestAw() {
        return isSectestAw;
    }

    public void setIsSectestAw(Integer isSectestAw) {
        this.isSectestAw = isSectestAw;
    }

    public AwInstanceRes withLevel(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * 用例级别
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public AwInstanceRes withName(String name) {
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

    public AwInstanceRes withParamDependent(String paramDependent) {
        this.paramDependent = paramDependent;
        return this;
    }

    /**
     * 参数依赖规则
     * @return paramDependent
     */
    public String getParamDependent() {
        return paramDependent;
    }

    public void setParamDependent(String paramDependent) {
        this.paramDependent = paramDependent;
    }

    public AwInstanceRes withParamDependentEnabled(Integer paramDependentEnabled) {
        this.paramDependentEnabled = paramDependentEnabled;
        return this;
    }

    /**
     * 是否启用参数依赖
     * @return paramDependentEnabled
     */
    public Integer getParamDependentEnabled() {
        return paramDependentEnabled;
    }

    public void setParamDependentEnabled(Integer paramDependentEnabled) {
        this.paramDependentEnabled = paramDependentEnabled;
    }

    public AwInstanceRes withParamTypeAndValue(List<AwParam> paramTypeAndValue) {
        this.paramTypeAndValue = paramTypeAndValue;
        return this;
    }

    public AwInstanceRes addParamTypeAndValueItem(AwParam paramTypeAndValueItem) {
        if (this.paramTypeAndValue == null) {
            this.paramTypeAndValue = new ArrayList<>();
        }
        this.paramTypeAndValue.add(paramTypeAndValueItem);
        return this;
    }

    public AwInstanceRes withParamTypeAndValue(Consumer<List<AwParam>> paramTypeAndValueSetter) {
        if (this.paramTypeAndValue == null) {
            this.paramTypeAndValue = new ArrayList<>();
        }
        paramTypeAndValueSetter.accept(this.paramTypeAndValue);
        return this;
    }

    /**
     * 参数类型和参数值对应List
     * @return paramTypeAndValue
     */
    public List<AwParam> getParamTypeAndValue() {
        return paramTypeAndValue;
    }

    public void setParamTypeAndValue(List<AwParam> paramTypeAndValue) {
        this.paramTypeAndValue = paramTypeAndValue;
    }

    public AwInstanceRes withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * awinstance所在的用例\\逻辑用例\\组合aw所属项目,该字段是新增字段,因此部分awinstance是无值的,所以只可写该值,而不能读取该值
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public AwInstanceRes withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域名称
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public AwInstanceRes withRelation(String relation) {
        this.relation = relation;
        return this;
    }

    /**
     * awId层级关系
     * @return relation
     */
    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public AwInstanceRes withRelationId(String relationId) {
        this.relationId = relationId;
        return this;
    }

    /**
     * relation id
     * @return relationId
     */
    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public AwInstanceRes withRelationType(Integer relationType) {
        this.relationType = relationType;
        return this;
    }

    /**
     * 映射类型 1-反向删除映射;2-用例自动添加的方向删除步骤
     * @return relationType
     */
    public Integer getRelationType() {
        return relationType;
    }

    public void setRelationType(Integer relationType) {
        this.relationType = relationType;
    }

    public AwInstanceRes withRetryInterval(String retryInterval) {
        this.retryInterval = retryInterval;
        return this;
    }

    /**
     * 重试间隔时间 (ms) 为空表示不等待
     * @return retryInterval
     */
    public String getRetryInterval() {
        return retryInterval;
    }

    public void setRetryInterval(String retryInterval) {
        this.retryInterval = retryInterval;
    }

    public AwInstanceRes withRetryTimes(String retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }

    /**
     * 重试次数
     * @return retryTimes
     */
    public String getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(String retryTimes) {
        this.retryTimes = retryTimes;
    }

    public AwInstanceRes withScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }

    /**
     * 获取脚本生成时，要使用的步骤名称
     * @return scriptName
     */
    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public AwInstanceRes withServiceAndStage(String serviceAndStage) {
        this.serviceAndStage = serviceAndStage;
        return this;
    }

    /**
     * aw所来自工程的服务名和阶段名 fromOutside为1时该值有效
     * @return serviceAndStage
     */
    public String getServiceAndStage() {
        return serviceAndStage;
    }

    public void setServiceAndStage(String serviceAndStage) {
        this.serviceAndStage = serviceAndStage;
    }

    public AwInstanceRes withSpecialType(Integer specialType) {
        this.specialType = specialType;
        return this;
    }

    /**
     * 测试步骤来源
     * @return specialType
     */
    public Integer getSpecialType() {
        return specialType;
    }

    public void setSpecialType(Integer specialType) {
        this.specialType = specialType;
    }

    public AwInstanceRes withUpdateTime(String updateTime) {
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

    public AwInstanceRes withUpdateTimeStamp(Long updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
        return this;
    }

    /**
     * 更新时间戳
     * @return updateTimeStamp
     */
    public Long getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    public void setUpdateTimeStamp(Long updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
    }

    public AwInstanceRes withUpdateTimeString(String updateTimeString) {
        this.updateTimeString = updateTimeString;
        return this;
    }

    /**
     * 更新时间字符串
     * @return updateTimeString
     */
    public String getUpdateTimeString() {
        return updateTimeString;
    }

    public void setUpdateTimeString(String updateTimeString) {
        this.updateTimeString = updateTimeString;
    }

    public AwInstanceRes withUpdateUser(String updateUser) {
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

    public AwInstanceRes withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * user id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public AwInstanceRes withVariableList(List<AwVariable> variableList) {
        this.variableList = variableList;
        return this;
    }

    public AwInstanceRes addVariableListItem(AwVariable variableListItem) {
        if (this.variableList == null) {
            this.variableList = new ArrayList<>();
        }
        this.variableList.add(variableListItem);
        return this;
    }

    public AwInstanceRes withVariableList(Consumer<List<AwVariable>> variableListSetter) {
        if (this.variableList == null) {
            this.variableList = new ArrayList<>();
        }
        variableListSetter.accept(this.variableList);
        return this;
    }

    /**
     * 定义的变量信息
     * @return variableList
     */
    public List<AwVariable> getVariableList() {
        return variableList;
    }

    public void setVariableList(List<AwVariable> variableList) {
        this.variableList = variableList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AwInstanceRes that = (AwInstanceRes) obj;
        return Objects.equals(this.aliasRunaw, that.aliasRunaw)
            && Objects.equals(this.authenticationInfo, that.authenticationInfo)
            && Objects.equals(this.authenticationType, that.authenticationType)
            && Objects.equals(this.awDescription, that.awDescription) && Objects.equals(this.awId, that.awId)
            && Objects.equals(this.awType, that.awType) && Objects.equals(this.basicAw, that.basicAw)
            && Objects.equals(this.bodyParamType, that.bodyParamType) && Objects.equals(this.byOrder, that.byOrder)
            && Objects.equals(this.changeSign, that.changeSign)
            && Objects.equals(this.checkPointList, that.checkPointList) && Objects.equals(this.children, that.children)
            && Objects.equals(this.conditionStatement, that.conditionStatement)
            && Objects.equals(this.conditionType, that.conditionType)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.createTimeStamp, that.createTimeStamp)
            && Objects.equals(this.createTimeString, that.createTimeString)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.customHeader, that.customHeader)
            && Objects.equals(this.description, that.description) && Objects.equals(this.errorInfo, that.errorInfo)
            && Objects.equals(this.extraInfo, that.extraInfo) && Objects.equals(this.fromOutside, that.fromOutside)
            && Objects.equals(this.hasLevel, that.hasLevel) && Objects.equals(this.headerArray, that.headerArray)
            && Objects.equals(this.hisScript, that.hisScript) && Objects.equals(this.id, that.id)
            && Objects.equals(this.isBasic, that.isBasic) && Objects.equals(this.isContractAw, that.isContractAw)
            && Objects.equals(this.isDisabled, that.isDisabled) && Objects.equals(this.isSectestAw, that.isSectestAw)
            && Objects.equals(this.level, that.level) && Objects.equals(this.name, that.name)
            && Objects.equals(this.paramDependent, that.paramDependent)
            && Objects.equals(this.paramDependentEnabled, that.paramDependentEnabled)
            && Objects.equals(this.paramTypeAndValue, that.paramTypeAndValue)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.region, that.region)
            && Objects.equals(this.relation, that.relation) && Objects.equals(this.relationId, that.relationId)
            && Objects.equals(this.relationType, that.relationType)
            && Objects.equals(this.retryInterval, that.retryInterval)
            && Objects.equals(this.retryTimes, that.retryTimes) && Objects.equals(this.scriptName, that.scriptName)
            && Objects.equals(this.serviceAndStage, that.serviceAndStage)
            && Objects.equals(this.specialType, that.specialType) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.updateTimeStamp, that.updateTimeStamp)
            && Objects.equals(this.updateTimeString, that.updateTimeString)
            && Objects.equals(this.updateUser, that.updateUser) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.variableList, that.variableList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aliasRunaw,
            authenticationInfo,
            authenticationType,
            awDescription,
            awId,
            awType,
            basicAw,
            bodyParamType,
            byOrder,
            changeSign,
            checkPointList,
            children,
            conditionStatement,
            conditionType,
            createTime,
            createTimeStamp,
            createTimeString,
            createUser,
            customHeader,
            description,
            errorInfo,
            extraInfo,
            fromOutside,
            hasLevel,
            headerArray,
            hisScript,
            id,
            isBasic,
            isContractAw,
            isDisabled,
            isSectestAw,
            level,
            name,
            paramDependent,
            paramDependentEnabled,
            paramTypeAndValue,
            projectId,
            region,
            relation,
            relationId,
            relationType,
            retryInterval,
            retryTimes,
            scriptName,
            serviceAndStage,
            specialType,
            updateTime,
            updateTimeStamp,
            updateTimeString,
            updateUser,
            userId,
            variableList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AwInstanceRes {\n");
        sb.append("    aliasRunaw: ").append(toIndentedString(aliasRunaw)).append("\n");
        sb.append("    authenticationInfo: ").append(toIndentedString(authenticationInfo)).append("\n");
        sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
        sb.append("    awDescription: ").append(toIndentedString(awDescription)).append("\n");
        sb.append("    awId: ").append(toIndentedString(awId)).append("\n");
        sb.append("    awType: ").append(toIndentedString(awType)).append("\n");
        sb.append("    basicAw: ").append(toIndentedString(basicAw)).append("\n");
        sb.append("    bodyParamType: ").append(toIndentedString(bodyParamType)).append("\n");
        sb.append("    byOrder: ").append(toIndentedString(byOrder)).append("\n");
        sb.append("    changeSign: ").append(toIndentedString(changeSign)).append("\n");
        sb.append("    checkPointList: ").append(toIndentedString(checkPointList)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    conditionStatement: ").append(toIndentedString(conditionStatement)).append("\n");
        sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createTimeStamp: ").append(toIndentedString(createTimeStamp)).append("\n");
        sb.append("    createTimeString: ").append(toIndentedString(createTimeString)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    customHeader: ").append(toIndentedString(customHeader)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
        sb.append("    fromOutside: ").append(toIndentedString(fromOutside)).append("\n");
        sb.append("    hasLevel: ").append(toIndentedString(hasLevel)).append("\n");
        sb.append("    headerArray: ").append(toIndentedString(headerArray)).append("\n");
        sb.append("    hisScript: ").append(toIndentedString(hisScript)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isBasic: ").append(toIndentedString(isBasic)).append("\n");
        sb.append("    isContractAw: ").append(toIndentedString(isContractAw)).append("\n");
        sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
        sb.append("    isSectestAw: ").append(toIndentedString(isSectestAw)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    paramDependent: ").append(toIndentedString(paramDependent)).append("\n");
        sb.append("    paramDependentEnabled: ").append(toIndentedString(paramDependentEnabled)).append("\n");
        sb.append("    paramTypeAndValue: ").append(toIndentedString(paramTypeAndValue)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
        sb.append("    relationId: ").append(toIndentedString(relationId)).append("\n");
        sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
        sb.append("    retryInterval: ").append(toIndentedString(retryInterval)).append("\n");
        sb.append("    retryTimes: ").append(toIndentedString(retryTimes)).append("\n");
        sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
        sb.append("    serviceAndStage: ").append(toIndentedString(serviceAndStage)).append("\n");
        sb.append("    specialType: ").append(toIndentedString(specialType)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateTimeStamp: ").append(toIndentedString(updateTimeStamp)).append("\n");
        sb.append("    updateTimeString: ").append(toIndentedString(updateTimeString)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    variableList: ").append(toIndentedString(variableList)).append("\n");
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
