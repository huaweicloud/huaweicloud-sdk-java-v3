package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class KeystoneShowSecurityComplianceByOptionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    /**
     * 查询条件。该字段内容为：password_regex或password_regex_description。  password_regex：密码强度策略的正则表达式；password_regex_description：密码强度策略的描述。
     */
    public static final class OptionEnum {

        /**
         * Enum PASSWORD_REGEX for value: "password_regex"
         */
        public static final OptionEnum PASSWORD_REGEX = new OptionEnum("password_regex");

        /**
         * Enum PASSWORD_REGEX_DESCRIPTION for value: "password_regex_description"
         */
        public static final OptionEnum PASSWORD_REGEX_DESCRIPTION = new OptionEnum("password_regex_description");

        private static final Map<String, OptionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OptionEnum> createStaticFields() {
            Map<String, OptionEnum> map = new HashMap<>();
            map.put("password_regex", PASSWORD_REGEX);
            map.put("password_regex_description", PASSWORD_REGEX_DESCRIPTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OptionEnum(String value) {
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
        public static OptionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OptionEnum(value));
        }

        public static OptionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OptionEnum) {
                return this.value.equals(((OptionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "option")

    private OptionEnum option;

    public KeystoneShowSecurityComplianceByOptionRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 待查询的账号ID，获取方式请参见：[获取账号、IAM用户、项目、用户组、委托的名称和ID](https://support.huaweicloud.com/api-iam/iam_17_0002.html)。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public KeystoneShowSecurityComplianceByOptionRequest withOption(OptionEnum option) {
        this.option = option;
        return this;
    }

    /**
     * 查询条件。该字段内容为：password_regex或password_regex_description。  password_regex：密码强度策略的正则表达式；password_regex_description：密码强度策略的描述。
     * @return option
     */
    public OptionEnum getOption() {
        return option;
    }

    public void setOption(OptionEnum option) {
        this.option = option;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeystoneShowSecurityComplianceByOptionRequest that = (KeystoneShowSecurityComplianceByOptionRequest) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.option, that.option);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, option);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneShowSecurityComplianceByOptionRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    option: ").append(toIndentedString(option)).append("\n");
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
