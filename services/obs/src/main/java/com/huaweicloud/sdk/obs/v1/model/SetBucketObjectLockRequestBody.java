package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.huaweicloud.sdk.corexml.SdkXmlBody;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 桶级WORM配置的根节点。 
 */
@JacksonXmlRootElement(localName = "ObjectLockConfiguration")
public class SetBucketObjectLockRequestBody extends SdkXmlBody<SetBucketObjectLockRequestBody> {

    /**
     * 参数解释： 桶级WORM开关状态。 约束限制： 不涉及 取值范围： Enabled：启用桶级WORM功能。 默认取值： 不涉及 
     */
    public static final class ObjectLockEnabledEnum {

        /**
         * Enum ENABLED for value: "Enabled"
         */
        public static final ObjectLockEnabledEnum ENABLED = new ObjectLockEnabledEnum("Enabled");

        private static final Map<String, ObjectLockEnabledEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectLockEnabledEnum> createStaticFields() {
            Map<String, ObjectLockEnabledEnum> map = new HashMap<>();
            map.put("Enabled", ENABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ObjectLockEnabledEnum(String value) {
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
        public static ObjectLockEnabledEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ObjectLockEnabledEnum(value));
        }

        public static ObjectLockEnabledEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ObjectLockEnabledEnum) {
                return this.value.equals(((ObjectLockEnabledEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ObjectLockEnabled")

    @JacksonXmlProperty(localName = "ObjectLockEnabled")

    private ObjectLockEnabledEnum objectLockEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Rule")

    @JacksonXmlProperty(localName = "Rule")

    private SetBucketObjectLockRule rule;

    public SetBucketObjectLockRequestBody withObjectLockEnabled(ObjectLockEnabledEnum objectLockEnabled) {
        this.objectLockEnabled = objectLockEnabled;
        return this;
    }

    /**
     * 参数解释： 桶级WORM开关状态。 约束限制： 不涉及 取值范围： Enabled：启用桶级WORM功能。 默认取值： 不涉及 
     * @return objectLockEnabled
     */
    public ObjectLockEnabledEnum getObjectLockEnabled() {
        return objectLockEnabled;
    }

    public void setObjectLockEnabled(ObjectLockEnabledEnum objectLockEnabled) {
        this.objectLockEnabled = objectLockEnabled;
    }

    public SetBucketObjectLockRequestBody withRule(SetBucketObjectLockRule rule) {
        this.rule = rule;
        return this;
    }

    public SetBucketObjectLockRequestBody withRule(Consumer<SetBucketObjectLockRule> ruleSetter) {
        if (this.rule == null) {
            this.rule = new SetBucketObjectLockRule();
            ruleSetter.accept(this.rule);
        }

        return this;
    }

    /**
     * Get rule
     * @return rule
     */
    public SetBucketObjectLockRule getRule() {
        return rule;
    }

    public void setRule(SetBucketObjectLockRule rule) {
        this.rule = rule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetBucketObjectLockRequestBody that = (SetBucketObjectLockRequestBody) obj;
        return Objects.equals(this.objectLockEnabled, that.objectLockEnabled) && Objects.equals(this.rule, that.rule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectLockEnabled, rule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetBucketObjectLockRequestBody {\n");
        sb.append("    objectLockEnabled: ").append(toIndentedString(objectLockEnabled)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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
