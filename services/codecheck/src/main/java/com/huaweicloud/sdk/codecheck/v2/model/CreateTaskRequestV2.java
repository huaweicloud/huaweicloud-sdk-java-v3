package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateTaskRequestV2
 */
public class CreateTaskRequestV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type")

    private List<String> checkType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_url")

    private String gitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_branch")

    private String gitBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private List<String> language = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_sets")

    private List<RuleSetV2> ruleSets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_token")

    private String accessToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inc_config")

    private IncConfigV2 incConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_fossbot")

    private Boolean enableFossbot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_pool_id")

    private String resourcePoolId;

    public CreateTaskRequestV2 withCheckType(List<String> checkType) {
        this.checkType = checkType;
        return this;
    }

    public CreateTaskRequestV2 addCheckTypeItem(String checkTypeItem) {
        if (this.checkType == null) {
            this.checkType = new ArrayList<>();
        }
        this.checkType.add(checkTypeItem);
        return this;
    }

    public CreateTaskRequestV2 withCheckType(Consumer<List<String>> checkTypeSetter) {
        if (this.checkType == null) {
            this.checkType = new ArrayList<>();
        }
        checkTypeSetter.accept(this.checkType);
        return this;
    }

    /**
     * 检查类型，数组格式，默认为source
     * @return checkType
     */
    public List<String> getCheckType() {
        return checkType;
    }

    public void setCheckType(List<String> checkType) {
        this.checkType = checkType;
    }

    public CreateTaskRequestV2 withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * 仓库地址
     * @return gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public CreateTaskRequestV2 withGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
        return this;
    }

    /**
     * 仓库分支
     * @return gitBranch
     */
    public String getGitBranch() {
        return gitBranch;
    }

    public void setGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
    }

    public CreateTaskRequestV2 withLanguage(List<String> language) {
        this.language = language;
        return this;
    }

    public CreateTaskRequestV2 addLanguageItem(String languageItem) {
        if (this.language == null) {
            this.language = new ArrayList<>();
        }
        this.language.add(languageItem);
        return this;
    }

    public CreateTaskRequestV2 withLanguage(Consumer<List<String>> languageSetter) {
        if (this.language == null) {
            this.language = new ArrayList<>();
        }
        languageSetter.accept(this.language);
        return this;
    }

    /**
     * 检查语言，数组格式，支持cpp,java,js,python,php,css,html,go,typescript,csharp
     * @return language
     */
    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public CreateTaskRequestV2 withRuleSets(List<RuleSetV2> ruleSets) {
        this.ruleSets = ruleSets;
        return this;
    }

    public CreateTaskRequestV2 addRuleSetsItem(RuleSetV2 ruleSetsItem) {
        if (this.ruleSets == null) {
            this.ruleSets = new ArrayList<>();
        }
        this.ruleSets.add(ruleSetsItem);
        return this;
    }

    public CreateTaskRequestV2 withRuleSets(Consumer<List<RuleSetV2>> ruleSetsSetter) {
        if (this.ruleSets == null) {
            this.ruleSets = new ArrayList<>();
        }
        ruleSetsSetter.accept(this.ruleSets);
        return this;
    }

    /**
     * 指定规则集
     * @return ruleSets
     */
    public List<RuleSetV2> getRuleSets() {
        return ruleSets;
    }

    public void setRuleSets(List<RuleSetV2> ruleSets) {
        this.ruleSets = ruleSets;
    }

    public CreateTaskRequestV2 withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 检查类型，支持full/inc两种类型，full表示全量检查，inc表示mr检查
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public CreateTaskRequestV2 withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 仓库有权限的用户名
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public CreateTaskRequestV2 withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * 仓库有权限的用户token
     * @return accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public CreateTaskRequestV2 withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * 仓库有权限的用户endpointId
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public CreateTaskRequestV2 withIncConfig(IncConfigV2 incConfig) {
        this.incConfig = incConfig;
        return this;
    }

    public CreateTaskRequestV2 withIncConfig(Consumer<IncConfigV2> incConfigSetter) {
        if (this.incConfig == null) {
            this.incConfig = new IncConfigV2();
            incConfigSetter.accept(this.incConfig);
        }

        return this;
    }

    /**
     * Get incConfig
     * @return incConfig
     */
    public IncConfigV2 getIncConfig() {
        return incConfig;
    }

    public void setIncConfig(IncConfigV2 incConfig) {
        this.incConfig = incConfig;
    }

    public CreateTaskRequestV2 withEnableFossbot(Boolean enableFossbot) {
        this.enableFossbot = enableFossbot;
        return this;
    }

    /**
     * 是否打开fossbot检查,默认不开
     * @return enableFossbot
     */
    public Boolean getEnableFossbot() {
        return enableFossbot;
    }

    public void setEnableFossbot(Boolean enableFossbot) {
        this.enableFossbot = enableFossbot;
    }

    public CreateTaskRequestV2 withResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
        return this;
    }

    /**
     * 资源池id，可以从资源池管理页面获取
     * @return resourcePoolId
     */
    public String getResourcePoolId() {
        return resourcePoolId;
    }

    public void setResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTaskRequestV2 that = (CreateTaskRequestV2) obj;
        return Objects.equals(this.checkType, that.checkType) && Objects.equals(this.gitUrl, that.gitUrl)
            && Objects.equals(this.gitBranch, that.gitBranch) && Objects.equals(this.language, that.language)
            && Objects.equals(this.ruleSets, that.ruleSets) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.username, that.username) && Objects.equals(this.accessToken, that.accessToken)
            && Objects.equals(this.endpointId, that.endpointId) && Objects.equals(this.incConfig, that.incConfig)
            && Objects.equals(this.enableFossbot, that.enableFossbot)
            && Objects.equals(this.resourcePoolId, that.resourcePoolId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkType,
            gitUrl,
            gitBranch,
            language,
            ruleSets,
            taskType,
            username,
            accessToken,
            endpointId,
            incConfig,
            enableFossbot,
            resourcePoolId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTaskRequestV2 {\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    gitBranch: ").append(toIndentedString(gitBranch)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    ruleSets: ").append(toIndentedString(ruleSets)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    incConfig: ").append(toIndentedString(incConfig)).append("\n");
        sb.append("    enableFossbot: ").append(toIndentedString(enableFossbot)).append("\n");
        sb.append("    resourcePoolId: ").append(toIndentedString(resourcePoolId)).append("\n");
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
