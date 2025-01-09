package com.huaweicloud.sdk.workspace.v2.model;

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
 * Radius认证配置信息
 */
public class RadiusAuthConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "radius_configs")

    private List<RadiusHost> radiusConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "radius_secret")

    private String radiusSecret;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "radius_timeout")

    private Integer radiusTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "radius_attempt_time")

    private Integer radiusAttemptTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_in_user_prefix")

    private String domainInUserPrefix;

    /**
     * 认证类型。静态密码: \"STATIC\"，动态口令: \"DYNAMIC\"
     */
    public static final class RadiusAuthTypeEnum {

        /**
         * Enum STATIC for value: "STATIC"
         */
        public static final RadiusAuthTypeEnum STATIC = new RadiusAuthTypeEnum("STATIC");

        /**
         * Enum DYNAMIC for value: "DYNAMIC"
         */
        public static final RadiusAuthTypeEnum DYNAMIC = new RadiusAuthTypeEnum("DYNAMIC");

        private static final Map<String, RadiusAuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RadiusAuthTypeEnum> createStaticFields() {
            Map<String, RadiusAuthTypeEnum> map = new HashMap<>();
            map.put("STATIC", STATIC);
            map.put("DYNAMIC", DYNAMIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RadiusAuthTypeEnum(String value) {
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
        public static RadiusAuthTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RadiusAuthTypeEnum(value));
        }

        public static RadiusAuthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RadiusAuthTypeEnum) {
                return this.value.equals(((RadiusAuthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "radius_auth_type")

    private RadiusAuthTypeEnum radiusAuthType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_protocol")

    private String authProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_code_display_enable")

    private Boolean verificationCodeDisplayEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_code_conditions")

    private Integer verificationCodeConditions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obtain_code_attributes")

    private Object obtainCodeAttributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_code_attributes")

    private Object checkCodeAttributes;

    public RadiusAuthConfig withRadiusConfigs(List<RadiusHost> radiusConfigs) {
        this.radiusConfigs = radiusConfigs;
        return this;
    }

    public RadiusAuthConfig addRadiusConfigsItem(RadiusHost radiusConfigsItem) {
        if (this.radiusConfigs == null) {
            this.radiusConfigs = new ArrayList<>();
        }
        this.radiusConfigs.add(radiusConfigsItem);
        return this;
    }

    public RadiusAuthConfig withRadiusConfigs(Consumer<List<RadiusHost>> radiusConfigsSetter) {
        if (this.radiusConfigs == null) {
            this.radiusConfigs = new ArrayList<>();
        }
        radiusConfigsSetter.accept(this.radiusConfigs);
        return this;
    }

    /**
     * Radius主机配置列表
     * @return radiusConfigs
     */
    public List<RadiusHost> getRadiusConfigs() {
        return radiusConfigs;
    }

    public void setRadiusConfigs(List<RadiusHost> radiusConfigs) {
        this.radiusConfigs = radiusConfigs;
    }

    public RadiusAuthConfig withRadiusSecret(String radiusSecret) {
        this.radiusSecret = radiusSecret;
        return this;
    }

    /**
     * Radius密码
     * @return radiusSecret
     */
    public String getRadiusSecret() {
        return radiusSecret;
    }

    public void setRadiusSecret(String radiusSecret) {
        this.radiusSecret = radiusSecret;
    }

    public RadiusAuthConfig withRadiusTimeout(Integer radiusTimeout) {
        this.radiusTimeout = radiusTimeout;
        return this;
    }

    /**
     * 超时时间,取值范围1-300s
     * minimum: 1
     * maximum: 300
     * @return radiusTimeout
     */
    public Integer getRadiusTimeout() {
        return radiusTimeout;
    }

    public void setRadiusTimeout(Integer radiusTimeout) {
        this.radiusTimeout = radiusTimeout;
    }

    public RadiusAuthConfig withRadiusAttemptTime(Integer radiusAttemptTime) {
        this.radiusAttemptTime = radiusAttemptTime;
        return this;
    }

    /**
     * 尝试次数,取值范围1-10
     * minimum: 1
     * maximum: 10
     * @return radiusAttemptTime
     */
    public Integer getRadiusAttemptTime() {
        return radiusAttemptTime;
    }

    public void setRadiusAttemptTime(Integer radiusAttemptTime) {
        this.radiusAttemptTime = radiusAttemptTime;
    }

    public RadiusAuthConfig withDomainInUserPrefix(String domainInUserPrefix) {
        this.domainInUserPrefix = domainInUserPrefix;
        return this;
    }

    /**
     * 用户前缀中的域。0代表禁用，1代表开启域前缀，2代表开启域后缀，默认值为0。
     * @return domainInUserPrefix
     */
    public String getDomainInUserPrefix() {
        return domainInUserPrefix;
    }

    public void setDomainInUserPrefix(String domainInUserPrefix) {
        this.domainInUserPrefix = domainInUserPrefix;
    }

    public RadiusAuthConfig withRadiusAuthType(RadiusAuthTypeEnum radiusAuthType) {
        this.radiusAuthType = radiusAuthType;
        return this;
    }

    /**
     * 认证类型。静态密码: \"STATIC\"，动态口令: \"DYNAMIC\"
     * @return radiusAuthType
     */
    public RadiusAuthTypeEnum getRadiusAuthType() {
        return radiusAuthType;
    }

    public void setRadiusAuthType(RadiusAuthTypeEnum radiusAuthType) {
        this.radiusAuthType = radiusAuthType;
    }

    public RadiusAuthConfig withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否启用
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public RadiusAuthConfig withAuthProtocol(String authProtocol) {
        this.authProtocol = authProtocol;
        return this;
    }

    /**
     * 身份验证类型: pap或chap，选择短信验证码时才可用
     * @return authProtocol
     */
    public String getAuthProtocol() {
        return authProtocol;
    }

    public void setAuthProtocol(String authProtocol) {
        this.authProtocol = authProtocol;
    }

    public RadiusAuthConfig withVerificationCodeDisplayEnable(Boolean verificationCodeDisplayEnable) {
        this.verificationCodeDisplayEnable = verificationCodeDisplayEnable;
        return this;
    }

    /**
     * 验证码开关，默认开启
     * @return verificationCodeDisplayEnable
     */
    public Boolean getVerificationCodeDisplayEnable() {
        return verificationCodeDisplayEnable;
    }

    public void setVerificationCodeDisplayEnable(Boolean verificationCodeDisplayEnable) {
        this.verificationCodeDisplayEnable = verificationCodeDisplayEnable;
    }

    public RadiusAuthConfig withVerificationCodeConditions(Integer verificationCodeConditions) {
        this.verificationCodeConditions = verificationCodeConditions;
        return this;
    }

    /**
     * 验证码失败次数
     * minimum: 0
     * maximum: 5
     * @return verificationCodeConditions
     */
    public Integer getVerificationCodeConditions() {
        return verificationCodeConditions;
    }

    public void setVerificationCodeConditions(Integer verificationCodeConditions) {
        this.verificationCodeConditions = verificationCodeConditions;
    }

    public RadiusAuthConfig withObtainCodeAttributes(Object obtainCodeAttributes) {
        this.obtainCodeAttributes = obtainCodeAttributes;
        return this;
    }

    /**
     * 过滤短信拓展字段
     * @return obtainCodeAttributes
     */
    public Object getObtainCodeAttributes() {
        return obtainCodeAttributes;
    }

    public void setObtainCodeAttributes(Object obtainCodeAttributes) {
        this.obtainCodeAttributes = obtainCodeAttributes;
    }

    public RadiusAuthConfig withCheckCodeAttributes(Object checkCodeAttributes) {
        this.checkCodeAttributes = checkCodeAttributes;
        return this;
    }

    /**
     * 过滤短信拓展字段
     * @return checkCodeAttributes
     */
    public Object getCheckCodeAttributes() {
        return checkCodeAttributes;
    }

    public void setCheckCodeAttributes(Object checkCodeAttributes) {
        this.checkCodeAttributes = checkCodeAttributes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RadiusAuthConfig that = (RadiusAuthConfig) obj;
        return Objects.equals(this.radiusConfigs, that.radiusConfigs)
            && Objects.equals(this.radiusSecret, that.radiusSecret)
            && Objects.equals(this.radiusTimeout, that.radiusTimeout)
            && Objects.equals(this.radiusAttemptTime, that.radiusAttemptTime)
            && Objects.equals(this.domainInUserPrefix, that.domainInUserPrefix)
            && Objects.equals(this.radiusAuthType, that.radiusAuthType) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.authProtocol, that.authProtocol)
            && Objects.equals(this.verificationCodeDisplayEnable, that.verificationCodeDisplayEnable)
            && Objects.equals(this.verificationCodeConditions, that.verificationCodeConditions)
            && Objects.equals(this.obtainCodeAttributes, that.obtainCodeAttributes)
            && Objects.equals(this.checkCodeAttributes, that.checkCodeAttributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radiusConfigs,
            radiusSecret,
            radiusTimeout,
            radiusAttemptTime,
            domainInUserPrefix,
            radiusAuthType,
            enable,
            authProtocol,
            verificationCodeDisplayEnable,
            verificationCodeConditions,
            obtainCodeAttributes,
            checkCodeAttributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RadiusAuthConfig {\n");
        sb.append("    radiusConfigs: ").append(toIndentedString(radiusConfigs)).append("\n");
        sb.append("    radiusSecret: ").append(toIndentedString(radiusSecret)).append("\n");
        sb.append("    radiusTimeout: ").append(toIndentedString(radiusTimeout)).append("\n");
        sb.append("    radiusAttemptTime: ").append(toIndentedString(radiusAttemptTime)).append("\n");
        sb.append("    domainInUserPrefix: ").append(toIndentedString(domainInUserPrefix)).append("\n");
        sb.append("    radiusAuthType: ").append(toIndentedString(radiusAuthType)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    authProtocol: ").append(toIndentedString(authProtocol)).append("\n");
        sb.append("    verificationCodeDisplayEnable: ")
            .append(toIndentedString(verificationCodeDisplayEnable))
            .append("\n");
        sb.append("    verificationCodeConditions: ").append(toIndentedString(verificationCodeConditions)).append("\n");
        sb.append("    obtainCodeAttributes: ").append(toIndentedString(obtainCodeAttributes)).append("\n");
        sb.append("    checkCodeAttributes: ").append(toIndentedString(checkCodeAttributes)).append("\n");
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
