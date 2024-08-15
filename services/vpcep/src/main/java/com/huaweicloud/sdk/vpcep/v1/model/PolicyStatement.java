package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * policy
 */
public class PolicyStatement {

    /**
     * Allow允许或Deny拒绝，控制访问权限
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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EffectEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EffectEnum(value));
        }

        public static EffectEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EffectEnum) {
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
    @JsonProperty(value = "Effect")

    private EffectEnum effect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Action")

    private List<String> action = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Resource")

    private List<String> resource = null;

    public PolicyStatement withEffect(EffectEnum effect) {
        this.effect = effect;
        return this;
    }

    /**
     * Allow允许或Deny拒绝，控制访问权限
     * @return effect
     */
    public EffectEnum getEffect() {
        return effect;
    }

    public void setEffect(EffectEnum effect) {
        this.effect = effect;
    }

    public PolicyStatement withAction(List<String> action) {
        this.action = action;
        return this;
    }

    public PolicyStatement addActionItem(String actionItem) {
        if (this.action == null) {
            this.action = new ArrayList<>();
        }
        this.action.add(actionItem);
        return this;
    }

    public PolicyStatement withAction(Consumer<List<String>> actionSetter) {
        if (this.action == null) {
            this.action = new ArrayList<>();
        }
        actionSetter.accept(this.action);
        return this;
    }

    /**
     * obs访问权限
     * @return action
     */
    public List<String> getAction() {
        return action;
    }

    public void setAction(List<String> action) {
        this.action = action;
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
        if (this.resource == null) {
            this.resource = new ArrayList<>();
        }
        resourceSetter.accept(this.resource);
        return this;
    }

    /**
     * obs对象
     * @return resource
     */
    public List<String> getResource() {
        return resource;
    }

    public void setResource(List<String> resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyStatement that = (PolicyStatement) obj;
        return Objects.equals(this.effect, that.effect) && Objects.equals(this.action, that.action)
            && Objects.equals(this.resource, that.resource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(effect, action, resource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyStatement {\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
