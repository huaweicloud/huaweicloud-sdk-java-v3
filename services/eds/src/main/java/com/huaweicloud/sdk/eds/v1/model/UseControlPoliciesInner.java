package com.huaweicloud.sdk.eds.v1.model;

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
 * UseControlPoliciesInner
 */
public class UseControlPoliciesInner {

    /**
     * 限制使用的操作
     */
    public static final class ActionEnum {

        /**
         * Enum VIEW for value: "VIEW"
         */
        public static final ActionEnum VIEW = new ActionEnum("VIEW");

        /**
         * Enum PROCESS for value: "PROCESS"
         */
        public static final ActionEnum PROCESS = new ActionEnum("PROCESS");

        /**
         * Enum MODIFY for value: "MODIFY"
         */
        public static final ActionEnum MODIFY = new ActionEnum("MODIFY");

        /**
         * Enum NOTIFY for value: "NOTIFY"
         */
        public static final ActionEnum NOTIFY = new ActionEnum("NOTIFY");

        /**
         * Enum VERIFY for value: "VERIFY"
         */
        public static final ActionEnum VERIFY = new ActionEnum("VERIFY");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final ActionEnum DELETE = new ActionEnum("DELETE");

        /**
         * Enum FORWARD for value: "FORWARD"
         */
        public static final ActionEnum FORWARD = new ActionEnum("FORWARD");

        /**
         * Enum DOWNLOAD for value: "DOWNLOAD"
         */
        public static final ActionEnum DOWNLOAD = new ActionEnum("DOWNLOAD");

        /**
         * Enum APPROVE for value: "APPROVE"
         */
        public static final ActionEnum APPROVE = new ActionEnum("APPROVE");

        /**
         * Enum TERMINATE for value: "TERMINATE"
         */
        public static final ActionEnum TERMINATE = new ActionEnum("TERMINATE");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final ActionEnum NONE = new ActionEnum("NONE");

        private static final Map<String, ActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionEnum> createStaticFields() {
            Map<String, ActionEnum> map = new HashMap<>();
            map.put("VIEW", VIEW);
            map.put("PROCESS", PROCESS);
            map.put("MODIFY", MODIFY);
            map.put("NOTIFY", NOTIFY);
            map.put("VERIFY", VERIFY);
            map.put("DELETE", DELETE);
            map.put("FORWARD", FORWARD);
            map.put("DOWNLOAD", DOWNLOAD);
            map.put("APPROVE", APPROVE);
            map.put("TERMINATE", TERMINATE);
            map.put("NONE", NONE);
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

    private ActionEnum action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "when")

    private Object when;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "how_many")

    private Integer howMany;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "where")

    private List<String> where = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "who")

    private List<String> who = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application")

    private List<String> application = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additional_attributes")

    private Map<String, String> additionalAttributes = null;

    public UseControlPoliciesInner withAction(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * 限制使用的操作
     * @return action
     */
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public UseControlPoliciesInner withWhen(Object when) {
        this.when = when;
        return this;
    }

    /**
     * 限制使用时间
     * @return when
     */
    public Object getWhen() {
        return when;
    }

    public void setWhen(Object when) {
        this.when = when;
    }

    public UseControlPoliciesInner withHowMany(Integer howMany) {
        this.howMany = howMany;
        return this;
    }

    /**
     * 限制使用次数
     * @return howMany
     */
    public Integer getHowMany() {
        return howMany;
    }

    public void setHowMany(Integer howMany) {
        this.howMany = howMany;
    }

    public UseControlPoliciesInner withWhere(List<String> where) {
        this.where = where;
        return this;
    }

    public UseControlPoliciesInner addWhereItem(String whereItem) {
        if (this.where == null) {
            this.where = new ArrayList<>();
        }
        this.where.add(whereItem);
        return this;
    }

    public UseControlPoliciesInner withWhere(Consumer<List<String>> whereSetter) {
        if (this.where == null) {
            this.where = new ArrayList<>();
        }
        whereSetter.accept(this.where);
        return this;
    }

    /**
     * 限制地点列表
     * @return where
     */
    public List<String> getWhere() {
        return where;
    }

    public void setWhere(List<String> where) {
        this.where = where;
    }

    public UseControlPoliciesInner withWho(List<String> who) {
        this.who = who;
        return this;
    }

    public UseControlPoliciesInner addWhoItem(String whoItem) {
        if (this.who == null) {
            this.who = new ArrayList<>();
        }
        this.who.add(whoItem);
        return this;
    }

    public UseControlPoliciesInner withWho(Consumer<List<String>> whoSetter) {
        if (this.who == null) {
            this.who = new ArrayList<>();
        }
        whoSetter.accept(this.who);
        return this;
    }

    /**
     * 限制用户列表
     * @return who
     */
    public List<String> getWho() {
        return who;
    }

    public void setWho(List<String> who) {
        this.who = who;
    }

    public UseControlPoliciesInner withApplication(List<String> application) {
        this.application = application;
        return this;
    }

    public UseControlPoliciesInner addApplicationItem(String applicationItem) {
        if (this.application == null) {
            this.application = new ArrayList<>();
        }
        this.application.add(applicationItem);
        return this;
    }

    public UseControlPoliciesInner withApplication(Consumer<List<String>> applicationSetter) {
        if (this.application == null) {
            this.application = new ArrayList<>();
        }
        applicationSetter.accept(this.application);
        return this;
    }

    /**
     * 限制应用列表
     * @return application
     */
    public List<String> getApplication() {
        return application;
    }

    public void setApplication(List<String> application) {
        this.application = application;
    }

    public UseControlPoliciesInner withAdditionalAttributes(Map<String, String> additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
        return this;
    }

    public UseControlPoliciesInner putAdditionalAttributesItem(String key, String additionalAttributesItem) {
        if (this.additionalAttributes == null) {
            this.additionalAttributes = new HashMap<>();
        }
        this.additionalAttributes.put(key, additionalAttributesItem);
        return this;
    }

    public UseControlPoliciesInner withAdditionalAttributes(Consumer<Map<String, String>> additionalAttributesSetter) {
        if (this.additionalAttributes == null) {
            this.additionalAttributes = new HashMap<>();
        }
        additionalAttributesSetter.accept(this.additionalAttributes);
        return this;
    }

    /**
     * 策略的扩展属性
     * @return additionalAttributes
     */
    public Map<String, String> getAdditionalAttributes() {
        return additionalAttributes;
    }

    public void setAdditionalAttributes(Map<String, String> additionalAttributes) {
        this.additionalAttributes = additionalAttributes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UseControlPoliciesInner useControlPoliciesInner = (UseControlPoliciesInner) o;
        return Objects.equals(this.action, useControlPoliciesInner.action)
            && Objects.equals(this.when, useControlPoliciesInner.when)
            && Objects.equals(this.howMany, useControlPoliciesInner.howMany)
            && Objects.equals(this.where, useControlPoliciesInner.where)
            && Objects.equals(this.who, useControlPoliciesInner.who)
            && Objects.equals(this.application, useControlPoliciesInner.application)
            && Objects.equals(this.additionalAttributes, useControlPoliciesInner.additionalAttributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, when, howMany, where, who, application, additionalAttributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UseControlPoliciesInner {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    when: ").append(toIndentedString(when)).append("\n");
        sb.append("    howMany: ").append(toIndentedString(howMany)).append("\n");
        sb.append("    where: ").append(toIndentedString(where)).append("\n");
        sb.append("    who: ").append(toIndentedString(who)).append("\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
        sb.append("    additionalAttributes: ").append(toIndentedString(additionalAttributes)).append("\n");
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
