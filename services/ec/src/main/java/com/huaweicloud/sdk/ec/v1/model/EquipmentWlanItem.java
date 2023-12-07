package com.huaweicloud.sdk.ec.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * EquipmentWlanItem
 */
public class EquipmentWlanItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_wlan")

    private Boolean supportWlan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wlan_enabled")

    private Boolean wlanEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_enabled")

    private Boolean securityEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    /**
     * 认证类型
     */
    public static final class AuthenticationMethodEnum {

        /**
         * Enum WPA for value: "WPA"
         */
        public static final AuthenticationMethodEnum WPA = new AuthenticationMethodEnum("WPA");

        /**
         * Enum WPA2 for value: "WPA2"
         */
        public static final AuthenticationMethodEnum WPA2 = new AuthenticationMethodEnum("WPA2");

        private static final Map<String, AuthenticationMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthenticationMethodEnum> createStaticFields() {
            Map<String, AuthenticationMethodEnum> map = new HashMap<>();
            map.put("WPA", WPA);
            map.put("WPA2", WPA2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthenticationMethodEnum(String value) {
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
        public static AuthenticationMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthenticationMethodEnum(value));
        }

        public static AuthenticationMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthenticationMethodEnum) {
                return this.value.equals(((AuthenticationMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication_method")

    private AuthenticationMethodEnum authenticationMethod;

    /**
     * 加密方式，认证类型为WPA或者WPA2时，可选TKIP、AES
     */
    public static final class EncrptionMethodEnum {

        /**
         * Enum TKIP for value: "TKIP"
         */
        public static final EncrptionMethodEnum TKIP = new EncrptionMethodEnum("TKIP");

        /**
         * Enum AES for value: "AES"
         */
        public static final EncrptionMethodEnum AES = new EncrptionMethodEnum("AES");

        private static final Map<String, EncrptionMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EncrptionMethodEnum> createStaticFields() {
            Map<String, EncrptionMethodEnum> map = new HashMap<>();
            map.put("TKIP", TKIP);
            map.put("AES", AES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EncrptionMethodEnum(String value) {
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
        public static EncrptionMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EncrptionMethodEnum(value));
        }

        public static EncrptionMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EncrptionMethodEnum) {
                return this.value.equals(((EncrptionMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrption_method")

    private EncrptionMethodEnum encrptionMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_hided")

    private Boolean nameHided;

    public EquipmentWlanItem withSupportWlan(Boolean supportWlan) {
        this.supportWlan = supportWlan;
        return this;
    }

    /**
     * 是否支持wlan，提供给UI识别是否显示Wi-Fi配置页面
     * @return supportWlan
     */
    public Boolean getSupportWlan() {
        return supportWlan;
    }

    public void setSupportWlan(Boolean supportWlan) {
        this.supportWlan = supportWlan;
    }

    public EquipmentWlanItem withWlanEnabled(Boolean wlanEnabled) {
        this.wlanEnabled = wlanEnabled;
        return this;
    }

    /**
     * 是否使能wlan，取值为true时，必须填写name、security_enabled、name_hided
     * @return wlanEnabled
     */
    public Boolean getWlanEnabled() {
        return wlanEnabled;
    }

    public void setWlanEnabled(Boolean wlanEnabled) {
        this.wlanEnabled = wlanEnabled;
    }

    public EquipmentWlanItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Wi-Fi名称，长度1-32个字符，不支持中文字符，特殊字符只支持!~@_.?
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EquipmentWlanItem withSecurityEnabled(Boolean securityEnabled) {
        this.securityEnabled = securityEnabled;
        return this;
    }

    /**
     * 是否开启无线安全，取值为true时，必须填写authentication_method、encrption_method
     * @return securityEnabled
     */
    public Boolean getSecurityEnabled() {
        return securityEnabled;
    }

    public void setSecurityEnabled(Boolean securityEnabled) {
        this.securityEnabled = securityEnabled;
    }

    public EquipmentWlanItem withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Wi-Fi密码，长度8-63个字符，包含大写字母、小写字母、数字、特殊字符中至少两种，不能和Wi-Fi名称及名称逆序相同，特殊字符只支持!~@_.?
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EquipmentWlanItem withAuthenticationMethod(AuthenticationMethodEnum authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
        return this;
    }

    /**
     * 认证类型
     * @return authenticationMethod
     */
    public AuthenticationMethodEnum getAuthenticationMethod() {
        return authenticationMethod;
    }

    public void setAuthenticationMethod(AuthenticationMethodEnum authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
    }

    public EquipmentWlanItem withEncrptionMethod(EncrptionMethodEnum encrptionMethod) {
        this.encrptionMethod = encrptionMethod;
        return this;
    }

    /**
     * 加密方式，认证类型为WPA或者WPA2时，可选TKIP、AES
     * @return encrptionMethod
     */
    public EncrptionMethodEnum getEncrptionMethod() {
        return encrptionMethod;
    }

    public void setEncrptionMethod(EncrptionMethodEnum encrptionMethod) {
        this.encrptionMethod = encrptionMethod;
    }

    public EquipmentWlanItem withNameHided(Boolean nameHided) {
        this.nameHided = nameHided;
        return this;
    }

    /**
     * 是否隐藏Wi-Fi名称
     * @return nameHided
     */
    public Boolean getNameHided() {
        return nameHided;
    }

    public void setNameHided(Boolean nameHided) {
        this.nameHided = nameHided;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EquipmentWlanItem that = (EquipmentWlanItem) obj;
        return Objects.equals(this.supportWlan, that.supportWlan) && Objects.equals(this.wlanEnabled, that.wlanEnabled)
            && Objects.equals(this.name, that.name) && Objects.equals(this.securityEnabled, that.securityEnabled)
            && Objects.equals(this.password, that.password)
            && Objects.equals(this.authenticationMethod, that.authenticationMethod)
            && Objects.equals(this.encrptionMethod, that.encrptionMethod)
            && Objects.equals(this.nameHided, that.nameHided);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supportWlan,
            wlanEnabled,
            name,
            securityEnabled,
            password,
            authenticationMethod,
            encrptionMethod,
            nameHided);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EquipmentWlanItem {\n");
        sb.append("    supportWlan: ").append(toIndentedString(supportWlan)).append("\n");
        sb.append("    wlanEnabled: ").append(toIndentedString(wlanEnabled)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    securityEnabled: ").append(toIndentedString(securityEnabled)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    authenticationMethod: ").append(toIndentedString(authenticationMethod)).append("\n");
        sb.append("    encrptionMethod: ").append(toIndentedString(encrptionMethod)).append("\n");
        sb.append("    nameHided: ").append(toIndentedString(nameHided)).append("\n");
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
