package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateTestCaseReq
 */
public class CreateTestCaseReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activity_id")

    private String activityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addToPlan")

    private Boolean addToPlan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_cata_list")

    private List<BasicAwCata> awCataList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aw_instance")

    private CaseAwInstance awInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_type")

    private Integer caseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_variable_list")

    private List<AwVariable> caseVariableList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "demoFlag")

    private String demoFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errorStep")

    private List<Integer> errorStep = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "import_info_list")

    private List<String> importInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isKeyWord")

    private Integer isKeyWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSync")

    private Boolean isSync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issueId")

    private String issueId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_tmss_case_uri")

    private String oldTmssCaseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_tmss_case_uri_list")

    private List<String> oldTmssCaseUriList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "planId")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "releaseDev")

    private String releaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_name")

    private String scriptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_path")

    private String scriptPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sourceWay")

    private String sourceWay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_tmss_case_uri")

    private String srcTmssCaseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tmss_case_uri")

    private String tmssCaseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tmss_feature_uri")

    private String tmssFeatureUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tmss_property")

    private TmssTestcase tmssProperty;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variableGroupId")

    private String variableGroupId;

    public CreateTestCaseReq withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    /**
     * 活动id
     * @return activityId
     */
    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public CreateTestCaseReq withAddToPlan(Boolean addToPlan) {
        this.addToPlan = addToPlan;
        return this;
    }

    /**
     * 是否添加到计划
     * @return addToPlan
     */
    public Boolean getAddToPlan() {
        return addToPlan;
    }

    public void setAddToPlan(Boolean addToPlan) {
        this.addToPlan = addToPlan;
    }

    public CreateTestCaseReq withAwCataList(List<BasicAwCata> awCataList) {
        this.awCataList = awCataList;
        return this;
    }

    public CreateTestCaseReq addAwCataListItem(BasicAwCata awCataListItem) {
        if (this.awCataList == null) {
            this.awCataList = new ArrayList<>();
        }
        this.awCataList.add(awCataListItem);
        return this;
    }

    public CreateTestCaseReq withAwCataList(Consumer<List<BasicAwCata>> awCataListSetter) {
        if (this.awCataList == null) {
            this.awCataList = new ArrayList<>();
        }
        awCataListSetter.accept(this.awCataList);
        return this;
    }

    /**
     * 创建时可选择导入的aw目录直接产生测试步骤
     * @return awCataList
     */
    public List<BasicAwCata> getAwCataList() {
        return awCataList;
    }

    public void setAwCataList(List<BasicAwCata> awCataList) {
        this.awCataList = awCataList;
    }

    public CreateTestCaseReq withAwInstance(CaseAwInstance awInstance) {
        this.awInstance = awInstance;
        return this;
    }

    public CreateTestCaseReq withAwInstance(Consumer<CaseAwInstance> awInstanceSetter) {
        if (this.awInstance == null) {
            this.awInstance = new CaseAwInstance();
            awInstanceSetter.accept(this.awInstance);
        }

        return this;
    }

    /**
     * Get awInstance
     * @return awInstance
     */
    public CaseAwInstance getAwInstance() {
        return awInstance;
    }

    public void setAwInstance(CaseAwInstance awInstance) {
        this.awInstance = awInstance;
    }

    public CreateTestCaseReq withCaseType(Integer caseType) {
        this.caseType = caseType;
        return this;
    }

    /**
     * 用例类型：0商用现有类型，1从内部导过来的用例类型
     * @return caseType
     */
    public Integer getCaseType() {
        return caseType;
    }

    public void setCaseType(Integer caseType) {
        this.caseType = caseType;
    }

    public CreateTestCaseReq withCaseVariableList(List<AwVariable> caseVariableList) {
        this.caseVariableList = caseVariableList;
        return this;
    }

    public CreateTestCaseReq addCaseVariableListItem(AwVariable caseVariableListItem) {
        if (this.caseVariableList == null) {
            this.caseVariableList = new ArrayList<>();
        }
        this.caseVariableList.add(caseVariableListItem);
        return this;
    }

    public CreateTestCaseReq withCaseVariableList(Consumer<List<AwVariable>> caseVariableListSetter) {
        if (this.caseVariableList == null) {
            this.caseVariableList = new ArrayList<>();
        }
        caseVariableListSetter.accept(this.caseVariableList);
        return this;
    }

    /**
     * 用例局部变量
     * @return caseVariableList
     */
    public List<AwVariable> getCaseVariableList() {
        return caseVariableList;
    }

    public void setCaseVariableList(List<AwVariable> caseVariableList) {
        this.caseVariableList = caseVariableList;
    }

    public CreateTestCaseReq withDemoFlag(String demoFlag) {
        this.demoFlag = demoFlag;
        return this;
    }

    /**
     * 演示标志
     * @return demoFlag
     */
    public String getDemoFlag() {
        return demoFlag;
    }

    public void setDemoFlag(String demoFlag) {
        this.demoFlag = demoFlag;
    }

    public CreateTestCaseReq withErrorStep(List<Integer> errorStep) {
        this.errorStep = errorStep;
        return this;
    }

    public CreateTestCaseReq addErrorStepItem(Integer errorStepItem) {
        if (this.errorStep == null) {
            this.errorStep = new ArrayList<>();
        }
        this.errorStep.add(errorStepItem);
        return this;
    }

    public CreateTestCaseReq withErrorStep(Consumer<List<Integer>> errorStepSetter) {
        if (this.errorStep == null) {
            this.errorStep = new ArrayList<>();
        }
        errorStepSetter.accept(this.errorStep);
        return this;
    }

    /**
     * 错误测试阶段
     * @return errorStep
     */
    public List<Integer> getErrorStep() {
        return errorStep;
    }

    public void setErrorStep(List<Integer> errorStep) {
        this.errorStep = errorStep;
    }

    public CreateTestCaseReq withId(String id) {
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

    public CreateTestCaseReq withImportInfoList(List<String> importInfoList) {
        this.importInfoList = importInfoList;
        return this;
    }

    public CreateTestCaseReq addImportInfoListItem(String importInfoListItem) {
        if (this.importInfoList == null) {
            this.importInfoList = new ArrayList<>();
        }
        this.importInfoList.add(importInfoListItem);
        return this;
    }

    public CreateTestCaseReq withImportInfoList(Consumer<List<String>> importInfoListSetter) {
        if (this.importInfoList == null) {
            this.importInfoList = new ArrayList<>();
        }
        importInfoListSetter.accept(this.importInfoList);
        return this;
    }

    /**
     * import信息List
     * @return importInfoList
     */
    public List<String> getImportInfoList() {
        return importInfoList;
    }

    public void setImportInfoList(List<String> importInfoList) {
        this.importInfoList = importInfoList;
    }

    public CreateTestCaseReq withIsKeyWord(Integer isKeyWord) {
        this.isKeyWord = isKeyWord;
        return this;
    }

    /**
     * 是否设置为关键字操作
     * @return isKeyWord
     */
    public Integer getIsKeyWord() {
        return isKeyWord;
    }

    public void setIsKeyWord(Integer isKeyWord) {
        this.isKeyWord = isKeyWord;
    }

    public CreateTestCaseReq withIsSync(Boolean isSync) {
        this.isSync = isSync;
        return this;
    }

    /**
     * 是否同步
     * @return isSync
     */
    public Boolean getIsSync() {
        return isSync;
    }

    public void setIsSync(Boolean isSync) {
        this.isSync = isSync;
    }

    public CreateTestCaseReq withIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }

    /**
     * 问题ID
     * @return issueId
     */
    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public CreateTestCaseReq withName(String name) {
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

    public CreateTestCaseReq withOldTmssCaseUri(String oldTmssCaseUri) {
        this.oldTmssCaseUri = oldTmssCaseUri;
        return this;
    }

    /**
     * 被复制用例的tmsscaseuri
     * @return oldTmssCaseUri
     */
    public String getOldTmssCaseUri() {
        return oldTmssCaseUri;
    }

    public void setOldTmssCaseUri(String oldTmssCaseUri) {
        this.oldTmssCaseUri = oldTmssCaseUri;
    }

    public CreateTestCaseReq withOldTmssCaseUriList(List<String> oldTmssCaseUriList) {
        this.oldTmssCaseUriList = oldTmssCaseUriList;
        return this;
    }

    public CreateTestCaseReq addOldTmssCaseUriListItem(String oldTmssCaseUriListItem) {
        if (this.oldTmssCaseUriList == null) {
            this.oldTmssCaseUriList = new ArrayList<>();
        }
        this.oldTmssCaseUriList.add(oldTmssCaseUriListItem);
        return this;
    }

    public CreateTestCaseReq withOldTmssCaseUriList(Consumer<List<String>> oldTmssCaseUriListSetter) {
        if (this.oldTmssCaseUriList == null) {
            this.oldTmssCaseUriList = new ArrayList<>();
        }
        oldTmssCaseUriListSetter.accept(this.oldTmssCaseUriList);
        return this;
    }

    /**
     * 被复制用例的tmsscaseuri列表，内部使用
     * @return oldTmssCaseUriList
     */
    public List<String> getOldTmssCaseUriList() {
        return oldTmssCaseUriList;
    }

    public void setOldTmssCaseUriList(List<String> oldTmssCaseUriList) {
        this.oldTmssCaseUriList = oldTmssCaseUriList;
    }

    public CreateTestCaseReq withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * 包名
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public CreateTestCaseReq withPlanId(String planId) {
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

    public CreateTestCaseReq withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 工程ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateTestCaseReq withReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
        return this;
    }

    /**
     * 新服务新建用例版本号
     * @return releaseDev
     */
    public String getReleaseDev() {
        return releaseDev;
    }

    public void setReleaseDev(String releaseDev) {
        this.releaseDev = releaseDev;
    }

    public CreateTestCaseReq withScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }

    /**
     * 脚本名(类名)
     * @return scriptName
     */
    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public CreateTestCaseReq withScriptPath(String scriptPath) {
        this.scriptPath = scriptPath;
        return this;
    }

    /**
     * 脚本路径
     * @return scriptPath
     */
    public String getScriptPath() {
        return scriptPath;
    }

    public void setScriptPath(String scriptPath) {
        this.scriptPath = scriptPath;
    }

    public CreateTestCaseReq withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 来源
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public CreateTestCaseReq withSourceWay(String sourceWay) {
        this.sourceWay = sourceWay;
        return this;
    }

    /**
     * 来源的方式
     * @return sourceWay
     */
    public String getSourceWay() {
        return sourceWay;
    }

    public void setSourceWay(String sourceWay) {
        this.sourceWay = sourceWay;
    }

    public CreateTestCaseReq withSrcTmssCaseUri(String srcTmssCaseUri) {
        this.srcTmssCaseUri = srcTmssCaseUri;
        return this;
    }

    /**
     * 选择用例中测试步骤生成关键字时的原用例tmssCaseUri
     * @return srcTmssCaseUri
     */
    public String getSrcTmssCaseUri() {
        return srcTmssCaseUri;
    }

    public void setSrcTmssCaseUri(String srcTmssCaseUri) {
        this.srcTmssCaseUri = srcTmssCaseUri;
    }

    public CreateTestCaseReq withTmssCaseUri(String tmssCaseUri) {
        this.tmssCaseUri = tmssCaseUri;
        return this;
    }

    /**
     * tmss用例uri
     * @return tmssCaseUri
     */
    public String getTmssCaseUri() {
        return tmssCaseUri;
    }

    public void setTmssCaseUri(String tmssCaseUri) {
        this.tmssCaseUri = tmssCaseUri;
    }

    public CreateTestCaseReq withTmssFeatureUri(String tmssFeatureUri) {
        this.tmssFeatureUri = tmssFeatureUri;
        return this;
    }

    /**
     * tmss用例uri
     * @return tmssFeatureUri
     */
    public String getTmssFeatureUri() {
        return tmssFeatureUri;
    }

    public void setTmssFeatureUri(String tmssFeatureUri) {
        this.tmssFeatureUri = tmssFeatureUri;
    }

    public CreateTestCaseReq withTmssProperty(TmssTestcase tmssProperty) {
        this.tmssProperty = tmssProperty;
        return this;
    }

    public CreateTestCaseReq withTmssProperty(Consumer<TmssTestcase> tmssPropertySetter) {
        if (this.tmssProperty == null) {
            this.tmssProperty = new TmssTestcase();
            tmssPropertySetter.accept(this.tmssProperty);
        }

        return this;
    }

    /**
     * Get tmssProperty
     * @return tmssProperty
     */
    public TmssTestcase getTmssProperty() {
        return tmssProperty;
    }

    public void setTmssProperty(TmssTestcase tmssProperty) {
        this.tmssProperty = tmssProperty;
    }

    public CreateTestCaseReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateTestCaseReq withVariableGroupId(String variableGroupId) {
        this.variableGroupId = variableGroupId;
        return this;
    }

    /**
     * 环境参数分组id
     * @return variableGroupId
     */
    public String getVariableGroupId() {
        return variableGroupId;
    }

    public void setVariableGroupId(String variableGroupId) {
        this.variableGroupId = variableGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTestCaseReq that = (CreateTestCaseReq) obj;
        return Objects.equals(this.activityId, that.activityId) && Objects.equals(this.addToPlan, that.addToPlan)
            && Objects.equals(this.awCataList, that.awCataList) && Objects.equals(this.awInstance, that.awInstance)
            && Objects.equals(this.caseType, that.caseType)
            && Objects.equals(this.caseVariableList, that.caseVariableList)
            && Objects.equals(this.demoFlag, that.demoFlag) && Objects.equals(this.errorStep, that.errorStep)
            && Objects.equals(this.id, that.id) && Objects.equals(this.importInfoList, that.importInfoList)
            && Objects.equals(this.isKeyWord, that.isKeyWord) && Objects.equals(this.isSync, that.isSync)
            && Objects.equals(this.issueId, that.issueId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.oldTmssCaseUri, that.oldTmssCaseUri)
            && Objects.equals(this.oldTmssCaseUriList, that.oldTmssCaseUriList)
            && Objects.equals(this.packageName, that.packageName) && Objects.equals(this.planId, that.planId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.releaseDev, that.releaseDev)
            && Objects.equals(this.scriptName, that.scriptName) && Objects.equals(this.scriptPath, that.scriptPath)
            && Objects.equals(this.source, that.source) && Objects.equals(this.sourceWay, that.sourceWay)
            && Objects.equals(this.srcTmssCaseUri, that.srcTmssCaseUri)
            && Objects.equals(this.tmssCaseUri, that.tmssCaseUri)
            && Objects.equals(this.tmssFeatureUri, that.tmssFeatureUri)
            && Objects.equals(this.tmssProperty, that.tmssProperty) && Objects.equals(this.type, that.type)
            && Objects.equals(this.variableGroupId, that.variableGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activityId,
            addToPlan,
            awCataList,
            awInstance,
            caseType,
            caseVariableList,
            demoFlag,
            errorStep,
            id,
            importInfoList,
            isKeyWord,
            isSync,
            issueId,
            name,
            oldTmssCaseUri,
            oldTmssCaseUriList,
            packageName,
            planId,
            projectId,
            releaseDev,
            scriptName,
            scriptPath,
            source,
            sourceWay,
            srcTmssCaseUri,
            tmssCaseUri,
            tmssFeatureUri,
            tmssProperty,
            type,
            variableGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTestCaseReq {\n");
        sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
        sb.append("    addToPlan: ").append(toIndentedString(addToPlan)).append("\n");
        sb.append("    awCataList: ").append(toIndentedString(awCataList)).append("\n");
        sb.append("    awInstance: ").append(toIndentedString(awInstance)).append("\n");
        sb.append("    caseType: ").append(toIndentedString(caseType)).append("\n");
        sb.append("    caseVariableList: ").append(toIndentedString(caseVariableList)).append("\n");
        sb.append("    demoFlag: ").append(toIndentedString(demoFlag)).append("\n");
        sb.append("    errorStep: ").append(toIndentedString(errorStep)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    importInfoList: ").append(toIndentedString(importInfoList)).append("\n");
        sb.append("    isKeyWord: ").append(toIndentedString(isKeyWord)).append("\n");
        sb.append("    isSync: ").append(toIndentedString(isSync)).append("\n");
        sb.append("    issueId: ").append(toIndentedString(issueId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    oldTmssCaseUri: ").append(toIndentedString(oldTmssCaseUri)).append("\n");
        sb.append("    oldTmssCaseUriList: ").append(toIndentedString(oldTmssCaseUriList)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    releaseDev: ").append(toIndentedString(releaseDev)).append("\n");
        sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
        sb.append("    scriptPath: ").append(toIndentedString(scriptPath)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    sourceWay: ").append(toIndentedString(sourceWay)).append("\n");
        sb.append("    srcTmssCaseUri: ").append(toIndentedString(srcTmssCaseUri)).append("\n");
        sb.append("    tmssCaseUri: ").append(toIndentedString(tmssCaseUri)).append("\n");
        sb.append("    tmssFeatureUri: ").append(toIndentedString(tmssFeatureUri)).append("\n");
        sb.append("    tmssProperty: ").append(toIndentedString(tmssProperty)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    variableGroupId: ").append(toIndentedString(variableGroupId)).append("\n");
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
