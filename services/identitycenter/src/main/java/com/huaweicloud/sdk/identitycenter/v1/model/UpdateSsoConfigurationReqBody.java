package com.huaweicloud.sdk.identitycenter.v1.model;

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
 * description: the request body of UpdateSsoConfiguration
 */
public class UpdateSsoConfigurationReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sso_configuration")

    private SSOConfigurationDto ssoConfiguration;

    /**
     * 配置类型
     */
    public static final class ConfigurationTypeEnum {

        /**
         * Enum APP_AUTHENTICATION_CONFIGURATION for value: "APP_AUTHENTICATION_CONFIGURATION"
         */
        public static final ConfigurationTypeEnum APP_AUTHENTICATION_CONFIGURATION =
            new ConfigurationTypeEnum("APP_AUTHENTICATION_CONFIGURATION");

        /**
         * Enum SESSION for value: "SESSION"
         */
        public static final ConfigurationTypeEnum SESSION = new ConfigurationTypeEnum("SESSION");

        private static final Map<String, ConfigurationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConfigurationTypeEnum> createStaticFields() {
            Map<String, ConfigurationTypeEnum> map = new HashMap<>();
            map.put("APP_AUTHENTICATION_CONFIGURATION", APP_AUTHENTICATION_CONFIGURATION);
            map.put("SESSION", SESSION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConfigurationTypeEnum(String value) {
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
        public static ConfigurationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConfigurationTypeEnum(value));
        }

        public static ConfigurationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConfigurationTypeEnum) {
                return this.value.equals(((ConfigurationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_type")

    private ConfigurationTypeEnum configurationType;

    public UpdateSsoConfigurationReqBody withSsoConfiguration(SSOConfigurationDto ssoConfiguration) {
        this.ssoConfiguration = ssoConfiguration;
        return this;
    }

    public UpdateSsoConfigurationReqBody withSsoConfiguration(Consumer<SSOConfigurationDto> ssoConfigurationSetter) {
        if (this.ssoConfiguration == null) {
            this.ssoConfiguration = new SSOConfigurationDto();
            ssoConfigurationSetter.accept(this.ssoConfiguration);
        }

        return this;
    }

    /**
     * Get ssoConfiguration
     * @return ssoConfiguration
     */
    public SSOConfigurationDto getSsoConfiguration() {
        return ssoConfiguration;
    }

    public void setSsoConfiguration(SSOConfigurationDto ssoConfiguration) {
        this.ssoConfiguration = ssoConfiguration;
    }

    public UpdateSsoConfigurationReqBody withConfigurationType(ConfigurationTypeEnum configurationType) {
        this.configurationType = configurationType;
        return this;
    }

    /**
     * 配置类型
     * @return configurationType
     */
    public ConfigurationTypeEnum getConfigurationType() {
        return configurationType;
    }

    public void setConfigurationType(ConfigurationTypeEnum configurationType) {
        this.configurationType = configurationType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSsoConfigurationReqBody that = (UpdateSsoConfigurationReqBody) obj;
        return Objects.equals(this.ssoConfiguration, that.ssoConfiguration)
            && Objects.equals(this.configurationType, that.configurationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssoConfiguration, configurationType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSsoConfigurationReqBody {\n");
        sb.append("    ssoConfiguration: ").append(toIndentedString(ssoConfiguration)).append("\n");
        sb.append("    configurationType: ").append(toIndentedString(configurationType)).append("\n");
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
