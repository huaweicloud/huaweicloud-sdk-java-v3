package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建转发策略请求参数。
 */
public class CreateL7PolicyOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    private String listenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private Integer position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_listener_id")

    private String redirectListenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_pool_id")

    private String redirectPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_url")

    private String redirectUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_url_config")

    private CreateRedirectUrlConfig redirectUrlConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_pools_config")

    private List<CreateRedirectPoolsConfig> redirectPoolsConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_pools_sticky_session_config")

    private CreateRedirectPoolsStickySessionConfig redirectPoolsStickySessionConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_response_config")

    private CreateFixtedResponseConfig fixedResponseConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_pools_extend_config")

    private CreateRedirectPoolsExtendConfig redirectPoolsExtendConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<CreateL7PolicyRuleOption> rules = null;

    public CreateL7PolicyOption withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 参数解释：转发策略的转发动作。  约束限制： - REDIRECT_TO_LISTENER的优先级最高，配置了以后，该监听器下的其他policy会失效。 - 当action为REDIRECT_TO_POOL时， 只支持创建在PROTOCOL为HTTP、HTTPS、TERMINATED_HTTPS的listener上。 - 当action为REDIRECT_TO_LISTENER时，只支持创建在PROTOCOL为HTTP的listener上。  取值范围： - REDIRECT_TO_POOL：转发到后端云服务器组。 - REDIRECT_TO_LISTENER：重定向到监听器。 - REDIRECT_TO_URL：重定向到URL。 - FIXED_RESPONSE：返回固定响应体。  [不支持REDIRECT_TO_URL和FIXED_RESPONSE](tag:hcso_dt)
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public CreateL7PolicyOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 参数解释：转发策略的管理状态。  约束限制：只支持设置为true。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public CreateL7PolicyOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数解释：转发策略描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateL7PolicyOption withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /**
     * 参数解释：转发策略对应的监听器ID。  约束限制： - 当action为REDIRECT_TO_POOL时，只支持创建在PROTOCOL为HTTP或HTTPS的listener上。 - 当action为REDIRECT_TO_LISTENER时，只支持创建在PROTOCOL为HTTP的listener上。
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public CreateL7PolicyOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数解释：转发策略名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateL7PolicyOption withPosition(Integer position) {
        this.position = position;
        return this;
    }

    /**
     * 参数解释：转发策略的优先级。  约束限制：不支持更新。  不支持该字段，请勿使用。
     * minimum: 1
     * maximum: 100
     * @return position
     */
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public CreateL7PolicyOption withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 参数解释：转发策略的优先级。数字越小表示优先级越高。  约束限制： - 同一个监听器下不同转发策略之间不允许重复的优先级数值。 - 当关联的监听器的高级转发策略功能（enhance_l7policy_enable）开启后才会生效，未开启传入该字段会报错。 - 当关联的监听器的高级转发策略功能（enhance_l7policy_enable）未开启，按原有policy的排序逻辑，自动排序。 不同域名优先级独立。相同域名下，按path的compare_type排序， 精确>前缀>正则，匹配类型相同时，path的长度越长优先级越高。 若policy下只有域名rule，没有路径rule，默认path为前缀匹配/。  [- 共享型负载均衡器下的转发策略不支持该字段。](tag:hws,hws_hk,ocb,ctc,g42,tm,cmcc,hk_g42,hws_ocb,hk_vdf,fcs,dt,hk_tm)  取值范围： - 当action为REDIRECT_TO_LISTENER时，支持指定为0-10000。 - 其它action取值，支持指定为1-10000。  默认取值： - 若关联的监听器的高级转发策略功能（enhance_l7policy_enable）未开启，且不传入该字段，则新创建的转发策略的优先级的值为1。 - 当action为REDIRECT_TO_LISTENER时，则新创建的转发策略的优先级的值为0。 - 其它action取值，新创建的转发策略的优先级的值为同一监听器下已有转发策略的优先级的最大值+1。   + 若监听器下没有转发策略，则新建的转发策略的优先级为1。   + 若当前已有转发策略的优先级的最大值是10000，则新创建的转发策略会因超出取值范围10000而失败。此时可通过传入指定priority，或调整原有policy的优先级来避免错误。  [不支持该字段，请勿使用。](tag:hcso_dt)  [荷兰region不支持该字段，请勿使用。](tag:dt,dt_test)
     * minimum: 0
     * maximum: 10000
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public CreateL7PolicyOption withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 参数解释：转发策略所在的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateL7PolicyOption withRedirectListenerId(String redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
        return this;
    }

    /**
     * 参数解释：转发到的listener的ID，当action为REDIRECT_TO_LISTENER时必选。  约束限制： - 只支持protocol为HTTPS/TERMINATED_HTTPS的listener。 - 不能指定为其他loadbalancer下的listener。 - 当action为REDIRECT_TO_POOL时，创建或更新时不能传入该参数。 [- 共享型负载均衡器下的转发策略不支持该字段。](tag:hws,hws_hk,ocb,ctc,g42,tm,cmcc,hk_g42,hws_ocb,hk_vdf,fcs,dt,hk_tm)
     * @return redirectListenerId
     */
    public String getRedirectListenerId() {
        return redirectListenerId;
    }

    public void setRedirectListenerId(String redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
    }

    public CreateL7PolicyOption withRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
        return this;
    }

    /**
     * 参数解释：转发到pool的ID。  约束限制： - 当action为REDIRECT_TO_POOL时生效。 - 当action为REDIRECT_TO_LISTENER时，传入会报错。
     * @return redirectPoolId
     */
    public String getRedirectPoolId() {
        return redirectPoolId;
    }

    public void setRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
    }

    public CreateL7PolicyOption withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    /**
     * 参数解释：转发到的url。  约束限制：必须满足格式: protocol://host:port/path?query。  [不支持该字段，请勿使用。](tag:hcso_dt)
     * @return redirectUrl
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public CreateL7PolicyOption withRedirectUrlConfig(CreateRedirectUrlConfig redirectUrlConfig) {
        this.redirectUrlConfig = redirectUrlConfig;
        return this;
    }

    public CreateL7PolicyOption withRedirectUrlConfig(Consumer<CreateRedirectUrlConfig> redirectUrlConfigSetter) {
        if (this.redirectUrlConfig == null) {
            this.redirectUrlConfig = new CreateRedirectUrlConfig();
            redirectUrlConfigSetter.accept(this.redirectUrlConfig);
        }

        return this;
    }

    /**
     * Get redirectUrlConfig
     * @return redirectUrlConfig
     */
    public CreateRedirectUrlConfig getRedirectUrlConfig() {
        return redirectUrlConfig;
    }

    public void setRedirectUrlConfig(CreateRedirectUrlConfig redirectUrlConfig) {
        this.redirectUrlConfig = redirectUrlConfig;
    }

    public CreateL7PolicyOption withRedirectPoolsConfig(List<CreateRedirectPoolsConfig> redirectPoolsConfig) {
        this.redirectPoolsConfig = redirectPoolsConfig;
        return this;
    }

    public CreateL7PolicyOption addRedirectPoolsConfigItem(CreateRedirectPoolsConfig redirectPoolsConfigItem) {
        if (this.redirectPoolsConfig == null) {
            this.redirectPoolsConfig = new ArrayList<>();
        }
        this.redirectPoolsConfig.add(redirectPoolsConfigItem);
        return this;
    }

    public CreateL7PolicyOption withRedirectPoolsConfig(
        Consumer<List<CreateRedirectPoolsConfig>> redirectPoolsConfigSetter) {
        if (this.redirectPoolsConfig == null) {
            this.redirectPoolsConfig = new ArrayList<>();
        }
        redirectPoolsConfigSetter.accept(this.redirectPoolsConfig);
        return this;
    }

    /**
     * 参数解释：转发到多个主机组列表。  约束限制：一个policy最多配置5个pool。
     * @return redirectPoolsConfig
     */
    public List<CreateRedirectPoolsConfig> getRedirectPoolsConfig() {
        return redirectPoolsConfig;
    }

    public void setRedirectPoolsConfig(List<CreateRedirectPoolsConfig> redirectPoolsConfig) {
        this.redirectPoolsConfig = redirectPoolsConfig;
    }

    public CreateL7PolicyOption withRedirectPoolsStickySessionConfig(
        CreateRedirectPoolsStickySessionConfig redirectPoolsStickySessionConfig) {
        this.redirectPoolsStickySessionConfig = redirectPoolsStickySessionConfig;
        return this;
    }

    public CreateL7PolicyOption withRedirectPoolsStickySessionConfig(
        Consumer<CreateRedirectPoolsStickySessionConfig> redirectPoolsStickySessionConfigSetter) {
        if (this.redirectPoolsStickySessionConfig == null) {
            this.redirectPoolsStickySessionConfig = new CreateRedirectPoolsStickySessionConfig();
            redirectPoolsStickySessionConfigSetter.accept(this.redirectPoolsStickySessionConfig);
        }

        return this;
    }

    /**
     * Get redirectPoolsStickySessionConfig
     * @return redirectPoolsStickySessionConfig
     */
    public CreateRedirectPoolsStickySessionConfig getRedirectPoolsStickySessionConfig() {
        return redirectPoolsStickySessionConfig;
    }

    public void setRedirectPoolsStickySessionConfig(
        CreateRedirectPoolsStickySessionConfig redirectPoolsStickySessionConfig) {
        this.redirectPoolsStickySessionConfig = redirectPoolsStickySessionConfig;
    }

    public CreateL7PolicyOption withFixedResponseConfig(CreateFixtedResponseConfig fixedResponseConfig) {
        this.fixedResponseConfig = fixedResponseConfig;
        return this;
    }

    public CreateL7PolicyOption withFixedResponseConfig(
        Consumer<CreateFixtedResponseConfig> fixedResponseConfigSetter) {
        if (this.fixedResponseConfig == null) {
            this.fixedResponseConfig = new CreateFixtedResponseConfig();
            fixedResponseConfigSetter.accept(this.fixedResponseConfig);
        }

        return this;
    }

    /**
     * Get fixedResponseConfig
     * @return fixedResponseConfig
     */
    public CreateFixtedResponseConfig getFixedResponseConfig() {
        return fixedResponseConfig;
    }

    public void setFixedResponseConfig(CreateFixtedResponseConfig fixedResponseConfig) {
        this.fixedResponseConfig = fixedResponseConfig;
    }

    public CreateL7PolicyOption withRedirectPoolsExtendConfig(
        CreateRedirectPoolsExtendConfig redirectPoolsExtendConfig) {
        this.redirectPoolsExtendConfig = redirectPoolsExtendConfig;
        return this;
    }

    public CreateL7PolicyOption withRedirectPoolsExtendConfig(
        Consumer<CreateRedirectPoolsExtendConfig> redirectPoolsExtendConfigSetter) {
        if (this.redirectPoolsExtendConfig == null) {
            this.redirectPoolsExtendConfig = new CreateRedirectPoolsExtendConfig();
            redirectPoolsExtendConfigSetter.accept(this.redirectPoolsExtendConfig);
        }

        return this;
    }

    /**
     * Get redirectPoolsExtendConfig
     * @return redirectPoolsExtendConfig
     */
    public CreateRedirectPoolsExtendConfig getRedirectPoolsExtendConfig() {
        return redirectPoolsExtendConfig;
    }

    public void setRedirectPoolsExtendConfig(CreateRedirectPoolsExtendConfig redirectPoolsExtendConfig) {
        this.redirectPoolsExtendConfig = redirectPoolsExtendConfig;
    }

    public CreateL7PolicyOption withRules(List<CreateL7PolicyRuleOption> rules) {
        this.rules = rules;
        return this;
    }

    public CreateL7PolicyOption addRulesItem(CreateL7PolicyRuleOption rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public CreateL7PolicyOption withRules(Consumer<List<CreateL7PolicyRuleOption>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 参数解释：转发策略关联的转发规则对象。  约束限制： - rules列表中最多含有10个rule规则 （若rule中包含conditions字段，一条condition算一个规则）， 且列表中type为HOST_NAME，PATH，METHOD，SOURCE_IP的rule不能重复，至多指定一条。 - 仅支持全量替换。 - 如果l7policy 是重定向到listener的话，不允许创建l7rule。
     * @return rules
     */
    public List<CreateL7PolicyRuleOption> getRules() {
        return rules;
    }

    public void setRules(List<CreateL7PolicyRuleOption> rules) {
        this.rules = rules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateL7PolicyOption that = (CreateL7PolicyOption) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.description, that.description) && Objects.equals(this.listenerId, that.listenerId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.position, that.position)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.redirectListenerId, that.redirectListenerId)
            && Objects.equals(this.redirectPoolId, that.redirectPoolId)
            && Objects.equals(this.redirectUrl, that.redirectUrl)
            && Objects.equals(this.redirectUrlConfig, that.redirectUrlConfig)
            && Objects.equals(this.redirectPoolsConfig, that.redirectPoolsConfig)
            && Objects.equals(this.redirectPoolsStickySessionConfig, that.redirectPoolsStickySessionConfig)
            && Objects.equals(this.fixedResponseConfig, that.fixedResponseConfig)
            && Objects.equals(this.redirectPoolsExtendConfig, that.redirectPoolsExtendConfig)
            && Objects.equals(this.rules, that.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action,
            adminStateUp,
            description,
            listenerId,
            name,
            position,
            priority,
            projectId,
            redirectListenerId,
            redirectPoolId,
            redirectUrl,
            redirectUrlConfig,
            redirectPoolsConfig,
            redirectPoolsStickySessionConfig,
            fixedResponseConfig,
            redirectPoolsExtendConfig,
            rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateL7PolicyOption {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    redirectListenerId: ").append(toIndentedString(redirectListenerId)).append("\n");
        sb.append("    redirectPoolId: ").append(toIndentedString(redirectPoolId)).append("\n");
        sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
        sb.append("    redirectUrlConfig: ").append(toIndentedString(redirectUrlConfig)).append("\n");
        sb.append("    redirectPoolsConfig: ").append(toIndentedString(redirectPoolsConfig)).append("\n");
        sb.append("    redirectPoolsStickySessionConfig: ")
            .append(toIndentedString(redirectPoolsStickySessionConfig))
            .append("\n");
        sb.append("    fixedResponseConfig: ").append(toIndentedString(fixedResponseConfig)).append("\n");
        sb.append("    redirectPoolsExtendConfig: ").append(toIndentedString(redirectPoolsExtendConfig)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
