package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新七层转发策略的请求参数。
 */
public class UpdateL7PolicyOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_listener_id")

    private String redirectListenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_pool_id")

    private String redirectPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_pools_config")

    private List<UpdateRedirectPoolsConfig> redirectPoolsConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_pools_sticky_session_config")

    private UpdateRedirectPoolsStickySessionConfig redirectPoolsStickySessionConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_url_config")

    private UpdateRedirectUrlConfig redirectUrlConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_response_config")

    private UpdateFixtedResponseConfig fixedResponseConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_pools_extend_config")

    private UpdateRedirectPoolsExtendConfig redirectPoolsExtendConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<CreateRuleOption> rules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    public UpdateL7PolicyOption withAdminStateUp(Boolean adminStateUp) {
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

    public UpdateL7PolicyOption withDescription(String description) {
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

    public UpdateL7PolicyOption withName(String name) {
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

    public UpdateL7PolicyOption withRedirectListenerId(String redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
        return this;
    }

    /**
     * 参数解释：转发到的listener的ID。  约束限制： - 当action为REDIRECT_TO_LISTENER时不能更新为空或null。 - 只支持protocol为HTTPS/TERMINATED_HTTPS的listener。 - 不能指定为其他loadbalancer下的listener。 - 当action为REDIRECT_TO_POOL时，创建或更新时不能传入该参数。
     * @return redirectListenerId
     */
    public String getRedirectListenerId() {
        return redirectListenerId;
    }

    public void setRedirectListenerId(String redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
    }

    public UpdateL7PolicyOption withRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
        return this;
    }

    /**
     * 参数解释：转发到pool的ID。  约束限制： - 指定的pool不能是任何listener的default_pool。不能是其他listener的l7policy使用的pool。 - 当action为REDIRECT_TO_POOL时生效，但不能更新为空或null。 - 当action为REDIRECT_TO_LISTENER时，传入会报错。
     * @return redirectPoolId
     */
    public String getRedirectPoolId() {
        return redirectPoolId;
    }

    public void setRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
    }

    public UpdateL7PolicyOption withRedirectPoolsConfig(List<UpdateRedirectPoolsConfig> redirectPoolsConfig) {
        this.redirectPoolsConfig = redirectPoolsConfig;
        return this;
    }

    public UpdateL7PolicyOption addRedirectPoolsConfigItem(UpdateRedirectPoolsConfig redirectPoolsConfigItem) {
        if (this.redirectPoolsConfig == null) {
            this.redirectPoolsConfig = new ArrayList<>();
        }
        this.redirectPoolsConfig.add(redirectPoolsConfigItem);
        return this;
    }

    public UpdateL7PolicyOption withRedirectPoolsConfig(
        Consumer<List<UpdateRedirectPoolsConfig>> redirectPoolsConfigSetter) {
        if (this.redirectPoolsConfig == null) {
            this.redirectPoolsConfig = new ArrayList<>();
        }
        redirectPoolsConfigSetter.accept(this.redirectPoolsConfig);
        return this;
    }

    /**
     * 参数解释：转发到多个主机组列表。一个policy最多配置5个pool。
     * @return redirectPoolsConfig
     */
    public List<UpdateRedirectPoolsConfig> getRedirectPoolsConfig() {
        return redirectPoolsConfig;
    }

    public void setRedirectPoolsConfig(List<UpdateRedirectPoolsConfig> redirectPoolsConfig) {
        this.redirectPoolsConfig = redirectPoolsConfig;
    }

    public UpdateL7PolicyOption withRedirectPoolsStickySessionConfig(
        UpdateRedirectPoolsStickySessionConfig redirectPoolsStickySessionConfig) {
        this.redirectPoolsStickySessionConfig = redirectPoolsStickySessionConfig;
        return this;
    }

    public UpdateL7PolicyOption withRedirectPoolsStickySessionConfig(
        Consumer<UpdateRedirectPoolsStickySessionConfig> redirectPoolsStickySessionConfigSetter) {
        if (this.redirectPoolsStickySessionConfig == null) {
            this.redirectPoolsStickySessionConfig = new UpdateRedirectPoolsStickySessionConfig();
            redirectPoolsStickySessionConfigSetter.accept(this.redirectPoolsStickySessionConfig);
        }

        return this;
    }

    /**
     * Get redirectPoolsStickySessionConfig
     * @return redirectPoolsStickySessionConfig
     */
    public UpdateRedirectPoolsStickySessionConfig getRedirectPoolsStickySessionConfig() {
        return redirectPoolsStickySessionConfig;
    }

    public void setRedirectPoolsStickySessionConfig(
        UpdateRedirectPoolsStickySessionConfig redirectPoolsStickySessionConfig) {
        this.redirectPoolsStickySessionConfig = redirectPoolsStickySessionConfig;
    }

    public UpdateL7PolicyOption withRedirectUrlConfig(UpdateRedirectUrlConfig redirectUrlConfig) {
        this.redirectUrlConfig = redirectUrlConfig;
        return this;
    }

    public UpdateL7PolicyOption withRedirectUrlConfig(Consumer<UpdateRedirectUrlConfig> redirectUrlConfigSetter) {
        if (this.redirectUrlConfig == null) {
            this.redirectUrlConfig = new UpdateRedirectUrlConfig();
            redirectUrlConfigSetter.accept(this.redirectUrlConfig);
        }

        return this;
    }

    /**
     * Get redirectUrlConfig
     * @return redirectUrlConfig
     */
    public UpdateRedirectUrlConfig getRedirectUrlConfig() {
        return redirectUrlConfig;
    }

    public void setRedirectUrlConfig(UpdateRedirectUrlConfig redirectUrlConfig) {
        this.redirectUrlConfig = redirectUrlConfig;
    }

    public UpdateL7PolicyOption withFixedResponseConfig(UpdateFixtedResponseConfig fixedResponseConfig) {
        this.fixedResponseConfig = fixedResponseConfig;
        return this;
    }

    public UpdateL7PolicyOption withFixedResponseConfig(
        Consumer<UpdateFixtedResponseConfig> fixedResponseConfigSetter) {
        if (this.fixedResponseConfig == null) {
            this.fixedResponseConfig = new UpdateFixtedResponseConfig();
            fixedResponseConfigSetter.accept(this.fixedResponseConfig);
        }

        return this;
    }

    /**
     * Get fixedResponseConfig
     * @return fixedResponseConfig
     */
    public UpdateFixtedResponseConfig getFixedResponseConfig() {
        return fixedResponseConfig;
    }

    public void setFixedResponseConfig(UpdateFixtedResponseConfig fixedResponseConfig) {
        this.fixedResponseConfig = fixedResponseConfig;
    }

    public UpdateL7PolicyOption withRedirectPoolsExtendConfig(
        UpdateRedirectPoolsExtendConfig redirectPoolsExtendConfig) {
        this.redirectPoolsExtendConfig = redirectPoolsExtendConfig;
        return this;
    }

    public UpdateL7PolicyOption withRedirectPoolsExtendConfig(
        Consumer<UpdateRedirectPoolsExtendConfig> redirectPoolsExtendConfigSetter) {
        if (this.redirectPoolsExtendConfig == null) {
            this.redirectPoolsExtendConfig = new UpdateRedirectPoolsExtendConfig();
            redirectPoolsExtendConfigSetter.accept(this.redirectPoolsExtendConfig);
        }

        return this;
    }

    /**
     * Get redirectPoolsExtendConfig
     * @return redirectPoolsExtendConfig
     */
    public UpdateRedirectPoolsExtendConfig getRedirectPoolsExtendConfig() {
        return redirectPoolsExtendConfig;
    }

    public void setRedirectPoolsExtendConfig(UpdateRedirectPoolsExtendConfig redirectPoolsExtendConfig) {
        this.redirectPoolsExtendConfig = redirectPoolsExtendConfig;
    }

    public UpdateL7PolicyOption withRules(List<CreateRuleOption> rules) {
        this.rules = rules;
        return this;
    }

    public UpdateL7PolicyOption addRulesItem(CreateRuleOption rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public UpdateL7PolicyOption withRules(Consumer<List<CreateRuleOption>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 参数解释：转发策略关联的转发规则对象。  约束限制： - rules列表中最多含有10个rule规则 （若rule中包含conditions字段，一条condition算一个规则）， 且列表中type为HOST_NAME，PATH，METHOD，SOURCE_IP的rule不能重复，至多指定一条。 - 仅支持全量替换。
     * @return rules
     */
    public List<CreateRuleOption> getRules() {
        return rules;
    }

    public void setRules(List<CreateRuleOption> rules) {
        this.rules = rules;
    }

    public UpdateL7PolicyOption withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 参数解释：转发策略的优先级。数字越小表示优先级越高。  约束限制： - 同一个监听器下不同转发策略之间不允许重复的优先级数值。  - 当关联的监听器的高级转发策略功能（enhance_l7policy_enable）开启后才会生效，未开启传入该字段会报错。 - 当关联的监听器的高级转发策略功能（enhance_l7policy_enable）未开启，按原有policy的排序逻辑，自动排序。 不同域名优先级独立。相同域名下，按path的compare_type排序， 精确>前缀>正则，匹配类型相同时，path的长度越长优先级越高。 若policy下只有域名rule，没有路径rule，默认path为前缀匹配/。 [- 共享型负载均衡器下的转发策略不支持该字段。](tag:hws,hws_hk,ocb,ctc,g42,tm,cmcc,hk_g42,hws_ocb,hk_vdf,srg,fcs,dt,hk_tm)  取值范围： - 当action为REDIRECT_TO_LISTENER时，支持指定为0-10000。 - 其它action取值，支持指定为1-10000。  默认取值： - 若关联的监听器的高级转发策略功能（enhance_l7policy_enable）未开启，且不传入该字段，则新创建的转发策略的优先级的值为1。 - 当action为REDIRECT_TO_LISTENER时，则新创建的转发策略的优先级的值为0。 - 其它action取值，新创建的转发策略的优先级的值为同一监听器下已有转发策略的优先级的最大值+1。   + 若监听器下没有转发策略，则新建的转发策略的优先级为1。   + 若当前已有转发策略的优先级的最大值是10000，则新创建的转发策略会因超出取值范围10000而失败。此时可通过传入指定priority，或调整原有policy的优先级来避免错误。  [不支持该字段，请勿使用。](tag:hcso_dt)  [荷兰region不支持该字段，请勿使用。](tag:dt,dt_test)
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateL7PolicyOption that = (UpdateL7PolicyOption) obj;
        return Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.description, that.description) && Objects.equals(this.name, that.name)
            && Objects.equals(this.redirectListenerId, that.redirectListenerId)
            && Objects.equals(this.redirectPoolId, that.redirectPoolId)
            && Objects.equals(this.redirectPoolsConfig, that.redirectPoolsConfig)
            && Objects.equals(this.redirectPoolsStickySessionConfig, that.redirectPoolsStickySessionConfig)
            && Objects.equals(this.redirectUrlConfig, that.redirectUrlConfig)
            && Objects.equals(this.fixedResponseConfig, that.fixedResponseConfig)
            && Objects.equals(this.redirectPoolsExtendConfig, that.redirectPoolsExtendConfig)
            && Objects.equals(this.rules, that.rules) && Objects.equals(this.priority, that.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp,
            description,
            name,
            redirectListenerId,
            redirectPoolId,
            redirectPoolsConfig,
            redirectPoolsStickySessionConfig,
            redirectUrlConfig,
            fixedResponseConfig,
            redirectPoolsExtendConfig,
            rules,
            priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateL7PolicyOption {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    redirectListenerId: ").append(toIndentedString(redirectListenerId)).append("\n");
        sb.append("    redirectPoolId: ").append(toIndentedString(redirectPoolId)).append("\n");
        sb.append("    redirectPoolsConfig: ").append(toIndentedString(redirectPoolsConfig)).append("\n");
        sb.append("    redirectPoolsStickySessionConfig: ")
            .append(toIndentedString(redirectPoolsStickySessionConfig))
            .append("\n");
        sb.append("    redirectUrlConfig: ").append(toIndentedString(redirectUrlConfig)).append("\n");
        sb.append("    fixedResponseConfig: ").append(toIndentedString(fixedResponseConfig)).append("\n");
        sb.append("    redirectPoolsExtendConfig: ").append(toIndentedString(redirectPoolsExtendConfig)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
