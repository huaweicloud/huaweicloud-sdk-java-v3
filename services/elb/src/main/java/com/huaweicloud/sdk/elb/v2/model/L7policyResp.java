package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 转发策略对象
 */
public class L7policyResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    @JacksonXmlProperty(localName = "rules")

    private List<ResourceList> rules = null;

    /**
    * 转发策略的转发动作；取值：REDIRECT_TO_POOL：转发到后端云服务器组；REDIRECT_TO_LISTENER：重定向到监听器
    */
    public static final class ActionEnum {

        /**
         * Enum REDIRECT_TO_POOL for value: "REDIRECT_TO_POOL"
         */
        public static final ActionEnum REDIRECT_TO_POOL = new ActionEnum("REDIRECT_TO_POOL");

        /**
         * Enum REDIRECT_TO_LISTENER for value: "REDIRECT_TO_LISTENER"
         */
        public static final ActionEnum REDIRECT_TO_LISTENER = new ActionEnum("REDIRECT_TO_LISTENER");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("REDIRECT_TO_POOL", REDIRECT_TO_POOL);
            map.put("REDIRECT_TO_LISTENER", REDIRECT_TO_LISTENER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionEnum(value);
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionEnum) {
                return this.value.equals(((ActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    @JacksonXmlProperty(localName = "action")

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_status")

    @JacksonXmlProperty(localName = "provisioning_status")

    private String provisioningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    @JacksonXmlProperty(localName = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    @JacksonXmlProperty(localName = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    @JacksonXmlProperty(localName = "listener_id")

    private String listenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_pool_id")

    @JacksonXmlProperty(localName = "redirect_pool_id")

    private String redirectPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_listener_id")

    @JacksonXmlProperty(localName = "redirect_listener_id")

    private String redirectListenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_url")

    @JacksonXmlProperty(localName = "redirect_url")

    private String redirectUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    @JacksonXmlProperty(localName = "position")

    private Integer position;

    public L7policyResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 转发策略ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public L7policyResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 转发策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public L7policyResp withRules(List<ResourceList> rules) {
        this.rules = rules;
        return this;
    }

    public L7policyResp addRulesItem(ResourceList rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public L7policyResp withRules(Consumer<List<ResourceList>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 转发策略关联的转发规则列表
     * @return rules
     */
    public List<ResourceList> getRules() {
        return rules;
    }

    public void setRules(List<ResourceList> rules) {
        this.rules = rules;
    }

    public L7policyResp withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 转发策略的转发动作；取值：REDIRECT_TO_POOL：转发到后端云服务器组；REDIRECT_TO_LISTENER：重定向到监听器
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public L7policyResp withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    /**
     * 健康检查的配置状态；该字段为预留字段，暂未启用。默认为ACTIVE。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public L7policyResp withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 转发策略所在的项目ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public L7policyResp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 转发策略所在的项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public L7policyResp withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 转发策略的管理状态；该字段为预留字段，暂未启用。默认为true。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public L7policyResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 转发策略额描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public L7policyResp withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /**
     * 转发策略对应的监听器ID
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public L7policyResp withRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
        return this;
    }

    /**
     * 转发到pool的ID。转发到pool的ID。当action为REDIRECT_TO_POOL时生效。
     * @return redirectPoolId
     */
    public String getRedirectPoolId() {
        return redirectPoolId;
    }

    public void setRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
    }

    public L7policyResp withRedirectListenerId(String redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
        return this;
    }

    /**
     * 转发到的listener的ID，当action为REDIRECT_TO_LISTENER时生效。
     * @return redirectListenerId
     */
    public String getRedirectListenerId() {
        return redirectListenerId;
    }

    public void setRedirectListenerId(String redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
    }

    public L7policyResp withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    /**
     * 转发到的url。该字段未启用。
     * @return redirectUrl
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public L7policyResp withPosition(Integer position) {
        this.position = position;
        return this;
    }

    /**
     * 转发策略的优先级，从1递增，最高100。该字段为预留字段，暂未启用。
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        L7policyResp l7policyResp = (L7policyResp) o;
        return Objects.equals(this.id, l7policyResp.id) && Objects.equals(this.name, l7policyResp.name)
            && Objects.equals(this.rules, l7policyResp.rules) && Objects.equals(this.action, l7policyResp.action)
            && Objects.equals(this.provisioningStatus, l7policyResp.provisioningStatus)
            && Objects.equals(this.tenantId, l7policyResp.tenantId)
            && Objects.equals(this.projectId, l7policyResp.projectId)
            && Objects.equals(this.adminStateUp, l7policyResp.adminStateUp)
            && Objects.equals(this.description, l7policyResp.description)
            && Objects.equals(this.listenerId, l7policyResp.listenerId)
            && Objects.equals(this.redirectPoolId, l7policyResp.redirectPoolId)
            && Objects.equals(this.redirectListenerId, l7policyResp.redirectListenerId)
            && Objects.equals(this.redirectUrl, l7policyResp.redirectUrl)
            && Objects.equals(this.position, l7policyResp.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            rules,
            action,
            provisioningStatus,
            tenantId,
            projectId,
            adminStateUp,
            description,
            listenerId,
            redirectPoolId,
            redirectListenerId,
            redirectUrl,
            position);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class L7policyResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    redirectPoolId: ").append(toIndentedString(redirectPoolId)).append("\n");
        sb.append("    redirectListenerId: ").append(toIndentedString(redirectListenerId)).append("\n");
        sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
