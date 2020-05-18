package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class PolicyStatement  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Action")
    
    private List<String> action = new ArrayList<>();
        /**
     * 作用。包含两种：允许（Allow）和拒绝（Deny），既有Allow又有Deny的授权语句时，遵循Deny优先的原则。
     */
    public static class EffectEnum {

        
        /**
         * Enum ALLOW for value: "Allow"
         */
        public static final EffectEnum ALLOW = new EffectEnum("Allow");

        
        /**
         * Enum DENY for value: "Deny"
         */
        public static final EffectEnum DENY = new EffectEnum("Deny");

        

        public static Map<String, EffectEnum> staticFields =
                new HashMap<String, EffectEnum>() {
                    { 
                        put("Allow", ALLOW);
                        put("Deny", DENY);
                    }
                };

        private String value;

        EffectEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EffectEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            EffectEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new EffectEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static EffectEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            EffectEnum result = staticFields.get(value);
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
    @JsonProperty(value="Condition")
    
    private Object condition = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Resource")
    
    private List<String> resource = null;
    
    public PolicyStatement withAction(List<String> action) {
        this.action = action;
        return this;
    }

    
    public PolicyStatement addActionItem(String actionItem) {
        this.action.add(actionItem);
        return this;
    }

    public PolicyStatement withAction(Consumer<List<String>> actionSetter) {
        if(this.action == null ){
            this.action = new ArrayList<>();
        }
        actionSetter.accept(this.action);
        return this;
    }

    /**
     * 授权项，指对资源的具体操作权限，不超过100个。   > - 格式为：服务名:资源类型:操作，例：vpc:ports:create。   > - 服务名为产品名称，例如ecs、evs和vpc等，服务名仅支持小写。 资源类型和操作没有大小写，要求支持通配符号*，无需罗列全部授权项。   > - 当自定义策略为委托自定义策略时，该字段值为：``` \"Action\": [\"iam:agencies:assume\"]```。
     * @return action
     */
    public List<String> getAction() {
        return action;
    }

    public void setAction(List<String> action) {
        this.action = action;
    }

    public PolicyStatement withEffect(EffectEnum effect) {
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

    public PolicyStatement withCondition(Object condition) {
        this.condition = condition;
        return this;
    }

    


    /**
     * 限制条件。不超过10个。
     * @return condition
     */
    public Object getCondition() {
        return condition;
    }

    public void setCondition(Object condition) {
        this.condition = condition;
    }

    public PolicyStatement withResource(List<String> resource) {
        this.resource = resource;
        return this;
    }

    
    public PolicyStatement addResourceItem(String resourceItem) {
        if (this.resource == null) {
            this.resource = new ArrayList<>();
        }
        this.resource.add(resourceItem);
        return this;
    }

    public PolicyStatement withResource(Consumer<List<String>> resourceSetter) {
        if(this.resource == null ){
            this.resource = new ArrayList<>();
        }
        resourceSetter.accept(this.resource);
        return this;
    }

    /**
     * 资源。数组长度不超过10，每个字符串长度不超过128，规则如下：   > - 可填 * 的五段式：<service-name>:<region>:<account-id>:<resource-type>:<resource-path>，例：\"obs:*:*:bucket:*\"。   > - region字段为*或用户可访问的region。service必须存在且resource属于对应service。   > - 当该自定义策略为委托自定义策略时，该字段类型为Object，值为：```\"Resource\": {\"uri\": [\"/iam/agencies/07805acaba800fdd4fbdc00b8f888c7c\"]}```。
     * @return resource
     */
    public List<String> getResource() {
        return resource;
    }

    public void setResource(List<String> resource) {
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
        PolicyStatement policyStatement = (PolicyStatement) o;
        return Objects.equals(this.action, policyStatement.action) &&
            Objects.equals(this.effect, policyStatement.effect) &&
            Objects.equals(this.condition, policyStatement.condition) &&
            Objects.equals(this.resource, policyStatement.resource);
    }
    @Override
    public int hashCode() {
        return Objects.hash(action, effect, condition, resource);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyStatement {\n");
            sb.append("    action: ").append(toIndentedString(action)).append("\n");
            sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
            sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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

