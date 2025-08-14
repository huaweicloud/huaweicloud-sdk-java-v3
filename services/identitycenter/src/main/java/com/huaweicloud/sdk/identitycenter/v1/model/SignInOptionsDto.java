package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 门户登录选项
 */
public class SignInOptionsDto {

    /**
     * IAM身份中心跳转应用程序的方式
     */
    public static final class OriginEnum {

        /**
         * Enum IDENTITY_CENTER for value: "IDENTITY_CENTER"
         */
        public static final OriginEnum IDENTITY_CENTER = new OriginEnum("IDENTITY_CENTER");

        /**
         * Enum APPLICATION for value: "APPLICATION"
         */
        public static final OriginEnum APPLICATION = new OriginEnum("APPLICATION");

        private static final Map<String, OriginEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OriginEnum> createStaticFields() {
            Map<String, OriginEnum> map = new HashMap<>();
            map.put("IDENTITY_CENTER", IDENTITY_CENTER);
            map.put("APPLICATION", APPLICATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OriginEnum(String value) {
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
        public static OriginEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OriginEnum(value));
        }

        public static OriginEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OriginEnum) {
                return this.value.equals(((OriginEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin")

    private OriginEnum origin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_url")

    private String applicationUrl;

    public SignInOptionsDto withOrigin(OriginEnum origin) {
        this.origin = origin;
        return this;
    }

    /**
     * IAM身份中心跳转应用程序的方式
     * @return origin
     */
    public OriginEnum getOrigin() {
        return origin;
    }

    public void setOrigin(OriginEnum origin) {
        this.origin = origin;
    }

    public SignInOptionsDto withApplicationUrl(String applicationUrl) {
        this.applicationUrl = applicationUrl;
        return this;
    }

    /**
     * 接受应用程序身份验证请求的Url
     * @return applicationUrl
     */
    public String getApplicationUrl() {
        return applicationUrl;
    }

    public void setApplicationUrl(String applicationUrl) {
        this.applicationUrl = applicationUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SignInOptionsDto that = (SignInOptionsDto) obj;
        return Objects.equals(this.origin, that.origin) && Objects.equals(this.applicationUrl, that.applicationUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(origin, applicationUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignInOptionsDto {\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
        sb.append("    applicationUrl: ").append(toIndentedString(applicationUrl)).append("\n");
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
