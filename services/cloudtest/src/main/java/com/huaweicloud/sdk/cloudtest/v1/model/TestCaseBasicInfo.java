package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TestCaseBasicInfo
 */
public class TestCaseBasicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_template")

    private AlertTemplate alertTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "caseType")

    private Integer caseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_type")

    private String executorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_forbidden")

    private Boolean isForbidden;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_update_time")

    private Long projectUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scriptProjectName")

    private String scriptProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private Integer state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "svn_script_path")

    private String svnScriptPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tmssVersionUri")

    private String tmssVersionUri;

    public TestCaseBasicInfo withAlertTemplate(AlertTemplate alertTemplate) {
        this.alertTemplate = alertTemplate;
        return this;
    }

    public TestCaseBasicInfo withAlertTemplate(Consumer<AlertTemplate> alertTemplateSetter) {
        if (this.alertTemplate == null) {
            this.alertTemplate = new AlertTemplate();
            alertTemplateSetter.accept(this.alertTemplate);
        }

        return this;
    }

    /**
     * Get alertTemplate
     * @return alertTemplate
     */
    public AlertTemplate getAlertTemplate() {
        return alertTemplate;
    }

    public void setAlertTemplate(AlertTemplate alertTemplate) {
        this.alertTemplate = alertTemplate;
    }

    public TestCaseBasicInfo withCaseType(Integer caseType) {
        this.caseType = caseType;
        return this;
    }

    /**
     * tmss用例类型
     * @return caseType
     */
    public Integer getCaseType() {
        return caseType;
    }

    public void setCaseType(Integer caseType) {
        this.caseType = caseType;
    }

    public TestCaseBasicInfo withExecutorType(String executorType) {
        this.executorType = executorType;
        return this;
    }

    /**
     * 执行机类型
     * @return executorType
     */
    public String getExecutorType() {
        return executorType;
    }

    public void setExecutorType(String executorType) {
        this.executorType = executorType;
    }

    public TestCaseBasicInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用例id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TestCaseBasicInfo withIsForbidden(Boolean isForbidden) {
        this.isForbidden = isForbidden;
        return this;
    }

    /**
     * 是否收藏
     * @return isForbidden
     */
    public Boolean getIsForbidden() {
        return isForbidden;
    }

    public void setIsForbidden(Boolean isForbidden) {
        this.isForbidden = isForbidden;
    }

    public TestCaseBasicInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用例id
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestCaseBasicInfo withNumber(String number) {
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

    public TestCaseBasicInfo withProjectUpdateTime(Long projectUpdateTime) {
        this.projectUpdateTime = projectUpdateTime;
        return this;
    }

    /**
     * 用例包更新时间
     * @return projectUpdateTime
     */
    public Long getProjectUpdateTime() {
        return projectUpdateTime;
    }

    public void setProjectUpdateTime(Long projectUpdateTime) {
        this.projectUpdateTime = projectUpdateTime;
    }

    public TestCaseBasicInfo withScriptProjectName(String scriptProjectName) {
        this.scriptProjectName = scriptProjectName;
        return this;
    }

    /**
     * 用例包名
     * @return scriptProjectName
     */
    public String getScriptProjectName() {
        return scriptProjectName;
    }

    public void setScriptProjectName(String scriptProjectName) {
        this.scriptProjectName = scriptProjectName;
    }

    public TestCaseBasicInfo withState(Integer state) {
        this.state = state;
        return this;
    }

    /**
     * 用例状态
     * @return state
     */
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public TestCaseBasicInfo withSvnScriptPath(String svnScriptPath) {
        this.svnScriptPath = svnScriptPath;
        return this;
    }

    /**
     * svn脚本路径
     * @return svnScriptPath
     */
    public String getSvnScriptPath() {
        return svnScriptPath;
    }

    public void setSvnScriptPath(String svnScriptPath) {
        this.svnScriptPath = svnScriptPath;
    }

    public TestCaseBasicInfo withTmssVersionUri(String tmssVersionUri) {
        this.tmssVersionUri = tmssVersionUri;
        return this;
    }

    /**
     * tmss版本地址
     * @return tmssVersionUri
     */
    public String getTmssVersionUri() {
        return tmssVersionUri;
    }

    public void setTmssVersionUri(String tmssVersionUri) {
        this.tmssVersionUri = tmssVersionUri;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TestCaseBasicInfo that = (TestCaseBasicInfo) obj;
        return Objects.equals(this.alertTemplate, that.alertTemplate) && Objects.equals(this.caseType, that.caseType)
            && Objects.equals(this.executorType, that.executorType) && Objects.equals(this.id, that.id)
            && Objects.equals(this.isForbidden, that.isForbidden) && Objects.equals(this.name, that.name)
            && Objects.equals(this.number, that.number)
            && Objects.equals(this.projectUpdateTime, that.projectUpdateTime)
            && Objects.equals(this.scriptProjectName, that.scriptProjectName) && Objects.equals(this.state, that.state)
            && Objects.equals(this.svnScriptPath, that.svnScriptPath)
            && Objects.equals(this.tmssVersionUri, that.tmssVersionUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertTemplate,
            caseType,
            executorType,
            id,
            isForbidden,
            name,
            number,
            projectUpdateTime,
            scriptProjectName,
            state,
            svnScriptPath,
            tmssVersionUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestCaseBasicInfo {\n");
        sb.append("    alertTemplate: ").append(toIndentedString(alertTemplate)).append("\n");
        sb.append("    caseType: ").append(toIndentedString(caseType)).append("\n");
        sb.append("    executorType: ").append(toIndentedString(executorType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isForbidden: ").append(toIndentedString(isForbidden)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    projectUpdateTime: ").append(toIndentedString(projectUpdateTime)).append("\n");
        sb.append("    scriptProjectName: ").append(toIndentedString(scriptProjectName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    svnScriptPath: ").append(toIndentedString(svnScriptPath)).append("\n");
        sb.append("    tmssVersionUri: ").append(toIndentedString(tmssVersionUri)).append("\n");
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
