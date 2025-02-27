package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * policy对象。
 */
public class L7Policy {

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
    @JsonProperty(value = "id")

    private String id;

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
    @JsonProperty(value = "provisioning_status")

    private String provisioningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_pool_id")

    private String redirectPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_listener_id")

    private String redirectListenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_url")

    private String redirectUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<RuleRef> rules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_url_config")

    private RedirectUrlConfig redirectUrlConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_pools_config")

    private List<RedirectPoolsConfig> redirectPoolsConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_pools_sticky_session_config")

    private RedirectPoolsStickySessionConfig redirectPoolsStickySessionConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_pools_extend_config")

    private RedirectPoolsExtendConfig redirectPoolsExtendConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_response_config")

    private FixtedResponseConfig fixedResponseConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public L7Policy withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 参数解释：转发策略的转发动作。  约束限制： - REDIRECT_TO_LISTENER的优先级最高，配置了以后，该监听器下的其他policy会失效。 - 当action为REDIRECT_TO_POOL时， 只支持创建在PROTOCOL为HTTP、HTTPS、TERMINATED_HTTPS的listener上。 - 当action为REDIRECT_TO_LISTENER时，只支持创建在PROTOCOL为HTTP的listener上。  取值范围： - REDIRECT_TO_POOL：转发到后端服务器组； - REDIRECT_TO_LISTENER：重定向到监听器； - REDIRECT_TO_URL：重定向到URL； - FIXED_RESPONSE：返回固定响应体。  [不支持REDIRECT_TO_URL和FIXED_RESPONSE](tag:hcso_dt)
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public L7Policy withAdminStateUp(Boolean adminStateUp) {
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

    public L7Policy withDescription(String description) {
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

    public L7Policy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 参数解释：转发策略ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public L7Policy withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /**
     * 参数解释：转发策略所属的监听器ID。
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public L7Policy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数解释：转发策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public L7Policy withPosition(Integer position) {
        this.position = position;
        return this;
    }

    /**
     * 参数解释：转发策略的优先级，不支持更新。  不支持该字段，请勿使用。
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

    public L7Policy withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 参数解释：转发策略的优先级。数字越小表示优先级越高。  约束限制： - 同一个监听器下不同转发策略之间不允许重复的优先级数值。  - 当关联的监听器的高级转发策略功能（enhance_l7policy_enable）开启后才会生效，未开启传入该字段会报错。 - 当关联的监听器的高级转发策略功能（enhance_l7policy_enable）未开启，按原有policy的排序逻辑，自动排序。 不同域名优先级独立。相同域名下，按path的compare_type排序， 精确>前缀>正则，匹配类型相同时，path的长度越长优先级越高。 若policy下只有域名rule，没有路径rule，默认path为前缀匹配/。 [- 共享型负载均衡器下的转发策略不支持该字段。](tag:hws,hws_hk,ocb,ctc,g42,tm,cmcc,hk_g42,hws_ocb,hk_vdf,srg,fcs,dt,hk_tm)  取值范围： - 当action为REDIRECT_TO_LISTENER时，支持指定为0-10000。 - 其它action取值，支持指定为1-10000。  默认取值： - 若关联的监听器的高级转发策略功能（enhance_l7policy_enable）未开启，且不传入该字段，则新创建的转发策略的优先级的值为1。 - 当action为REDIRECT_TO_LISTENER时，则新创建的转发策略的优先级的值为0。 - 其它action取值，新创建的转发策略的优先级的值为同一监听器下已有转发策略的优先级的最大值+1。   + 若监听器下没有转发策略，则新建的转发策略的优先级为1。   + 若当前已有转发策略的优先级的最大值是10000，则新创建的转发策略会因超出取值范围10000而失败。此时可通过传入指定priority，或调整原有policy的优先级来避免错误。  [不支持该字段，请勿使用。](tag:hcso_dt)  [荷兰region不支持该字段，请勿使用。](tag:dt)
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public L7Policy withProjectId(String projectId) {
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

    public L7Policy withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    /**
     * 参数解释：转发策略的配置状态。  取值范围： - ACTIVE: 默认值，表示正常。 [- ERROR: 表示当前策略与同一监听器下的其他策略存在相同的规则配置。 ](tag:hws,hws_hk,ocb,ctc,hcs,g42,tm,cmcc,hk_g42,hws_ocb,hk_vdf,srg,fcs)
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public L7Policy withRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
        return this;
    }

    /**
     * 参数解释：转发到pool的ID。  约束限制：当action为REDIRECT_TO_POOL时生效。
     * @return redirectPoolId
     */
    public String getRedirectPoolId() {
        return redirectPoolId;
    }

    public void setRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
    }

    public L7Policy withRedirectListenerId(String redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
        return this;
    }

    /**
     * 参数解释：转发到的listener的ID。  约束限制： - 当action为REDIRECT_TO_LISTENER时必选。 - 只支持protocol为HTTPS/TERMINATED_HTTPS的listener。 - 不能指定为其他loadbalancer下的listener。 - 当action为REDIRECT_TO_POOL时，创建或更新时不能传入该参数。
     * @return redirectListenerId
     */
    public String getRedirectListenerId() {
        return redirectListenerId;
    }

    public void setRedirectListenerId(String redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
    }

    public L7Policy withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    /**
     * 参数解释：转发到的url。  取值范围：必须满足格式: protocol://host:port/path?query。  不支持该字段，请勿使用。
     * @return redirectUrl
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public L7Policy withRules(List<RuleRef> rules) {
        this.rules = rules;
        return this;
    }

    public L7Policy addRulesItem(RuleRef rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public L7Policy withRules(Consumer<List<RuleRef>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 参数解释：转发策略关联的转发规则列表。
     * @return rules
     */
    public List<RuleRef> getRules() {
        return rules;
    }

    public void setRules(List<RuleRef> rules) {
        this.rules = rules;
    }

    public L7Policy withRedirectUrlConfig(RedirectUrlConfig redirectUrlConfig) {
        this.redirectUrlConfig = redirectUrlConfig;
        return this;
    }

    public L7Policy withRedirectUrlConfig(Consumer<RedirectUrlConfig> redirectUrlConfigSetter) {
        if (this.redirectUrlConfig == null) {
            this.redirectUrlConfig = new RedirectUrlConfig();
            redirectUrlConfigSetter.accept(this.redirectUrlConfig);
        }

        return this;
    }

    /**
     * Get redirectUrlConfig
     * @return redirectUrlConfig
     */
    public RedirectUrlConfig getRedirectUrlConfig() {
        return redirectUrlConfig;
    }

    public void setRedirectUrlConfig(RedirectUrlConfig redirectUrlConfig) {
        this.redirectUrlConfig = redirectUrlConfig;
    }

    public L7Policy withRedirectPoolsConfig(List<RedirectPoolsConfig> redirectPoolsConfig) {
        this.redirectPoolsConfig = redirectPoolsConfig;
        return this;
    }

    public L7Policy addRedirectPoolsConfigItem(RedirectPoolsConfig redirectPoolsConfigItem) {
        if (this.redirectPoolsConfig == null) {
            this.redirectPoolsConfig = new ArrayList<>();
        }
        this.redirectPoolsConfig.add(redirectPoolsConfigItem);
        return this;
    }

    public L7Policy withRedirectPoolsConfig(Consumer<List<RedirectPoolsConfig>> redirectPoolsConfigSetter) {
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
    public List<RedirectPoolsConfig> getRedirectPoolsConfig() {
        return redirectPoolsConfig;
    }

    public void setRedirectPoolsConfig(List<RedirectPoolsConfig> redirectPoolsConfig) {
        this.redirectPoolsConfig = redirectPoolsConfig;
    }

    public L7Policy withRedirectPoolsStickySessionConfig(
        RedirectPoolsStickySessionConfig redirectPoolsStickySessionConfig) {
        this.redirectPoolsStickySessionConfig = redirectPoolsStickySessionConfig;
        return this;
    }

    public L7Policy withRedirectPoolsStickySessionConfig(
        Consumer<RedirectPoolsStickySessionConfig> redirectPoolsStickySessionConfigSetter) {
        if (this.redirectPoolsStickySessionConfig == null) {
            this.redirectPoolsStickySessionConfig = new RedirectPoolsStickySessionConfig();
            redirectPoolsStickySessionConfigSetter.accept(this.redirectPoolsStickySessionConfig);
        }

        return this;
    }

    /**
     * Get redirectPoolsStickySessionConfig
     * @return redirectPoolsStickySessionConfig
     */
    public RedirectPoolsStickySessionConfig getRedirectPoolsStickySessionConfig() {
        return redirectPoolsStickySessionConfig;
    }

    public void setRedirectPoolsStickySessionConfig(RedirectPoolsStickySessionConfig redirectPoolsStickySessionConfig) {
        this.redirectPoolsStickySessionConfig = redirectPoolsStickySessionConfig;
    }

    public L7Policy withRedirectPoolsExtendConfig(RedirectPoolsExtendConfig redirectPoolsExtendConfig) {
        this.redirectPoolsExtendConfig = redirectPoolsExtendConfig;
        return this;
    }

    public L7Policy withRedirectPoolsExtendConfig(Consumer<RedirectPoolsExtendConfig> redirectPoolsExtendConfigSetter) {
        if (this.redirectPoolsExtendConfig == null) {
            this.redirectPoolsExtendConfig = new RedirectPoolsExtendConfig();
            redirectPoolsExtendConfigSetter.accept(this.redirectPoolsExtendConfig);
        }

        return this;
    }

    /**
     * Get redirectPoolsExtendConfig
     * @return redirectPoolsExtendConfig
     */
    public RedirectPoolsExtendConfig getRedirectPoolsExtendConfig() {
        return redirectPoolsExtendConfig;
    }

    public void setRedirectPoolsExtendConfig(RedirectPoolsExtendConfig redirectPoolsExtendConfig) {
        this.redirectPoolsExtendConfig = redirectPoolsExtendConfig;
    }

    public L7Policy withFixedResponseConfig(FixtedResponseConfig fixedResponseConfig) {
        this.fixedResponseConfig = fixedResponseConfig;
        return this;
    }

    public L7Policy withFixedResponseConfig(Consumer<FixtedResponseConfig> fixedResponseConfigSetter) {
        if (this.fixedResponseConfig == null) {
            this.fixedResponseConfig = new FixtedResponseConfig();
            fixedResponseConfigSetter.accept(this.fixedResponseConfig);
        }

        return this;
    }

    /**
     * Get fixedResponseConfig
     * @return fixedResponseConfig
     */
    public FixtedResponseConfig getFixedResponseConfig() {
        return fixedResponseConfig;
    }

    public void setFixedResponseConfig(FixtedResponseConfig fixedResponseConfig) {
        this.fixedResponseConfig = fixedResponseConfig;
    }

    public L7Policy withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 参数解释：创建时间。  取值范围：格式：yyyy-MM-dd'T'HH:mm:ss'Z'，UTC时区。  [注意：独享型实例的历史数据以及共享型实例下的资源，不返回该字段。 ](tag:hws,hws_hk,ocb,ctc,g42,tm,cmcc,hk_g42,hws_ocb,hk_vdf,srg,fcs,dt,hk_tm)
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public L7Policy withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 参数解释：更新时间。  取值范围：格式：yyyy-MM-dd'T'HH:mm:ss'Z'，UTC时区。  [注意：独享型实例的历史数据以及共享型实例下的资源，不返回该字段。 ](tag:hws,hws_hk,ocb,ctc,g42,tm,cmcc,hk_g42,hws_ocb,hk_vdf,srg,fcs,dt,hk_tm)
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public L7Policy withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 参数解释：企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        L7Policy that = (L7Policy) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.description, that.description) && Objects.equals(this.id, that.id)
            && Objects.equals(this.listenerId, that.listenerId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.position, that.position) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.provisioningStatus, that.provisioningStatus)
            && Objects.equals(this.redirectPoolId, that.redirectPoolId)
            && Objects.equals(this.redirectListenerId, that.redirectListenerId)
            && Objects.equals(this.redirectUrl, that.redirectUrl) && Objects.equals(this.rules, that.rules)
            && Objects.equals(this.redirectUrlConfig, that.redirectUrlConfig)
            && Objects.equals(this.redirectPoolsConfig, that.redirectPoolsConfig)
            && Objects.equals(this.redirectPoolsStickySessionConfig, that.redirectPoolsStickySessionConfig)
            && Objects.equals(this.redirectPoolsExtendConfig, that.redirectPoolsExtendConfig)
            && Objects.equals(this.fixedResponseConfig, that.fixedResponseConfig)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action,
            adminStateUp,
            description,
            id,
            listenerId,
            name,
            position,
            priority,
            projectId,
            provisioningStatus,
            redirectPoolId,
            redirectListenerId,
            redirectUrl,
            rules,
            redirectUrlConfig,
            redirectPoolsConfig,
            redirectPoolsStickySessionConfig,
            redirectPoolsExtendConfig,
            fixedResponseConfig,
            createdAt,
            updatedAt,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class L7Policy {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    redirectPoolId: ").append(toIndentedString(redirectPoolId)).append("\n");
        sb.append("    redirectListenerId: ").append(toIndentedString(redirectListenerId)).append("\n");
        sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    redirectUrlConfig: ").append(toIndentedString(redirectUrlConfig)).append("\n");
        sb.append("    redirectPoolsConfig: ").append(toIndentedString(redirectPoolsConfig)).append("\n");
        sb.append("    redirectPoolsStickySessionConfig: ")
            .append(toIndentedString(redirectPoolsStickySessionConfig))
            .append("\n");
        sb.append("    redirectPoolsExtendConfig: ").append(toIndentedString(redirectPoolsExtendConfig)).append("\n");
        sb.append("    fixedResponseConfig: ").append(toIndentedString(fixedResponseConfig)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
