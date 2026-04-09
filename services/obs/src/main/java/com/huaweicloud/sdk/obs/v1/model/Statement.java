package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 桶策略描述。Policy由多条statement组成，也可以是一条。  在单条statement中，Action与NotAction必须二选一，Resource与NotResource必须二选一，Principal与NotPrincipal必须二选一。  详细介绍请参见[桶策略参数说明](https://support.huaweicloud.com/perms-cfg-obs/obs_40_0041.html)。 
 */
@JacksonXmlRootElement(localName = "Statement")
public class Statement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Sid")

    @JacksonXmlProperty(localName = "Sid")

    private String sid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Principal")

    @JacksonXmlProperty(localName = "Principal")

    private StatementPrincipal principal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "NotPrincipal")

    @JacksonXmlProperty(localName = "NotPrincipal")

    private StatementNotPrincipal notPrincipal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Action")

    @JacksonXmlProperty(localName = "Action")
    private List<String> action = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "NotAction")

    @JacksonXmlProperty(localName = "NotAction")
    private List<String> notAction = null;

    /**
     * 必选关键字，效果，指定本条statement的权限是允许还是拒绝，Effect的值必须为Allow或者Deny。 
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

    @JacksonXmlProperty(localName = "Effect")

    private EffectEnum effect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Resource")

    @JacksonXmlProperty(localName = "Resource")
    private List<String> resource = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "NotResource")

    @JacksonXmlProperty(localName = "NotResource")
    private List<String> notResource = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Condition")

    @JacksonXmlProperty(localName = "Condition")

    private Object condition;

    public Statement withSid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * statement Id，可选关键字，描述statement的字符串。 
     * @return sid
     */
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Statement withPrincipal(StatementPrincipal principal) {
        this.principal = principal;
        return this;
    }

    public Statement withPrincipal(Consumer<StatementPrincipal> principalSetter) {
        if (this.principal == null) {
            this.principal = new StatementPrincipal();
            principalSetter.accept(this.principal);
        }

        return this;
    }

    /**
     * Get principal
     * @return principal
     */
    public StatementPrincipal getPrincipal() {
        return principal;
    }

    public void setPrincipal(StatementPrincipal principal) {
        this.principal = principal;
    }

    public Statement withNotPrincipal(StatementNotPrincipal notPrincipal) {
        this.notPrincipal = notPrincipal;
        return this;
    }

    public Statement withNotPrincipal(Consumer<StatementNotPrincipal> notPrincipalSetter) {
        if (this.notPrincipal == null) {
            this.notPrincipal = new StatementNotPrincipal();
            notPrincipalSetter.accept(this.notPrincipal);
        }

        return this;
    }

    /**
     * Get notPrincipal
     * @return notPrincipal
     */
    public StatementNotPrincipal getNotPrincipal() {
        return notPrincipal;
    }

    public void setNotPrincipal(StatementNotPrincipal notPrincipal) {
        this.notPrincipal = notPrincipal;
    }

    public Statement withAction(List<String> action) {
        this.action = action;
        return this;
    }

    public Statement addActionItem(String actionItem) {
        if (this.action == null) {
            this.action = new ArrayList<>();
        }
        this.action.add(actionItem);
        return this;
    }

    public Statement withAction(Consumer<List<String>> actionSetter) {
        if (this.action == null) {
            this.action = new ArrayList<>();
        }
        actionSetter.accept(this.action);
        return this;
    }

    /**
     * 可选关键字，指定本条statement作用的操作，Action字段为OBS支持的所有操作集合，以字符串形式表示，不区分大小写。支持通配符“*”，表示该资源能进行的所有操作。例如：\"Action\":[\"List*\", \"Get*\"]。 可选，Action与NotAction选其一。 
     * @return action
     */
    public List<String> getAction() {
        return action;
    }

    public void setAction(List<String> action) {
        this.action = action;
    }

    public Statement withNotAction(List<String> notAction) {
        this.notAction = notAction;
        return this;
    }

    public Statement addNotActionItem(String notActionItem) {
        if (this.notAction == null) {
            this.notAction = new ArrayList<>();
        }
        this.notAction.add(notActionItem);
        return this;
    }

    public Statement withNotAction(Consumer<List<String>> notActionSetter) {
        if (this.notAction == null) {
            this.notAction = new ArrayList<>();
        }
        notActionSetter.accept(this.notAction);
        return this;
    }

    /**
     * 可选关键字，指定一组操作，statement匹配除该组操作之外的其他操作。 取值同Action。 可选，Action与NotAction选其一。 
     * @return notAction
     */
    public List<String> getNotAction() {
        return notAction;
    }

    public void setNotAction(List<String> notAction) {
        this.notAction = notAction;
    }

    public Statement withEffect(EffectEnum effect) {
        this.effect = effect;
        return this;
    }

    /**
     * 必选关键字，效果，指定本条statement的权限是允许还是拒绝，Effect的值必须为Allow或者Deny。 
     * @return effect
     */
    public EffectEnum getEffect() {
        return effect;
    }

    public void setEffect(EffectEnum effect) {
        this.effect = effect;
    }

    public Statement withResource(List<String> resource) {
        this.resource = resource;
        return this;
    }

    public Statement addResourceItem(String resourceItem) {
        if (this.resource == null) {
            this.resource = new ArrayList<>();
        }
        this.resource.add(resourceItem);
        return this;
    }

    public Statement withResource(Consumer<List<String>> resourceSetter) {
        if (this.resource == null) {
            this.resource = new ArrayList<>();
        }
        resourceSetter.accept(this.resource);
        return this;
    }

    /**
     * 可选关键字，指定statement起作用的一组资源，支持通配符“*”，表示所有资源。 可选，Resource与NotResource选其一。 
     * @return resource
     */
    public List<String> getResource() {
        return resource;
    }

    public void setResource(List<String> resource) {
        this.resource = resource;
    }

    public Statement withNotResource(List<String> notResource) {
        this.notResource = notResource;
        return this;
    }

    public Statement addNotResourceItem(String notResourceItem) {
        if (this.notResource == null) {
            this.notResource = new ArrayList<>();
        }
        this.notResource.add(notResourceItem);
        return this;
    }

    public Statement withNotResource(Consumer<List<String>> notResourceSetter) {
        if (this.notResource == null) {
            this.notResource = new ArrayList<>();
        }
        notResourceSetter.accept(this.notResource);
        return this;
    }

    /**
     * 可选关键字，指定一组资源，statement匹配除该组资源之外的其他资源。 取值同Resource。 可选，Resource与NotResource选其一。 
     * @return notResource
     */
    public List<String> getNotResource() {
        return notResource;
    }

    public void setNotResource(List<String> notResource) {
        this.notResource = notResource;
    }

    public Statement withCondition(Object condition) {
        this.condition = condition;
        return this;
    }

    /**
     * 除了指定效果、被授权用户、资源、动作外，桶策略还可以指定生效条件。只有当条件设置的表达式与访问请求中的值匹配时，桶策略才生效。条件是可选参数，用户可以根据业务需要选择是否使用。  条件由条件运算符、键、值三部分组成，最终组成一个条件表达式，决定桶策略生效的条件。同一个条件运算符中，如果存在多个相同的键，则只会保留最后一个键。条件运算符、键两者之间存在互相限制的关联关系，例如： 条件运算符选择了一个String类型的，比如StringEquals，键就只能选择String类型的，比如UserAgent。 键选择了一个Date类型，比如CurrentTime，条件运算符就只能选择Date类型的，比如DateEquals。  Condition判断类型和键如[桶策略参数说明表4-7](https://support.huaweicloud.com/perms-cfg-obs/obs_40_0041.html#section3)所示。 
     * @return condition
     */
    public Object getCondition() {
        return condition;
    }

    public void setCondition(Object condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Statement that = (Statement) obj;
        return Objects.equals(this.sid, that.sid) && Objects.equals(this.principal, that.principal)
            && Objects.equals(this.notPrincipal, that.notPrincipal) && Objects.equals(this.action, that.action)
            && Objects.equals(this.notAction, that.notAction) && Objects.equals(this.effect, that.effect)
            && Objects.equals(this.resource, that.resource) && Objects.equals(this.notResource, that.notResource)
            && Objects.equals(this.condition, that.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, principal, notPrincipal, action, notAction, effect, resource, notResource, condition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Statement {\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
        sb.append("    notPrincipal: ").append(toIndentedString(notPrincipal)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    notAction: ").append(toIndentedString(notAction)).append("\n");
        sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    notResource: ").append(toIndentedString(notResource)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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
