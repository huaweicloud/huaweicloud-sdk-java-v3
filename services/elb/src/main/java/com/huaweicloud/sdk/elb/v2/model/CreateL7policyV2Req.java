package com.huaweicloud.sdk.elb.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.CreateL7ruleV2ReqInPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 转发策略对象
 */
public class CreateL7policyV2Req  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ActionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ActionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ActionEnum(value);
            }
            return result;
        }

        public static ActionEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof ActionEnum) {
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
    @JsonProperty(value="action")
    
    private ActionEnum action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="admin_state_up")
    
    private Boolean adminStateUp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listener_id")
    
    private String listenerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="redirect_pool_id")
    
    private String redirectPoolId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="redirect_listener_id")
    
    private String redirectListenerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="redirect_url")
    
    private String redirectUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="position")
    
    private Integer position;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rules")
    
    private List<CreateL7ruleV2ReqInPolicy> rules = null;
    
    public CreateL7policyV2Req withName(String name) {
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

    public CreateL7policyV2Req withAction(ActionEnum action) {
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

    public CreateL7policyV2Req withTenantId(String tenantId) {
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

    public CreateL7policyV2Req withAdminStateUp(Boolean adminStateUp) {
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

    public CreateL7policyV2Req withDescription(String description) {
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

    public CreateL7policyV2Req withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    


    /**
     * 转发策略对应的监听器ID。当action为REDIRECT_TO_POOL时，只支持创建在PROTOCOL为HTTP或TERMINATED_HTTPS的listener上。 当action为REDIRECT_TO_LISTENER时，只支持创建在PROTOCOL为HTTP的listener上。
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public CreateL7policyV2Req withRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
        return this;
    }

    


    /**
     * 转发到pool的ID。转发到pool的ID。当action为REDIRECT_TO_POOL时生效。当action为REDIRECT_TO_POOL时必选
     * @return redirectPoolId
     */
    public String getRedirectPoolId() {
        return redirectPoolId;
    }

    public void setRedirectPoolId(String redirectPoolId) {
        this.redirectPoolId = redirectPoolId;
    }

    public CreateL7policyV2Req withRedirectListenerId(String redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
        return this;
    }

    


    /**
     * 转发到的listener的ID，当action为REDIRECT_TO_LISTENER时生效。当action为REDIRECT_TO_LISTENER时必选
     * @return redirectListenerId
     */
    public String getRedirectListenerId() {
        return redirectListenerId;
    }

    public void setRedirectListenerId(String redirectListenerId) {
        this.redirectListenerId = redirectListenerId;
    }

    public CreateL7policyV2Req withRedirectUrl(String redirectUrl) {
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

    public CreateL7policyV2Req withPosition(Integer position) {
        this.position = position;
        return this;
    }

    


    /**
     * 转发策略的优先级，从1递增，最高100。该字段为预留字段，暂未启用。
     * @return position
     */
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public CreateL7policyV2Req withRules(List<CreateL7ruleV2ReqInPolicy> rules) {
        this.rules = rules;
        return this;
    }

    
    public CreateL7policyV2Req addRulesItem(CreateL7ruleV2ReqInPolicy rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public CreateL7policyV2Req withRules(Consumer<List<CreateL7ruleV2ReqInPolicy>> rulesSetter) {
        if(this.rules == null ){
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 指定L7rule的参数，可以在创建L7policy的同时创建L7rule
     * @return rules
     */
    public List<CreateL7ruleV2ReqInPolicy> getRules() {
        return rules;
    }

    public void setRules(List<CreateL7ruleV2ReqInPolicy> rules) {
        this.rules = rules;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateL7policyV2Req createL7policyV2Req = (CreateL7policyV2Req) o;
        return Objects.equals(this.name, createL7policyV2Req.name) &&
            Objects.equals(this.action, createL7policyV2Req.action) &&
            Objects.equals(this.tenantId, createL7policyV2Req.tenantId) &&
            Objects.equals(this.adminStateUp, createL7policyV2Req.adminStateUp) &&
            Objects.equals(this.description, createL7policyV2Req.description) &&
            Objects.equals(this.listenerId, createL7policyV2Req.listenerId) &&
            Objects.equals(this.redirectPoolId, createL7policyV2Req.redirectPoolId) &&
            Objects.equals(this.redirectListenerId, createL7policyV2Req.redirectListenerId) &&
            Objects.equals(this.redirectUrl, createL7policyV2Req.redirectUrl) &&
            Objects.equals(this.position, createL7policyV2Req.position) &&
            Objects.equals(this.rules, createL7policyV2Req.rules);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, action, tenantId, adminStateUp, description, listenerId, redirectPoolId, redirectListenerId, redirectUrl, position, rules);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateL7policyV2Req {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    redirectPoolId: ").append(toIndentedString(redirectPoolId)).append("\n");
        sb.append("    redirectListenerId: ").append(toIndentedString(redirectListenerId)).append("\n");
        sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

