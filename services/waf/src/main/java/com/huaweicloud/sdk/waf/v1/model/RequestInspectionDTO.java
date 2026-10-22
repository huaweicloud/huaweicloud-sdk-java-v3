package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 请求的检查规则
 */
public class RequestInspectionDTO {

    /**
     * 请求的 Payload 类型（JSON/FORM_URLENCODED）
     */
    public static final class PayloadTypeEnum {

        /**
         * Enum JSON for value: "JSON"
         */
        public static final PayloadTypeEnum JSON = new PayloadTypeEnum("JSON");

        /**
         * Enum FORM_URLENCODED for value: "FORM_URLENCODED"
         */
        public static final PayloadTypeEnum FORM_URLENCODED = new PayloadTypeEnum("FORM_URLENCODED");

        private static final Map<String, PayloadTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PayloadTypeEnum> createStaticFields() {
            Map<String, PayloadTypeEnum> map = new HashMap<>();
            map.put("JSON", JSON);
            map.put("FORM_URLENCODED", FORM_URLENCODED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PayloadTypeEnum(String value) {
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
        public static PayloadTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PayloadTypeEnum(value));
        }

        public static PayloadTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PayloadTypeEnum) {
                return this.value.equals(((PayloadTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payload_type")

    private PayloadTypeEnum payloadType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    public RequestInspectionDTO withPayloadType(PayloadTypeEnum payloadType) {
        this.payloadType = payloadType;
        return this;
    }

    /**
     * 请求的 Payload 类型（JSON/FORM_URLENCODED）
     * @return payloadType
     */
    public PayloadTypeEnum getPayloadType() {
        return payloadType;
    }

    public void setPayloadType(PayloadTypeEnum payloadType) {
        this.payloadType = payloadType;
    }

    public RequestInspectionDTO withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户名字段路径
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public RequestInspectionDTO withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 密码字段路径
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RequestInspectionDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱字段路径（可选）
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RequestInspectionDTO withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 手机号字段路径（可选）
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RequestInspectionDTO that = (RequestInspectionDTO) obj;
        return Objects.equals(this.payloadType, that.payloadType) && Objects.equals(this.username, that.username)
            && Objects.equals(this.password, that.password) && Objects.equals(this.email, that.email)
            && Objects.equals(this.phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payloadType, username, password, email, phone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequestInspectionDTO {\n");
        sb.append("    payloadType: ").append(toIndentedString(payloadType)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
