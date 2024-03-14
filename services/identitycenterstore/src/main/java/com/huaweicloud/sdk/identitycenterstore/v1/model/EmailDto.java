package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The email address associated with the user.
 */
public class EmailDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary")

    private Boolean primary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    /**
     * 电子邮箱地址的验证状态
     */
    public static final class VerificationStatusEnum {

        /**
         * Enum NOT_VERIFIED for value: "NOT_VERIFIED"
         */
        public static final VerificationStatusEnum NOT_VERIFIED = new VerificationStatusEnum("NOT_VERIFIED");

        /**
         * Enum VERIFIED for value: "VERIFIED"
         */
        public static final VerificationStatusEnum VERIFIED = new VerificationStatusEnum("VERIFIED");

        private static final Map<String, VerificationStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VerificationStatusEnum> createStaticFields() {
            Map<String, VerificationStatusEnum> map = new HashMap<>();
            map.put("NOT_VERIFIED", NOT_VERIFIED);
            map.put("VERIFIED", VERIFIED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VerificationStatusEnum(String value) {
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
        public static VerificationStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VerificationStatusEnum(value));
        }

        public static VerificationStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VerificationStatusEnum) {
                return this.value.equals(((VerificationStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_status")

    private VerificationStatusEnum verificationStatus;

    public EmailDto withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * 一个布尔值，表示这是否为用户的主电子邮箱
     * @return primary
     */
    public Boolean getPrimary() {
        return primary;
    }

    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public EmailDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 表示电子邮箱类型的字符串
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EmailDto withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 包含电子邮箱地址的字符串
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public EmailDto withVerificationStatus(VerificationStatusEnum verificationStatus) {
        this.verificationStatus = verificationStatus;
        return this;
    }

    /**
     * 电子邮箱地址的验证状态
     * @return verificationStatus
     */
    public VerificationStatusEnum getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(VerificationStatusEnum verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EmailDto that = (EmailDto) obj;
        return Objects.equals(this.primary, that.primary) && Objects.equals(this.type, that.type)
            && Objects.equals(this.value, that.value)
            && Objects.equals(this.verificationStatus, that.verificationStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primary, type, value, verificationStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmailDto {\n");
        sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
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
