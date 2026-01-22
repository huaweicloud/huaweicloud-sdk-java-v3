package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CheckDomainVerificationInfo
 */
public class CheckDomainVerificationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    /**
     * 验证方式，DNS：DNS解析验证；FILE：文件验证
     */
    public static final class VerifyTypeEnum {

        /**
         * Enum DNS for value: "DNS"
         */
        public static final VerifyTypeEnum DNS = new VerifyTypeEnum("DNS");

        /**
         * Enum FILE for value: "FILE"
         */
        public static final VerifyTypeEnum FILE = new VerifyTypeEnum("FILE");

        private static final Map<String, VerifyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VerifyTypeEnum> createStaticFields() {
            Map<String, VerifyTypeEnum> map = new HashMap<>();
            map.put("DNS", DNS);
            map.put("FILE", FILE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VerifyTypeEnum(String value) {
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
        public static VerifyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VerifyTypeEnum(value));
        }

        public static VerifyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VerifyTypeEnum) {
                return this.value.equals(((VerifyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verify_type")

    private VerifyTypeEnum verifyType;

    public CheckDomainVerificationInfo withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 直播域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CheckDomainVerificationInfo withVerifyType(VerifyTypeEnum verifyType) {
        this.verifyType = verifyType;
        return this;
    }

    /**
     * 验证方式，DNS：DNS解析验证；FILE：文件验证
     * @return verifyType
     */
    public VerifyTypeEnum getVerifyType() {
        return verifyType;
    }

    public void setVerifyType(VerifyTypeEnum verifyType) {
        this.verifyType = verifyType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckDomainVerificationInfo that = (CheckDomainVerificationInfo) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.verifyType, that.verifyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, verifyType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckDomainVerificationInfo {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    verifyType: ").append(toIndentedString(verifyType)).append("\n");
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
