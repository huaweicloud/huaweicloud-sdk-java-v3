package com.huaweicloud.sdk.codeartscheck.v2.model;

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
    @JsonProperty(value = "resource_pool_id")

    private String resourcePoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sm_level")

    private String smLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type")

    private List<String> checkType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_fossbot")

    private Boolean enableFossbot;

    public CreateTaskRequestV2 withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * **参数解释：** 代码仓地址。 **约束限制：** 不涉及。 **取值范围：** repo仓传以git开头的地址；非repo仓传以http开头的地址。 **默认取值：** 不涉及。
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
     * **参数解释：** 计划创建任务的对应代码仓的分支。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
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
     * **参数解释：** 启用的检查语言，数组格式，支持的语言请关注服务更新特性文档。 **约束限制：** 与rule_sets 2选1使用。
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
     * **参数解释：** 启用的规则集，数组格式，当只传语言，不传规则集ID时，与language参数等效，启用这些语言在项目下的默认规则集，支持的语言请关注服务更新特性文档。 **约束限制：** 与language 2选1使用。
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
     * **参数解释：** 任务类型。 **约束限制：** 不涉及。 **取值范围：** - full：代码仓分支对应的全量任务。 - inc：MR增量任务。 **默认取值：** full
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
     * **参数解释：** 用户名，与access_token联合使用，用于在创建三方仓时，由Check服务创建1个通用git扩展点，从而保存代码仓信息。 **约束限制：** username、access_token组合与endpoint_id 2选1使用。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
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
     * **参数解释：** 密码或访问密钥/令牌，username，用于在创建三方仓时，由Check服务创建1个通用git扩展点，从而保存代码仓信息。 **约束限制：** username、access_token组合与endpoint_id 2选1使用。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
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
     * **参数解释：** 用户预先创建的项目下的代码源扩展点ID，保存了代码仓信息。创建第三方代码源任务，若未填写endpoint，会自动创建扩展点，需要账号有创建扩展点权限，且项目下扩展点未达到上限。 **约束限制：** username、access_token组合与endpoint_id 2选1使用。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
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

    public CreateTaskRequestV2 withResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
        return this;
    }

    /**
     * **参数解释：** 用户购买的资源池ID，创建任务时如传此参数，任务将使用对应资源池进行检查。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return resourcePoolId
     */
    public String getResourcePoolId() {
        return resourcePoolId;
    }

    public void setResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
    }

    public CreateTaskRequestV2 withSmLevel(String smLevel) {
        this.smLevel = smLevel;
        return this;
    }

    /**
     * **参数解释：** [密级ID,可见信息密级的ID，从页面接口GET https://{endpoint}/projects/v1/options的响应参数中获取，其中的code值即为密级ID。](tag:hcs_sm,hcs_sitesm)[该参数暂无业务意义，传0即可。](tag:fcs) **约束限制：** [租户开启密级功能后必传。](tag:hcs_sm,hcs_sitesm)[不涉及。](tag:fcs) **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return smLevel
     */
    public String getSmLevel() {
        return smLevel;
    }

    public void setSmLevel(String smLevel) {
        this.smLevel = smLevel;
    }

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
     * **参数解释：** 废弃参数
     * @return checkType
     */
    public List<String> getCheckType() {
        return checkType;
    }

    public void setCheckType(List<String> checkType) {
        this.checkType = checkType;
    }

    public CreateTaskRequestV2 withEnableFossbot(Boolean enableFossbot) {
        this.enableFossbot = enableFossbot;
        return this;
    }

    /**
     * **参数解释：** 废弃参数
     * @return enableFossbot
     */
    public Boolean getEnableFossbot() {
        return enableFossbot;
    }

    public void setEnableFossbot(Boolean enableFossbot) {
        this.enableFossbot = enableFossbot;
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
        return Objects.equals(this.gitUrl, that.gitUrl) && Objects.equals(this.gitBranch, that.gitBranch)
            && Objects.equals(this.language, that.language) && Objects.equals(this.ruleSets, that.ruleSets)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.username, that.username)
            && Objects.equals(this.accessToken, that.accessToken) && Objects.equals(this.endpointId, that.endpointId)
            && Objects.equals(this.incConfig, that.incConfig)
            && Objects.equals(this.resourcePoolId, that.resourcePoolId) && Objects.equals(this.smLevel, that.smLevel)
            && Objects.equals(this.checkType, that.checkType) && Objects.equals(this.enableFossbot, that.enableFossbot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gitUrl,
            gitBranch,
            language,
            ruleSets,
            taskType,
            username,
            accessToken,
            endpointId,
            incConfig,
            resourcePoolId,
            smLevel,
            checkType,
            enableFossbot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTaskRequestV2 {\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    gitBranch: ").append(toIndentedString(gitBranch)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    ruleSets: ").append(toIndentedString(ruleSets)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    incConfig: ").append(toIndentedString(incConfig)).append("\n");
        sb.append("    resourcePoolId: ").append(toIndentedString(resourcePoolId)).append("\n");
        sb.append("    smLevel: ").append(toIndentedString(smLevel)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    enableFossbot: ").append(toIndentedString(enableFossbot)).append("\n");
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
