package com.huaweicloud.sdk.iam.v3.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.AgencyPolicyResource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class AgencyPolicyStatement  {

    /**
     * Gets or Sets action
     */
    public static final class ActionEnum {

        
        /**
         * Enum IAM_AGENCIES_ASSUME for value: "iam:agencies:assume"
         */
        public static final ActionEnum IAM_AGENCIES_ASSUME = new ActionEnum("iam:agencies:assume");
        

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("iam:agencies:assume", IAM_AGENCIES_ASSUME);
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
    @JsonProperty(value="Action")
    
    private List<ActionEnum> action = null;
        /**
     * 作用。包含两种：允许（Allow）和拒绝（Deny），既有Allow又有Deny的授权语句时，遵循Deny优先的原则。
     */
    public static final class EffectEnum {

        
        /**
         * Enum ALLOW for value: "Allow"
         */
        public static final EffectEnum ALLOW = new EffectEnum("Allow");
        
        /**
         * Enum DENY for value: "Deny"
         */
        public static final EffectEnum DENY = new EffectEnum("Deny");
        

        private static final Map<String, EffectEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EffectEnum> createStaticFields() {
            Map<String, EffectEnum> map = new HashMap<>();
            map.put("Allow", ALLOW);
            map.put("Deny", DENY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EffectEnum(String value) {
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
        public static EffectEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            EffectEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EffectEnum(value);
            }
            return result;
        }

        public static EffectEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            EffectEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof EffectEnum) {
                return this.value.equals(((EffectEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Effect")
    
    private EffectEnum effect;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Resource")
    
    private AgencyPolicyResource resource;

    public AgencyPolicyStatement withAction(List<ActionEnum> action) {
        this.action = action;
        return this;
    }

    
    public AgencyPolicyStatement addActionItem(ActionEnum actionItem) {
        if(this.action == null) {
            this.action = new ArrayList<>();
        }
        this.action.add(actionItem);
        return this;
    }

    public AgencyPolicyStatement withAction(Consumer<List<ActionEnum>> actionSetter) {
        if(this.action == null) {
            this.action = new ArrayList<>();
        }
        actionSetter.accept(this.action);
        return this;
    }

    /**
     * 授权项，指对资源的具体操作权限。   > - 当自定义策略为委托自定义策略时，该字段值为：``` \"Action\": [\"iam:agencies:assume\"]```。
     * @return action
     */
    public List<ActionEnum> getAction() {
        return action;
    }

    public void setAction(List<ActionEnum> action) {
        this.action = action;
    }

    

    public AgencyPolicyStatement withEffect(EffectEnum effect) {
        this.effect = effect;
        return this;
    }

    


    /**
     * 作用。包含两种：允许（Allow）和拒绝（Deny），既有Allow又有Deny的授权语句时，遵循Deny优先的原则。
     * @return effect
     */
    public EffectEnum getEffect() {
        return effect;
    }

    public void setEffect(EffectEnum effect) {
        this.effect = effect;
    }

    

    public AgencyPolicyStatement withResource(AgencyPolicyResource resource) {
        this.resource = resource;
        return this;
    }

    public AgencyPolicyStatement withResource(Consumer<AgencyPolicyResource> resourceSetter) {
        if(this.resource == null ){
            this.resource = new AgencyPolicyResource();
            resourceSetter.accept(this.resource);
        }
        
        return this;
    }


    /**
     * Get resource
     * @return resource
     */
    public AgencyPolicyResource getResource() {
        return resource;
    }

    public void setResource(AgencyPolicyResource resource) {
        this.resource = resource;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgencyPolicyStatement agencyPolicyStatement = (AgencyPolicyStatement) o;
        return Objects.equals(this.action, agencyPolicyStatement.action) &&
            Objects.equals(this.effect, agencyPolicyStatement.effect) &&
            Objects.equals(this.resource, agencyPolicyStatement.resource);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action, effect, resource);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyPolicyStatement {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

