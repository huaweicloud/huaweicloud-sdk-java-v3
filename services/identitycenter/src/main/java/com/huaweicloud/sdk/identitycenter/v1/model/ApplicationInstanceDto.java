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
 * 应用程序实例
 */
public class ApplicationInstanceDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_certificate")

    private CertificateDto activeCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display")

    private DisplayDto display;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_provider_config")

    private IdentityProviderConfigDto identityProviderConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_instance_id")

    private String applicationInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible")

    private Boolean visible;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_config")

    private ResponseConfigDto responseConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_schema_config")

    private ResponseSchemaConfigDto responseSchemaConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_config")

    private SecurityConfigDto securityConfig;

    /**
     * 应用程序实例状态
     */
    public static final class StatusEnum {

        /**
         * Enum CREATED for value: "CREATED"
         */
        public static final StatusEnum CREATED = new StatusEnum("CREATED");

        /**
         * Enum ENABLED for value: "ENABLED"
         */
        public static final StatusEnum ENABLED = new StatusEnum("ENABLED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATED", CREATED);
            map.put("ENABLED", ENABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private ApplicationTemplateDto template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_provider_config")

    private ServiceProviderConfigDto serviceProviderConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_id")

    private String clientId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_user_visible")

    private Boolean endUserVisible;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_account")

    private String managedAccount;

    public ApplicationInstanceDto withActiveCertificate(CertificateDto activeCertificate) {
        this.activeCertificate = activeCertificate;
        return this;
    }

    public ApplicationInstanceDto withActiveCertificate(Consumer<CertificateDto> activeCertificateSetter) {
        if (this.activeCertificate == null) {
            this.activeCertificate = new CertificateDto();
            activeCertificateSetter.accept(this.activeCertificate);
        }

        return this;
    }

    /**
     * Get activeCertificate
     * @return activeCertificate
     */
    public CertificateDto getActiveCertificate() {
        return activeCertificate;
    }

    public void setActiveCertificate(CertificateDto activeCertificate) {
        this.activeCertificate = activeCertificate;
    }

    public ApplicationInstanceDto withDisplay(DisplayDto display) {
        this.display = display;
        return this;
    }

    public ApplicationInstanceDto withDisplay(Consumer<DisplayDto> displaySetter) {
        if (this.display == null) {
            this.display = new DisplayDto();
            displaySetter.accept(this.display);
        }

        return this;
    }

    /**
     * Get display
     * @return display
     */
    public DisplayDto getDisplay() {
        return display;
    }

    public void setDisplay(DisplayDto display) {
        this.display = display;
    }

    public ApplicationInstanceDto withIdentityProviderConfig(IdentityProviderConfigDto identityProviderConfig) {
        this.identityProviderConfig = identityProviderConfig;
        return this;
    }

    public ApplicationInstanceDto withIdentityProviderConfig(
        Consumer<IdentityProviderConfigDto> identityProviderConfigSetter) {
        if (this.identityProviderConfig == null) {
            this.identityProviderConfig = new IdentityProviderConfigDto();
            identityProviderConfigSetter.accept(this.identityProviderConfig);
        }

        return this;
    }

    /**
     * Get identityProviderConfig
     * @return identityProviderConfig
     */
    public IdentityProviderConfigDto getIdentityProviderConfig() {
        return identityProviderConfig;
    }

    public void setIdentityProviderConfig(IdentityProviderConfigDto identityProviderConfig) {
        this.identityProviderConfig = identityProviderConfig;
    }

    public ApplicationInstanceDto withApplicationInstanceId(String applicationInstanceId) {
        this.applicationInstanceId = applicationInstanceId;
        return this;
    }

    /**
     * 应用程序实例唯一标识ID
     * @return applicationInstanceId
     */
    public String getApplicationInstanceId() {
        return applicationInstanceId;
    }

    public void setApplicationInstanceId(String applicationInstanceId) {
        this.applicationInstanceId = applicationInstanceId;
    }

    public ApplicationInstanceDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用程序UUID
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApplicationInstanceDto withVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    /**
     * 应用程序在门户是否可见
     * @return visible
     */
    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public ApplicationInstanceDto withResponseConfig(ResponseConfigDto responseConfig) {
        this.responseConfig = responseConfig;
        return this;
    }

    public ApplicationInstanceDto withResponseConfig(Consumer<ResponseConfigDto> responseConfigSetter) {
        if (this.responseConfig == null) {
            this.responseConfig = new ResponseConfigDto();
            responseConfigSetter.accept(this.responseConfig);
        }

        return this;
    }

    /**
     * Get responseConfig
     * @return responseConfig
     */
    public ResponseConfigDto getResponseConfig() {
        return responseConfig;
    }

    public void setResponseConfig(ResponseConfigDto responseConfig) {
        this.responseConfig = responseConfig;
    }

    public ApplicationInstanceDto withResponseSchemaConfig(ResponseSchemaConfigDto responseSchemaConfig) {
        this.responseSchemaConfig = responseSchemaConfig;
        return this;
    }

    public ApplicationInstanceDto withResponseSchemaConfig(
        Consumer<ResponseSchemaConfigDto> responseSchemaConfigSetter) {
        if (this.responseSchemaConfig == null) {
            this.responseSchemaConfig = new ResponseSchemaConfigDto();
            responseSchemaConfigSetter.accept(this.responseSchemaConfig);
        }

        return this;
    }

    /**
     * Get responseSchemaConfig
     * @return responseSchemaConfig
     */
    public ResponseSchemaConfigDto getResponseSchemaConfig() {
        return responseSchemaConfig;
    }

    public void setResponseSchemaConfig(ResponseSchemaConfigDto responseSchemaConfig) {
        this.responseSchemaConfig = responseSchemaConfig;
    }

    public ApplicationInstanceDto withSecurityConfig(SecurityConfigDto securityConfig) {
        this.securityConfig = securityConfig;
        return this;
    }

    public ApplicationInstanceDto withSecurityConfig(Consumer<SecurityConfigDto> securityConfigSetter) {
        if (this.securityConfig == null) {
            this.securityConfig = new SecurityConfigDto();
            securityConfigSetter.accept(this.securityConfig);
        }

        return this;
    }

    /**
     * Get securityConfig
     * @return securityConfig
     */
    public SecurityConfigDto getSecurityConfig() {
        return securityConfig;
    }

    public void setSecurityConfig(SecurityConfigDto securityConfig) {
        this.securityConfig = securityConfig;
    }

    public ApplicationInstanceDto withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 应用程序实例状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ApplicationInstanceDto withTemplate(ApplicationTemplateDto template) {
        this.template = template;
        return this;
    }

    public ApplicationInstanceDto withTemplate(Consumer<ApplicationTemplateDto> templateSetter) {
        if (this.template == null) {
            this.template = new ApplicationTemplateDto();
            templateSetter.accept(this.template);
        }

        return this;
    }

    /**
     * Get template
     * @return template
     */
    public ApplicationTemplateDto getTemplate() {
        return template;
    }

    public void setTemplate(ApplicationTemplateDto template) {
        this.template = template;
    }

    public ApplicationInstanceDto withServiceProviderConfig(ServiceProviderConfigDto serviceProviderConfig) {
        this.serviceProviderConfig = serviceProviderConfig;
        return this;
    }

    public ApplicationInstanceDto withServiceProviderConfig(
        Consumer<ServiceProviderConfigDto> serviceProviderConfigSetter) {
        if (this.serviceProviderConfig == null) {
            this.serviceProviderConfig = new ServiceProviderConfigDto();
            serviceProviderConfigSetter.accept(this.serviceProviderConfig);
        }

        return this;
    }

    /**
     * Get serviceProviderConfig
     * @return serviceProviderConfig
     */
    public ServiceProviderConfigDto getServiceProviderConfig() {
        return serviceProviderConfig;
    }

    public void setServiceProviderConfig(ServiceProviderConfigDto serviceProviderConfig) {
        this.serviceProviderConfig = serviceProviderConfig;
    }

    public ApplicationInstanceDto withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * OIDC Client ID
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public ApplicationInstanceDto withEndUserVisible(Boolean endUserVisible) {
        this.endUserVisible = endUserVisible;
        return this;
    }

    /**
     * 用户是否可见
     * @return endUserVisible
     */
    public Boolean getEndUserVisible() {
        return endUserVisible;
    }

    public void setEndUserVisible(Boolean endUserVisible) {
        this.endUserVisible = endUserVisible;
    }

    public ApplicationInstanceDto withManagedAccount(String managedAccount) {
        this.managedAccount = managedAccount;
        return this;
    }

    /**
     * 组员所属账号ID
     * @return managedAccount
     */
    public String getManagedAccount() {
        return managedAccount;
    }

    public void setManagedAccount(String managedAccount) {
        this.managedAccount = managedAccount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplicationInstanceDto that = (ApplicationInstanceDto) obj;
        return Objects.equals(this.activeCertificate, that.activeCertificate)
            && Objects.equals(this.display, that.display)
            && Objects.equals(this.identityProviderConfig, that.identityProviderConfig)
            && Objects.equals(this.applicationInstanceId, that.applicationInstanceId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.visible, that.visible)
            && Objects.equals(this.responseConfig, that.responseConfig)
            && Objects.equals(this.responseSchemaConfig, that.responseSchemaConfig)
            && Objects.equals(this.securityConfig, that.securityConfig) && Objects.equals(this.status, that.status)
            && Objects.equals(this.template, that.template)
            && Objects.equals(this.serviceProviderConfig, that.serviceProviderConfig)
            && Objects.equals(this.clientId, that.clientId) && Objects.equals(this.endUserVisible, that.endUserVisible)
            && Objects.equals(this.managedAccount, that.managedAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeCertificate,
            display,
            identityProviderConfig,
            applicationInstanceId,
            name,
            visible,
            responseConfig,
            responseSchemaConfig,
            securityConfig,
            status,
            template,
            serviceProviderConfig,
            clientId,
            endUserVisible,
            managedAccount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationInstanceDto {\n");
        sb.append("    activeCertificate: ").append(toIndentedString(activeCertificate)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    identityProviderConfig: ").append(toIndentedString(identityProviderConfig)).append("\n");
        sb.append("    applicationInstanceId: ").append(toIndentedString(applicationInstanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
        sb.append("    responseConfig: ").append(toIndentedString(responseConfig)).append("\n");
        sb.append("    responseSchemaConfig: ").append(toIndentedString(responseSchemaConfig)).append("\n");
        sb.append("    securityConfig: ").append(toIndentedString(securityConfig)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    serviceProviderConfig: ").append(toIndentedString(serviceProviderConfig)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    endUserVisible: ").append(toIndentedString(endUserVisible)).append("\n");
        sb.append("    managedAccount: ").append(toIndentedString(managedAccount)).append("\n");
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
