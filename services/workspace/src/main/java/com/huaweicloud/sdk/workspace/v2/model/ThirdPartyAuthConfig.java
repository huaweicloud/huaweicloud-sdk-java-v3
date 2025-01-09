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
 * 第三方认证配置信息
 */
public class ThirdPartyAuthConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_type")

    private String updateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_cooperate_password")

    private Boolean isCooperatePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_object")

    private String updateObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_interface_config")

    private InterfacesConfig clientInterfaceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_interface_config")

    private InterfacesConfig serverInterfaceConfig;

    /**
     * 更新认证配置类型，认证类型为第三方密码时使用。ADD代表新增，UPDATE代表修改，DELETE代表删除。
     */
    public static final class ThirdPasswordUpdateTypeEnum {

        /**
         * Enum ADD for value: "ADD"
         */
        public static final ThirdPasswordUpdateTypeEnum ADD = new ThirdPasswordUpdateTypeEnum("ADD");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final ThirdPasswordUpdateTypeEnum UPDATE = new ThirdPasswordUpdateTypeEnum("UPDATE");

        /**
         * Enum DELETE for value: "DELETE"
         */
        public static final ThirdPasswordUpdateTypeEnum DELETE = new ThirdPasswordUpdateTypeEnum("DELETE");

        private static final Map<String, ThirdPasswordUpdateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ThirdPasswordUpdateTypeEnum> createStaticFields() {
            Map<String, ThirdPasswordUpdateTypeEnum> map = new HashMap<>();
            map.put("ADD", ADD);
            map.put("UPDATE", UPDATE);
            map.put("DELETE", DELETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ThirdPasswordUpdateTypeEnum(String value) {
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
        public static ThirdPasswordUpdateTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new ThirdPasswordUpdateTypeEnum(value));
        }

        public static ThirdPasswordUpdateTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ThirdPasswordUpdateTypeEnum) {
                return this.value.equals(((ThirdPasswordUpdateTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "third_password_update_type")

    private ThirdPasswordUpdateTypeEnum thirdPasswordUpdateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_definition")

    private String customDefinition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oauth_configs")

    private String oauthConfigs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ldap_configs")

    private List<LdapConfig> ldapConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "third_password_name")

    private String thirdPasswordName;

    public ThirdPartyAuthConfig withUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }

    /**
     * 更新认证配置类型，认证类型为第三方单点登录时使用
     * @return updateType
     */
    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    public ThirdPartyAuthConfig withEnable(Boolean enable) {
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

    public ThirdPartyAuthConfig withIsCooperatePassword(Boolean isCooperatePassword) {
        this.isCooperatePassword = isCooperatePassword;
        return this;
    }

    /**
     * 是否支持密码认证
     * @return isCooperatePassword
     */
    public Boolean getIsCooperatePassword() {
        return isCooperatePassword;
    }

    public void setIsCooperatePassword(Boolean isCooperatePassword) {
        this.isCooperatePassword = isCooperatePassword;
    }

    public ThirdPartyAuthConfig withUpdateObject(String updateObject) {
        this.updateObject = updateObject;
        return this;
    }

    /**
     * 更新认证配置对象，认证类型为第三方单点登录时使用
     * @return updateObject
     */
    public String getUpdateObject() {
        return updateObject;
    }

    public void setUpdateObject(String updateObject) {
        this.updateObject = updateObject;
    }

    public ThirdPartyAuthConfig withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 认证类型
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public ThirdPartyAuthConfig withClientInterfaceConfig(InterfacesConfig clientInterfaceConfig) {
        this.clientInterfaceConfig = clientInterfaceConfig;
        return this;
    }

    public ThirdPartyAuthConfig withClientInterfaceConfig(Consumer<InterfacesConfig> clientInterfaceConfigSetter) {
        if (this.clientInterfaceConfig == null) {
            this.clientInterfaceConfig = new InterfacesConfig();
            clientInterfaceConfigSetter.accept(this.clientInterfaceConfig);
        }

        return this;
    }

    /**
     * Get clientInterfaceConfig
     * @return clientInterfaceConfig
     */
    public InterfacesConfig getClientInterfaceConfig() {
        return clientInterfaceConfig;
    }

    public void setClientInterfaceConfig(InterfacesConfig clientInterfaceConfig) {
        this.clientInterfaceConfig = clientInterfaceConfig;
    }

    public ThirdPartyAuthConfig withServerInterfaceConfig(InterfacesConfig serverInterfaceConfig) {
        this.serverInterfaceConfig = serverInterfaceConfig;
        return this;
    }

    public ThirdPartyAuthConfig withServerInterfaceConfig(Consumer<InterfacesConfig> serverInterfaceConfigSetter) {
        if (this.serverInterfaceConfig == null) {
            this.serverInterfaceConfig = new InterfacesConfig();
            serverInterfaceConfigSetter.accept(this.serverInterfaceConfig);
        }

        return this;
    }

    /**
     * Get serverInterfaceConfig
     * @return serverInterfaceConfig
     */
    public InterfacesConfig getServerInterfaceConfig() {
        return serverInterfaceConfig;
    }

    public void setServerInterfaceConfig(InterfacesConfig serverInterfaceConfig) {
        this.serverInterfaceConfig = serverInterfaceConfig;
    }

    public ThirdPartyAuthConfig withThirdPasswordUpdateType(ThirdPasswordUpdateTypeEnum thirdPasswordUpdateType) {
        this.thirdPasswordUpdateType = thirdPasswordUpdateType;
        return this;
    }

    /**
     * 更新认证配置类型，认证类型为第三方密码时使用。ADD代表新增，UPDATE代表修改，DELETE代表删除。
     * @return thirdPasswordUpdateType
     */
    public ThirdPasswordUpdateTypeEnum getThirdPasswordUpdateType() {
        return thirdPasswordUpdateType;
    }

    public void setThirdPasswordUpdateType(ThirdPasswordUpdateTypeEnum thirdPasswordUpdateType) {
        this.thirdPasswordUpdateType = thirdPasswordUpdateType;
    }

    public ThirdPartyAuthConfig withCustomDefinition(String customDefinition) {
        this.customDefinition = customDefinition;
        return this;
    }

    /**
     * 自定义接口配置
     * @return customDefinition
     */
    public String getCustomDefinition() {
        return customDefinition;
    }

    public void setCustomDefinition(String customDefinition) {
        this.customDefinition = customDefinition;
    }

    public ThirdPartyAuthConfig withOauthConfigs(String oauthConfigs) {
        this.oauthConfigs = oauthConfigs;
        return this;
    }

    /**
     * oauth2配置
     * @return oauthConfigs
     */
    public String getOauthConfigs() {
        return oauthConfigs;
    }

    public void setOauthConfigs(String oauthConfigs) {
        this.oauthConfigs = oauthConfigs;
    }

    public ThirdPartyAuthConfig withLdapConfigs(List<LdapConfig> ldapConfigs) {
        this.ldapConfigs = ldapConfigs;
        return this;
    }

    public ThirdPartyAuthConfig addLdapConfigsItem(LdapConfig ldapConfigsItem) {
        if (this.ldapConfigs == null) {
            this.ldapConfigs = new ArrayList<>();
        }
        this.ldapConfigs.add(ldapConfigsItem);
        return this;
    }

    public ThirdPartyAuthConfig withLdapConfigs(Consumer<List<LdapConfig>> ldapConfigsSetter) {
        if (this.ldapConfigs == null) {
            this.ldapConfigs = new ArrayList<>();
        }
        ldapConfigsSetter.accept(this.ldapConfigs);
        return this;
    }

    /**
     * 单点登录配置信息列表
     * @return ldapConfigs
     */
    public List<LdapConfig> getLdapConfigs() {
        return ldapConfigs;
    }

    public void setLdapConfigs(List<LdapConfig> ldapConfigs) {
        this.ldapConfigs = ldapConfigs;
    }

    public ThirdPartyAuthConfig withThirdPasswordName(String thirdPasswordName) {
        this.thirdPasswordName = thirdPasswordName;
        return this;
    }

    /**
     * 更新认证配置对象，认证类型为第三方密码时使用
     * @return thirdPasswordName
     */
    public String getThirdPasswordName() {
        return thirdPasswordName;
    }

    public void setThirdPasswordName(String thirdPasswordName) {
        this.thirdPasswordName = thirdPasswordName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThirdPartyAuthConfig that = (ThirdPartyAuthConfig) obj;
        return Objects.equals(this.updateType, that.updateType) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.isCooperatePassword, that.isCooperatePassword)
            && Objects.equals(this.updateObject, that.updateObject) && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.clientInterfaceConfig, that.clientInterfaceConfig)
            && Objects.equals(this.serverInterfaceConfig, that.serverInterfaceConfig)
            && Objects.equals(this.thirdPasswordUpdateType, that.thirdPasswordUpdateType)
            && Objects.equals(this.customDefinition, that.customDefinition)
            && Objects.equals(this.oauthConfigs, that.oauthConfigs)
            && Objects.equals(this.ldapConfigs, that.ldapConfigs)
            && Objects.equals(this.thirdPasswordName, that.thirdPasswordName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateType,
            enable,
            isCooperatePassword,
            updateObject,
            authType,
            clientInterfaceConfig,
            serverInterfaceConfig,
            thirdPasswordUpdateType,
            customDefinition,
            oauthConfigs,
            ldapConfigs,
            thirdPasswordName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThirdPartyAuthConfig {\n");
        sb.append("    updateType: ").append(toIndentedString(updateType)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    isCooperatePassword: ").append(toIndentedString(isCooperatePassword)).append("\n");
        sb.append("    updateObject: ").append(toIndentedString(updateObject)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    clientInterfaceConfig: ").append(toIndentedString(clientInterfaceConfig)).append("\n");
        sb.append("    serverInterfaceConfig: ").append(toIndentedString(serverInterfaceConfig)).append("\n");
        sb.append("    thirdPasswordUpdateType: ").append(toIndentedString(thirdPasswordUpdateType)).append("\n");
        sb.append("    customDefinition: ").append(toIndentedString(customDefinition)).append("\n");
        sb.append("    oauthConfigs: ").append(toIndentedString(oauthConfigs)).append("\n");
        sb.append("    ldapConfigs: ").append(toIndentedString(ldapConfigs)).append("\n");
        sb.append("    thirdPasswordName: ").append(toIndentedString(thirdPasswordName)).append("\n");
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
