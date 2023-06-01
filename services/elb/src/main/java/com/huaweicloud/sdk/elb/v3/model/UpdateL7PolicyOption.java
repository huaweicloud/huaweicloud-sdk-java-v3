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
     * 转发策略的管理状态，默认为true。  不支持该字段，请勿使用。
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
     * 转发策略描述信息。
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
     * 转发策略名称。
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
     * 转发到的listener的ID。  使用说明： - 当action为REDIRECT_TO_LISTENER时不能更新为空或null。 - 只支持protocol为HTTPS/TERMINATED_HTTPS的listener。 - 不能指定为其他loadbalancer下的listener。 - 当action为REDIRECT_TO_POOL时，创建或更新时不能传入该参数。
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
     * 转发到pool的ID。  使用说明： - 指定的pool不能是listener的default_pool。不能是其他listener的l7policy使用的pool。 - 当action为REDIRECT_TO_POOL时为必选字段，不能更新为空或null。 当action为REDIRECT_TO_LISTENER时，不可指定。
     * @return redirectPoolId
     */
    public String getRedirectPoolId() {
        return redirectPoolId;
    }

    public void setRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
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
     * 转发策略关联的转发规则对象。 详细参考表l7rule字段说明。rules列表中最多含有10个rule规则 （若rule中包含conditions字段，一条condition算一个规则）， 且列表中type为HOST_NAME，PATH，METHOD，SOURCE_IP的rule不能重复，至多指定一条。
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
     * 转发策略的优先级。数字越小表示优先级越高，同一监听器下不允许重复。  当监听器的高级转发策略功能（enhance_l7policy_enable）开启后才会生效，未开启传入该字段会报错。  当action为REDIRECT_TO_LISTENER时，仅支持指定为0，优先级最高。  当关联的listener没有开启enhance_l7policy_enable，按原有policy的排序逻辑，自动排序。 各域名之间优先级独立，相同域名下，按path的compare_type排序， 精确>前缀>正则，匹配类型相同时，path的长度越长优先级越高。 若policy下只有域名rule，没有路径rule，默认path为前缀匹配/。  当关联的listener开启了enhance_l7policy_enable，且不传该字段， 则新创建的转发策略的优先级的值为：同一监听器下已有转发策略的优先级的最大值+1。 因此，若当前已有转发策略的优先级的最大值是10000，新创建会因超出取值范围10000而失败。 此时可通过传入指定priority，或调整原有policy的优先级来避免错误。 若监听器下没有转发策略，则新建的转发策略的优先级为1。  [共享型负载均衡器下的转发策略不支持该字段。 ](tag:hws,hws_hk,ocb,ctc,g42,tm,cmcc,hk_g42,hws_ocb,fcs,dt,hk_tm)  [不支持该字段，请勿使用。](tag:hcso_dt)  [荷兰region不支持该字段，请勿使用。](tag:dt)
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateL7PolicyOption updateL7PolicyOption = (UpdateL7PolicyOption) o;
        return Objects.equals(this.adminStateUp, updateL7PolicyOption.adminStateUp)
            && Objects.equals(this.description, updateL7PolicyOption.description)
            && Objects.equals(this.name, updateL7PolicyOption.name)
            && Objects.equals(this.redirectListenerId, updateL7PolicyOption.redirectListenerId)
            && Objects.equals(this.redirectPoolId, updateL7PolicyOption.redirectPoolId)
            && Objects.equals(this.redirectUrlConfig, updateL7PolicyOption.redirectUrlConfig)
            && Objects.equals(this.fixedResponseConfig, updateL7PolicyOption.fixedResponseConfig)
            && Objects.equals(this.redirectPoolsExtendConfig, updateL7PolicyOption.redirectPoolsExtendConfig)
            && Objects.equals(this.rules, updateL7PolicyOption.rules)
            && Objects.equals(this.priority, updateL7PolicyOption.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp,
            description,
            name,
            redirectListenerId,
            redirectPoolId,
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
