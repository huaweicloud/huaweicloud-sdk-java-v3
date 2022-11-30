package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 自定义合规规则
 */
public class CustomPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_urn")

    private String functionUrn;

    /**
     * 自定义合规规则调用function方式
     */
    public static final class AuthTypeEnum {

        /**
         * Enum AGENCY for value: "agency"
         */
        public static final AuthTypeEnum AGENCY = new AuthTypeEnum("agency");

        private static final Map<String, AuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthTypeEnum> createStaticFields() {
            Map<String, AuthTypeEnum> map = new HashMap<>();
            map.put("agency", AGENCY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthTypeEnum(String value) {
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
        public static AuthTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AuthTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AuthTypeEnum(value);
            }
            return result;
        }

        public static AuthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AuthTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthTypeEnum) {
                return this.value.equals(((AuthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private AuthTypeEnum authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_value")

    private Map<String, Object> authValue = null;

    public CustomPolicy withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    /**
     * 自定义函数的urn
     * @return functionUrn
     */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    public CustomPolicy withAuthType(AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 自定义合规规则调用function方式
     * @return authType
     */
    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthTypeEnum authType) {
        this.authType = authType;
    }

    public CustomPolicy withAuthValue(Map<String, Object> authValue) {
        this.authValue = authValue;
        return this;
    }

    public CustomPolicy putAuthValueItem(String key, Object authValueItem) {
        if (this.authValue == null) {
            this.authValue = new HashMap<>();
        }
        this.authValue.put(key, authValueItem);
        return this;
    }

    public CustomPolicy withAuthValue(Consumer<Map<String, Object>> authValueSetter) {
        if (this.authValue == null) {
            this.authValue = new HashMap<>();
        }
        authValueSetter.accept(this.authValue);
        return this;
    }

    /**
     * method参数值，method为agency时，为{\"agency_name\":rms_fg_agency}, rms_fg_agency为授权RMS调用FunctionGraph接口的委托名称
     * @return authValue
     */
    public Map<String, Object> getAuthValue() {
        return authValue;
    }

    public void setAuthValue(Map<String, Object> authValue) {
        this.authValue = authValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomPolicy customPolicy = (CustomPolicy) o;
        return Objects.equals(this.functionUrn, customPolicy.functionUrn)
            && Objects.equals(this.authType, customPolicy.authType)
            && Objects.equals(this.authValue, customPolicy.authValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, authType, authValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomPolicy {\n");
        sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    authValue: ").append(toIndentedString(authValue)).append("\n");
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
