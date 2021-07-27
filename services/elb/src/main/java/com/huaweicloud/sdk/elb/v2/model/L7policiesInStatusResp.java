package com.huaweicloud.sdk.elb.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.L7rulesInStatusResp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 转发策略对象，用于状态树
 */
public class L7policiesInStatusResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="rules")
    
    private List<L7rulesInStatusResp> rules = null;
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
    @JsonProperty(value="action")
    
    private ActionEnum action;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private String provisioningStatus;

    public L7policiesInStatusResp withId(String id) {
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

    

    public L7policiesInStatusResp withName(String name) {
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

    

    public L7policiesInStatusResp withRules(List<L7rulesInStatusResp> rules) {
        this.rules = rules;
        return this;
    }

    
    public L7policiesInStatusResp addRulesItem(L7rulesInStatusResp rulesItem) {
        if(this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public L7policiesInStatusResp withRules(Consumer<List<L7rulesInStatusResp>> rulesSetter) {
        if(this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 转发策略关联的转发规则列表
     * @return rules
     */
    public List<L7rulesInStatusResp> getRules() {
        return rules;
    }

    public void setRules(List<L7rulesInStatusResp> rules) {
        this.rules = rules;
    }

    

    public L7policiesInStatusResp withAction(ActionEnum action) {
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

    

    public L7policiesInStatusResp withProvisioningStatus(String provisioningStatus) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        L7policiesInStatusResp l7policiesInStatusResp = (L7policiesInStatusResp) o;
        return Objects.equals(this.id, l7policiesInStatusResp.id) &&
            Objects.equals(this.name, l7policiesInStatusResp.name) &&
            Objects.equals(this.rules, l7policiesInStatusResp.rules) &&
            Objects.equals(this.action, l7policiesInStatusResp.action) &&
            Objects.equals(this.provisioningStatus, l7policiesInStatusResp.provisioningStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, rules, action, provisioningStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class L7policiesInStatusResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
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

